package com.butterfly.myfirstandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class DonateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate);
    }

    public void donateBtn (View view){

        String text = "Tack för att du hjälper till!";
        int time = Toast.LENGTH_SHORT;
        Context myApp = getApplicationContext();
        Toast toast = Toast.makeText(myApp, text, time);
        toast.show();
    }
}