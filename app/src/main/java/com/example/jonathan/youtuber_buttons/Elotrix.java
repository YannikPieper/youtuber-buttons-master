package com.example.jonathan.youtuber_buttons;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Elotrix extends ActionBarActivity {

    //Different Buttons of elotrix_1.xmlml
    private static Button elotrix_1;
    private static Button elotrix_2;
    private static Button elotrix_3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.elotrix_1);
        setTitle("Elotrix");

        elotrix_buttons();
    }

    public void elotrix_buttons(){
        Button elotrix_1 = (Button) findViewById(R.id.elotrix_b1);
        Button elotrix_2 = (Button) findViewById(R.id.elotrix_b2);
        Button elotrix_3 = (Button) findViewById(R.id.elotrix_b3);

        elotrix_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer elotrix_1 = MediaPlayer.create(Elotrix.this, R.raw.test);
                elotrix_1.start();
            }
        });

        elotrix_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer elotrix_2 = MediaPlayer.create(Elotrix.this, R.raw.test);
                elotrix_2.start();
            }
        });

        elotrix_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer elotrix_3 = MediaPlayer.create(Elotrix.this, R.raw.test);
                elotrix_3.start();
            }
        });
    }

    public void et1_next(View view)
    {
        setContentView(R.layout.elotrix_2);
    }

    public void et1_back(View view)
    {
        setContentView(R.layout.elotrix_info);
    }

    public void et2_next(View view)
    {
        setContentView(R.layout.elotrix_3);
    }

    public void et2_back(View view)
    {
        setContentView(R.layout.elotrix_1);
    }

    public void et3_next(View view)
    {
        setContentView(R.layout.elotrix_info);
    }

    public void et3_back(View view)
    {
        setContentView(R.layout.elotrix_2);
    }

    public void et4_back(View view)
    {
        setContentView(R.layout.elotrix_3);
    }

    public void et4_next(View view)
    {
        setContentView(R.layout.elotrix_1);
    }

    public void et_kanal(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/user/ELoTRiXHDx"));
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
