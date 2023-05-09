package com.nischalstha9.multiplicationtable;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class main extends Activity {
    Button calcMultiple, findVowels, calcNumericCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        calcMultiple = (Button) findViewById(R.id.calculateMultiple);
        findVowels = (Button) findViewById(R.id.getVowel);
        calcNumericCount = (Button) findViewById(R.id.findNumericCount);

        calcMultiple.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(main.this, multiple.class);
                startActivity(intent);
            }
        });

        findVowels.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(main.this, vowel_and_consonants.class);
                startActivity(intent);
            }
        });

        calcNumericCount.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(main.this, count_numeric_digit.class);
                startActivity(intent);
            }
        });
    }
}
