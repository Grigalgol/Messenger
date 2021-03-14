package com.example.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReseveMessageActivity extends AppCompatActivity {

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reseve_message);
        Intent intent = getIntent();
        String msg = intent.getStringExtra("msg");
        textView = findViewById(R.id.textView);
        textView.setText(msg);
    }
}