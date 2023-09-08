package com.droidfreshsquad.demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



public class Forgot extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgetpass_layout);
        Button buttonsendOTP = findViewById(R.id.btnOTP);

        buttonsendOTP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Forgot.this, sendOTP.class);

                startActivity(intent);
            }
        });
    }
}