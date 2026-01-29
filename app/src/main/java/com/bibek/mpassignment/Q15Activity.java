package com.bibek.mpassignment;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;

import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Q15Activity extends AppCompatActivity {

    ListView listView;

    String[] names = {"Khamzat", "Ilia", "Steve"};

    String[] details = {
            "Roll No: 1\nName: Khamzat\nAddress: Russia",
            "Roll No: 2\nName: Ilia\nAddress: Spain",
            "Roll No: 3\nName: Steve\nAddress: America"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.q15);

        listView = findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                names);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            Q15Fragment fragment =
                    new Q15Fragment(details[position]);

            FragmentTransaction ft =
                    getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.fragmentContainer, fragment);
            ft.commit();
        });
    }
}
