package com.butterfly.myfirstandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class UnicefActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unicef);
    }

    public void unicefdonateBtn (View view) {
        Intent donation = new Intent(this, DonateActivity.class);
        startActivity(donation);
    }
}