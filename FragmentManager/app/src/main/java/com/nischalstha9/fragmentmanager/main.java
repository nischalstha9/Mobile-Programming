package com.nischalstha9.fragmentmanager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class main extends FragmentActivity {
    Button btnFirst, btnSecond;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        btnFirst = findViewById(R.id.btnFirst);
        btnSecond = findViewById(R.id.btnSecond);

        btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new fragment1();
                FragmentManager mgr = getSupportFragmentManager();
                FragmentTransaction transaction = mgr.beginTransaction();
                transaction.replace(R.id.FragmentContainer, fragment);
                transaction.commit();
            }
        });

        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new fragment2();
                FragmentManager mgr = getSupportFragmentManager();
                FragmentTransaction transaction = mgr.beginTransaction();
                transaction.replace(R.id.FragmentContainer, fragment);
                transaction.commit();
            }
        });


    }
}
