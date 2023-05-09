package com.nischalstha9.lab_11_number_attributes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class main extends Activity {

    Button checkBtn;
    EditText noInput;
    TextView output;
    String outputText = "";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        checkBtn = (Button)findViewById(R.id.checkBtn);
        noInput = (EditText) findViewById(R.id.no_input);
        output = (TextView)findViewById(R.id.output);

        checkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outputText="";
                String stringInput = noInput.getText().toString();
                try {
                    int number = Integer.parseInt(stringInput);
                    if (isEven(number)){
                        outputText += "\n Even";
                    }else{
                        outputText += "\n Not Even";
                    }
                    if (isOdd(number)){
                        outputText += "\n Odd";
                    }else{
                        outputText += "\n Not Odd";
                    }
                    if (isFibonacci(number)){
                        outputText += "\n Fibonacci";
                    }else{
                        outputText += "\n Not Fibonacci";
                    }
                    if (isPrime(number)){
                        outputText += "\n Prime";
                    }else{
                        outputText += "\n Not Prime";
                    }
                }catch (Exception e){}
                if (isPalindrome(stringInput)){
                    outputText += "\n Palindrome";
                }else{
                    outputText += "\n Not Palindrome";
                }
                output.setText(outputText);
            }
        });
    }

    public boolean isPrime(int num){
        try{
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i)
        {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag)
            return true;
        return false;
        }catch (Exception e){return false;}
    }

    public boolean isFibonacci(int inputNumber){
        try{
        int firstTerm = 0;
        int secondTerm = 1;
        int thirdTerm = 0;
        while (thirdTerm < inputNumber)
        {
            thirdTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
        }
        if(thirdTerm == inputNumber)
        {
            return true;
        }
        return false;
        }catch (Exception e){
            return false;
        }
    }

    public boolean isPalindrome(String number){
        String str = number;
        int len = str.length();
        for(int i = 0; i < len / 2; i++)
        {
            if (str.charAt(i) !=
                    str.charAt(len - i - 1))
                return false;
        }
        return true;
    }

    public boolean isEven(int number){
        try {
            if (number % 2 == 0)
                return true;
            return false;
        }catch (Exception e){
            return false;
        }
    }

    public boolean isOdd(int number){
        try{
        if(number % 2!=0)
            return true;
        return false;
    }catch (Exception e){return false;}
    }
}
