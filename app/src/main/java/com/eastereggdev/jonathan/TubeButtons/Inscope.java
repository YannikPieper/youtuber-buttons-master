package com.eastereggdev.jonathan.TubeButtons;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

import com.example.jonathan.TubeButtons.R;


public class Inscope extends ActionBarActivity {

    //Different Buttons of marcelscorpion_1.xmlml
    private static Button inscope_1;
    private static Button inscope_2;
    private static Button inscope_3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inscope_1);
        setTitle("Inscope");

        inscope_buttons();
    }

    public void inscope_buttons(){
        Button inscope_1 = (Button) findViewById(R.id.inscope_b1);
        Button inscope_2 = (Button) findViewById(R.id.inscope_b2);
        Button inscope_3 = (Button) findViewById(R.id.inscope_b3);

        inscope_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
             //   MediaPlayer inscope_1 = MediaPlayer.create(Inscope.this, R.raw.test);
             //   inscope_1.start();
            }
        });

        inscope_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            //    MediaPlayer inscope_2 = MediaPlayer.create(Inscope.this, R.raw.test);
            //    inscope_2.start();
            }
        });

        inscope_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
             //   MediaPlayer inscope_3 = MediaPlayer.create(Inscope.this, R.raw.test);
             //   inscope_3.start();
            }
        });
    }

    public void is1_next(View view)
    {
        setContentView(R.layout.inscope_2);
    }

    public void is1_back(View view)
    {
        setContentView(R.layout.inscope_info);
    }

    public void is2_next(View view)
    {
        setContentView(R.layout.inscope_3);
    }

    public void is2_back(View view)
    {
        setContentView(R.layout.inscope_1);
    }

    public void is3_next(View view)
    {
        setContentView(R.layout.inscope_info);
    }

    public void is3_back(View view)
    {
        setContentView(R.layout.inscope_2);
    }

    public void is4_back(View view)
    {
        setContentView(R.layout.inscope_3);
    }

    public void is4_next(View view)
    {
        setContentView(R.layout.inscope_1);
    }

    public void is_kanal(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/user/inscope21"));
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
