package com.messymaze.csquiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView cardView1 = findViewById(R.id.topic_card);
        cardView1.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, QuizActivity.class);
        });
    }
}