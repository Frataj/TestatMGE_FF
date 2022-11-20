package ch.ost.rj.mge.testat.storage;

import android.content.Context;
import android.graphics.Bitmap;

import androidx.room.Room;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.List;

import ch.ost.rj.mge.testat.User;

public final class UserRepository {
    private static UserDatabase database;

    public static void initialize(Context context){
        database = Room.databaseBuilder(context, UserDatabase.class, "usersDB").allowMainThreadQueries().build();
    }

    public static List<User> getAll() {return database.userDao().getAll();}

    public static void addUser(User newUser) {database.userDao().insertNew(newUser);}

    public static void createUser(String name){
        User user = new User();
        user.name = name;

        addUser(user);
    }
}
