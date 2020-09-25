package com.example.ravipandya_ceng319lab1_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout layoutmain = (LinearLayout) findViewById(R.id.layoutmain);
        TextView createmain = new TextView(this);
        createmain.setText(R.string.createmain);
        layoutmain.addView(createmain);
    }
    @Override
    protected void onStart(){
        super.onStart();
        LinearLayout layoutmain = (LinearLayout) findViewById(R.id.layoutmain);
        TextView startmain = new TextView(this);
        startmain.setText(R.string.onstart);
        layoutmain.addView(startmain);
    }

    @Override
    protected void onStop(){
        super.onStop();
        LinearLayout layoutmain = (LinearLayout) findViewById(R.id.layoutmain);
        TextView stopmain = new TextView(this);
        stopmain.setText(R.string.onstop);
        layoutmain.addView(stopmain);
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        LinearLayout layoutmain = (LinearLayout) findViewById(R.id.layoutmain);
        TextView destroymain = new TextView(this);
        destroymain.setText(R.string.ondestroy);
        layoutmain.addView(destroymain);

    }
}