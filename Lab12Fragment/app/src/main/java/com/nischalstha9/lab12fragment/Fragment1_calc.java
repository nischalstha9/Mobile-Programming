package com.nischalstha9.lab12fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class Fragment1_calc extends Fragment {

    EditText edtFirst, edtSecond;
    Button btnCalculate;
    TextView txtResult;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, container, false);

        edtFirst = view.findViewById(R.id.edtFirst);
        edtSecond = view.findViewById(R.id.edtSecond);
        btnCalculate = view.findViewById(R.id.btnCalculate);
        txtResult = view.findViewById(R.id.txtResult);
        btnCalculate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int first, second, result;
                first = Integer.parseInt(edtFirst.getText().toString());
                second = Integer.parseInt(edtSecond.getText().toString());
                result = first+second;
                txtResult.setText("Result = "+ result);

                Fragment fragment = new result_fragment();
                Bundle bundle = new Bundle();
                bundle.putString("res", Integer.toString(result)); // Add your data to the bundle
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
