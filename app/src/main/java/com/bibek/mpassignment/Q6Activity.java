package com.bibek.mpassignment;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;


import com.bibek.mpassignment.Database.BankDao;

import java.util.ArrayList;

public class Q6Activity extends AppCompatActivity {

    ListView listView;
    ArrayAdapter<String> adapter;
    ArrayList<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.q6);

        listView = findViewById(R.id.lv_bank_details);

        BankDao dao = new BankDao(this);
        // Insert dummy data (only first time)
        dao.insertCustomer(101, "Rahul", "Savings", 75000);
        dao.insertCustomer(102, "Anita", "Current", 30000);
        dao.insertCustomer(103, "Suresh", "Savings", 90000);
        dao.insertCustomer(104, "Meena", "Savings", 45000);

        // Fetch customers with deposit > 50000
        list = dao.getRichCustomers();

        adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                list
        );

        listView.setAdapter(adapter);
    }
}
