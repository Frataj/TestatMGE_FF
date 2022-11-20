package ch.ost.rj.mge.testat.storage;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.ArrayList;
import java.util.List;

import ch.ost.rj.mge.testat.User;

@Dao
public interface UserDao {
    @Query("SELECT * FROM users")
    List<User> getAll();

    @Insert
    void insertNew(User newUser);

    @Delete
    void delete(User depricatedUser);
}
