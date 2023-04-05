package com.nischalstha9.lab_9_multipleactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class main_activity extends Activity {
    TextView qsn1;
    Button nextActivityBtn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        nextActivityBtn = (Button) findViewById(R.id.first_activity_btn);
        qsn1 = (TextView) findViewById(R.id.qsn1_id);
        qsn1.setText("What is your name?");

        nextActivityBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(main_activity.this, second_activity.class);
                startActivity(intent);
            }
        }   );
    }
}
