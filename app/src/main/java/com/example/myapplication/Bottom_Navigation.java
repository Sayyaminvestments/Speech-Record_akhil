package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Bottom_Navigation extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.settings);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){

                    case R.id.home:
                        startActivities(new Intent[]{new Intent(getApplicationContext(), HomeActivity.class)});
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.notification:
                        startActivities(new Intent[]{new Intent(getApplicationContext(),MainActivity.class)});
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.settings:

                        return true;
                }
                return false;
            }
        });

    }
}