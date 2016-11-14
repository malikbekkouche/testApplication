package com.example.root.myapplication.objects;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.root.myapplication.R;

import java.util.ArrayList;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;


/**
 * Created by root on 11/12/16.
 */

public class Death extends BaseAdapter {

    private Context context;
    private ArrayList<Person> list;
    private static LayoutInflater inflater ;

    public Death(ArrayList<Person> l,Context c){
        list=l;
        context=c;
        inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Person getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view==null){
            view=inflater.inflate(R.layout.activity_death_row,null);
        }
        Person t=getItem(i);
        TextView textView=(TextView)view.findViewById(R.id.death_name);
        textView.setText(t.getName());
        ImageView imageView=(ImageView)view.findViewById(R.id.death_photo);
        imageView.setImageResource(t.getImage());
        return view;
    }


}
