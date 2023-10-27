package com.newtechieblog.wordpress.views.sendingdata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button btnShow;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       btnShow = findViewById(R.id.btnShow);
       textViewResult = findViewById(R.id.textViewResult);

       btnShow.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
                FragmentManager fragMan = getSupportFragmentManager();

                MyDialogFragment myDialogFragment = new MyDialogFragment();
                myDialogFragment.show(fragMan, "MyDialogFragment");
           }
       });
    }

}