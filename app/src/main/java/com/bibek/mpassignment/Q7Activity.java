package com.bibek.mpassignment;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Q7Activity extends AppCompatActivity {

    EditText etFirstNum, etSecondNum;
    Button btnMultiply, btnDivide;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.q7);

        etFirstNum = findViewById(R.id.et_first_num);
        etSecondNum = findViewById(R.id.et_second_num);
        btnMultiply = findViewById(R.id.btn_multiply);
        btnDivide = findViewById(R.id.btn_divide);
        tvResult = findViewById(R.id.tv_result);

    }

    @Override
    protected void onStart() {
        super.onStart();


        btnMultiply.setOnClickListener(view -> {
            int num1 = Integer.parseInt(etFirstNum.getText().toString());
            int num2 = Integer.parseInt(etSecondNum.getText().toString());
            tvResult.setText(String.valueOf(num1 * num2));
        });

        btnDivide.setOnClickListener(view -> {
            int num1 = Integer.parseInt(etFirstNum.getText().toString());
            int num2 = Integer.parseInt(etSecondNum.getText().toString());
            tvResult.setText(String.valueOf(num1/num2));
        });

    }
}