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

public class vowel_and_consonants extends Activity {

    EditText text;
    Button findBtn;
    TextView result;
    String[] vowelArr = {"a","e","i","o","u"};
    List<String> vowels = Arrays.asList(vowelArr);
    String vowelsValues = "" ;
    String consonantValues = "" ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vowel_and_consonants);

        text = (EditText) findViewById(R.id.text);
        findBtn = (Button) findViewById(R.id.findBtn);
        result = (TextView) findViewById(R.id.result);

        findBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txtVal = text.getText().toString();

                for (int i = 0; i < txtVal.length(); i++) {
                    String character = String.valueOf(txtVal.charAt(i));
                    if(vowels.contains(character)){
                        vowelsValues += character + "\n";
                    }else{
                        consonantValues += character + "\n";
                    }
                }
                result.setText("Vowels:\n" + vowelsValues + "\n Consonants: \n" + consonantValues);
            }
        });
    }
}
