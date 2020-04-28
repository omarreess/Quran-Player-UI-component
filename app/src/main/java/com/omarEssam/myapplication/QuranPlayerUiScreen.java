package com.omarEssam.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;

public class QuranPlayerUiScreen extends AppCompatActivity {
    ImageView like , play ;
    SeekBar seekBar ;
    static Boolean var = false;
    static    Boolean var1  = true;
    static Boolean k;
    static int i =0;
    MediaPlayer mMediaPlayer ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.quranplayer_ui);

        seekBar = findViewById(R.id.song_seekBar);
        like = findViewById(R.id.song_love);
        play = findViewById(R.id.song_play);


        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                playAndPause();




            }



        });


    }

    public void playAndPause(){
        if(var1==true){
            play.setImageResource(R.drawable.ic_baseline_pause_circle_outline_24px);
            mMediaPlayer= MediaPlayer.create(getApplicationContext(),R.raw.sura);
            QuranPlayerUiScreen.var1=false;
            mMediaPlayer.start();
            k = false ;}
        if (k){ if(var || i==1)
        {

            mMediaPlayer.start();
            play.setImageResource(R.drawable.ic_baseline_pause_circle_outline_24px);

            var = false;}
        else   {
            mMediaPlayer.pause();
            play.setImageResource(R.drawable.ic_baseline_play_circle_outline_24px);
            var=true;
            i=1;

        }

        }

        k =true ;
    }
}
