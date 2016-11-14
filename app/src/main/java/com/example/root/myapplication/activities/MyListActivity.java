package com.example.root.myapplication.activities;

import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.root.myapplication.R;

import java.util.ArrayList;

import static android.R.id.list;

/**
 * Created by root on 11/9/16.
 */

public class MyListActivity extends android.app.ListActivity {

    private ListView listview;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listview=(ListView)findViewById(android.R.id.list);

        ArrayList<String> list=new ArrayList<>();
        list.add("aaaaaaaaaa");
        list.add("bbbbbbbbbb");
        list.add("cccccccccc");

        ListAdapter arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, list);

        listview.setAdapter(arrayAdapter);

    }


}
