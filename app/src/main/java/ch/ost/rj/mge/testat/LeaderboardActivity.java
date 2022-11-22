package ch.ost.rj.mge.testat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import ch.ost.rj.mge.testat.storage.StorageController;

public class LeaderboardActivity extends AppCompatActivity {

    TextView userText;
    ImageView playerAvatar;
    Bitmap image;

    StorageController sc;

    public static Intent createIntent(Context context) {
        return new Intent(context, LeaderboardActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaderboard);

        userText = findViewById(R.id.playerName);
        playerAvatar = findViewById(R.id.playerAvatar);
        sc = new StorageController();

        image = sc.loadImageBitmap(this, "Fabian.jpg");
        playerAvatar.setImageBitmap(image);

    }
}