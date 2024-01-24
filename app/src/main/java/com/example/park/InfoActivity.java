package com.example.park;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        AppCompatButton getDirection = findViewById(R.id.directionBtn);
        AppCompatButton book = findViewById(R.id.bookBtn);

        getDirection.setOnClickListener(view ->{
            Intent intent = new Intent(InfoActivity.this,MapsActivity.class);
            startActivity(intent);
        });

        book.setOnClickListener(view ->{
            Intent intent = new Intent(InfoActivity.this,CarActivity.class);
        });
    }
}