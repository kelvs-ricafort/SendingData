package com.newtechieblog.wordpress.views.sendingdata;

import android.os.Bundle;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class MyDialogFragment extends DialogFragment {

    Button btnOK, btnCancel;
    EditText editTextEnter;
    public MyDialogFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_dialog, container, false);

        editTextEnter = view.findViewById(R.id.editTextEnter);
        btnOK = view.findViewById(R.id.btnOk);
        btnCancel = view.findViewById(R.id.btnCancel);

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userEnter = editTextEnter.getText().toString();
                ((MainActivity) getActivity()).textViewResult.setText(userEnter);
                getDialog().dismiss();
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getDialog().dismiss();
            }
        });
        return view;
    }
}