package com.example.android.tudien;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.android.trada.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Đặt nội dung của activity để dùng trong activity_main.xml layout
        setContentView(R.layout.activity_main);
    }
}