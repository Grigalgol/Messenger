package com.example.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editTextSendMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextSendMsg = findViewById(R.id.editTextMessage);
    }

    public void OnClickSendMessage(View view) {
        String msg = editTextSendMsg.getText().toString();
        Intent intent = new Intent(this, ReseveMessageActivity.class);
        intent.putExtra("msg",msg);
        startActivity(intent);
    }
}