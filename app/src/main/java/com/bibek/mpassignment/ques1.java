package com.bibek.mpassignment;

import static java.lang.Double.parseDouble;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class ques1 extends AppCompatActivity {
    EditText etKm, etm;
    Button btnConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ques1);

        etKm = findViewById(R.id.et_km);
        etm = findViewById(R.id.et_m);
        btnConvert = findViewById(R.id.btn_convert);
    }

    @Override
    protected void onStart() {
        super.onStart();

        btnConvert.setOnClickListener(view -> {
            double kmVal = parseDouble(etKm.getText().toString());

            etm.setText(String.valueOf(kmVal * 1000));
        });

    }
}