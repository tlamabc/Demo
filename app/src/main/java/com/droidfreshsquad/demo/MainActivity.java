package com.droidfreshsquad.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
    }
    public void openProfile(View view) {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }
    public void openSignUp(View view) {
        Intent intent = new Intent(this, SignupActivity.class);
        startActivity(intent);
    }
    public void openForgot(View view) {
        Intent intent = new Intent(this, Forgot.class);
        startActivity(intent);
    }
    public void openOTP(View view) {
        Intent intent = new Intent(this, sendOTP.class);
        startActivity(intent);
    }
}