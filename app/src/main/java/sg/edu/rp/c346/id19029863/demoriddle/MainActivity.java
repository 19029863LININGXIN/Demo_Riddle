package sg.edu.rp.c346.id19029863.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button reveal1;
    Button reveal2;
    TextView answer1, answer2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MainActivity", "onCreate() called.");
        setContentView(R.layout.activity_main);
        reveal1 = findViewById(R.id.ButtonRevealQ1);
        reveal2 = findViewById(R.id.ButtonRevealQ2);
        answer1 = findViewById(R.id.Answer);
        answer2 = findViewById(R.id.answer2);

        reveal1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AnswerActivity1.class);
                intent.putExtra("Question", "Q1");
                startActivity(intent);
            }
        });

        reveal2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AnswerActivity1.class);
                intent.putExtra("Question", "Q2");
                startActivity(intent);

            }
        });

    }

    @Override
    protected void onStart() {
        Log.d("MainActivity", "onStart() called.");
        super.onStart();
    }
    @Override
    protected void onResume() {
        Log.d("MainActivity", "onResume() called.");
        super.onResume();
    }
    @Override
    protected void onPause() {
        Log.d("MainActivity", "onPause() called.");
        super.onPause();
    }
    @Override
    protected void onStop() {
        Log.d("MainActivity", "onStop() called.");
        super.onStop();
    }
    @Override
    protected void onDestroy() {
        Log.d("MainActivity", "onDestroy() called.");
        super.onDestroy();
    }
    @Override
    protected void onRestart() {
        Log.d("MainActivity", "onRestart() called.");
        super.onRestart();
    }



}