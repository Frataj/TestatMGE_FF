package ch.ost.rj.mge.testat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
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
import ch.ost.rj.mge.testat.storage.UserRepository;

public class MainActivity extends AppCompatActivity {

    public static Intent createIntent(Context context) {
        return new Intent(context, MainActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button userButton = findViewById(R.id.userManagement);
        userButton.setOnClickListener(v -> showUserManagementActivity());

        Button leaderboardButton = findViewById(R.id.ranking);
        leaderboardButton.setOnClickListener(v -> showLeaderboard());

        Button playButton = findViewById(R.id.predict);
        playButton.setOnClickListener(v -> showPlayScreen());

        Button resultsButton = findViewById(R.id.raceResult);
        resultsButton.setOnClickListener(v -> showResults());

        UserRepository.initialize(this);
    }

    private void showUserManagementActivity(){
        Intent intent = UserActivity.createIntent(this);
        startActivity(intent);
    }

    private void showLeaderboard(){
        Intent intent = LeaderboardActivity.createIntent(this);
        startActivity(intent);
    }

    private void showPlayScreen(){
        Intent intent = PlayActivity.createIntent(this);
        startActivity(intent);
    }

    private void showResults(){
        Intent intent = RaceResultsActivity.createIntent(this);
        startActivity(intent);
    }
}

