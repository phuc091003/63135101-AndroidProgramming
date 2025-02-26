package com.example.ex3_simplesumapp;

import android.os.Bundle;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    //Bo lang nghe va xu ly su kien click len nut tinh tong
    public void XuLyCong(View view){
        //Tim va tham chieu den dieu khien tren tep XML
        EditText editTextSoA = findViewById(R.id.edtA);
        EditText editTextSoB = findViewById(R.id.edtB);
        EditText editTextKetQua = findViewById(R.id.edtKQ);
        //Lay du lieu ve o dieu khien so a
        String strA= editTextSoA.getText().toString();
        //Lay du lieu ve o dieu khien so a
        String strB= editTextSoB.getText().toString();
        //Chuyen du lieu sang dang so
        int so_A= Integer.parseInt(strA);
        int so_B= Integer.parseInt(strB);
        // Tinh toan theo yeu cau
        int tong = so_A + so_B;
        String strTong = String.valueOf(tong);
        //Hien ra man hinh
        editTextKetQua.setText(strTong);
    }
}