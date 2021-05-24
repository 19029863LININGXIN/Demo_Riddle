package sg.edu.rp.c346.id19029863.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity2 extends AppCompatActivity {
    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);
        answer = findViewById(R.id.answer2);
        Intent intentReceived = getIntent();
        String questionsSelected = intentReceived.getStringExtra("Question2");
        answer.setText(questionsSelected + " answer is: Gone");

    }
}