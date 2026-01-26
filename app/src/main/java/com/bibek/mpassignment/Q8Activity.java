package com.bibek.mpassignment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Q8Activity extends AppCompatActivity {

    Button btnFactorial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.q8);

        btnFactorial = findViewById(R.id.btn_factorial);

        btnFactorial.setOnClickListener(view -> showFactorialDialog());
    }

    private void showFactorialDialog() {
        EditText etNumber = new EditText(this);
        etNumber.setInputType(android.text.InputType.TYPE_CLASS_NUMBER);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Factorial")
                .setMessage("Enter a number")
                .setView(etNumber)
                .setPositiveButton("Calculate", (dialog, which) -> {
                    String input = etNumber.getText().toString();

                    if (input.isEmpty()) {
                        Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    int num = Integer.parseInt(input);
                    long fact = 1;

                    for (int i = 1; i <= num; i++) {
                        fact *= i;
                    }

                    Toast.makeText(this,
                            "Factorial of " + num + " is " + fact,
                            Toast.LENGTH_LONG).show();
                })
                .setNegativeButton("Cancel", null)
                .show();
    }
}
