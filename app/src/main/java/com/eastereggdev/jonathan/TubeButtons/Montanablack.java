package com.eastereggdev.jonathan.TubeButtons;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

import com.example.jonathan.TubeButtons.R;


public class Montanablack extends ActionBarActivity {
    private MediaPlayer mp = new MediaPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.montanablack_1);
        setTitle("Montanablack");


    }

    //OnClick Method für alle verschiedenen Sound Buttons
    public void mb_b1(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_moinmoin); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void mb_b2(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_after); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void mb_b3(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_erstesmal); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void mb_b4(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_hurensohn); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void mb_b5(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_hurensohn2); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void mb_b6(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_hurensohn3); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void mb_b7(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_isklar); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void mb_b8(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_kundenhotline); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void mb_b9(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_lache); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void mb_b10(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_lache2); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void mb_b11(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_messerihn); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void mb_b12(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_nein); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void mb_b13(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_nicespawn); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void mb_b14(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_ohh); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void mb_b15(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_omg); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void mb_b16(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_pizza); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void mb_b17(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_porno); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void mb_b18(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_schleifendehoden); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void mb_b19(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_trol); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void mb_b20(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_uiui); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void mb_b21(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_vorraete); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void mb_b22(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_bug); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void mb_b23(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_aktiv); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void mb_b24(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_5vswilli); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }


    public void mb1_next(View view)
    {
        setContentView(R.layout.montanablack_2);
    }

    public void mb1_back(View view)
    {
        setContentView(R.layout.montanablack_info);
    }

    public void mb2_next(View view)
    {
        setContentView(R.layout.montanablack_3);
    }

    public void mb2_back(View view)
    {
        setContentView(R.layout.montanablack_1);
    }

    public void mb3_next(View view)
    {
        setContentView(R.layout.montanablack_4);
    }

    public void mb3_back(View view)
    {
        setContentView(R.layout.montanablack_2);
    }

    public void mb4_next(View view)
    {
        setContentView(R.layout.montanablack_info);
    }

    public void mb4_back(View view)
    {
        setContentView(R.layout.montanablack_3);
    }


    public void mbinfo_back(View view)
    {
        setContentView(R.layout.montanablack_4);
    }

    public void mbinfo_next(View view)
    {
        setContentView(R.layout.montanablack_1);
    }

    public void mb_kanal(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/user/montanablack88"));
        startActivity(browserIntent);
    }



    /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    } */


}
