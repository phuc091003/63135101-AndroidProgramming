package com.example.a63135101_giuaki;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity_chucnang5 extends AppCompatActivity {
    public EditText inputValue;
    public Spinner fromUnit;
    public Spinner toUnit;
    public Button convertButton;
    public TextView resultText;
    public String[] units = {"m", "km"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chucnang5);
        inputValue = findViewById(R.id.input_value);
        fromUnit = findViewById(R.id.from_unit);
        toUnit = findViewById(R.id.to_unit);
        convertButton = findViewById(R.id.convert_button);
        resultText = findViewById(R.id.result_text);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, units);
        fromUnit.setAdapter(adapter);
        toUnit.setAdapter(adapter);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertUnits();
            }
        });
    }

    private void convertUnits() {
        String input = inputValue.getText().toString();
        if (input.isEmpty()) {
            resultText.setText("Vui lòng nhập giá trị");
            return;
        }
        double value = Double.parseDouble(input);
        String from = fromUnit.getSelectedItem().toString();
        String to = toUnit.getSelectedItem().toString();
        double result;
        if (from.equals("m") && to.equals("km")) {
            result = value / 1000;
        } else if (from.equals("km") && to.equals("m")) {
            result = value * 1000;
        } else {
            result = value;
        }
        resultText.setText(String.format("Kết quả: %.3f %s", result, to));
    }
}