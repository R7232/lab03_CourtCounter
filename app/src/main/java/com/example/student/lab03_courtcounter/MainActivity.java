package com.example.student.lab03_courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    private CourtCounterFragment TeamA;
    private CourtCounterFragment TeamB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        TeamA = (CourtCounterFragment)getSupportFragmentManager()
                .findFragmentById(R.id.fragment_team_a) ;
        TeamB = (CourtCounterFragment)getSupportFragmentManager()
                .findFragmentById(R.id.fragment_team_b) ;

        String team_a_name = getString(R.string.team_a_mame);
        String team_b_name = getString(R.string.team_b_mame);

        TeamA.setTeamName(team_a_name);
        TeamB.setTeamName(team_b_name);

        TeamA.setTeamLogo(R.drawable.team_a_logo);
        TeamB.setTeamLogo(R.drawable.team_b_logo);

    }

    public void resetScoreView(View view){
        TeamA.restScore();
        TeamB.restScore();
    }



}
