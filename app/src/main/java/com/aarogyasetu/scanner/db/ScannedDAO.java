package com.aarogyasetu.scanner.db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ScannedDAO {

    @Query("Select * from ScannedUser")
    List<ScannedUser> getAll();

    @Insert
    void insert(ScannedUser scannedUser);

    @Update
    void update(ScannedUser scannedUser);


}
