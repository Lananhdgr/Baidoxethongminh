package com.example.baidoxethongminh;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        @SuppressLint("WrongViewCast") Button myButton = findViewById(R.id.battatden);

        myButton.setOnClickListener(v -> {
            // Xử lý khi Button được nhấn
            // Đặt hành động mà bạn muốn thực hiện ở đây
            doSomethingOnClick();
        });
    }

    private void doSomethingOnClick() {
        // Hành động cần thực hiện khi Button được nhấn
        Toast.makeText(this, "Button Clicked!", Toast.LENGTH_SHORT).show();
        // Thay đổi hoặc thực hiện hành động khác tùy theo nhu cầu của bạn
    }

}