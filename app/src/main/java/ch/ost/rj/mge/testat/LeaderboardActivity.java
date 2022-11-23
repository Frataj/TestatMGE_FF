package ch.ost.rj.mge.testat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import ch.ost.rj.mge.testat.storage.StorageController;
import ch.ost.rj.mge.testat.storage.UserRepository;

public class LeaderboardActivity extends AppCompatActivity {

    TextView userText;
    ImageView playerAvatar;
    Bitmap image;
    TextView scoreDisplay;

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
        scoreDisplay = findViewById(R.id.score);
        sc = new StorageController();
        User me = UserRepository.getByName("Fabian");

        image = sc.loadImageBitmap(this, "Fabian.jpg");
        playerAvatar.setImageBitmap(image);
        scoreDisplay.setText(Integer.toString(me.score));
    }
}