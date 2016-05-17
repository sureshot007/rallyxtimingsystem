package com.example.jperrin.rallyxtimingsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Main extends AppCompatActivity {


    LinearLayout menuWindow;
    LinearLayout eventSelectionScreen;
    Button selectEventButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Layout Screens
        menuWindow = (LinearLayout) findViewById(R.id.MenuWindow);
        eventSelectionScreen = (LinearLayout) findViewById(R.id.EventSelectionScreen);

        //Buttons
        selectEventButton = (Button) findViewById(R.id.selectEventButton);


    }


    public void selectEventButtonClicked(View v) {
        menuWindow.setVisibility(View.GONE);
        eventSelectionScreen.setVisibility(View.VISIBLE);
    }








}//EOL

