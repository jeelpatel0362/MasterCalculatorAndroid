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

public class MainActivity7 extends AppCompatActivity {

    private ImageView backButton;
    private TextView yourPercentage;
    private Button calculateButton;
    private EditText totalmarks,yourTotalMarks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main7);
        initBinding();

        //For back Button

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // intent

                Intent intent = new Intent(MainActivity7.this, MainActivity2.class);
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
         backButton = findViewById(R.id.BackButton6);
         totalmarks = findViewById(R.id.totalmarks);
         yourTotalMarks = findViewById(R.id.yourTotalMarks);
         calculateButton = findViewById(R.id.calculateValue);
         yourPercentage = findViewById(R.id.yourPercentage);
     }

     public void calculate(){
         String Marks = totalmarks.getText().toString();
         String yourMarks = yourTotalMarks.getText().toString();

         if (Marks.isEmpty()) {
             totalmarks.setError("Enter Your Marks");

         }
         else if (yourMarks.isEmpty()) {
             yourTotalMarks.setError("Enter Your Total Marks");
         }
         else {


             try {
                 double marks = Double.parseDouble(yourMarks);
                 double total = Double.parseDouble(Marks);

                 double percentageValue = (marks / total) * 100;


                 yourPercentage.setText(String.format("%.2f%%", percentageValue));
             } catch (NumberFormatException e) {

                 e.printStackTrace();
             }
         }

         }
     }
