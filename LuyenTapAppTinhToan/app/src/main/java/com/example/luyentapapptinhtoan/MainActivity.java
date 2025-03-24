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
        TimDieuKhien();
    }
    public void TimDieuKhien(){
        btnCong = (Button) findViewById(R.id.btnCong);
        btnTru = (Button) findViewById(R.id.btnTru);
        btnNhan = (Button) findViewById(R.id.btnNhan);
        btnChia = (Button) findViewById(R.id.btnChia);
        edt1 = (EditText) findViewById(R.id.edt1);
        edt2 = (EditText) findViewById(R.id.edt2);
        edtKetQua = (EditText) findViewById(R.id.edtKetQua);
    }
    public void XuLyCong(View view){
        String sothunhat = edt1.getText().toString();
        String sothuhai = edt2.getText().toString();

        float a = Float.parseFloat(sothunhat);
        float b = Float.parseFloat(sothuhai);
        float Tong = a + b;
        String chuoiKQ = String.valueOf(Tong);
        edtKetQua.setText(String.valueOf(chuoiKQ));
    }
    public void XuLyTru(View view){
        String sothunhat = edt1.getText().toString();
        String sothuhai = edt2.getText().toString();

        float a = Float.parseFloat(sothunhat);
        float b = Float.parseFloat(sothuhai);
        float Hieu = a - b;
        String chuoiKQ = String.valueOf(Hieu);
        edtKetQua.setText(String.valueOf(chuoiKQ));
    }
    public void XuLyNhan(View view){
        String sothunhat = edt1.getText().toString();
        String sothuhai = edt2.getText().toString();

        float a = Float.parseFloat(sothunhat);
        float b = Float.parseFloat(sothuhai);
        float Nhan = a * b;
        String chuoiKQ = String.valueOf(Nhan);
        edtKetQua.setText(String.valueOf(chuoiKQ));
    }
    public void XuLyChia(View view){
        String sothunhat = edt1.getText().toString();
        String sothuhai = edt2.getText().toString();

        float a = Float.parseFloat(sothunhat);
        float b = Float.parseFloat(sothuhai);
        float Chia = a / b;
        String chuoiKQ = String.valueOf(Chia);
        edtKetQua.setText(String.valueOf(chuoiKQ));
    }

}