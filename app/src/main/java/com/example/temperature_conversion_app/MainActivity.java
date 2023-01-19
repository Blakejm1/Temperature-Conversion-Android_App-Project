package com.example.temperature_conversion_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText inputBox;
    EditText inputBox2;
    TextView outputText;
    TextView outputText2;
    Button convertButton;
    Button convertButton2;
    ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputBox = findViewById(R.id.celsiusInput);
        inputBox2 = findViewById(R.id.fahrenheightInput);
        outputText = findViewById(R.id.outputText);
        outputText2 = findViewById(R.id.outputText2);
        convertButton = findViewById(R.id.convertButton);
        convertButton2 = findViewById(R.id.convertButton2);
        layout = findViewById(R.id.layout);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = inputBox.getText().toString();
                double x = Double.parseDouble(s);
                double f = x * 1.8 + 32;
                outputText.setText("Fahrenheight: " + f);
            }
        });

        convertButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = inputBox2.getText().toString();
                double x = Double.parseDouble(s);
                double c = (x - 32) * .5556;
                outputText2.setText("Celsius: " + c);
            }
        });
    }
}