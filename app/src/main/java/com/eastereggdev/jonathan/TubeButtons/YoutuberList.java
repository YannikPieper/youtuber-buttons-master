package com.eastereggdev.jonathan.TubeButtons;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jonathan.TubeButtons.R;

public class YoutuberList extends ActionBarActivity {

    Button ms;
    Button mb;
    Button vb;
    Button is;
    Button et;
    Button ks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.youtuberlist);

    }

    public void ms(View view){
        Intent intent = new Intent(this, Marcelscorpion.class);
        startActivity(intent); //start the new class
    }

    public void mb(View view){
        Intent intent = new Intent(this, Montanablack.class);
        startActivity(intent);
    }

    public void vb(View view){
        Intent intent = new Intent(this, ViscaBarca.class);
        startActivity(intent);
    }

    public void is(View view){
        Intent intent = new Intent(this, Inscope.class);
        startActivity(intent);
    }

    public void et(View view){
        Intent intent = new Intent(this, Elotrix.class);
        startActivity(intent);
    }

    public void ks(View view){
        Toast.makeText(getApplicationContext(), "Erst im nächsten Update verfügbar!", Toast.LENGTH_SHORT).show();
        /*Intent intent = new Intent(this, KSFreak.class);
        startActivity(intent);*/
    }

}
