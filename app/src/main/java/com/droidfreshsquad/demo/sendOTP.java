package com.droidfreshsquad.demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;





public class sendOTP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.otp_layout);


        // Nhận Button từ layout bằng ID
        Button buttonveri = findViewById(R.id.veri);

        // Đính kèm một trình xử lý sự kiện khi người dùng nhấn nút
        buttonveri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Tạo Intent để chuyển đến activity thứ hai
                Intent intent = new Intent(sendOTP.this, LoginActivity.class);

                // Khởi động activity thứ hai
                startActivity(intent);
            }
        });
    }
}