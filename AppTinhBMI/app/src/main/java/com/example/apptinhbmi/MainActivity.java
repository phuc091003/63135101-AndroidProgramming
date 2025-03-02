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
        imgCategory = findViewById(R.id.imgCategory);
        radioGroup = findViewById(R.id.radioGroup);
        radioWho = findViewById(R.id.radioWHO);
        radioIDI = findViewById(R.id.radioIDI);
    }

    public void onCalculateClick(View view) {
        String weightStr = edtWeight.getText().toString();
        String heightStr = edtHeight.getText().toString();
        if (!weightStr.isEmpty() && !heightStr.isEmpty()) {
            double weight = Double.parseDouble(weightStr);
            double height = Double.parseDouble(heightStr)/100;
            double bmi = weight / (height * height);
            boolean isWho = radioWho.isChecked();
            String category = getBMICategory(bmi, isWho);
            txtResult.setText(String.format("BMI: %.2f (%s)", bmi, category));
            updateCategoryImage(category);
        }
    }

    public String getBMICategory(double bmi, boolean isWHO) {
        if (isWHO) {
            if (bmi < 18.5) return "Cân nặng thấp (gầy) bạn cần ăn thêm ";
            else if (bmi < 24.9) return "Cơ thể bạn ở mức bình thường nên duy trì";
            else if (bmi < 29.9) return "Tiền béo phì bạn cần chú ý tới thuc đơn hằng ngày";
            else if (bmi < 34.9) return "Béo phì độ I bạn cần phải giảm cân";
            else if (bmi < 39.9) return "Béo phì độ II bạn cần phải giảm cân";
            else return "Béo phì độ III bạn cần phải giảm cân";
        } else {
            if (bmi < 18.5) return "Cân nặng thấp (gầy) bạn cần ăn thêm ";
            else if (bmi < 22.9) return "Cơ thể bạn ở mức bình thường nên duy trì";
            else if (bmi < 24.9) return "Tiền béo phì bạn cần chú ý tới thuc đơn hằng ngày";
            else if (bmi < 29.9) return "Béo phì độ I bạn cần phải giảm cân";
            else return "Béo phì độ II";
        }
    }
    private void updateCategoryImage(String category){
        imgCategory.setImageResource(R.drawable.anhbody);
    }
}