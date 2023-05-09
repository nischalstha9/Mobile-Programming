package com.nischalstha9.multiplicationtable;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class count_numeric_digit extends Activity {

    EditText text;
    Button findBtn;
    TextView result;
    int numericCount = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.count_numeric_digit);

        text = (EditText) findViewById(R.id.text);
        findBtn = (Button) findViewById(R.id.findNumericCountBtn);
        result = (TextView) findViewById(R.id.result);

        findBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txtVal = text.getText().toString();

                for (int i = 0; i < txtVal.length(); i++) {
                    String character = String.valueOf(txtVal.charAt(i));
                    try{
                        Integer.parseInt(character);
                        numericCount ++;
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
                result.setText("Numeric Count = " + numericCount);
            }
        });
    }
}
