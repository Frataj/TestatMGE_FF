package ch.ost.rj.mge.testat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import ch.ost.rj.mge.testat.storage.UserRepository;

public class UserActivity extends AppCompatActivity {

    List<User> allUsers;

    public static Intent createIntent(Context context) {
        return new Intent(context, UserActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        allUsers = UserRepository.getAll();
        ListView listAllUsers = findViewById(R.id.listOfUsers);

        if(allUsers.size() > 0) {
            List<String> stringsToShowInList = new ArrayList<>();
            for (User user : allUsers) {
                stringsToShowInList.add(user.name);
            }
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
                    this,
                    android.R.layout.simple_list_item_1,
                    stringsToShowInList);
            listAllUsers.setAdapter(arrayAdapter);
        }


        Button createUserButton = findViewById(R.id.createUser);
        createUserButton.setOnClickListener(v -> showCreateUserActivity());
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