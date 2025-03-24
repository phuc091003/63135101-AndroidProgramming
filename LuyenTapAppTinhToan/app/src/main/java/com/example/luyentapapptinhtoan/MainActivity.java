package com.example.luyentapapptinhtoan;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Button btnCong;
    Button btnTru;
    Button btnNhan;
    Button btnChia;
    EditText edt1;
    EditText edt2;
    EditText edtKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCong = findViewById(R.id.btnCong);
        btnTru = findViewById(R.id.btnTru);
        btnNhan = findViewById(R.id.btnNhan);
        btnChia = findViewById(R.id.btnChia);
        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
        edtKetQua = findViewById(R.id.edtKetQua);
    }
}