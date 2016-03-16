package com.example.student.lab03_courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreTeamA;
    int scoreTeamB;

    private void TeamA(int score) {
        TextView TeamA = (TextView) findViewById(R.id.team_a_score);
        TeamA.setText(String.valueOf(score));
    }

    public void add3ForTeamA(View view) {
        scoreTeamA += 3;
        TeamA(scoreTeamA);
    }

    public void add2ForTeamA(View view) {
        scoreTeamA += 2;
        TeamA(scoreTeamA);
    }

    public void add1ForTeamA(View view) {
        scoreTeamA += 1;
        TeamA(scoreTeamA);
    }

    private void TeamB(int score) {
        TextView TeamB = (TextView) findViewById(R.id.team_b_score);
        TeamB.setText(String.valueOf(score));
    }

    public void add3ForTeamB(View view) {
        scoreTeamB += 3;
        TeamB(scoreTeamB);
    }

    public void add2ForTeamB(View view) {
        scoreTeamB += 2;
        TeamB(scoreTeamB);
    }

    public void add1ForTeamB(View view) {
        scoreTeamB += 1;
        TeamB(scoreTeamB);
    }

    public void resetScoreView(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        TeamA(scoreTeamA);
        TeamB(scoreTeamB);

    }

}
