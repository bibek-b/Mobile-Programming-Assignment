package com.bibek.mpassignment.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class DBConnect {

    private SQLiteDatabase database;
    private DbHelper dbHelper;

    public DBConnect(Context context) {
        dbHelper = new DbHelper(context);
    }

    // Connect to local SQLite database
    public SQLiteDatabase open() {
        database = dbHelper.getWritableDatabase();
        return database;
    }

    // Close database connection
    public void close() {
        if (database != null && database.isOpen()) {
            database.close();
        }
    }
}
