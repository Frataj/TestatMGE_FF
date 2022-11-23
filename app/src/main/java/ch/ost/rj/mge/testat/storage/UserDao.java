package ch.ost.rj.mge.testat.storage;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.ArrayList;
import java.util.List;

import ch.ost.rj.mge.testat.User;

@Dao
public interface UserDao {
    @Query("SELECT * FROM users ORDER BY score DESC")
    List<User> getAll();

    @Query("SELECT * FROM users WHERE name=:name")
    User getByName(String name);

    @Insert
    void insertNew(User newUser);

    @Delete
    void delete(User depricatedUser);

    @Query("UPDATE users SET score=:newScore WHERE name=:name")
    void setScore(int newScore, String name);

    @Query("UPDATE users SET prediction=:prediction WHERE name=:name")
    void setPrediction(String prediction, String name);
}
