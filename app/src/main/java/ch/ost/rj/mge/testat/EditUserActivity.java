package ch.ost.rj.mge.testat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class EditUserActivity extends AppCompatActivity {

    private static final String PREFS_NAME = "preferences";
    String userName;
    TextView placeholder;

    public static Intent createIntent(Context context) {
        return new Intent(context, EditUserActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_user);

        placeholder = findViewById(R.id.placeholder);
        loadUsers();
        placeholder.setText(userName);
    }

    private void loadUsers() {

    }
}