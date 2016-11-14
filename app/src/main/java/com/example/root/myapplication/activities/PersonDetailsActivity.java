package com.example.root.myapplication.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.root.myapplication.R;

public class PersonDetailsActivity extends AppCompatActivity {
    private String name;
    private TextView nameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_details);

        nameView=(TextView)findViewById(R.id.person_name);


        name=getIntent().getStringExtra("NAME");
        nameView.setText(name);

    }
}
