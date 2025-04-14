package com.example.a63135101_giuaki;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Item3Activity extends AppCompatActivity {
    private TextView itemTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_item3);
        itemTextView = findViewById(R.id.itemTextView);

        String selectedItem = getIntent().getStringExtra("selected_item");

        if (selectedItem != null) {
            itemTextView.setText(selectedItem);
        }
    }
}