package com.example.assignment4;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class frag2 extends Fragment {


    public frag2() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_frag2, container, false);

        SharedPreferences sharedPreferences = getContext().getSharedPreferences("content", Context.MODE_PRIVATE);
        String msg = sharedPreferences.getString("msg", "Hello!");
        TextView display = view.findViewById(R.id.display_msg);
        display.setText(msg);


        return inflater.inflate(R.layout.fragment_frag2, container, false);
    }


}