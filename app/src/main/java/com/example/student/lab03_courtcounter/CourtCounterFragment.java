package com.example.student.lab03_courtcounter;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class CourtCounterFragment extends Fragment implements View.OnClickListener {

    private TextView m_tv_team_name;
    private TextView m_tv_team_score;
    private Button m_btn_three_points;
    private Button m_btn_two_points;
    private Button m_btn_free_points;
    private ImageView m_img_team_logo ;

    private int score ;

    public CourtCounterFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_court_counter, container, false);


    }

    @Override
    public void onStart() {
        super.onStart();
        m_tv_team_score = (TextView)getView().findViewById(R.id.tv_team_score);
        m_tv_team_name = (TextView)getView().findViewById(R.id.tv_team_name);
        m_img_team_logo = (ImageView)getView().findViewById(R.id.img_team_logo) ;

        m_btn_three_points = (Button)getView().findViewById(R.id.btn_three_points);
        m_btn_two_points = (Button)getView().findViewById(R.id.btn_two_points);
        m_btn_free_points = (Button)getView().findViewById(R.id.btn_free_throw);

        m_btn_two_points.setOnClickListener(this);
        m_btn_three_points.setOnClickListener(this);
        m_btn_free_points.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if (v.getId() == R.id.btn_three_points){
                  score += 3 ;
            }  else if(v.getId() == R.id.btn_two_points){
                  score += 2 ;
            } else if (v.getId() == R.id.btn_free_throw){
                  score += 1 ;
            }

        m_tv_team_score.setText(String.valueOf(score));
    }

    public void restScore(){
        m_tv_team_score.setText("0");
    }

    public void setTeamName(CharSequence teamName){
        m_tv_team_name.setText(teamName);
    }

    public void setTeamLogo(int res_id){

        m_img_team_logo.setImageResource(res_id);

    }


}

