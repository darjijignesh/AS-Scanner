package com.aarogyasetu.scanner.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;
@Database(entities = {ScannedUser.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract ScannedDAO  scannedDAO();

}
