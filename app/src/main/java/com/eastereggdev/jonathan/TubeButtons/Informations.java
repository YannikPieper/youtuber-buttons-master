package com.eastereggdev.jonathan.TubeButtons;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

import com.example.jonathan.TubeButtons.R;

public class Informations extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.informations);
        setTitle("Credits");
    }

    public void twitter(View view) //Button to play a random sound
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/eastereggdev"));
        startActivity(browserIntent);
    }

    public void facebook(View view) //Button to play a random sound
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/eastereggdev"));
        startActivity(browserIntent);
    }

    public void website(View view) //Button to play a random sound
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.eastereggdevelopment.com/"));
        startActivity(browserIntent);
    }


    @Override
    public void onDestroy() { //destroy method for the class
        super.onDestroy();
    }
}
