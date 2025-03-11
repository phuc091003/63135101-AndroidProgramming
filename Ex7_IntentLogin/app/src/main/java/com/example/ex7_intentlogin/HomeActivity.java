package com.example.ex7_intentlogin;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Intent intentTuLogin = getIntent();

        String tenDN_NhanDuoc = intentTuLogin.getStringExtra("ten_dang_nhap");

        TextView tvTenDN = (TextView) findViewById(R.id.tvUserName);
        tvTenDN.setText(tenDN_NhanDuoc);
    }
}