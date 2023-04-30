package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button loginButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        usernameEditText = findViewById(R.id.mobile);
        passwordEditText = findViewById(R.id.password);
        loginButton = findViewById(R.id.button_login);
        EditText passwordEditText = findViewById(R.id.password);
        ImageView showPasswordButton = findViewById(R.id.toggleButton);


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                if (username.equals("9087750187") && password.equals("12345")) {

                // if login is successful, start the next activity
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
               startActivity(intent);
                finish();
            }}
        });
        showPasswordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int cursorPosition = passwordEditText.getSelectionEnd(); // save cursor position
                if (passwordEditText.getTransformationMethod() == PasswordTransformationMethod.getInstance()) {
                    // show password
                    passwordEditText.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    showPasswordButton.setImageResource(R.drawable.account_login_eye_open);
                } else {
                    // hide password
                    passwordEditText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    showPasswordButton.setImageResource(R.drawable.account_login_eye_close);
                }
                passwordEditText.setSelection(cursorPosition); // restore cursor position
            }
        });





    }
}
