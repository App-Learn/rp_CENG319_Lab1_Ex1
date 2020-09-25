package com.example.ravipandya_ceng319lab1_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class VRClick extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_r_click);
        LinearLayout layoutvr = (LinearLayout) findViewById(R.id.layoutvr);
        TextView createvr = new TextView(this);
        createvr.setText(R.string.createvr);
        layoutvr.addView(createvr);
    }
    @Override
    protected void onStart(){
        super.onStart();
        LinearLayout layoutvr = (LinearLayout) findViewById(R.id.layoutvr);
        TextView startvr = new TextView(this);
        startvr.setText(R.string.onstart);
        layoutvr.addView(startvr);
    }

    @Override
    protected void onStop(){
        super.onStop();
        LinearLayout layoutvr = (LinearLayout) findViewById(R.id.layoutvr);
        TextView stopvr = new TextView(this);
        stopvr.setText(R.string.onstop);
        layoutvr.addView(stopvr);
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        LinearLayout layoutvr = (LinearLayout) findViewById(R.id.layoutvr);
        TextView destroyvr = new TextView(this);
        destroyvr.setText(R.string.ondestroy);
        layoutvr.addView(destroyvr);

    }
}