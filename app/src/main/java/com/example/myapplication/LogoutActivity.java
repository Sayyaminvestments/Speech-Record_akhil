package com.example.myapplication;

import android.annotation.SuppressLint;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class LogoutActivity extends AppCompatActivity {

    private Button button;
  //  private ImageButton imageButton1;
   // private ImageButton imageButton2;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);

        BottomNavigationView bottomNavigationView = findViewById(R.id.botoom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.about);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.dashbord:
                        startActivities(new Intent[]{new Intent(getApplicationContext(), HomeActivity.class)});
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.home:
                        startActivities(new Intent[]{new Intent(getApplicationContext(), AudioActivity.class)});
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.about:

                        return true;
                }

                return false;
            }
        });

        button = findViewById(R.id.button_logout);

        button.setOnClickListener(v -> {
            // add your logout logic here
            Intent intent = new Intent(LogoutActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });

    }}

