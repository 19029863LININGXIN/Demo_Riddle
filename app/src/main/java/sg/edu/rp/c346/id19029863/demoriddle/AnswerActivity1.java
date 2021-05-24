package sg.edu.rp.c346.id19029863.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity1 extends AppCompatActivity {
    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);
        answer = findViewById(R.id.Answer);
        Intent intentReceived = getIntent();

        String questionsSelected = intentReceived.getStringExtra("Question");
        if (questionsSelected.equalsIgnoreCase("Q1")){
            answer.setText(questionsSelected + " answer is: Queue");
        }else if(questionsSelected.equalsIgnoreCase("Q2")){
            answer.setText(questionsSelected + " answer is: Gone");

        }
    }
}