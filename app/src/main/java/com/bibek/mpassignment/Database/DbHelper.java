package com.bibek.mpassignment.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {

    public static final String DB_NAME = "bank.db";
    public static final int DB_VERSION = 1;

    public static final String TABLE_NAME = "Customer";
    public static final String COL_ID = "id";
    public static final String COL_ACCOUNT_NO = "account_no";
    public static final String COL_NAME = "name";
    public static final String COL_ACCOUNT_TYPE = "accountType";
    public static final String COL_AMOUNT = "amount";


    public DbHelper (Context context){
        super(context, DB_NAME, null, DB_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + "(" +
                COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                COL_ACCOUNT_NO + " NUMBER, "+
                COL_NAME + " TEXT," +
                COL_ACCOUNT_TYPE + " NUMBER, "+
                COL_AMOUNT + " NUMBER)";

        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}
