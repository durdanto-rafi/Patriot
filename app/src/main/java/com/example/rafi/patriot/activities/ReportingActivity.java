package com.example.rafi.patriot.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.rafi.patriot.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ReportingActivity extends AppCompatActivity {
    @BindView(R.id.spCategory)
    Spinner spCategory;
    @BindView(R.id.spSubCategory)
    Spinner spSubCategory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporting);
        ButterKnife.bind(this);

        String[] games = {"CRIME", "MOTOR VEHICLE", "LAND"};
        Toast.makeText(this,games[0],Toast.LENGTH_SHORT).show();

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, games);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spCategory.setAdapter(arrayAdapter);
    }
}
