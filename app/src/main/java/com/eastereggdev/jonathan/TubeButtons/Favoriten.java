package com.eastereggdev.jonathan.TubeButtons;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.example.jonathan.TubeButtons.R;

public class Favoriten extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favoriten_bewertung); //Set the layout file
        setTitle("Meine Favoriten"); //Rename the ActionBar Title
    }

}
