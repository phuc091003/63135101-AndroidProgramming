package com.example.appchitieu_final;

import android.os.Bundle;
import android.widget.Toast;

import

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNav;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNav = findViewById(R.id.bottom_nav);
        fab = findViewById(R.id.fab_add);

        // Load mặc định HomeFragment
        loadFragment(new HomeFragment());

        bottomNav.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.nav_home:
                    loadFragment(new HomeFragment());
                    return true;
                case R.id.nav_transaction:
                    loadFragment(new TransactionFragment());
                    return true;
                case R.id.nav_statistics:
                    loadFragment(new StatisticsFragment());
                    return true;
                case R.id.nav_profile:
                    loadFragment(new ProfileFragment());
                    return true;
            }
            return false;
        });

        fab.setOnClickListener(v -> {
            Toast.makeText(this, "Thêm giao dịch", Toast.LENGTH_SHORT).show();
            // Sau này mở activity hoặc fragment thêm giao dịch
        });
    }
    
    private void loadFragment(TransactionFragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();
    }
}
