package com.nischalstha9.lab14views;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class listview extends Activity {
    String[] listItems= {"Nischal", "niraj", "sh","Nischal", "niraj", "shit","Nischal", "niraj", "sh","Nischal", "niraj", "sh","Nischal", "niraj", "sh","Nischal", "niraj", "sh","Nischal", "niraj", "sh","Nischal", "niraj", "sh",};
    ListView listView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        listView = (ListView) findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, listItems);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), listItems[i].toString(), Toast.LENGTH_LONG).show();
            }
        });
        listView.setAdapter(adapter);
    }



}
