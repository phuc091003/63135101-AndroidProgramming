package com.example.a63135101_giuaki;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
public class MainActivity extends AppCompatActivity {
    Button btncn2, btncn3, btncn5, btnme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btncn2 = findViewById(R.id.btncn2);
        btncn3 = findViewById(R.id.btncn3);
        btncn5 = findViewById(R.id.btncn5);
        btnme = findViewById(R.id.btnme);

        btncn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iCau1 = new Intent(MainActivity.this, Activity_chucnang3.class);
                startActivity(iCau1);
            }
        });
        btnme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutme = new Intent(MainActivity.this, AboutMe.class);
                startActivity(aboutme);
            }
        });
        btncn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iCau5 = new Intent(MainActivity.this, Activity_chucnang5.class);
                startActivity(iCau5);
            }
        });
        btncn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iCau2 = new Intent(MainActivity.this, Activity_chucnang2.class);
                startActivity(iCau2);
            }
        });

    }
}