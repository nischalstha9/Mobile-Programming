package com.nischalstha9.lab14views;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class recyclerview extends Activity {
    String[] listItems= {"Nischal", "niraj", "sh","Nischal", "niraj", "sh","Nischal", "niraj", "sh","Nischal", "niraj", "sh","Nischal", "niraj", "sh","Nischal", "niraj", "sh","Nischal", "niraj", "sh","Nischal", "niraj", "sh",};
    RecyclerView rView;

    private ArrayList<recyclerModal> recyclerItemArrayList;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclerview);

        rView = (RecyclerView) findViewById(R.id.recyclerView);

        // here we have created new array list and added data to it.
        recyclerItemArrayList = new ArrayList<>();

        for (int i = 0; i < listItems.length; i++) {
            recyclerItemArrayList.add(new recyclerModal(listItems[i], i));
        }

        recyclerItemAdapter adapter = new recyclerItemAdapter(this, recyclerItemArrayList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rView.setLayoutManager(linearLayoutManager);
        rView.setAdapter(adapter);
    }



}
