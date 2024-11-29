package com.example.mastercalculatorandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity4 extends AppCompatActivity {

    private ImageView backButton;
    private Button calculateButton;
    private TextView totalInvest2;
    private EditText Amount,Rate,TimePeriods;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main4);
        initBinding();

        //For back Button


        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // intent

                Intent intent = new Intent(MainActivity4.this, MainActivity2.class);
                startActivity(intent);
            }
        });
        // For Calculation

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate();
            }
        });
    }

    private void initBinding(){
        backButton = findViewById(R.id.BackButton3);
        calculateButton = findViewById(R.id.calculateValue);
        Amount = findViewById(R.id.Amount);
        Rate = findViewById(R.id.rate);
        TimePeriods = findViewById(R.id.timePeriods);
        totalInvest2 = findViewById(R.id.totalInvest2);
    }
    private void calculate() {
        String principalInput = Amount.getText().toString().trim();
        String rateInput = Rate.getText().toString().trim();
        String timeInput = TimePeriods.getText().toString().trim();

        if (principalInput.isEmpty()) {
            Amount.setError("Enter the principal amount");
            return;
        } else if (rateInput.isEmpty()) {
            Rate.setError("Enter the annual rate of interest");
            return;
        } else if (timeInput.isEmpty()) {
            TimePeriods.setError("Enter the time period in years");
            return;
        }

        try {
            double principal = Double.parseDouble(principalInput);
            double rate = Double.parseDouble(rateInput);
            double time = Double.parseDouble(timeInput);

            // Formula to calculate simple interest
            double interest = (principal * rate * time) / 100;

            // Display the calculated interest
            totalInvest2.setText(String.format("%.2f", interest));
        } catch (NumberFormatException e) {
            Amount.setError("Invalid input");
            Rate.setError("Invalid input");
            TimePeriods.setError("Invalid input");
        }
    }

}