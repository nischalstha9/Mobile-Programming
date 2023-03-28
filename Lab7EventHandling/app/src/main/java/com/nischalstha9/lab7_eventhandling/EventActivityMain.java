package com.nischalstha9.lab7_eventhandling;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class EventActivityMain extends Activity implements View.OnTouchListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_activity);

        //EVENT LISTENERS
        Button button = (Button) findViewById(R.id.ClickBtn);
        TextView result = (TextView) findViewById(R.id.Result);
        button.setOnTouchListener(this);
        result.setOnTouchListener(this);
    }


    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        System.out.println("TOUCHED");
        TextView result = (TextView) findViewById(R.id.Result);
        result.setText("Nischal is awesome!");
        return false;
    }
}
