package com.example.mastercalculatorandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button startAppButton = findViewById(R.id.click_here);
        Button aboutUsButton = findViewById(R.id.knowMore);

        // for start app

        startAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Intent
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);

            }
        });

        //for About us

        aboutUsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Intent
                Intent intent = new Intent(MainActivity.this,MainActivity9.class);
                startActivity(intent);

            }
        });



    }
}