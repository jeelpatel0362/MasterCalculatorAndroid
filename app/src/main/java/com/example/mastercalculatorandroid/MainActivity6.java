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

public class MainActivity6 extends AppCompatActivity {

    private ImageView backButton;
    private TextView emiTotalAmount,emiTotalInterest,totalPayableAmount;
    private Button calculateButton;
    private EditText loanAmount,emiInterestRate,emiTimePeriods;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main6);
        initBinding();

        //For back Button

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // intent

                Intent intent = new Intent(MainActivity6.this, MainActivity2.class);
                startActivity(intent);
            }
        });
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate();
            }
        });
    }

    public void initBinding(){
        backButton = findViewById(R.id.BackButton5);
        emiTotalAmount = findViewById(R.id.emiTotalAmount);
        emiTotalInterest = findViewById(R.id.emiTotalInterest);
        totalPayableAmount = findViewById(R.id.totalPayableAmount);
        loanAmount = findViewById(R.id.loanAmount);
        emiInterestRate = findViewById(R.id.emiInterestRate);
        emiTimePeriods = findViewById(R.id.emiTimePeriods);
        calculateButton = findViewById(R.id.calculateValue);
    }

    public void calculate(){
        String amount = loanAmount.getText().toString();
        String interest = emiInterestRate.getText().toString();
        String year = emiTimePeriods.getText().toString();

        if (amount.isEmpty()) {
            loanAmount.setError("Enter Your Amount");

        }
        else if (interest.isEmpty()) {
            emiInterestRate.setError("Enter Your Interest");
        }
        else if (year.isEmpty()) {
            emiTimePeriods.setError("Enter Your Year");
        }
        else {

            double amount1 = Double.parseDouble(loanAmount.getText().toString());
            double interest1 = Double.parseDouble(emiInterestRate.getText().toString());
            double year1 = Double.parseDouble(emiTimePeriods.getText().toString());

            double monthlyInterestRate = (interest1/12)/100;
            double numberOfPayments = year1 * 12;
            double emi = amount1 * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments) / ( Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
            emiTotalAmount.setText(String.valueOf((int) emi));
            emiTotalInterest.setText(String.valueOf((int)((emi*numberOfPayments)-amount1)));
            totalPayableAmount.setText(String.valueOf((int)(emi*numberOfPayments)));

        }

    }
}