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

    int mFraction ;


    public void fraction3(View view) {
        mFraction += 3 ;
        TextView fraction = (TextView)findViewById(R.id.fraction) ;
        fraction.setText(String.valueOf(mFraction));
    }

    public void fraction2(View view) {
        mFraction += 2 ;
        TextView fraction = (TextView)findViewById(R.id.fraction) ;
        fraction.setText(String.valueOf(mFraction));
    }

    public void penalty(View view) {
        mFraction += 1 ;
        TextView fraction = (TextView)findViewById(R.id.fraction) ;
        fraction.setText(String.valueOf(mFraction));
    }
    public void reset(View view) {
        mFraction = 0 ;
        TextView fraction = (TextView)findViewById(R.id.fraction) ;
        fraction.setText(String.valueOf(mFraction));
    }

}
