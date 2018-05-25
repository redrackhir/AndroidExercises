package com.example.mmut.app003;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final boolean[] answers = {false, false, true};
    private final String[] questions = {"Are you an extraterrestrian?", "Do we live in a satellite?", "Is 2 an even number?"};
    Button btnNext;
    Button btnPrev;
    private int qNum = 0;
    private TextView quiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        quiz = findViewById(R.id.textView1);
        btnNext = findViewById(R.id.btnNext);
        btnPrev = findViewById(R.id.btnPrevious);
    }

    public void btnYes(View view) {
        Toast.makeText(this, answerResult(true), Toast.LENGTH_SHORT).show();
    }

    public void btnNo(View view) {
        Toast.makeText(this, answerResult(false), Toast.LENGTH_SHORT).show();
    }

    private String answerResult(boolean value) {
        return answers[qNum] == value ? "Correct!" : "Incorrect";
    }

    private void setQuiz() {
        quiz.setText(questions[qNum]);
        btnNext.setEnabled(qNum < answers.length - 1);
        btnPrev.setEnabled(qNum > 0);
    }

    public void btnNext(View view) {
        qNum++;
        setQuiz();
    }


    public void btnPrev(View view) {
        qNum--;
        setQuiz();
    }

}
