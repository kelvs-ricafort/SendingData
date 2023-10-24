package com.newtechieblog.wordpress.views.sendingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textViewUserName, textViewUserEmail, textViewUserPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textViewUserName = findViewById(R.id.textViewUserName);
        textViewUserEmail = findViewById(R.id.textViewUserEmail);
        textViewUserPhone = findViewById(R.id.textViewUserPhone);

        Intent intent = getIntent();
        String userName = intent.getStringExtra("name");
        String userEmail = intent.getStringExtra("email");
        int userPhone = intent.getIntExtra("phone", 0);

        textViewUserName.setText("Hello, " + userName);
        textViewUserEmail.setText("Your email is: " + userEmail);
        textViewUserPhone.setText("Your phone number is: " + String.valueOf(userPhone));
    }
}