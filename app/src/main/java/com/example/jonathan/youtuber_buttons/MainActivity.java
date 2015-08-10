package com.example.jonathan.youtuber_buttons;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    private static TextView link;
    private static Button soundboard;
    private static ImageView ytView;
    int msicon = R.drawable.msicon;
    int vbicon = R.drawable.vbicon;
    int mbicon = R.drawable.mbicon;
    int isicon = R.drawable.isicon;
    int eticon = R.drawable.eticon;

    int yt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.youtuber_list);

    }

    public void ms(View view)
    {
        ytView = (ImageView) findViewById(R.id.yt_icon);
        soundboard = (Button) findViewById(R.id.sounds);
        link = (TextView) findViewById(R.id.ytlink);
        link.setText("https://www.youtube.com/user/marcelscorpion");
        soundboard.setText("Marcelscorpion Sounds");
        soundboard.setBackgroundColor(Color.parseColor("#EF5350"));
        ytView.setImageResource(msicon);
        yt = 1;
    }

    public void vb(View view)
    {
        ytView = (ImageView) findViewById(R.id.yt_icon);
        soundboard = (Button) findViewById(R.id.sounds);
        link = (TextView) findViewById(R.id.ytlink);
        link.setText("https://www.youtube.com/user/Visca96Barca");
        soundboard.setText("ViscaBarca Sounds");
        soundboard.setBackgroundColor(Color.parseColor("#2196F3"));
        ytView.setImageResource(vbicon);
        yt = 2;
    }

    public void mb(View view)
    {
        ytView = (ImageView) findViewById(R.id.yt_icon);
        soundboard = (Button) findViewById(R.id.sounds);
        link = (TextView) findViewById(R.id.ytlink);
        link.setText("https://www.youtube.com/user/montanablack88");
        soundboard.setText("Montanablack Sounds");
        soundboard.setBackgroundColor(Color.parseColor("#9C27B0"));
        ytView.setImageResource(mbicon);
        yt = 3;
    }

    public void is(View view)
    {
        ytView = (ImageView) findViewById(R.id.yt_icon);
        soundboard = (Button) findViewById(R.id.sounds);
        link = (TextView) findViewById(R.id.ytlink);
        link.setText("https://www.youtube.com/user/inscope21");
        soundboard.setText("Inscope21 Sounds");
        soundboard.setBackgroundColor(Color.parseColor("#8BC34A"));
        ytView.setImageResource(isicon);
        yt = 4;
    }

    public void et(View view)
    {
        ytView = (ImageView) findViewById(R.id.yt_icon);
        soundboard = (Button) findViewById(R.id.sounds);
        link = (TextView) findViewById(R.id.ytlink);
        link.setText("https://www.youtube.com/user/ELoTRiXHDx");
        soundboard.setText("Elotrix Sounds");
        soundboard.setBackgroundColor(Color.parseColor("#FFC107"));
        ytView.setImageResource(eticon);
        yt = 5;
    }

    public void sounds(View view)
    {
        if(yt == 1)
        {
            Intent intent = new Intent(this, Marcelscorpion.class);
            startActivity(intent);
        }
        if(yt == 2)
        {
            Intent intent = new Intent(this, ViscaBarca.class);
            startActivity(intent);
        }
        if(yt == 3)
        {
            Intent intent = new Intent(this, Montanablack.class);
            startActivity(intent);
        }
        if(yt == 4)
        {
            Intent intent = new Intent(this, Inscope.class);
            startActivity(intent);
        }
        if(yt == 5)
        {
            Intent intent = new Intent(this, Elotrix.class);
            startActivity(intent);
        }
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
