package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Answer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        TextView Info = findViewById(R.id.information);
        ImageView Image = findViewById(R.id.Image);
        Random random = new Random();
        int Random_Number = (random.nextInt(6-1)+1);
        String answer = String.valueOf(Random_Number);
        String Guess = getIntent().getSerializableExtra("Data").toString();
        Log.d("debug",answer);
        Log.d("debug", Guess);
        Log.d("debug",Boolean.toString(answer == Guess));
        if (answer.equals(Guess)){
            Info.setText("Your guess is correct!");
            Image.setImageResource(R.drawable.happy);}
        else{
            Info.setText("Your guess is incorrect, the answer was "+ answer);
            Image.setImageResource(R.drawable.sad);}
        Button mPlay = findViewById(R.id.Back);
        mPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Answer.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
