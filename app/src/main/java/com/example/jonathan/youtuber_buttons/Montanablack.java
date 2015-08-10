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


public class Montanablack extends ActionBarActivity {

    //Different Buttons of montanablack_1.xmlml
    private static Button montanablack_1;
    private static Button montanablack_2;
    private static Button montanablack_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.montanablack_1);
        setTitle("Montanablack");

        montanablack_buttons();
    }

    public void montanablack_buttons(){
        Button montanablack_1 = (Button) findViewById(R.id.montanablack_b1);
        Button montanablack_2 = (Button) findViewById(R.id.montanablack_b2);
        Button montanablack_3 = (Button) findViewById(R.id.montanablack_b3);

        montanablack_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer montanablack_1 = MediaPlayer.create(Montanablack.this, R.raw.test);
                montanablack_1.start();
            }
        });

        montanablack_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer montanablack_2 = MediaPlayer.create(Montanablack.this, R.raw.test);
                montanablack_2.start();
            }
        });

        montanablack_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer montanablack_3 = MediaPlayer.create(Montanablack.this, R.raw.test);
                montanablack_3.start();
            }
        });
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
        setContentView(R.layout.montanablack_info);
    }

    public void mb3_back(View view)
    {
        setContentView(R.layout.montanablack_2);
    }

    public void mb4_back(View view)
    {
        setContentView(R.layout.montanablack_3);
    }

    public void mb4_next(View view)
    {
        setContentView(R.layout.montanablack_1);
    }

    public void mb_kanal(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/user/montanablack88"));
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
