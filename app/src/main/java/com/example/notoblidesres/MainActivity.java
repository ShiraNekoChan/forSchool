package com.example.notoblidesres;

import android.widget.*;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

public class MainActivity extends AppCompatActivity {

    static public TextView titol;
    static public Button horari, tares, qualificacions, chuletes, calendari;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        titol= findViewById(R.id.titol);
        tares= findViewById(R.id.tasques);
        qualificacions= findViewById(R.id.qualificacions);
        chuletes= findViewById(R.id.chuletes);
        calendari= findViewById(R.id.calendari);
        horari= findViewById(R.id.horari);

        tares.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


            }
        });



    }




}