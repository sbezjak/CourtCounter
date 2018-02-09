package com.example.android.courtcounter;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int x = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeForTeamA(View view) {
        if (x == 0) {
            scoreTeamA = scoreTeamA + 3;
            displayForTeamA(scoreTeamA);
        } else {
            scoreTeamA = scoreTeamA - 3;
            displayForTeamA(scoreTeamA);
        }
    }

    public void addTwoForTeamA(View view) {

        if (x == 0) {
            scoreTeamA = scoreTeamA + 2;
            displayForTeamA(scoreTeamA);
        } else {
            scoreTeamA = scoreTeamA - 2;
            displayForTeamA(scoreTeamA);
        }
    }

    public void addOneForTeamA(View view) {

        if (x == 0) {
            scoreTeamA = scoreTeamA + 1;
            displayForTeamA(scoreTeamA);
        } else {
            scoreTeamA = scoreTeamA - 1;
            displayForTeamA(scoreTeamA);
        }
    }

    public void addThreeForTeamB(View view) {

        if (x == 0) {
            scoreTeamB = scoreTeamB + 3;
            displayForTeamB(scoreTeamB);
        } else {
            scoreTeamB = scoreTeamB - 3;
            displayForTeamB(scoreTeamB);
        }
    }

    public void addTwoForTeamB(View view) {
        if (x == 0) {
            scoreTeamB = scoreTeamB + 2;
            displayForTeamB(scoreTeamB);
        } else {
            scoreTeamB = scoreTeamB - 2;
            displayForTeamB(scoreTeamB);
        }
    }

    public void addOneForTeamB(View view) {
        if (x == 0) {
            scoreTeamB = scoreTeamB + 1;
            displayForTeamB(scoreTeamB);
        } else {
            scoreTeamB = scoreTeamB - 1;
            displayForTeamB(scoreTeamB);
        }
    }

    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    public void correctMinusThree(String message) {

        Button correctThreePointsA = findViewById(R.id.team_a_three_points);
        Button correctThreePointsB = findViewById(R.id.team_b_three_points);
        correctThreePointsB.setText(message);
        correctThreePointsA.setText(message);

    }

    public void correctPlusThree(String message) {

        Button correctThreePointsA = findViewById(R.id.team_a_three_points);
        Button correctThreePointsB = findViewById(R.id.team_b_three_points);
        correctThreePointsB.setText(message);
        correctThreePointsA.setText(message);

    }


    public void correctMinusTwo(String message) {

        Button correctTwoPointsA = findViewById(R.id.team_a_two_points);
        Button correctTwoPointsB = findViewById(R.id.team_b_two_points);
        correctTwoPointsB.setText(message);
        correctTwoPointsA.setText(message);

    }

    public void correctPlusTwo(String message) {

        Button correctTwoPointsA = findViewById(R.id.team_a_two_points);
        Button correctTwoPointsB = findViewById(R.id.team_b_two_points);
        correctTwoPointsB.setText(message);
        correctTwoPointsA.setText(message);

    }

    public void correctMinusOne(String message) {

        Button correctOnePointA = findViewById(R.id.team_a_free_throw);
        Button correctOnePointB = findViewById(R.id.team_b_free_throw);
        correctOnePointA.setText(message);
        correctOnePointB.setText(message);

    }

    public void correctPlusOne(String message) {

        Button correctOnePointA = findViewById(R.id.team_a_free_throw);
        Button correctOnePointB = findViewById(R.id.team_b_free_throw);
        correctOnePointA.setText(message);
        correctOnePointB.setText(message);

    }

    public void correctScore(View view) {
        if (x == 0) {
            x = x + 1;

            correctMinusThree("- 3 points");
            correctMinusTwo("- 2 points");
            correctMinusOne("- 1 point");

            Button buttonFinish = findViewById(R.id.correct_button);
            buttonFinish.setText("Finish");


        } else {
            x = x - 1;

            correctPlusThree("+3 points");
            correctPlusTwo("+2 points");
            correctPlusOne("Free throw");

            Button buttonFinish = findViewById(R.id.correct_button);
            buttonFinish.setText("Correct");

        }
    }

}



