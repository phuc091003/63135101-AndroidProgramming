package com.example.a63135101_thigiuaky;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnCau1 = findViewById(R.id.btncau1);
        btnCau1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iCau1 = new Intent(MainActivity.this, Activity_Cau1.class);
                startActivity(iCau1);
            }
        });
        Button btnCau2 = findViewById(R.id.btncau2);
        btnCau2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iCau2 = new Intent(MainActivity.this, Activity_Cau2.class);
                startActivity(iCau2);
            }
        });

        Button btnCau4 = findViewById(R.id.btncau4);
        btnCau4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iCau4 = new Intent(MainActivity.this, Activity_Cau4.class);
                startActivity(iCau4);
            }
        });
    }
}