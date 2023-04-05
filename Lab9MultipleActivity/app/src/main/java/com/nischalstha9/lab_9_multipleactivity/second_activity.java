package com.nischalstha9.lab_9_multipleactivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class second_activity extends AppCompatActivity {

        TextView question2;
        Button next_button, previous_button;
        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_two);

            next_button = (Button)findViewById(R.id.second_activity_next_btn);
            previous_button = (Button)findViewById(R.id.second_activity_prev_btn);

            question2 = (TextView)findViewById(R.id.qsn2_id);
            question2.setText("Q 2 - What is ADB in android?\n"
                    + "\n"
                    + "Ans- Android Debug Bridge");

            next_button.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v)
                {
                    Intent intent = new Intent(second_activity.this, third_activity.class);
                    startActivity(intent);
                }
            });

            previous_button.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v)
                {
                    Intent intent = new Intent(second_activity.this, main_activity.class);
                    startActivity(intent);
                }
            });
    }

}