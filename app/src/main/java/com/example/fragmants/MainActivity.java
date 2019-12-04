package com.example.fragmants;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.fragmants.fragment.FirstFragment;
import com.example.fragmants.fragment.SecondFragment;

import java.util.PriorityQueue;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnfragment;

    private Boolean status=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnfragment=findViewById(R.id.btnfragment);
        btnfragment.setOnClickListener(this);

    }
    public void onClick(View V){
        FragmentManager fragmentManager= getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        if(status){
            FirstFragment firstFragment=new FirstFragment();
            fragmentTransaction.replace(R.id.fcontainer,firstFragment);
            btnfragment.setText("Load Seccond Fragment");
            status=false;
        }
        else {
            SecondFragment secondFragment=new SecondFragment();
            fragmentTransaction.replace(R.id.btnfragment,secondFragment);
            btnfragment.setText("Load First Fragment");
            status=true;
        }

    }
}
