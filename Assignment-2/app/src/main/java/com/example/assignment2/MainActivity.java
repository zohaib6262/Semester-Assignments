package com.example.assignment2;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView displayUsername = (TextView) findViewById(R.id.display_username);
        displayUsername.setText("Sajeel");
        ImageView displayImage = (ImageView) findViewById(R.id.display_picture);
        displayImage.setImageResource(R.drawable.house_cardimage);
    }
}