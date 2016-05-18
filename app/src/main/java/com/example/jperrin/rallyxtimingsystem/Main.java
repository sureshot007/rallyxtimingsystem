package com.example.jperrin.rallyxtimingsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.VectorEnabledTintResources;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

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
            doneWithRegistrationButton,
            eventSelectorButton;

    TextView event_selected;

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
        eventSelectorButton = (Button) findViewById(R.id.eventSelectorButton);

        //Textviews
        event_selected = (TextView) findViewById(R.id.event_selected);



    }

    public void backToMenu(View v){
        resultsScreen.setVisibility(View.GONE);
        finishScreen.setVisibility(View.GONE);
        startScreen.setVisibility(View.GONE);
        registrationScreen.setVisibility(View.GONE);
        clockSyncScreen.setVisibility(View.GONE);
        eventSelectionScreen.setVisibility(View.GONE);
        menuWindow.setVisibility(View.VISIBLE);
    }

    ////////// Registration Page //////////
    public void registrationButtonClicked(View v){
        menuWindow.setVisibility(View.GONE);
        registrationScreen.setVisibility(View.VISIBLE);
    }
    public void doneWithRegistrationButtonClicked(View v){
        registrationScreen.setVisibility(View.GONE);
        menuWindow.setVisibility(View.VISIBLE);
    }

    ////////// Start Page //////////
    public void startButtonClicked(View v){
        menuWindow.setVisibility(View.GONE);
        startScreen.setVisibility(View.VISIBLE);
    }

    ////////// Finish Page //////////
    public void finishButtonClicked(View v){
        menuWindow.setVisibility(View.GONE);
        finishScreen.setVisibility(View.VISIBLE);
    }

    ////////// Results Page //////////
    public void resultsButtonClicked(View v){
        menuWindow.setVisibility(View.GONE);
        resultsScreen.setVisibility(View.VISIBLE);
    }


    ////////// Event Page //////////
    public void selectEventButtonClicked(View v) {
        menuWindow.setVisibility(View.GONE);
        eventSelectionScreen.setVisibility(View.VISIBLE);
    }
    public void eventSelectorButtonClicked(View v){

    }
    public void createNewEventButtonClicked(View v){
        //do something here about creating a db for the event data
        //and displaying the name of the event on the screen
        //event_selected.setText("New Event!");

        // pop up and ask for event name or date? Date Picker? Text entry? Both?
        // write data to file? GDrive?
        // Set local variable with key
        // Change text label to reflect data

    }

    public void eventBackButtonClicked(View v){
        eventSelectionScreen.setVisibility(View.GONE);
        menuWindow.setVisibility(View.VISIBLE);
    }

    ////////// Clock Sync Page //////////
    public void syncButtonClicked(View v){
        clockSyncScreen.setVisibility(View.GONE);
        menuWindow.setVisibility(View.VISIBLE);
    }

    public void clockSyncButtonClicked(View v){
        menuWindow.setVisibility(View.GONE);
        clockSyncScreen.setVisibility(View.VISIBLE);
    }


}//EOL

