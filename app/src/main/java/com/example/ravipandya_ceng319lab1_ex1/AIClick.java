package com.example.ravipandya_ceng319lab1_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class AIClick extends AppCompatActivity {

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_i_click);
        LinearLayout layoutai = (LinearLayout) findViewById(R.id.layoutai);
        TextView createai = new TextView(this);
        createai.setText(R.string.createai);
        layoutai.addView(createai);
        }
@Override
protected void onStart(){
        super.onStart();
        LinearLayout layoutai = (LinearLayout) findViewById(R.id.layoutai);
        TextView startai = new TextView(this);
        startai.setText(R.string.onstart);
        layoutai.addView(startai);
        }

@Override
protected void onStop(){
        super.onStop();
        LinearLayout layoutai = (LinearLayout) findViewById(R.id.layoutai);
        TextView stopai = new TextView(this);
        stopai.setText(R.string.onstop);
        layoutai.addView(stopai);
}

@Override
protected void onDestroy(){
        super.onDestroy();
        LinearLayout layoutai = (LinearLayout) findViewById(R.id.layoutai);
        TextView destroyai = new TextView(this);
        destroyai.setText(R.string.ondestroy);
        layoutai.addView(destroyai);

}
}