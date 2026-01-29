package com.bibek.mpassignment;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;


import org.json.JSONObject;

public class Q12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            // JSON data as String
            String jsonData = "{ \"student\": { \"id\": 101, \"name\": \"Bibek\", \"course\": \"MP\", \"marks\": 95 } }";

            // Convert string to JSONObject
            JSONObject jsonObject = new JSONObject(jsonData);

            // Get student object
            JSONObject studentObject = jsonObject.getJSONObject("student");

            // Decode values
            int id = studentObject.getInt("id");
            String name = studentObject.getString("name");
            String course = studentObject.getString("course");
            int marks = studentObject.getInt("marks");

            // Display data (example)
            Log.d("JSON DATA", "ID: " + id);
            Log.d("JSON DATA", "Name: " + name);
            Log.d("JSON DATA", "Course: " + course);
            Log.d("JSON DATA", "Marks: " + marks);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
