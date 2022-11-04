package ch.ost.rj.mge.testat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class UserActivity extends AppCompatActivity {

    private Button createUserButton;
    private Button editUserButton;

    public static Intent createIntent(Context context) {
        Intent intent = new Intent(context, UserActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        createUserButton = findViewById(R.id.createUser);
        createUserButton.setOnClickListener(v -> showCreateUserActivity());

        editUserButton = findViewById(R.id.manageUser);
        editUserButton.setOnClickListener(v -> showEditUserActivity());
    }

    private void showCreateUserActivity(){
        Intent intent = CreateUserActivity.createIntent(this);
        startActivity(intent);
    }

    private void showEditUserActivity(){
        Intent intent = editUserActivity.createIntent(this);
        startActivity(intent);
    }
}