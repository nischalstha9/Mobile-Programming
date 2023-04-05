package com.nischalstha9.lab_9_multipleactivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class third_activity extends AppCompatActivity {

    TextView question3;
    Button previous_button;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);


        previous_button = (Button)findViewById(R.id.third_activity_prev_btn);

        question3 = (TextView)findViewById(R.id.qsn3_id);
        question3.setText("Q 3 - How to store heavy structured data in android?\n"
                + "\n"
                + "Ans- SQlite database");

        previous_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                Intent intent = new Intent(third_activity.this, second_activity.class);
                startActivity(intent);
            }
        });
    }}