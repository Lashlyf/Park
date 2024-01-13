package com.example.park;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        AppCompatButton btnSignup = findViewById(R.id.btnSignup);
        TextView loginRedirect = findViewById(R.id.loginRedirectText);

        btnSignup.setOnClickListener(view -> {
            Intent intent = new Intent(SignupActivity.this,LoginActivity.class);
            startActivity(intent);
        });

        loginRedirect.setOnClickListener(view -> {
            Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
            startActivity(intent);
        });
    }
}