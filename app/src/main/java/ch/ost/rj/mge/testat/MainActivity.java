package ch.ost.rj.mge.testat;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import ch.ost.rj.mge.testat.storage.UserRepository;

public class MainActivity extends AppCompatActivity {

    public static Intent createIntent(Context context) {
        return new Intent(context, MainActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(AppCompatDelegate.getDefaultNightMode() ==AppCompatDelegate.MODE_NIGHT_YES){

            setTheme(R.style.NightMode);
        }else{
            setTheme(R.style.AppTheme);
        }
        setContentView(R.layout.activity_main);

        //setCurrentTheme();

        Button userButton = findViewById(R.id.userManagement);
        userButton.setOnClickListener(v -> showUserManagementActivity());

        Button leaderboardButton = findViewById(R.id.ranking);
        leaderboardButton.setOnClickListener(v -> showLeaderboard());

        Button playButton = findViewById(R.id.predict);
        playButton.setOnClickListener(v -> showPlayScreen());

        Button resultsButton = findViewById(R.id.raceResult);
        resultsButton.setOnClickListener(v -> showResults());

        Button switchTheme = findViewById(R.id.switchTheme);
        switchTheme.setOnClickListener(v -> switchDarkMode());

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

    private void switchDarkMode(){
        boolean darkMode;
        String file = "ch.ost.mge.testat.preferences";
        SharedPreferences preferences = getSharedPreferences(file, Context.MODE_PRIVATE);

        darkMode = preferences.getBoolean("dark", false);
        if(darkMode){
            //setTheme(R.style.AppTheme);
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putBoolean("dark", false);
            editor.commit();
            //Intent intent = MainActivity.createIntent(this);
            //startActivity(intent);
        }
        else{
            //setTheme(R.style.NightMode);
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putBoolean("dark", true);
            editor.commit();
            //Intent intent = MainActivity.createIntent(this);
            //startActivity(intent);
        }
    }

    private void setCurrentTheme(){
        boolean darkMode;
        String file = "ch.ost.mge.testat.preferences";
        SharedPreferences preferences = getSharedPreferences(file, Context.MODE_PRIVATE);

        darkMode = preferences.getBoolean("dark", true);
        if(darkMode){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        }else{
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }
    }
}

