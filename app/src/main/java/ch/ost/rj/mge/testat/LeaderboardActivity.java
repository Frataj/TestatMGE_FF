package ch.ost.rj.mge.testat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import ch.ost.rj.mge.testat.storage.StorageController;
import ch.ost.rj.mge.testat.storage.UserRepository;

public class LeaderboardActivity extends AppCompatActivity {

    ImageView firstplaceImage;
    ImageView secondPlaceImage;
    ImageView thirdPlaceImage;

    TextView firstPlaceInfo;
    TextView secondPlaceInfo;
    TextView thirdPlaceInfo;

    ListView otherPlayerList;

    List<User> allPlayers;

    StorageController sc = new StorageController();

    public static Intent createIntent(Context context) {
        return new Intent(context, LeaderboardActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaderboard);

        firstplaceImage = findViewById(R.id.firstPlaceAvatar);
        secondPlaceImage = findViewById(R.id.secondPlaceAvatar);
        thirdPlaceImage = findViewById(R.id.thirdPlaceAvatar);

        firstPlaceInfo = findViewById(R.id.firstPlaceInfo);
        secondPlaceInfo = findViewById(R.id.secondPlaceInfo);
        thirdPlaceInfo = findViewById(R.id.thirdPlaceInfo);

        otherPlayerList = findViewById(R.id.otherPlayerList);

        allPlayers = UserRepository.getAll();

        if(allPlayers.size() > 2) {
            thirdPlaceImage.setImageBitmap(sc.loadImageBitmap(this, allPlayers.get(2).imagePath));
            thirdPlaceInfo.setText(allPlayers.get(2).name + " Score: " + allPlayers.get(2).score);
            allPlayers.remove(2);
        }
        if(allPlayers.size() > 1) {
            secondPlaceImage.setImageBitmap(sc.loadImageBitmap(this, allPlayers.get(1).imagePath));
            secondPlaceInfo.setText(allPlayers.get(1).name + " Score: " + allPlayers.get(1).score);
            allPlayers.remove(1);
        }
        if(allPlayers.size() > 0) {
            firstplaceImage.setImageBitmap(sc.loadImageBitmap(this, allPlayers.get(0).imagePath));
            firstPlaceInfo.setText(allPlayers.get(0).name + " Score: " + allPlayers.get(0).score);
            allPlayers.remove(0);
        }
        if(allPlayers.size() > 0){
            List<String> stringsToDispplay = new ArrayList<>();
            for(int i = 0; i < allPlayers.size(); i++){
                stringsToDispplay.add((allPlayers.get(i).name + " Score: " + allPlayers.get(i).score));
            }
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
                    this,
                    android.R.layout.simple_list_item_1,
                    stringsToDispplay);
            otherPlayerList.setAdapter(arrayAdapter);
        }
    }
}