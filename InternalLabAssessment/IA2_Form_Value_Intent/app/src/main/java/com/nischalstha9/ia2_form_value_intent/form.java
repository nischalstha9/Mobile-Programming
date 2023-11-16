package com.nischalstha9.ia2_form_value_intent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import androidx.annotation.Nullable;
public class form extends Activity {
    EditText first_name, last_name, address, roll_no;
    Button submit_btn;
    RadioGroup gender_radio_group;
    RadioButton gender;
    Spinner class_name;

    public void sayHello(View v){
        Log.d("TermsAccepted==>", "Terms and Conditions Accepted!!");
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.form);

        Spinner spinner = (Spinner) findViewById(R.id.className);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.classValues, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        submit_btn = (Button) findViewById(R.id.submitBtn);
        first_name = (EditText) findViewById(R.id.firstName);
        last_name = (EditText) findViewById(R.id.lastName);
        address = (EditText) findViewById(R.id.address);
        roll_no = (EditText) findViewById(R.id.rollNo);
        gender_radio_group = (RadioGroup) findViewById(R.id.genderRdGroup);
        class_name = (Spinner) findViewById(R.id.className);


        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fname = first_name.getText().toString();
                String lname = last_name.getText().toString();
                String addr = address.getText().toString();
                String rol = roll_no.getText().toString();
                String classVal = class_name.getSelectedItem().toString();
                int SelectedGenderId = gender_radio_group.getCheckedRadioButtonId();
                gender = (RadioButton) findViewById(SelectedGenderId);
                String g = gender.getText().toString();
                Intent report = new Intent(getApplicationContext(), result.class);
                report.putExtra("fName", fname);
                report.putExtra("lName", lname);
                report.putExtra("address", addr);
                report.putExtra("roll", rol);
                report.putExtra("class", classVal);
                report.putExtra("g", g);
                startActivity(report);
            }
        });
    }
}
