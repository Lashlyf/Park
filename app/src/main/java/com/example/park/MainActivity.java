package com.example.park;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView Parking = findViewById(R.id.image5);
        ImageView Booking = findViewById(R.id.Booking);
        TextView  Book = findViewById(R.id.text6);
        TextView MainParking = findViewById(R.id.mainParking);

        MainParking.setOnClickListener(View ->{
            Intent intent = new Intent(MainActivity.this, InfoActivity.class);
            startActivity(intent);
        });

        Parking.setOnClickListener(View ->{
            Intent intent = new Intent(MainActivity.this, InfoActivity.class);
            startActivity(intent);
        });

        Booking.setOnClickListener(View ->{
            Intent intent = new Intent(MainActivity.this, MyBookingActivity.class);
            startActivity(intent);
        });

        Book.setOnClickListener(View ->{
            Intent intent = new Intent(MainActivity.this, MyBookingActivity.class);
            startActivity(intent);
        });
    }
}