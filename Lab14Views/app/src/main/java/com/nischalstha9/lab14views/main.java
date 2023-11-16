package com.nischalstha9.lab14views;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main extends Activity {

    Button ListViewBtn, GridViewBtn, RecyclerViewBtn, CustomListViewBtn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        CustomListViewBtn = (Button) findViewById(R.id.customListViewBtn);
        ListViewBtn = (Button) findViewById(R.id.listViewBtn);
        GridViewBtn = (Button) findViewById(R.id.gridViewBtn);
        RecyclerViewBtn = (Button) findViewById(R.id.recyclerViewBtn);

        ListViewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(main.this, listview.class);
                startActivity(i);
            }
        });

        CustomListViewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(main.this, customListView.class);
                startActivity(i);
            }
        });

        GridViewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(main.this, gridview.class);
                startActivity(i);
            }
        });

        RecyclerViewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(main.this, recyclerview.class);
                startActivity(i);
            }
        });




    }



}
