package com.nischalstha9.ia2_form_value_intent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.annotation.Nullable;

public class result extends Activity {
    TextView fTV, lTV, gTV, rollTV, addressTV, classTV;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        fTV = (TextView)findViewById(R.id.firstNameRes);
        lTV = (TextView)findViewById(R.id.lastNameRes);
        gTV = (TextView)findViewById(R.id.GenderValueView);
        rollTV = (TextView)findViewById(R.id.rollRes);
        addressTV = (TextView)findViewById(R.id.addressRes);
        classTV = (TextView)findViewById(R.id.classRes);

        Intent form = getIntent();
        String fNameValueSubmitted = form.getStringExtra("fName");
        String lNameValueSubmitted = form.getStringExtra("lName");
        String addressValueSubmitted = form.getStringExtra("address");
        String rollValueSubmitted = form.getStringExtra("roll");
        String classValueSubmitted = form.getStringExtra("class");


        String gValueSubmitted = form.getStringExtra("g");
        fTV.setText(fNameValueSubmitted);
        lTV.setText(lNameValueSubmitted);
        gTV.setText(gValueSubmitted);
        rollTV.setText(rollValueSubmitted);
        addressTV.setText(addressValueSubmitted);
        classTV.setText(classValueSubmitted);


    }
}

