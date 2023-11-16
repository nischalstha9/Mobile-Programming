package com.nischalstha9.labass2_dialog;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import java.text.DateFormat;
import java.util.Calendar;

public class main extends AppCompatActivity implements DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener {
    Button alertBtn, datePicker, timePicker, customDialog;
    TextView TV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        alertBtn = (Button) findViewById(R.id.alertDialogBtn);
        datePicker = (Button) findViewById(R.id.datePickerDialogBtn);
        timePicker = (Button) findViewById(R.id.timePickerDialogBtn);
        customDialog = (Button) findViewById(R.id.customDialogBtn);
        TV = (TextView) findViewById(R.id.report);

        alertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create the object of AlertDialog Builder class
                AlertDialog.Builder builder = new AlertDialog.Builder(main.this);

                // Set the message show for the Alert time
                builder.setMessage("Are you awesome!");

                // Set Alert Title
                builder.setTitle("Awesomeness check !");

                // Set Cancelable false for when the user clicks on the outside the Dialog Box then it will remain show
                builder.setCancelable(false);

                // Set the positive button with yes name Lambda OnClickListener method is use of DialogInterface interface.
                builder.setPositiveButton("Yes", (DialogInterface.OnClickListener) (dialog, which) -> {
                    // When the user click yes button then app will close
                    //finish();
                    TV.setText("You are awesome!");
                    Toast.makeText(getApplicationContext(), "Yu are awseoms", Toast.LENGTH_SHORT).show();
                });

                // Set the Negative button with No name Lambda OnClickListener method is use of DialogInterface interface.
                builder.setNegativeButton("No", (DialogInterface.OnClickListener) (dialog, which) -> {
                    // If user click no then dialog box is canceled.
                    dialog.cancel();
                });

                // Create the Alert dialog
                AlertDialog alertDialog = builder.create();
                // Show the Alert Dialog box
                alertDialog.show();
            }
        });

        datePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                com.nischalstha9.labass2_dialog.DatePicker mDatePickerDialogFragment;
                mDatePickerDialogFragment = new com.nischalstha9.labass2_dialog.DatePicker();
                mDatePickerDialogFragment.show(getSupportFragmentManager(), "DATE PICK");
            }
        });

        timePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                com.nischalstha9.labass2_dialog.TimePicker mTimePickerDialogFragment;
                mTimePickerDialogFragment = new com.nischalstha9.labass2_dialog.TimePicker();
                mTimePickerDialogFragment.show(getSupportFragmentManager(), "TIME PICK");
            }
        });

        customDialog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                com.nischalstha9.labass2_dialog.CustomDialog customDialog1;
                customDialog1 = new com.nischalstha9.labass2_dialog.CustomDialog();
                customDialog1.show(getSupportFragmentManager(), "CustomDialog");
            }
        });
    }

    @Override
    public void onDateSet(android.widget.DatePicker view, int year, int month, int dayOfMonth) {
        Calendar mCalendar = Calendar.getInstance();
        mCalendar.set(Calendar.YEAR, year);
        mCalendar.set(Calendar.MONTH, month);
        mCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        String selectedDate = DateFormat.getDateInstance(DateFormat.FULL).format(mCalendar.getTime());
        TV.setText(selectedDate);
    }

    @Override
    public void onTimeSet(TimePicker timePicker, int hour, int minute) {
        Calendar mCalendar = Calendar.getInstance();
        mCalendar.set(Calendar.HOUR, hour);
        mCalendar.set(Calendar.MINUTE, minute);
        TV.setText(hour + ":" + minute);
    }
}