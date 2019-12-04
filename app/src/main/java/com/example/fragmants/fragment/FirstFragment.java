package com.example.fragmants.fragment;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fragmants.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment implements View.OnClickListener {
    private Button btncalculate;
    private EditText etfirstno,etsecondno;

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_first, container, false);
        View view=inflater.inflate(R.layout.fragment_first,container,false);

        etfirstno=view.findViewById(R.id.etfirstno);
        etsecondno=view.findViewById(R.id.etsecindno);
        btncalculate=view.findViewById(R.id.btncalculate);
        btncalculate.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int first= Integer.parseInt(etfirstno.getText().toString());
        int second= Integer.parseInt(etsecondno.getText().toString());
        int add=first+second;
        Toast.makeText(getActivity(),"sum is"+add,Toast.LENGTH_LONG).show();

    }
}
