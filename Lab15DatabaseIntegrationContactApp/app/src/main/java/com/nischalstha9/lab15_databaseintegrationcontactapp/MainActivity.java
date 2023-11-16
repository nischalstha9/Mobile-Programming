package com.nischalstha9.lab15_databaseintegrationcontactapp;

import android.os.Bundle;
import android.util.Log;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ListView list;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        DatabaseHandler db = new DatabaseHandler(this);
        // Inserting Contacts
        Log.d("Insert: ", "Inserting ..");
        db.addContact(new Contact("Ravi", "9100000000"));
        db.addContact(new Contact("Srinivas", "9199999999"));
        db.addContact(new Contact("Tommy", "9522222222"));
        db.addContact(new Contact("Karthik", "9533333333"));
        // Reading all contacts
        Toast.makeText(getApplicationContext(),"Reading all contacts..", Toast.LENGTH_SHORT).show();
        Log.d("Reading: ", "Reading all contacts..");
        List<Contact> contacts = db.getAllContacts();
        ArrayList<String> names = new ArrayList<>();

//        for (Contact cn : contacts) {
//            String log = "Id: " + cn.id + " ,Name: " + cn.name + " ,Phone: " +
//                    cn._phone_number;
//            names.add(cn.name);
//            // Writing Contacts to log
//            Log.d("Name: ", log);
//        }
        for (int i = 0; i < contacts.toArray().length; i++) {
            Contact c = contacts.get(i);
            names.add(c.name);
        }

        list = (ListView) findViewById(R.id.contacts);
        ArrayAdapter<String> ad = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, names);
        list.setAdapter(ad);
    }
}