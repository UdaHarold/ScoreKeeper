package com.example.zhangfan.udascorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.R.id.empty;

public class MainActivity extends AppCompatActivity {
    private TextView mLakerScoreView;
    private TextView mCavaliersScoreView;
    private static int mLakerTotal = 0;
    private static int mCavaliersTotal = 0;
    private static final int THREE_POINT = 3;
    private static final int TWO_POINT = 2;
    private static final int ONE_POINT = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLakerScoreView = (TextView) findViewById(R.id.lakers_score);
        mCavaliersScoreView = (TextView) findViewById(R.id.cavaliers_score);
    }

    public void resetScore(View view) {
        String empty = getString(R.string.empty_score);
        mLakerTotal = 0;
        mCavaliersTotal = 0;
        mLakerScoreView.setText(empty);
        mCavaliersScoreView.setText(empty);
    }

    public void addThreePointToLakers(View view) {
        mLakerTotal += 3;
        String score = String.valueOf(mLakerTotal);
        mLakerScoreView.setText(score);
    }

    public void addTwoPointToLakers(View view) {
        mLakerTotal += 2;
        String score = String.valueOf(mLakerTotal);
        mLakerScoreView.setText(score);
    }

    public void addOnePointToLakers(View view) {
        mLakerTotal += 1;
        String score = String.valueOf(mLakerTotal);
        mLakerScoreView.setText(score);
    }

    public void addThreePointToCavaliers(View view) {
        mCavaliersTotal += 3;
        String score = String.valueOf(mCavaliersTotal);
        mCavaliersScoreView.setText(score);
    }

    public void addTwoPointToCavaliers(View view) {
        mCavaliersTotal += 2;
        String score = String.valueOf(mCavaliersTotal);
        mCavaliersScoreView.setText(score);
    }

    public void addOnePointToCavaliers(View view) {
        mCavaliersTotal += 1;
        String score = String.valueOf(mCavaliersTotal);
        mCavaliersScoreView.setText(score);
    }
}
