package com.bibek.mpassignment.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class BankDao {

    DBConnect dbConnection;

    public BankDao(Context context) {
        dbConnection = new DBConnect(context);
    }

    // Insert dummy customer
    public void insertCustomer(int accountNo, String name, String accountType, double amount) {
        SQLiteDatabase db = dbConnection.open();

        ContentValues values = new ContentValues();
        values.put("account_no", accountNo);
        values.put("name", name);
        values.put("accountType", accountType);
        values.put("amount", amount);

        db.insert("Customer", null, values);
        dbConnection.close();
    }

    // Fetch customers with amount > 50000
    public ArrayList<String> getRichCustomers() {
        ArrayList<String> list = new ArrayList<>();
        SQLiteDatabase db = dbConnection.open();

        Cursor cursor = db.rawQuery(
                "SELECT * FROM Customer WHERE amount > 50000", null);

        if (cursor.moveToFirst()) {
            do {
                String data = cursor.getInt(cursor.getColumnIndex("account_no")) + "  "
                        + cursor.getString(cursor.getColumnIndex("name")) + "  "
                        + cursor.getString(cursor.getColumnIndex("accountType")) + "  "
                        + cursor.getDouble(cursor.getColumnIndex("amount"));
                list.add(data);
            } while (cursor.moveToNext());
        }

        cursor.close();
        dbConnection.close();
        return list;
    }
}
