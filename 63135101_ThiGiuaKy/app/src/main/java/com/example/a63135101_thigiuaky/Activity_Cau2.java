package com.example.a63135101_thigiuaky;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class Activity_Cau2 extends AppCompatActivity {
    private ListView listView;
    private ArrayList<String> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cau2);
        listView = findViewById(R.id.listView);

        itemList = new ArrayList<>();
        itemList.add("🎵 Bài hát: Nơi này có anh");
        itemList.add("🎵 Bài hát: Sóng gió");

        // Adapter để đưa dữ liệu vào ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, itemList);
        listView.setAdapter(adapter);

        // Bắt sự kiện click vào item
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = itemList.get(position);

                // Chuyển dữ liệu sang ItemActivity
                Intent intent = new Intent(Activity_Cau2.this, ItemActivity.class);
                intent.putExtra("selected_item", selectedItem);
                startActivity(intent);
            }
        });
    }
}