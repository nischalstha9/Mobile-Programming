package com.nischalstha9.lab14views;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import androidx.annotation.Nullable;

public class gridview extends Activity {
    String[] listItems= {"Nischal", "niraj", "sh","Nischal", "niraj", "sh","Nischal", "niraj", "sh","Nischal", "niraj", "sh","Nischal", "niraj", "sh","Nischal", "niraj", "sh","Nischal", "niraj", "sh","Nischal", "niraj", "sh",};
    GridView gView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview);

        gView = (GridView) findViewById(R.id.gridView);
        gView.setNumColumns(3);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, listItems);
        gView.setAdapter(adapter);
    }



}
