package com.example.ex7_intentlogin;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnXacNhan = (Button) findViewById(R.id.btnOK);
        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                //xu ly dang nhap
                EditText edTenDN = (EditText) findViewById(R.id.edtUsername);
                EditText edPass = (EditText) findViewById(R.id.edtPass);
                String tenDangNhap = edTenDN.getText().toString();
                String mk = edPass.getText().toString();
                //ktra mat khau
                if( tenDangNhap.equals("phuc091003") && mk.equals("hoilamj12")){
                    Intent iQuiz = new Intent(LoginActivity.this, HomeActivity.class);
                    iQuiz.putExtra("ten_dang_nhap", tenDangNhap);
                    iQuiz.putExtra("mk_dang_nhap", mk);
                    // gui di
                    startActivity(iQuiz);

                }
                else {
                    Toast.makeText(LoginActivity.this, "Sai thông tin", Toast.LENGTH_LONG);
                }
            }
        });
    }
}