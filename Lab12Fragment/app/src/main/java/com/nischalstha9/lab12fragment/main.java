package com.nischalstha9.lab12fragment;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;

public class main extends FragmentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}
