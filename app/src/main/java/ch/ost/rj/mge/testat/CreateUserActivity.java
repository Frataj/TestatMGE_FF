package ch.ost.rj.mge.testat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Environment;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class CreateUserActivity extends AppCompatActivity {

    EditText userInput;
    String[] userName;
    Button saveButton;
    String[] userNames;

    private static final String PREFS_NAME = "preferences";

    public static Intent createIntent(Context context) {
        return new Intent(context, CreateUserActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_user);

        saveButton = findViewById(R.id.saveButton);
        userInput = findViewById(R.id.editTextUserName);
        userInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        saveButton.setOnClickListener(v -> showUserManagementActivity());
    }

    private void showUserManagementActivity(){
        saveUserNames();
        Intent intent = UserActivity.createIntent(this);
        startActivity(intent);
    }

    public  void saveUserNames()
    {

    }
}