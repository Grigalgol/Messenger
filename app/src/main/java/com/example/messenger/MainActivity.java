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
        Intent intent = new Intent(Intent.ACTION_SEND); //простой текст
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, msg);
        Intent chosenintent = Intent.createChooser(intent, getString(R.string.chooser_title));
        startActivity(chosenintent);
    }
}