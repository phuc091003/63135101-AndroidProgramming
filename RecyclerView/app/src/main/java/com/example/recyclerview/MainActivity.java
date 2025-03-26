package com.example.recyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.example.recyclerview.LandScape;
import com.example.recyclerview.LandScapeAdapter;
import com.example.recyclerview.R;

public class MainActivity extends AppCompatActivity {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> recylerViewDatas;
    RecyclerView recyclerViewLandscape;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //3
        recylerViewDatas = getDataForRecyclerView();
        //4
        recyclerViewLandscape = findViewById(R.id.recycleLand);
        //5
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
        recyclerViewLandscape.setLayoutManager(layoutLinear);
        //6
        landScapeAdapter = new LandScapeAdapter(this, recylerViewDatas);
        //7
        recyclerViewLandscape.setAdapter(landScapeAdapter);

    }
    ArrayList<LandScape> getDataForRecyclerView(){
        ArrayList<LandScape> dsDuLieu = new ArrayList<LandScape>();
        LandScape landScape1 = new LandScape("flag_tower_of_hanoi","Cột cờ Hà Nội");
        dsDuLieu.add(landScape1);
        dsDuLieu.add(new LandScape("effel","Tháp effel"));
        dsDuLieu.add(new LandScape("buckingham","Cung Điện Buckingham"));
        dsDuLieu.add(new LandScape("statue_of_liberty","Tượng nữ thần tự do"));
        return dsDuLieu;
    }
}