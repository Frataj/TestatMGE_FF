package ch.ost.rj.mge.testat.storage;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import ch.ost.rj.mge.testat.User;

@Database(entities = {User.class}, version = 2)
public abstract class UserDatabase extends RoomDatabase{
    public abstract UserDao userDao();
}
