package ch.ost.rj.mge.testat;

import android.graphics.Bitmap;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "users")
public final class User {
    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo
    public String name;

    //@ColumnInfo(typeAffinity = ColumnInfo.BLOB)
    //public Bitmap image;

    //@ColumnInfo
    //public List<String> prediction;

    @ColumnInfo
    public int score;
}
