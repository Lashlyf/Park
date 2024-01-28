package com.example.park;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



import java.util.regex.Pattern;

public class SignupActivity extends AppCompatActivity {
//    private FirebaseAuth mAuth;
      private static final Pattern EMAIL_ADDRESS = Pattern.compile("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" + "\\@" +
        "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" + "(" + "\\." + "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" + ")+");


    //    @Override
//    public void onStart() {
//        super.onStart();
//        if (mAuth != null) {
//            FirebaseUser currentUser = mAuth.getCurrentUser();
//            if (currentUser != null) {
//                currentUser.reload();
//            }
//        }
//    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

//      mAuth = FirebaseAuth.getInstance();

        EditText usernameInput = findViewById(R.id.signupName);
        EditText emailInput = findViewById(R.id.signupEmail);
        EditText passwordInput = findViewById(R.id.signupPassword);
        AppCompatButton btnSignup = findViewById(R.id.btnSignup);
        TextView loginRedirect = findViewById(R.id.loginRedirectText);

        btnSignup.setOnClickListener(view -> {
            String username = usernameInput.getText().toString();
            String email = emailInput.getText().toString();
            String password = passwordInput.getText().toString();

            if (TextUtils.isEmpty(email)) {
                Toast.makeText(SignupActivity.this, "Email is required", Toast.LENGTH_LONG).show();
                return;
            } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                emailInput.setError("Please enter a valid email address");
                return;
            }


            if (TextUtils.isEmpty(username)) {
                Toast.makeText(SignupActivity.this, "Username is required", Toast.LENGTH_LONG).show();
                return;
            }

            if (username.length() < 3) {
                Toast.makeText(SignupActivity.this, "Username should be at least three characters", Toast.LENGTH_SHORT).show();
                return;
            }

            if (TextUtils.isEmpty(password)) {
                Toast.makeText(SignupActivity.this, "Password is required", Toast.LENGTH_LONG).show();
                return;
            }
            if (password.length() < 6) {
                passwordInput.setError("Password should not be less than six characters");
                return;
            }

            Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
            startActivity(intent);

//            mAuth.createUserWithEmailAndPassword(email, password)
//                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
//                        @Override
//                        public void onComplete(@NonNull Task<AuthResult> task) {
//                            if (task.isSuccessful()) {
//                                Toast.makeText(SignupActivity.this,"Successfully created an account", Toast.LENGTH_SHORT).show();
//                                Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
//                                startActivity(intent);
//                            } else {
//                                // If sign in fails, display a message to the user.
//                                Toast.makeText(SignupActivity.this, "Authentication failed.",
//                                        Toast.LENGTH_SHORT).show();
//                            }
//                        }
//                    });


        });

        loginRedirect.setOnClickListener(view -> {
            Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
            startActivity(intent);
        });
    }

}