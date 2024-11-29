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

public class MainActivity5 extends AppCompatActivity {

    private ImageView backButton;
    private EditText amount , priceDiscount;
    private Button calculateButton;
    private TextView priceAfterDiscount ,savedPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main5);
        initBinding();

        //For back Button

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // intent

                Intent intent = new Intent(MainActivity5.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        // for calculate

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate();
            }
        });


    }

    public void initBinding(){
        backButton = findViewById(R.id.BackButton4);
        amount = findViewById(R.id.amount);
        priceDiscount = findViewById(R.id.priceDiscount);
        calculateButton = findViewById(R.id.calculateValue);
        priceAfterDiscount = findViewById(R.id.priceAfterDiscount);
        savedPrice = findViewById(R.id.savedPrice);
    }

    public void calculate(){

        String price = amount.getText().toString();
        String discount = priceDiscount.getText().toString();

        if (price.isEmpty()) {
            amount.setError("Enter Your Amount");

        }
        else if (discount.isEmpty()) {
            priceDiscount.setError("Enter Your Discount");
        }
        else {

            double amount1 = Double.parseDouble(amount.getText().toString());
            double interest1 = Double.parseDouble(priceDiscount.getText().toString());

            double  a = ((amount1) * (interest1)) / 100;

            priceAfterDiscount.setText(String.valueOf((int)(amount1-a)));
            savedPrice.setText(String.valueOf((int) a));

        }
    }

}