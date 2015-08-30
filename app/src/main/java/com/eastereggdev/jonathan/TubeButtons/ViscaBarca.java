package com.eastereggdev.jonathan.TubeButtons;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

import com.example.jonathan.TubeButtons.R;


public class ViscaBarca extends ActionBarActivity {

    //Different Buttons of viscabarca_1_1.xml
    private static Button viscabarca_1;
    private static Button viscabarca_2;
    private static Button viscabarca_3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viscabarca_1);
        setTitle("ViscaBarca");

       // viscabarca_buttons();
    }

    /*public void viscabarca_buttons(){
        Button viscabarca_1 = (Button) findViewById(R.id.viscabarca_b1);
        Button viscabarca_2 = (Button) findViewById(R.id.viscabarca_b2);
        Button viscabarca_3 = (Button) findViewById(R.id.viscabarca_b3);

        viscabarca_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer viscabarca_1 = MediaPlayer.create(ViscaBarca.this, R.raw.test);
                viscabarca_1.start();
            }
        });

        viscabarca_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer viscabarca_2 = MediaPlayer.create(ViscaBarca.this, R.raw.test);
                viscabarca_2.start();
            }
        });

        viscabarca_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer viscabarca_3 = MediaPlayer.create(ViscaBarca.this, R.raw.test);
                viscabarca_3.start();
            }
        });
    } */

    public void vb1_next(View view)
    {
        setContentView(R.layout.viscabarca_2);
    }

    public void vb1_back(View view)
    {
        setContentView(R.layout.viscabarca_info);
    }

    public void vb2_next(View view)
    {
        setContentView(R.layout.viscabarca_3);
    }

    public void vb2_back(View view)
    {
        setContentView(R.layout.viscabarca_1);
    }

    public void vb3_next(View view)
    {
        setContentView(R.layout.viscabarca_info);
    }

    public void vb3_back(View view)
    {
        setContentView(R.layout.viscabarca_2);
    }

    public void vb4_back(View view)
    {
        setContentView(R.layout.viscabarca_3);
    }

    public void vb4_next(View view)
    {
        setContentView(R.layout.viscabarca_1);
    }

    public void vb_kanal(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/user/Visca96Barca"));
        startActivity(browserIntent);
    }

    /*@Override
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
    }*/


}
