package com.nischalstha9.ila1_calculator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class result_fragment extends Fragment {
    TextView tvResult;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.result_fragment, container, false);
        tvResult = (TextView) view.findViewById(R.id.result);
        Bundle bundle = getArguments();
        if (bundle != null) {
            int result = bundle.getInt("result");
            tvResult.setText("Result: " + result);
        }
        return view;
    }
}
