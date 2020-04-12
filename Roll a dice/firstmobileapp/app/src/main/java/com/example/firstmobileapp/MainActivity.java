package com.example.firstmobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

                //Display the result Dice number
                if(RandomNumber==1) {
                    ImageView num1 = (ImageView) findViewById(R.id.Result_imageView);
                    num1.setImageResource(R.drawable.number1);
                    AnimationDrawable number1 = (AnimationDrawable) num1.getDrawable();
                    number1.start();
                }
                else if(RandomNumber==2) {
                    ImageView num2 = (ImageView) findViewById(R.id.Result_imageView);
                    num2.setImageResource(R.drawable.number2);
                    AnimationDrawable number2 = (AnimationDrawable) num2.getDrawable();
                    number2.start();
                }
                else if(RandomNumber==3) {
                    ImageView num3 = (ImageView) findViewById(R.id.Result_imageView);
                    num3.setImageResource(R.drawable.number3);
                    AnimationDrawable number3 = (AnimationDrawable) num3.getDrawable();
                    number3.start();
                }
                else if(RandomNumber==4) {
                    ImageView num4 = (ImageView) findViewById(R.id.Result_imageView);
                    num4.setImageResource(R.drawable.number4);
                    AnimationDrawable number4 = (AnimationDrawable) num4.getDrawable();
                    number4.start();
                }
                else if(RandomNumber==5) {
                    ImageView num5 = (ImageView) findViewById(R.id.Result_imageView);
                    num5.setImageResource(R.drawable.number5);
                    AnimationDrawable number5 = (AnimationDrawable) num5.getDrawable();
                    number5.start();
                }
                else if(RandomNumber==6) {
                    ImageView num6 = (ImageView) findViewById(R.id.Result_imageView);
                    num6.setImageResource(R.drawable.number6);
                    AnimationDrawable number6 = (AnimationDrawable) num6.getDrawable();
                    number6.start();
                }

            }
        });

    }

}
