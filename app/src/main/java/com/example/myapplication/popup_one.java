package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;



import androidx.annotation.Nullable;

public class popup_one extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.popup_one);

        //DisplayMetrics dm = new DisplayMetrics();
        //getWindowManager().getDefaultDisplay().getMetrics(dm);


        //int width = dm.widthPixels;
       // int height = dm.heightPixels;
        //getWindow().setLayout((int)(width*.8),(int)(height*.6));

    }
}

