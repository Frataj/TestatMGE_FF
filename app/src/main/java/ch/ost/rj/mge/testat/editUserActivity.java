package ch.ost.rj.mge.testat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class editUserActivity extends AppCompatActivity {

    public static Intent createIntent(Context context) {
        Intent intent = new Intent(context, editUserActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_user);
    }
}