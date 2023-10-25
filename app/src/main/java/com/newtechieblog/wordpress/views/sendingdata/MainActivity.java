package com.newtechieblog.wordpress.views.sendingdata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView name, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FirstFragment firstFragment = new FirstFragment();

        fragmentTransaction.add(R.id.linear, firstFragment);

        fragmentTransaction.commit();
    }

    public void takeData(String userName, String userEmail) {
        name = findViewById(R.id.textViewName);
        email = findViewById(R.id.textViewEmail);

        name.setText(userName);
        email.setText(userEmail);
    }
}