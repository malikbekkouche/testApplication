package com.example.root.myapplication.objects;

import android.graphics.Path;

import com.example.root.myapplication.R;

import java.io.File;
import java.util.Random;

/**
 * Created by root on 11/13/16.
 */

public class Person {
    private String name,cause;
    private int image;

    public Person(String name) {
        this.name = name;
        randomize();
    }

    public Person( String cause, String name) {
        this.cause = cause;
        this.name = name;
        randomize();
    }

    private void randomize(){
        Random r=new Random();
        int i=r.nextInt(10);
        if(i%2==0)
            image=R.drawable.an;
        else
            image=R.drawable.anon;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
