package com.example.listview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //B1 chuan bi du lieu
        ArrayList<String> nguonDuLieu = new ArrayList<String>();
        nguonDuLieu.add("Em của ngày hôm qua");
        nguonDuLieu.add("Nắng ấm xa dần");
        nguonDuLieu.add("Buông đôi tay nhau ra ");
        nguonDuLieu.add("Chúng ta của hiện tại");
        nguonDuLieu.add("Cơn mưa ngang qua");
        //B2 tim tham chieu den listview
        ListView listViewBH = (ListView) findViewById(R.id.lvDS);
        //B3 tao adapter, 
    }
}