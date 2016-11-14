package com.example.root.myapplication.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.example.root.myapplication.R;
import com.example.root.myapplication.objects.Death;
import com.example.root.myapplication.objects.Person;

import java.util.ArrayList;

public class DeathActivity extends Activity {

    private String name,death;
    private boolean useDate;
    private long date;

    private TextView mName,mCause,mDate;
    private ArrayList<Person> list=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        //mName=(TextView)findViewById(R.id.death_name);
        //mCause=(TextView)findViewById(R.id.death_cause);
        //mDate=(TextView)findViewById(R.id.death_date);


      /*  if(useDate){
            date=getIntent().getLongExtra(MainActivity.DATE,0);
            Date d=new Date(date);
            SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
            String out=format.format(d);
            mDate.setText(out);
        }else {
            mDate.setText("Right now !");
        }*/

        name=getIntent().getStringExtra(MainActivity.NAME);
        death=getIntent().getStringExtra(MainActivity.DEATH);
        useDate=getIntent().getBooleanExtra(MainActivity.USEDATE,false);
        list.add(new Person(name));
        list.add(new Person("malik"));
        list.add(new Person("toufik"));
        list.add(new Person("jambo"));
        list.add(new Person("qwant"));
        //hhh


        ListView listView=(ListView)findViewById(R.id.list);
        listView.setAdapter(new Death(list,this));


    }
}
