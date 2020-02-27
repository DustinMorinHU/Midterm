package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mPlay = findViewById(R.id.play);
        mPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText TextField = findViewById(R.id.TextEntry);
                String mUserData = TextField.getText().toString();
                Intent i = new Intent(MainActivity.this, Answer.class);
                i.putExtra("Data",mUserData);
                startActivity(i);
            }
        });
    }
}
