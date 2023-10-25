package com.newtechieblog.wordpress.views.sendingdata;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;



public class FirstFragment extends Fragment {
    EditText name, email;
    Button btnSend;

    public FirstFragment() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        name = view.findViewById(R.id.editTextName);
        email = view.findViewById(R.id.editTextEmail);
        btnSend = view.findViewById(R.id.btnSend);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = name.getText().toString();
                String userEmail = email.getText().toString();

                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.takeData(userName, userEmail);
            }
        });

        return view;
    }
}