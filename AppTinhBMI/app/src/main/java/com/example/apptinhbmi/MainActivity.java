package com.example.apptinhbmi;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    public EditText edtWeight, edtHeight;
    public TextView txtResult;
    public ImageView imgCategory;
    public RadioGroup radioGroup;
    public RadioButton radioWho, radioIDI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtWeight = findViewById(R.id.edtWeight);
        edtHeight = findViewById(R.id.edtHeight);
        txtResult = findViewById(R.id.txtResult);
        edtHeight = findViewById(R.id.edtHeight);
        edtHeight = findViewById(R.id.edtHeight);
        edtHeight = findViewById(R.id.edtHeight);
        edtHeight = findViewById(R.id.edtHeight);
    }
}