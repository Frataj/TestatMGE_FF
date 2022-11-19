package ch.ost.rj.mge.testat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class UserActivity extends AppCompatActivity {

    public static Intent createIntent(Context context) {
        return new Intent(context, UserActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        Button createUserButton = findViewById(R.id.createUser);
        createUserButton.setOnClickListener(v -> showCreateUserActivity());

        Button editUserButton = findViewById(R.id.manageUser);
        editUserButton.setOnClickListener(v -> showEditUserActivity());
    }

    private void showCreateUserActivity(){
        Intent intent = CreateUserActivity.createIntent(this);
        startActivity(intent);
    }

    private void showEditUserActivity(){
        Intent intent = EditUserActivity.createIntent(this);
        startActivity(intent);
    }
}