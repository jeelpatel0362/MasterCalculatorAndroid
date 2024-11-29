package com.example.mastercalculatorandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    private ImageView backButton;
    private LinearLayout MutualFund,interest,Discount,EMI,SchoolResult,SquareorHour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        initBinding();

        //For back Button

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // intent

                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // For Mutual Fund

        MutualFund.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
            }
        });

        // For Interest

        interest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity4.class);
                startActivity(intent);
            }
        });

        // For Discount

        Discount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity5.class);
                startActivity(intent);
            }
        });

        // For EMI

        EMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,MainActivity6.class);
                startActivity(intent);
            }
        });

        // For School Result

        SchoolResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,MainActivity7.class);
                startActivity(intent);
            }
        });

       // For Square & Hour

        SquareorHour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity8.class);
                startActivity(intent);
            }
        });
    }

    private void initBinding() {
        backButton = findViewById(R.id.BackButton1);
        MutualFund = findViewById(R.id.mutualFund);
        interest = findViewById(R.id.interest);
        Discount = findViewById(R.id.Discount);
        EMI = findViewById(R.id.EMI);
        SchoolResult = findViewById(R.id.SchoolResult);
        SquareorHour = findViewById(R.id.SquareorHour);
    }
}