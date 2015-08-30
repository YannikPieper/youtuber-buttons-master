package com.eastereggdev.jonathan.TubeButtons;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

import com.example.jonathan.TubeButtons.R;


public class Marcelscorpion extends ActionBarActivity {
    private MediaPlayer mp = new MediaPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.marcelscorpion_1); //Set the layout file
        setTitle("Marcelscorpion"); //Rename the ActionBar Title
    }


    //OnClick Method für alle verschiedenen Sound Buttons
    public void ms_b1(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_noconnection); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void ms_b2(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_weristderbeste); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void ms_b3(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_einsvor); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void ms_b4(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_frechdachs); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void ms_b5(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_krank1); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void ms_b6(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_krank2); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void ms_b7(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_krank3); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void ms_b8(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_krankfinale); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void ms_b9(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_krankesounds); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void ms_b10(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_lenakannsnicht); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void ms_b11(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_lenalachen); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void ms_b12(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_marcelsingt1); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void ms_b13(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_marcelsingt2); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void ms_b14(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_meinpissoir); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void ms_b15(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_nohands); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void ms_b16(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_nochniegesehen); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void ms_b17(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_noobsschwitzen); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void ms_b18(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_onlyflinkehaende); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void ms_b19(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_ragemoment); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }

    public void ms_b20(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_rechtsvorlinks); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }

    public void ms_b21(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_schwarm); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }

    public void ms_b22(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_sweep); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }

    public void ms_b23(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_tarnheli); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }

    public void ms_b24(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_wasistmitdenleutenlos); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }

    public void ms_b25(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_wermchtdennsowas); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }

    public void ms_b26(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_whoisthebest); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }

    public void ms_b27(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_zelosmonteturnon); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }

    public void ms_b28(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_zelosred); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }

    public void ms_b29(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_zelossauberman); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }

    public void ms_b30(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_tot1vor); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }

    public void ms_b31(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_sagudaheda); //Method to start the MediaPlayer with the selected Sound
        mp.start();

    }public void ms_b32(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_bombi); //Method to start the MediaPlayer with the selected Sound
        mp.start();

    }public void ms_b33(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_eyman); //Method to start the MediaPlayer with the selected Sound
        mp.start();

    }public void ms_b34(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_stellung); //Method to start the MediaPlayer with the selected Sound
        mp.start();

    }public void ms_b35(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_ausraster1); //Method to start the MediaPlayer with the selected Sound
        mp.start();

    }public void ms_b36(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_ohoh); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }






    public void ms1_next(View view)
    {
        setContentView(R.layout.marcelscorpion_2);
    }

    public void ms1_back(View view)
    {
        setContentView(R.layout.marcelscorpion_info);
    }

    public void ms2_next(View view)
    {
        setContentView(R.layout.marcelscorpion_3);
    }

    public void ms2_back(View view)
    {
        setContentView(R.layout.marcelscorpion_1);
    }

    public void ms3_next(View view)
    {
        setContentView(R.layout.marcelscorpion_4);
    }

    public void ms3_back(View view)
    {
        setContentView(R.layout.marcelscorpion_2);
    }

    public void msinfo_back(View view)
    {
        setContentView(R.layout.marcelscorpion_6);
    }

    public void msinfo_next(View view)
    {
        setContentView(R.layout.marcelscorpion_1);
    }

    public void ms5_next(View view)
    {
        setContentView(R.layout.marcelscorpion_5);
    }

    public void ms5_back(View view)
    {
        setContentView(R.layout.marcelscorpion_3);
    }

    public void ms6_next(View view)
    {
        setContentView(R.layout.marcelscorpion_6);
    }

    public void ms6_back(View view)
    {
        setContentView(R.layout.marcelscorpion_4);
    }

    public void ms7_next(View view)
    {
        setContentView(R.layout.marcelscorpion_info);
    }

    public void ms7_back(View view)
    {
        setContentView(R.layout.marcelscorpion_5);
    }

    public void ms_kanal(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/user/marcelscorpionhttps://www.youtube.com/user/marcelscorpion"));
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
