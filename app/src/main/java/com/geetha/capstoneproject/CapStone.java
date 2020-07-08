package com.geetha.capstoneproject;

import android.app.Application;

import com.jakewharton.threetenabp.AndroidThreeTen;

public class CapStone extends Application {

    @Override
    public void onCreate() {
        super.onCreate ();
        AndroidThreeTen.init (this);
    }
}
