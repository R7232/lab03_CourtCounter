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
        TextView TeamA = (TextView) findViewById(R.id.Team_A);
        TeamA.setText(String.valueOf(score));
    }

    public void fraction3(View view) {
        scoreTeamA += 3;
        TeamA(scoreTeamA);
    }

    public void fraction2(View view) {
        scoreTeamA += 2;
        TeamA(scoreTeamA);
    }

    public void penalty(View view) {
        scoreTeamA += 1;
        TeamA(scoreTeamA);
    }

    private void TeamB(int score) {
        TextView TeamB = (TextView) findViewById(R.id.Team_B);
        TeamB.setText(String.valueOf(score));
    }

    public void fraction32(View view) {
        scoreTeamB += 3;
        TeamB(scoreTeamB);
    }

    public void fraction22(View view) {
        scoreTeamB += 2;
        TeamB(scoreTeamB);
    }

    public void penalty2(View view) {
        scoreTeamB += 1;
        TeamB(scoreTeamB);
    }

    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        TeamA(scoreTeamA);
        TeamB(scoreTeamB);

    }

}
