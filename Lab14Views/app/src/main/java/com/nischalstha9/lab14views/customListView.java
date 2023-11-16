package com.nischalstha9.lab14views;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;

public class customListView extends Activity {
    String[] listItems= {"Nischal", "niraj", "sh","Nischal", "niraj", "sh","Nischal", "niraj", "sh","Nischal", "niraj", "sh","Nischal", "niraj", "sh","Nischal", "niraj", "sh","Nischal", "niraj", "sh","Nischal", "niraj", "sh",};
    ListView listView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        listView = (ListView) findViewById(R.id.listView);

        CustomListViewAdapter adapter = new CustomListViewAdapter(this, listItems);
        listView.setAdapter(adapter);
    }
}
