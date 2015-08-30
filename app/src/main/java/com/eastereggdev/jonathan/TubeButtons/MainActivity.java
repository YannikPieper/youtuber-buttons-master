package com.eastereggdev.jonathan.TubeButtons;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.eastereggdev.jonathan.TubeButtons.Elotrix;
import com.eastereggdev.jonathan.TubeButtons.Montanablack;
import com.example.jonathan.TubeButtons.R;


public class MainActivity extends ActionBarActivity {

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

    public void favoriten(View view) //Button to see your favorites
    {
        Intent intent = new Intent(this, Favoriten.class);
        startActivity(intent); //Start class "Favoriten"
    }

    public void ms(View view) //Method to change the values on top of the xml file
    {
        ytView = (ImageView) findViewById(R.id.yt_icon); //Change YouTuber Icon
        soundboard = (Button) findViewById(R.id.sounds); //Change Button to connect to the class
        soundboard.setText("Marcelscorpion Sounds"); //Change Text
        soundboard.setBackgroundColor(Color.parseColor("#B71C1C")); //Change Background Color
        ytView.setImageResource(msicon);
        yt = 1; //Value to set the different YouTubers
    }

    public void vb(View view)
    {
        ytView = (ImageView) findViewById(R.id.yt_icon);
        soundboard = (Button) findViewById(R.id.sounds);
        soundboard.setText("Gesperrt");
        soundboard.setBackgroundColor(Color.parseColor("#263238"));
        ytView.setImageResource(vbicon);
        yt = 2;
    }

    public void mb(View view)
    {
        ytView = (ImageView) findViewById(R.id.yt_icon);
        soundboard = (Button) findViewById(R.id.sounds);
        soundboard.setText("Montanablack Sounds");
        soundboard.setBackgroundColor(Color.parseColor("#673AB7"));
        ytView.setImageResource(mbicon);
        yt = 3;
    }

    public void is(View view)
    {
        ytView = (ImageView) findViewById(R.id.yt_icon);
        soundboard = (Button) findViewById(R.id.sounds);
        soundboard.setText("Gesperrt");
        soundboard.setBackgroundColor(Color.parseColor("#263238"));
        ytView.setImageResource(isicon);
        yt = 4;
    }

    public void et(View view)
    {
        ytView = (ImageView) findViewById(R.id.yt_icon);
        soundboard = (Button) findViewById(R.id.sounds);
        soundboard.setText("Elotrix Sounds");
        soundboard.setBackgroundColor(Color.parseColor("#FF9800"));
        ytView.setImageResource(eticon);
        yt = 5;
    }

    public void sounds(View view) //Method to open the different soundboards
    {
        if(yt == 0) //yt = YouTuber (Marcelscorpion = 0 and 1)
        {
            Intent intent = new Intent(this, Marcelscorpion.class);
            startActivity(intent); //start the new class
        }
        if(yt == 1)
        {
            Intent intent = new Intent(this, Marcelscorpion.class);
            startActivity(intent);
        }
        if(yt == 2)
        {
            CharSequence text = "Dieser YouTuber wird erst im nächsten Update freigeschaltet!"; //Text shown by toast
            int duration = Toast.LENGTH_SHORT; //Toast duration

            Toast toast = Toast.makeText(getApplicationContext(), text, duration);
            toast.show();

            /*Intent intent = new Intent(this, ViscaBarca.class);
            startActivity(intent);*/
        }
        if(yt == 3)
        {
            Intent intent = new Intent(this, Montanablack.class);
            startActivity(intent);
        }
        if(yt == 4)
        {
            CharSequence text = "Dieser YouTuber wird erst im nächsten Update freigeschaltet!"; //Text shown by toast
            int duration = Toast.LENGTH_SHORT; //Toast duration

            Toast toast = Toast.makeText(getApplicationContext(), text, duration);
            toast.show();

            /* Intent intent = new Intent(this, Inscope.class);
            startActivity(intent);*/
        }
        if(yt == 5)
        {
            Intent intent = new Intent(this, Elotrix.class);
            startActivity(intent);
        }
    }





    /*

    No actual use for the Settings in the Action Menu Bar!

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
    }  */


}
