package ch.ost.rj.mge.testat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import ch.ost.rj.mge.testat.storage.UserRepository;
import ch.ost.rj.mge.testat.storage.StorageController;


public class CreateUserActivity extends AppCompatActivity {

    EditText userInput;
    Button saveButton;
    Button changeImageButton;
    ImageView playerAvatar;

    String userName;
    Bitmap image;

    StorageController sc;

    String permission = Manifest.permission.CAMERA;
    int permissionStatus;
    private static final int CALLBACK_CODE = 1;
    private static final int CAMERA_PERMISSION_CODE = 1;
    private static final int CAMERA_REQUEST = 1888;

    public static Intent createIntent(Context context) {
        return new Intent(context, CreateUserActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_user);

        saveButton = findViewById(R.id.saveButton);
        userInput = findViewById(R.id.editTextUserName);
        changeImageButton = findViewById(R.id.addAvatarButton);
        playerAvatar = findViewById(R.id.playerAvatar);
        sc = new StorageController();

        userInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                userName = userInput.getText().toString();
            }
        });

        changeImageButton.setOnClickListener(v -> changePlayerAvatar());


        saveButton.setOnClickListener(v -> showUserManagementActivity());
    }

    private void showUserManagementActivity(){
        persistUser();
        Intent intent = UserActivity.createIntent(this);
        startActivity(intent);
    }

    private  void persistUser()
    {
        playerAvatar.setDrawingCacheEnabled(true);
        image = playerAvatar.getDrawingCache();
        sc.saveImage(this, image, userName);
        UserRepository.createUser(userName);
    }

    @SuppressLint("NewApi")
    private void changePlayerAvatar(){
        if(checkSelfPermission(Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED){
            requestPermissions(new String[]{Manifest.permission.CAMERA}, CAMERA_PERMISSION_CODE);
        }else{
            Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(cameraIntent, CAMERA_REQUEST);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults){
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(requestCode == CAMERA_PERMISSION_CODE){
            if(grantResults[0] == PackageManager.PERMISSION_GRANTED){
                Toast.makeText(this, "Camera permission granted", Toast.LENGTH_LONG).show();
                Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent, CAMERA_REQUEST);
            }else{
                Toast.makeText(this, "camera permission denied", Toast.LENGTH_LONG).show();
            }
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == CAMERA_REQUEST && resultCode == Activity.RESULT_OK) {
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            playerAvatar.setImageBitmap(photo);
        }
    }
}