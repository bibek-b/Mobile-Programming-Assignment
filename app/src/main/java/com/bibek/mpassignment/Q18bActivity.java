package com.bibek.mpassignment;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.bibek.mpassignment.Adapter.FighterAdapter;

public class Q18bActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    String[] items = {"Khamzat Chimaev", "Ilia Topuria", "Khabib", "Conor", "Arman"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.q18b);

        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new FighterAdapter(items));
    }
}
