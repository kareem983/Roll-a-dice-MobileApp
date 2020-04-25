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

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //history array list
    ArrayList<Integer> History=new ArrayList<>();
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
                int MinNumber = 1;
                int MaxNumber = 6;
                int range = MaxNumber - MinNumber + 1;
                int RandomNumber = (int) (Math.random() * range) + MinNumber;
                //add history in array list
                History.add(RandomNumber);
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


    //on click history button
    public void history_btn(View v){
        Intent intent=new Intent(MainActivity.this,Main2Activity.class);
        if(History.size()>0) intent.putExtra("key1",String.valueOf( History.get(History.size()-1)) );
        if(History.size()>1) intent.putExtra("key2",String.valueOf( History.get(History.size()-2)) );
        if(History.size()>2) intent.putExtra("key3",String.valueOf( History.get(History.size()-3)) );
        if(History.size()>3) intent.putExtra("key4",String.valueOf( History.get(History.size()-4)) );
        if(History.size()>4) intent.putExtra("key5",String.valueOf( History.get(History.size()-5)) );
        if(History.size()>5) intent.putExtra("key6",String.valueOf( History.get(History.size()-6)) );
        if(History.size()>6) intent.putExtra("key7",String.valueOf( History.get(History.size()-7)) );
        if(History.size()>7) intent.putExtra("key8",String.valueOf( History.get(History.size()-8)) );
        if(History.size()>8) intent.putExtra("key9",String.valueOf( History.get(History.size()-9)) );
        if(History.size()>9) intent.putExtra("key10",String.valueOf( History.get(History.size()-10)) );

        startActivity(intent);
    }
}
