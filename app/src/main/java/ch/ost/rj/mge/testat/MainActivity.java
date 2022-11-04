package ch.ost.rj.mge.testat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import ch.ost.rj.mge.testat.R;

public class MainActivity extends AppCompatActivity {

    private Button userButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userButton = findViewById(R.id.userManagement);
        userButton.setOnClickListener(v -> showUserManagementActivity());

    }

    private void showUserManagementActivity(){
        Intent intent = UserActivity.createIntent(this);
        startActivity(intent);
    }
}

