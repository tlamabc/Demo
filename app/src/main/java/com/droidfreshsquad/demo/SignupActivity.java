package com.droidfreshsquad.demo;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_layout);

        // Nhận Button từ layout bằng ID
        Button buttonSignup = findViewById(R.id.buttonSignup);

        // Đính kèm một trình xử lý sự kiện khi người dùng nhấn nút
        buttonSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Tạo Intent để chuyển đến activity thứ hai
                Intent intent = new Intent(SignupActivity.this, ProfileActivity.class);

                // Khởi động activity thứ hai
                startActivity(intent);
            }
        });
    }
}