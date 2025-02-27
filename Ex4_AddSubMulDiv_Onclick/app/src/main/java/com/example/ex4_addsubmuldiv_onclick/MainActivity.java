package com.example.ex4_addsubmuldiv_onclick;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    Button nutCong,nutTru,nutNhan,nutChia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
    }
    void TimDieuKhien(){
        EditText editTextSo1 = (EditText) findViewById(R.id.edtSo1);
        EditText editTextSo2 = (EditText) findViewById(R.id.edtSo2);
        EditText editTextKQ = (EditText) findViewById(R.id.edtKetQua);
        nutCong = (Button) findViewById(R.id.btnCong);
        nutTru = (Button) findViewById(R.id.btnTru);
        nutNhan = (Button) findViewById(R.id.btnNhan);
        nutChia = (Button) findViewById(R.id.btnChia);

    }
    void XuLyCong(View v){
        //b1 tìm edittext số 1 và số 2
        //b2 Lấy dữ liệu từ 2 điều khiển đó
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //Chuyển dữ liệu từ chuỗi sang số
        float soA =  Float.parseFloat(soThu1);
        float soB =  Float.parseFloat(soThu2);
        // tính toán
        float Tong = soA + soB;
        String chuoiKQ = String.valueOf(Tong);
        editTextKQ.setText(chuoiKQ);

    }
    void XuLyTru(View v){
        //b1 tìm edittext số 1 và số 2
        //b2 Lấy dữ liệu từ 2 điều khiển đó
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //Chuyển dữ liệu từ chuỗi sang số
        float soA =  Float.parseFloat(soThu1);
        float soB =  Float.parseFloat(soThu2);
        // tính toán
        float Tong = soA - soB;
        String chuoiKQ = String.valueOf(Tong);
        editTextKQ.setText(chuoiKQ);

    }
    void XuLyNhan(View v){
        //b1 tìm edittext số 1 và số 2
        //b2 Lấy dữ liệu từ 2 điều khiển đó
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //Chuyển dữ liệu từ chuỗi sang số
        float soA =  Float.parseFloat(soThu1);
        float soB =  Float.parseFloat(soThu2);
        // tính toán
        float Tong = soA * soB;
        String chuoiKQ = String.valueOf(Tong);
        editTextKQ.setText(chuoiKQ);

    }
    void XuLyChia(View v){
        //b1 tìm edittext số 1 và số 2
        //b2 Lấy dữ liệu từ 2 điều khiển đó
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //Chuyển dữ liệu từ chuỗi sang số
        float soA =  Float.parseFloat(soThu1);
        float soB =  Float.parseFloat(soThu2);
        // tính toán
        float Tong = soA / soB;
        String chuoiKQ = String.valueOf(Tong);
        editTextKQ.setText(chuoiKQ);
    }
}