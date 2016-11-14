package com.example.root.myapplication.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

import com.example.root.myapplication.R;


public class MainActivity extends AppCompatActivity {

    private CheckBox mCheckbox;
    private CalendarView mCalendar;
    private Button mButton;
    private EditText mEditText,mDeath;

    public static final String NAME="com.examlpe.root.myapplication.name";
    public static final String DATE="com.examlpe.root.myapplication.date";
    public static final String DATER="com.examlpe.root.myapplication.dateR";
    public static final String DEATH="com.examlpe.root.myapplication.death";
    public static final String USEDATE="com.examlpe.root.myapplication.usedate";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCheckbox=(CheckBox)findViewById(R.id.wantCalendar);
        mCalendar=(CalendarView)findViewById(R.id.calendar);
        mCalendar.setVisibility(View.GONE);
        mCalendar.setMinDate(System.currentTimeMillis());
        mButton=(Button)findViewById(R.id.button1);
        mEditText=(EditText) findViewById(R.id.name);
        mDeath=(EditText)findViewById(R.id.death);

        mCheckbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    mCalendar.setVisibility(View.VISIBLE);
                    Log.d("main","true");
                }
                else
                    mCalendar.setVisibility(View.GONE);
            }
        });

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,DeathActivity.class);
                intent.putExtra(NAME,mEditText.getText().toString().trim());
                intent.putExtra(USEDATE,mCheckbox.isChecked());
                if(mCheckbox.isChecked())
                    intent.putExtra(DATE,mCalendar.getDate());
                intent.putExtra(DEATH,mDeath.getText().toString().trim());
                startActivity(intent);

            }
        });




    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){ // crashes when click
        switch (item.getItemId()){
            case R.id.menu_item :
                Intent intent=new Intent(MainActivity.this,PersonDetailsActivity.class);
                startActivity(intent);
                return true;
        }
        return false;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater mi=getMenuInflater();
        mi.inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public void onSaveInstanceState(Bundle state){
        super.onSaveInstanceState(state);
        state.putLong(DATER,mCalendar.getDate());
    }

    @Override
    public void onRestoreInstanceState(Bundle state){
        super.onRestoreInstanceState(state);
        long savedDate=state.getLong(DATER);
        mCalendar.setDate(savedDate);
    }
}
