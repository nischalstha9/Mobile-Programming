package com.nischalstha9.ila1_calculator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class input_fragment extends Fragment {
    EditText num1, num2;
    Button calculateBtn;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.input_fragment, container, false);

        num1 = view.findViewById(R.id.ip1);
        num2 = view.findViewById(R.id.ip2);
        calculateBtn = view.findViewById(R.id.btnCalculate);
        calculateBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int first, second, result;
                first = Integer.parseInt(num1.getText().toString());
                second = Integer.parseInt(num2.getText().toString());
                result = first+second;

                Fragment fragment = new result_fragment();
                Bundle bundle = new Bundle();
                bundle.putInt("result", result);
                fragment.setArguments(bundle);

                FragmentManager fragmentManager = getParentFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.result_fragment, fragment)
                        .commit();
            }
        });
        return view;
    }
}
