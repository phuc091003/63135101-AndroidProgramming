package com.example.a63135101_giuaki;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class Activity_chucnang3 extends AppCompatActivity {
    private ListView listView;
    private ArrayList<String> itemList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chucnang3);
        listView = findViewById(R.id.listView);

        itemList = new ArrayList<>();
        itemList.add("Lập trình C");
        itemList.add("Lập trình Java");
        itemList.add("Phát triển ứng dụng web");
        itemList.add("Khai phá dữ liệu lớn");
        itemList.add("Internet vạn vật kết nối");
        itemList.add("Học máy");


        // Adapter để đưa dữ liệu vào ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, itemList);
        listView.setAdapter(adapter);

        // Bắt sự kiện click vào item
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = itemList.get(position);

                // Chuyển dữ liệu sang ItemActivity
                Intent intent = new Intent(Activity_chucnang3.this, Item3Activity.class);
                intent.putExtra("selected_item", selectedItem);
                startActivity(intent);
            }
        });
    }
}