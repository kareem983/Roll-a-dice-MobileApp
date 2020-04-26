package com.example.firstmobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.transition.Transition;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        if(getResources().getConfiguration().orientation== Configuration.ORIENTATION_PORTRAIT||getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE) {

            TextView txt1 = (TextView) findViewById(R.id.text1);
            TextView txt2 = (TextView) findViewById(R.id.text2);
            TextView txt3 = (TextView) findViewById(R.id.text3);
            TextView txt4 = (TextView) findViewById(R.id.text4);
            TextView txt5 = (TextView) findViewById(R.id.text5);
            TextView txt6 = (TextView) findViewById(R.id.text6);
            TextView txt7 = (TextView) findViewById(R.id.text7);
            TextView txt8 = (TextView) findViewById(R.id.text8);
            TextView txt9 = (TextView) findViewById(R.id.text9);
            TextView txt10 = (TextView) findViewById(R.id.text10);



            String x1 = getIntent().getStringExtra("key1");
            if (x1 != null){ txt1.setText(x1); txt1.setGravity(Gravity.CENTER);}

            String x2 = getIntent().getStringExtra("key2");
            if (x2 != null) {txt2.setText(x2); txt2.setGravity(Gravity.CENTER);}

            String x3 = getIntent().getStringExtra("key3");
            if (x3 != null) {txt3.setText(x3); txt3.setGravity(Gravity.CENTER);}

            String x4 = getIntent().getStringExtra("key4");
            if (x4 != null) {txt4.setText(x4); txt4.setGravity(Gravity.CENTER);}

            String x5 = getIntent().getStringExtra("key5");
            if (x5 != null) {txt5.setText(x5); txt5.setGravity(Gravity.CENTER);}

            String x6 = getIntent().getStringExtra("key6");
            if (x6 != null) {txt6.setText(x6); txt6.setGravity(Gravity.CENTER);}

            String x7 = getIntent().getStringExtra("key7");
            if (x7 != null) {txt7.setText(x7); txt7.setGravity(Gravity.CENTER);}

            String x8 = getIntent().getStringExtra("key8");
            if (x8 != null) {txt8.setText(x8); txt8.setGravity(Gravity.CENTER);}

            String x9 = getIntent().getStringExtra("key9");
            if (x9 != null) {txt9.setText(x9); txt9.setGravity(Gravity.CENTER);}

            String x10 = getIntent().getStringExtra("key10");
            if (x10 != null) {txt10.setText(x10); txt10.setGravity(Gravity.CENTER);}
        }

    }

}
