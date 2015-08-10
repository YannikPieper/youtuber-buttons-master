package com.example.jonathan.youtuber_buttons;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Marcelscorpion extends ActionBarActivity {

    //Different Buttons of marcelscorpion_1_1.xml
    private static Button marcelscorpion_1;
    private static Button marcelscorpion_2;
    private static Button marcelscorpion_3;

    private static Button weiter_1;
    private static Button weiter_2;
    private static Button weiter_3;

    private static Button zurück_1;
    private static Button zurück_2;
    private static Button zurück_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.marcelscorpion_1); //Set the layout file
        setTitle("Marcelscorpion"); //Rename the ActionBar Title

        marcelscorpion_buttons(); //Call method
    }

    public void marcelscorpion_buttons(){ //OnClickListener for the different sound buttons in marcelscorpion_1_1.xml
        Button marcelscorpion_1 = (Button) findViewById(R.id.marcelscorpion_b1);
        Button marcelscorpion_2 = (Button) findViewById(R.id.marcelscorpion_b2);
        Button marcelscorpion_3 = (Button) findViewById(R.id.marcelscorpion_b3);

        marcelscorpion_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer marcelscorpion_1 = MediaPlayer.create(com.example.jonathan.youtuber_buttons.Marcelscorpion.this, R.raw.test); //Method to start the MediaPlayer with the selected Sound
                marcelscorpion_1.start();
            }
        });

        marcelscorpion_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer marcelscorpion_2 = MediaPlayer.create(com.example.jonathan.youtuber_buttons.Marcelscorpion.this, R.raw.test);
                marcelscorpion_2.start();
            }
        });

        marcelscorpion_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer marcelscorpion_3 = MediaPlayer.create(com.example.jonathan.youtuber_buttons.Marcelscorpion.this, R.raw.test);
                marcelscorpion_3.start();
            }
        });
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
        setContentView(R.layout.marcelscorpion_info);
    }

    public void ms3_back(View view)
    {
        setContentView(R.layout.marcelscorpion_2);
    }

    public void ms4_back(View view)
    {
        setContentView(R.layout.marcelscorpion_3);
    }

    public void ms4_next(View view)
    {
        setContentView(R.layout.marcelscorpion_1);
    }

    public void ms_kanal(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/user/marcelscorpionhttps://www.youtube.com/user/marcelscorpion"));
        startActivity(browserIntent);
    }


    @Override
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
    }


}
