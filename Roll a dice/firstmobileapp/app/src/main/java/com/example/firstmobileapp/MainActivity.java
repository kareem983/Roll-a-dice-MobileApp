package com.example.firstmobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //if(getResources().getConfiguration().orientation== Configuration.ORIENTATION_PORTRAIT){}
        //else if(getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE){}

        Button RollButton=(Button)findViewById(R.id.roll_btn);
        RollButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //get the Random number
                int MinNumber=1;
                int MaxNumber=6;
                int range=MaxNumber-MinNumber+1;
                int RandomNumber=(int)(Math.random()*range)+MinNumber;
                //sound Efect
                MediaPlayer RollSoundEfect = MediaPlayer.create(MainActivity.this, R.raw.roll);
                RollSoundEfect.start();
                //Movable Dice image view
                ImageView MovableDice = (ImageView) findViewById(R.id.Movable_imageView);
                MovableDice.setImageResource(R.drawable.running);
                AnimationDrawable running = (AnimationDrawable) MovableDice.getDrawable();
                running.start();


                ImageView num = (ImageView) findViewById(R.id.Result_imageView);
                //Display the result Dice number
                if(RandomNumber==1) {
                    num.setImageResource(R.drawable.num1);
                }
                else if(RandomNumber==2) {
                    num.setImageResource(R.drawable.num2);
                }
                else if(RandomNumber==3) {
                    num.setImageResource(R.drawable.num3);
                }
                else if(RandomNumber==4) {
                    num.setImageResource(R.drawable.num4);
                }
                else if(RandomNumber==5) {
                    num.setImageResource(R.drawable.num5);
                }
                else if(RandomNumber==6) {
                    num.setImageResource(R.drawable.num6);
                }

            }
        });

    }

}
