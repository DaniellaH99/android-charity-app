package com.butterfly.myfirstandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class OrganizationsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organizations);

        //Skapar arraylist med alla organisationer samlade i en lista
        ListView orgListView = findViewById(R.id.orgListView);

        List<String> list = new ArrayList<>();
        list.add("UNICEF");
        list.add("Röda Korset");
        list.add("Barncancerfonden");
        list.add("SOS-barnbyar");
        list.add("UNHCR");
        list.add("Cancerfonden");
        list.add("Naturskyddsföreningen");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, list);
        orgListView.setAdapter(arrayAdapter);

        orgListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    //unicef
                    startActivity(new Intent(OrganizationsActivity.this, UnicefActivity.class));
                } else{

                }
            }
            });
    }
}