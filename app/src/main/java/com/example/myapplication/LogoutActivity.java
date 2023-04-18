package com.example.myapplication;

import android.annotation.SuppressLint;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class LogoutActivity extends AppCompatActivity {

    private Button button;
  //  private ImageButton imageButton1;
   // private ImageButton imageButton2;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);


        button = findViewById(R.id.button_logout);

        button.setOnClickListener(v -> {
            // add your logout logic here
            Intent intent = new Intent(LogoutActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });

        ImageButton myImageButton = findViewById(R.id.rec_btn);
        myImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LogoutActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        ImageButton ImageButton = findViewById(R.id.act_btn);
        ImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LogoutActivity.this, LogoutActivity.class);
                startActivity(intent);
            }
        });


    }
    /* ImageButton myButton = findViewById(R.id.record);


        myButton.setOnClickListener(view -> {
            Intent intent = new Intent(LogoutActivity.this, HomeActivity.class);
            startActivity(intent);
        });

       imageButton1 = new ImageButton(this);
        imageButton2 = new ImageButton(this);

        imageButton1.setImageResource(R.drawable.record_shade);
        imageButton2.setImageResource(R.drawable.audio_shade);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(100, 100);
        imageButton1.setLayoutParams(params);
        imageButton2.setLayoutParams(params);

        LinearLayout linearLayout = findViewById(R.id.linear_layout);
        linearLayout.addView(imageButton1);
        linearLayout.addView(imageButton2);


*/

    }

