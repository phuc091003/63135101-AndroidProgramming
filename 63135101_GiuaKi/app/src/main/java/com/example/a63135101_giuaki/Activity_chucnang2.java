package com.example.a63135101_giuaki;

import android.os.Bundle;
import android.widget.EditText;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity_chucnang2 extends AppCompatActivity {
    EditText qt;
    EditText gk;
    EditText ck;
    EditText edtKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chucnang2);
        qt = findViewById(R.id.qt);
        gk = findViewById(R.id.gk);
        ck = findViewById(R.id.ck);
        edtKetQua = findViewById(R.id.edtKetQua);

    }
    public void tinhDiem(View view) {
        double diemQT = Double.parseDouble(qt.getText().toString());
        double diemGK = Double.parseDouble(gk.getText().toString());
        double diemCK = Double.parseDouble(ck.getText().toString());
        double diemTB = (diemQT * 0.2) + (diemGK * 0.3) + (diemCK * 0.5);
        edtKetQua.setText(String.valueOf(diemTB));
    }
}