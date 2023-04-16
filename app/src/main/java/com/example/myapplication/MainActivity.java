package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TableLayout;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    Dialog myDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDialog = new Dialog(this);
    }

    public void show_popup(View v) {
        TextView txtclose;
        Button btnShow;

        myDialog.setContentView(R.layout.popup_one);
        txtclose = (TextView) myDialog.findViewById(R.id.txtclose);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.show();

    }

}