package com.example.a63135101_thigiuaky;

import android.os.Bundle;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ItemActivity extends AppCompatActivity {
    private TextView itemTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        // Ánh xạ TextView từ layout
        itemTextView = findViewById(R.id.itemTextView);

        // Nhận dữ liệu từ Intent
        String selectedItem = getIntent().getStringExtra("selected_item");

        // Hiển thị dữ liệu lên TextView
        if (selectedItem != null) {
            itemTextView.setText(selectedItem);
        }
    }
}