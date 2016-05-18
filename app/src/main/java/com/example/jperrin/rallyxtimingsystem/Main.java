package com.example.jperrin.rallyxtimingsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Main extends AppCompatActivity {


    LinearLayout menuWindow,
            eventSelectionScreen,
            clockSyncScreen,
            registrationScreen,
            startScreen,
            finishScreen,
            resultsScreen;
    Button selectEventButton,
            eventBackButton,
            syncButton,
            clockSyncButton,
            registrationButton,
            startButton,
            finishButton,
            resultsButton,
            addDriverButton,
            doneWithRegistrationButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Layout Screens
        menuWindow = (LinearLayout) findViewById(R.id.MenuWindow);
        eventSelectionScreen = (LinearLayout) findViewById(R.id.EventSelectionScreen);
        clockSyncScreen = (LinearLayout) findViewById(R.id.ClockSyncScreen);
        registrationScreen = (LinearLayout) findViewById(R.id.RegistrationScreen);
        startScreen = (LinearLayout) findViewById(R.id.StartScreen);
        finishScreen = (LinearLayout) findViewById(R.id.FinishScreen);
        resultsScreen = (LinearLayout) findViewById(R.id.ResultsScreen);

        //Buttons
        selectEventButton = (Button) findViewById(R.id.selectEventButton);
        eventBackButton = (Button) findViewById(R.id.eventBackButton);
        syncButton = (Button) findViewById(R.id.syncButton);
        clockSyncButton = (Button) findViewById(R.id.clockSyncButton);
        registrationButton = (Button) findViewById(R.id.registrationButton);
        startButton = (Button) findViewById(R.id.startButton);
        finishButton = (Button) findViewById(R.id.finishButton);
        resultsButton = (Button) findViewById(R.id.resultsButton);
        addDriverButton = (Button) findViewById(R.id.addDriverButton);
        doneWithRegistrationButton = (Button) findViewById(R.id.doneWithRegistrationButton);

    }

    public void backToMenu(View v){
        resultsScreen.setVisibility(View.GONE);
        finishScreen.setVisibility(View.GONE);
        startScreen.setVisibility(View.GONE);
        registrationScreen.setVisibility(View.GONE);
        clockSyncButton.setVisibility(View.GONE);
        eventSelectionScreen.setVisibility(View.GONE);
        menuWindow.setVisibility(View.VISIBLE);
    }

    public void registrationButtonClicked(View v){
        menuWindow.setVisibility(View.GONE);
        registrationScreen.setVisibility(View.VISIBLE);
    }
    public void startButtonClicked(View v){
        menuWindow.setVisibility(View.GONE);
        startScreen.setVisibility(View.VISIBLE);
    }
    public void finishButtonClicked(View v){
        menuWindow.setVisibility(View.GONE);
        finishScreen.setVisibility(View.VISIBLE);
    }
    public void resultsButtonClicked(View v){
        menuWindow.setVisibility(View.GONE);
        resultsScreen.setVisibility(View.VISIBLE);
    }

    public void doneWithRegistrationButtonClicked(View v){
        registrationScreen.setVisibility(View.GONE);
        menuWindow.setVisibility(View.VISIBLE);
    }

    public void selectEventButtonClicked(View v) {
        menuWindow.setVisibility(View.GONE);
        eventSelectionScreen.setVisibility(View.VISIBLE);
    }

    public void eventBackButtonClicked(View v){
        eventSelectionScreen.setVisibility(View.GONE);
        menuWindow.setVisibility(View.VISIBLE);
    }

    public void syncButtonClicked(View v){
        clockSyncScreen.setVisibility(View.GONE);
        menuWindow.setVisibility(View.VISIBLE);
    }

    public void clockSyncButtonClicked(View v){
        menuWindow.setVisibility(View.GONE);
        clockSyncScreen.setVisibility(View.VISIBLE);
    }


}//EOL

