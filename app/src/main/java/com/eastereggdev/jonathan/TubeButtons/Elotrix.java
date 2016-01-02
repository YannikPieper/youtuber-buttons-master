package com.eastereggdev.jonathan.TubeButtons;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jonathan.TubeButtons.R;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;


public class Elotrix extends ActionBarActivity {
    private MediaPlayer mp = new MediaPlayer();
    private int page = 1;

    public String ordnerpfad = Environment.getExternalStorageDirectory() + "/TubeSounds";
    public String soundpfad = ordnerpfad + "/sound.mp3";
    public File ordnerfile = new File(ordnerpfad);
    public File soundfile = new File(soundpfad);
    public Uri urisound = Uri.parse(soundpfad);
    public byte[] byte1 = new byte[1024];
    public int zwischenspeicher = 0;
    public InputStream is1;
    public FileOutputStream fos;

    public Intent shareintent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.elotrix);
        setTitle("Elotrix");

        elotrix_share();
    }

    public void setText(){
        if(page == 1){
            Button et1 = (Button) findViewById(R.id.elotrix_b1);
            Button et2 = (Button) findViewById(R.id.elotrix_b2);
            Button et3 = (Button) findViewById(R.id.elotrix_b3);
            Button et4 = (Button) findViewById(R.id.elotrix_b4);
            Button et5 = (Button) findViewById(R.id.elotrix_b5);
            Button et6 = (Button) findViewById(R.id.elotrix_b6);

            et1.setText("Auf dem Auto!");
            et2.setText("Aufklärungsdrohne V.1");
            et3.setText("Aufklärungsdrohne V.2");
            et4.setText("Das kann nicht sein");
            et5.setText("deine Eltern sind Geschwister");
            et6.setText("Sie können nichts!");
        }
        if(page == 2){
            Button et1 = (Button) findViewById(R.id.elotrix_b1);
            Button et2 = (Button) findViewById(R.id.elotrix_b2);
            Button et3 = (Button) findViewById(R.id.elotrix_b3);
            Button et4 = (Button) findViewById(R.id.elotrix_b4);
            Button et5 = (Button) findViewById(R.id.elotrix_b5);
            Button et6 = (Button) findViewById(R.id.elotrix_b6);

            et1.setText("du Huansohn V.1");
            et2.setText("Du Huansohn V.2");
            et3.setText("Du Huansohn V.3");
            et4.setText("Du Huansohn V.4");
            et5.setText("Hier wirst du eh nur...");
            et6.setText("Er ist wieder in der Lobby!");
        }
        if(page == 3){
            Button et1 = (Button) findViewById(R.id.elotrix_b1);
            Button et2 = (Button) findViewById(R.id.elotrix_b2);
            Button et3 = (Button) findViewById(R.id.elotrix_b3);
            Button et4 = (Button) findViewById(R.id.elotrix_b4);
            Button et5 = (Button) findViewById(R.id.elotrix_b5);
            Button et6 = (Button) findViewById(R.id.elotrix_b6);

            et1.setText("Es reicht!");
            et2.setText("Hnnnnnnnn!");
            et3.setText("Ihr opfer!");
            et4.setText("Du hast kein Recht dazu");
            et5.setText("Kranke sounds V.1");
            et6.setText("Lächerlich!");
        }
        if(page == 4){
            Button et1 = (Button) findViewById(R.id.elotrix_b1);
            Button et2 = (Button) findViewById(R.id.elotrix_b2);
            Button et3 = (Button) findViewById(R.id.elotrix_b3);
            Button et4 = (Button) findViewById(R.id.elotrix_b4);
            Button et5 = (Button) findViewById(R.id.elotrix_b5);
            Button et6 = (Button) findViewById(R.id.elotrix_b6);

            et1.setText("Meine Mama hat gesagt!");
            et2.setText("Mongo Name!");
            et3.setText("Oh Gott!");
            et4.setText("Oh Maaaan!");
            et5.setText("Oh Nein!");
            et6.setText("Du siehst den Pfeil in deinem Arsch stecken");
        }
        if(page == 5){
            Button et1 = (Button) findViewById(R.id.elotrix_b1);
            Button et2 = (Button) findViewById(R.id.elotrix_b2);
            Button et3 = (Button) findViewById(R.id.elotrix_b3);
            Button et4 = (Button) findViewById(R.id.elotrix_b4);
            Button et5 = (Button) findViewById(R.id.elotrix_b5);
            Button et6 = (Button) findViewById(R.id.elotrix_b6);

            et1.setText("Scheiß Sniper!");
            et2.setText("Warum schluckst du so viel");
            et3.setText("Ich spring gleich aus dem Fenster");
            et4.setText("Immer von Hinten");
            et5.setText("Was hat der für ein Aim");
            et6.setText("Was hast du getan?");
        }
        if(page == 6){
            Button et1 = (Button) findViewById(R.id.elotrix_b1);
            Button et2 = (Button) findViewById(R.id.elotrix_b2);
            Button et3 = (Button) findViewById(R.id.elotrix_b3);
            Button et4 = (Button) findViewById(R.id.elotrix_b4);
            Button et5 = (Button) findViewById(R.id.elotrix_b5);
            Button et6 = (Button) findViewById(R.id.elotrix_b6);

            et1.setText("Was machst du da");
            et2.setText("Wie die geiern");
            et3.setText("Worauf es ankommt im Leben");
            et4.setText("Abgehoben");
            et5.setText("Begrüßung");
            et6.setText("Haracash");
        }
        if(page == 7){
            Button et1 = (Button) findViewById(R.id.elotrix_b1);
            Button et2 = (Button) findViewById(R.id.elotrix_b2);
            Button et3 = (Button) findViewById(R.id.elotrix_b3);
            Button et4 = (Button) findViewById(R.id.elotrix_b4);
            Button et5 = (Button) findViewById(R.id.elotrix_b5);
            Button et6 = (Button) findViewById(R.id.elotrix_b6);

            et1.setText("Abnormal");
            et2.setText("Ausraster V.1");
            et3.setText("Eins zu Fünf!");
            et4.setText("Habt ihr gesehen?");
            et5.setText("Hardscope nich so rum!");
            et6.setText("Inzucht Kind!");
        }
        if(page == 8){
            Button et1 = (Button) findViewById(R.id.elotrix_b1);
            Button et2 = (Button) findViewById(R.id.elotrix_b2);
            Button et3 = (Button) findViewById(R.id.elotrix_b3);
            Button et4 = (Button) findViewById(R.id.elotrix_b4);
            Button et5 = (Button) findViewById(R.id.elotrix_b5);
            Button et6 = (Button) findViewById(R.id.elotrix_b6);

            et1.setText("Kein Aim");
            et2.setText("Kein Bock mehr");
            et3.setText("Lächerlich V.2");
            et4.setText("Immer die Nachjoiner");
            et5.setText("Nein");
            et6.setText("Scheiß Lobby!");
        }
        if(page == 9){
            Button et1 = (Button) findViewById(R.id.elotrix_b1);
            Button et2 = (Button) findViewById(R.id.elotrix_b2);
            Button et3 = (Button) findViewById(R.id.elotrix_b3);
            Button et4 = (Button) findViewById(R.id.elotrix_b4);
            Button et5 = (Button) findViewById(R.id.elotrix_b5);
            Button et6 = (Button) findViewById(R.id.elotrix_b6);

            et1.setText("Seine fette Mom");
            et2.setText("Du Untermensch");
            et3.setText("Willst du mich verarschen?");
            et4.setText("Was willst du dagegen machen");
            et5.setText("Du Hurensohn V.5");
            et6.setText("Wieder von Hinten");
        }
    }

    public void elotrix_share(){
        Button et1 = (Button) findViewById(R.id.elotrix_b1);
        Button et2 = (Button) findViewById(R.id.elotrix_b2);
        Button et3 = (Button) findViewById(R.id.elotrix_b3);
        Button et4 = (Button) findViewById(R.id.elotrix_b4);
        Button et5 = (Button) findViewById(R.id.elotrix_b5);
        Button et6 = (Button) findViewById(R.id.elotrix_b6);


        et1.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                if(! ordnerfile.exists()){

                    try{
                        ordnerfile.mkdir();
                    } catch (Exception e) {
                        e.printStackTrace();
                        Toast.makeText(getApplicationContext(), "Error, please try again", Toast.LENGTH_SHORT).show();
                    }
                }

                try {

                    if(page ==1) {
                        is1 = getResources().openRawResource(R.raw.et_aufdemauto);
                    }
                    if(page ==2) {
                        is1 = getResources().openRawResource(R.raw.et_dudreckigerhuansohn);
                    }
                    if(page ==3) {
                        is1 = getResources().openRawResource(R.raw.et_esreicht);
                    }
                    if(page ==4) {
                        is1 = getResources().openRawResource(R.raw.et_meinemamahatgesagt);
                    }
                    if(page ==5) {
                        is1 = getResources().openRawResource(R.raw.et_scheisssniper);
                    }
                    if(page ==6) {
                        is1 = getResources().openRawResource(R.raw.et_wasmachstduda);
                    }
                    if(page ==7) {
                        is1 = getResources().openRawResource(R.raw.et_abnormal);
                    }
                    if(page ==8) {
                        is1 = getResources().openRawResource(R.raw.et_keinaim);
                    }
                    if(page ==9) {
                        is1 = getResources().openRawResource(R.raw.et_seinemom);
                    }
                    fos = new FileOutputStream(soundfile);

                    while((zwischenspeicher = is1.read(byte1)) > 0){

                        fos.write(byte1, 0, zwischenspeicher);

                    }
                    is1.close();
                    fos.close();

                }catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(), "Error, please try again", Toast.LENGTH_SHORT).show();
                }

                shareintent = new Intent(Intent.ACTION_SEND);
                shareintent.setType("audio/*");
                shareintent.putExtra(Intent.EXTRA_STREAM, urisound);
                startActivity(Intent.createChooser(shareintent, "Sound teilen..."));

                return true;

            }
        });

        et2.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {

                if(! ordnerfile.exists()){

                    try{
                        ordnerfile.mkdir();
                    } catch (Exception e) {
                        e.printStackTrace();
                        Toast.makeText(getApplicationContext(), "Error, please try again", Toast.LENGTH_SHORT).show();
                    }
                }

                try {

                    if(page ==1) {
                        is1 = getResources().openRawResource(R.raw.et_aufklaerungsdrohne);
                    }
                    if(page ==2) {
                        is1 = getResources().openRawResource(R.raw.et_duhuansohn);
                    }
                    if(page ==3) {
                        is1 = getResources().openRawResource(R.raw.et_hnnnn);
                    }
                    if(page ==4) {
                        is1 = getResources().openRawResource(R.raw.et_mongoname);
                    }
                    if(page ==5) {
                        is1 = getResources().openRawResource(R.raw.et_schluck);
                    }
                    if(page ==6) {
                        is1 = getResources().openRawResource(R.raw.et_wiediegeiern);
                    }
                    if(page ==7) {
                        is1 = getResources().openRawResource(R.raw.et_ausraster);
                    }
                    if(page ==8) {
                        is1 = getResources().openRawResource(R.raw.et_keinbock);
                    }
                    if(page ==9) {
                        is1 = getResources().openRawResource(R.raw.et_untermensch);
                    }
                    fos = new FileOutputStream(soundfile);

                    while((zwischenspeicher = is1.read(byte1)) > 0){

                        fos.write(byte1, 0, zwischenspeicher);

                    }
                    is1.close();
                    fos.close();

                }catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(), "Error, please try again", Toast.LENGTH_SHORT).show();
                }

                shareintent = new Intent(Intent.ACTION_SEND);
                shareintent.setType("audio/*");
                shareintent.putExtra(Intent.EXTRA_STREAM, urisound);
                startActivity(Intent.createChooser(shareintent, "Sound teilen..."));

                return true;

            }
        });

        et3.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                if(! ordnerfile.exists()){

                    try{
                        ordnerfile.mkdir();
                    } catch (Exception e) {
                        e.printStackTrace();
                        Toast.makeText(getApplicationContext(), "Error, please try again", Toast.LENGTH_SHORT).show();
                    }
                }

                try {

                    if(page ==1) {
                        is1 = getResources().openRawResource(R.raw.et_aufklaerungsdrohne2);
                    }
                    if(page ==2) {
                        is1 = getResources().openRawResource(R.raw.et_duhuansohn2);
                    }
                    if(page ==3) {
                        is1 = getResources().openRawResource(R.raw.et_ihropfer);
                    }
                    if(page ==4) {
                        is1 = getResources().openRawResource(R.raw.et_ohgott);
                    }
                    if(page ==5) {
                        is1 = getResources().openRawResource(R.raw.et_springausdemfenster);
                    }
                    if(page ==6) {
                        is1 = getResources().openRawResource(R.raw.et_woraufsankommt);
                    }
                    if(page ==7) {
                        is1 = getResources().openRawResource(R.raw.et_einszufuenf);
                    }
                    if(page ==8) {
                        is1 = getResources().openRawResource(R.raw.et_laecherlich2);
                    }
                    if(page ==9) {
                        is1 = getResources().openRawResource(R.raw.et_verarschen);
                    }
                    fos = new FileOutputStream(soundfile);

                    while((zwischenspeicher = is1.read(byte1)) > 0){

                        fos.write(byte1, 0, zwischenspeicher);

                    }
                    is1.close();
                    fos.close();

                }catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(), "Error, please try again", Toast.LENGTH_SHORT).show();
                }

                shareintent = new Intent(Intent.ACTION_SEND);
                shareintent.setType("audio/*");
                shareintent.putExtra(Intent.EXTRA_STREAM, urisound);
                startActivity(Intent.createChooser(shareintent, "Sound teilen..."));

                return true;

            }
        });

        et4.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                if(! ordnerfile.exists()){

                    try{
                        ordnerfile.mkdir();
                    } catch (Exception e) {
                        e.printStackTrace();
                        Toast.makeText(getApplicationContext(), "Error, please try again", Toast.LENGTH_SHORT).show();
                    }
                }

                try {

                    if(page ==1) {
                        is1 = getResources().openRawResource(R.raw.et_daskanndochnichtsein);
                    }
                    if(page ==2) {
                        is1 = getResources().openRawResource(R.raw.et_duhuansohn3);
                    }
                    if(page ==3) {
                        is1 = getResources().openRawResource(R.raw.et_keinrecht);
                    }
                    if(page ==4) {
                        is1 = getResources().openRawResource(R.raw.et_ohman);
                    }
                    if(page ==5) {
                        is1 = getResources().openRawResource(R.raw.et_vonhinten);
                    }
                    if(page ==6) {
                        is1 = getResources().openRawResource(R.raw.et_abgehoben);
                    }
                    if(page ==7) {
                        is1 = getResources().openRawResource(R.raw.et_habtihrgesehn);
                    }
                    if(page ==8) {
                        is1 = getResources().openRawResource(R.raw.et_nachjoiner);
                    }
                    if(page ==9) {
                        is1 = getResources().openRawResource(R.raw.et_waswillstdu);
                    }
                    fos = new FileOutputStream(soundfile);

                    while((zwischenspeicher = is1.read(byte1)) > 0){

                        fos.write(byte1, 0, zwischenspeicher);

                    }
                    is1.close();
                    fos.close();

                }catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(), "Error, please try again", Toast.LENGTH_SHORT).show();
                }

                shareintent = new Intent(Intent.ACTION_SEND);
                shareintent.setType("audio/*");
                shareintent.putExtra(Intent.EXTRA_STREAM, urisound);
                startActivity(Intent.createChooser(shareintent, "Sound teilen..."));

                return true;

            }
        });

        et5.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {

                if(! ordnerfile.exists()){

                    try{
                        ordnerfile.mkdir();
                    } catch (Exception e) {
                        e.printStackTrace();
                        Toast.makeText(getApplicationContext(), "Error, please try again", Toast.LENGTH_SHORT).show();
                    }
                }

                try {

                    if(page ==1) {
                        is1 = getResources().openRawResource(R.raw.et_deineelternsindgeschwister);
                    }
                    if(page ==2) {
                        is1 = getResources().openRawResource(R.raw.et_ehnur);
                    }
                    if(page ==3) {
                        is1 = getResources().openRawResource(R.raw.et_krankesouns);
                    }
                    if(page ==4) {
                        is1 = getResources().openRawResource(R.raw.et_ohnein);
                    }
                    if(page ==5) {
                        is1 = getResources().openRawResource(R.raw.et_wasfuereinaim);
                    }
                    if(page ==6) {
                        is1 = getResources().openRawResource(R.raw.et_begruessung);
                    }
                    if(page ==7) {
                        is1 = getResources().openRawResource(R.raw.et_hardscope);
                    }
                    if(page ==8) {
                        is1 = getResources().openRawResource(R.raw.et_nein);
                    }
                    if(page ==9) {
                        is1 = getResources().openRawResource(R.raw.et_weizen);
                    }
                    fos = new FileOutputStream(soundfile);

                    while((zwischenspeicher = is1.read(byte1)) > 0){

                        fos.write(byte1, 0, zwischenspeicher);

                    }
                    is1.close();
                    fos.close();

                }catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(), "Error, please try again", Toast.LENGTH_SHORT).show();
                }

                shareintent = new Intent(Intent.ACTION_SEND);
                shareintent.setType("audio/*");
                shareintent.putExtra(Intent.EXTRA_STREAM, urisound);
                startActivity(Intent.createChooser(shareintent, "Sound teilen..."));


                return true;

            }
        });

        et6.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                if(! ordnerfile.exists()){

                    try{
                        ordnerfile.mkdir();
                    } catch (Exception e) {
                        e.printStackTrace();
                        Toast.makeText(getApplicationContext(), "Error, please try again", Toast.LENGTH_SHORT).show();
                    }
                }

                try {

                    if(page ==1) {
                        is1 = getResources().openRawResource(R.raw.et_diekoennennix);
                    }
                    if(page ==2) {
                        is1 = getResources().openRawResource(R.raw.et_eristwiederda);
                    }
                    if(page ==3) {
                        is1 = getResources().openRawResource(R.raw.et_laecherlich);
                    }
                    if(page ==4) {
                        is1 = getResources().openRawResource(R.raw.et_roterpfeil);
                    }
                    if(page ==5) {
                        is1 = getResources().openRawResource(R.raw.et_washastdugetan);
                    }
                    if(page ==6) {
                        is1 = getResources().openRawResource(R.raw.et_harakesh);
                    }
                    if(page ==7) {
                        is1 = getResources().openRawResource(R.raw.et_inzucht);
                    }
                    if(page ==8) {
                        is1 = getResources().openRawResource(R.raw.et_scheisslobby);
                    }
                    if(page ==9) {
                        is1 = getResources().openRawResource(R.raw.et_wiedervonhinten);
                    }
                    fos = new FileOutputStream(soundfile);

                    while((zwischenspeicher = is1.read(byte1)) > 0){

                        fos.write(byte1, 0, zwischenspeicher);

                    }
                    is1.close();
                    fos.close();

                }catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(), "Error, please try again", Toast.LENGTH_SHORT).show();
                }

                shareintent = new Intent(Intent.ACTION_SEND);
                shareintent.setType("audio/*");
                shareintent.putExtra(Intent.EXTRA_STREAM, urisound);
                startActivity(Intent.createChooser(shareintent, "Sound teilen..."));


                return true;

            }
        });

    }

    public void et_b1(View view){
        if(page == 1)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_aufdemauto); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 2)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_dudreckigerhuansohn); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 3)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_esreicht); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 4)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_meinemamahatgesagt); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 5)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_scheisssniper); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 6)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_wasmachstduda); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 7)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_abnormal); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 8)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_keinaim); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 9)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_seinemom); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }


    }

    public void et_b2(View view){
        if(page == 1)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_aufklaerungsdrohne); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 2)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_duhuansohn); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 3)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_hnnnn); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 4)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_mongoname); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 5)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_schluck); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 6)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_wiediegeiern); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 7)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_ausraster); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 8)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_keinbock); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 9)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_untermensch); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }

    }

    public void et_b3(View view){
        if(page == 1)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_aufklaerungsdrohne2); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 2)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_duhuansohn2); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 3)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_ihropfer); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 4)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_ohgott); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 5)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_springausdemfenster); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 6)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_woraufsankommt); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 7)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_einszufuenf); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 8)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_laecherlich2); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 9)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_verarschen); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }

    }

    public void et_b4(View view){
        if(page == 1)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_daskanndochnichtsein); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 2)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_duhuansohn3); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 3)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_keinrecht); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 4)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_ohman); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 5)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_vonhinten); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 6)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_abgehoben); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 7)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_habtihrgesehn); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 8)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_nachjoiner); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 9)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_waswillstdu); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }

    }

    public void et_b5(View view){
        if(page == 1)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_deineelternsindgeschwister); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 2) {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_ehnur); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 3)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_krankesouns); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 4)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_ohnein); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 5)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_wasfuereinaim); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 6)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_begruessung); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 7)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_hardscope); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 8)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_nein); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 9)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_weizen); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }

    }

    public void et_b6(View view){
        if(page == 1)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_diekoennennix); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 2)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_eristwiederda); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 3)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_laecherlich); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 4)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_roterpfeil); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 5)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_washastdugetan); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 6)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_harakesh); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 7)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_inzucht); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 8)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_scheisslobby); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 9)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_wiedervonhinten); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }

    }

    public void et_next(View view)
    {
        page++;
        if(page == 1){
            setContentView(R.layout.elotrix);
            setPage();
            setText();
            elotrix_share();
        }
        if(page == 2){
            setContentView(R.layout.elotrix);
            setPage();
            setText();
            elotrix_share();
        }
        if(page == 3){
            setContentView(R.layout.elotrix);
            setPage();
            setText();
            elotrix_share();
        }
        if(page == 4) {
            setContentView(R.layout.elotrix);
            setPage();
            setText();
            elotrix_share();
        }
        if(page == 5){
            setContentView(R.layout.elotrix);
            setPage();
            setText();
            elotrix_share();
        }
        if(page == 6){
            setContentView(R.layout.elotrix);
            setPage();
            setText();
            elotrix_share();
        }
        if(page == 7){
            setContentView(R.layout.elotrix);
            setPage();
            setText();
            elotrix_share();
        }
        if(page == 8){
            setContentView(R.layout.elotrix);
            setPage();
            setText();
            elotrix_share();
        }
        if(page == 9){
            setContentView(R.layout.elotrix);
            setPage();
            setText();
            elotrix_share();
        }
        if(page == 10){
            setContentView(R.layout.elotrix_info);
        }

    }

    public void et_back(View view)
    {
        page--;
        if(page == 1){
            setContentView(R.layout.elotrix);
            setPage();
            setText();
            elotrix_share();
        }
        if(page == 2){
            setContentView(R.layout.elotrix);
            setPage();
            setText();
            elotrix_share();
        }
        if(page == 3){
            setContentView(R.layout.elotrix);
            setPage();
            setText();
            elotrix_share();
        }
        if(page == 4){
            setContentView(R.layout.elotrix);
            setPage();
            setText();
            elotrix_share();
        }
        if(page == 5){
            setContentView(R.layout.elotrix);
            setPage();
            setText();
            elotrix_share();
        }
        if(page == 6){
            setContentView(R.layout.elotrix);
            setPage();
            setText();
            elotrix_share();
        }
        if(page == 7){
            setContentView(R.layout.elotrix);
            setPage();
            setText();
            elotrix_share();
        }
        if(page == 8){
            setContentView(R.layout.elotrix);
            setPage();
            setText();
            elotrix_share();
        }
        if(page == 9){
            setContentView(R.layout.elotrix);
            setPage();
            setText();
            elotrix_share();
        }
        if(page == 0){
            setContentView(R.layout.elotrix_info);
        }

    }

    public void etinfo_next(View view){
        setContentView(R.layout.elotrix);
        page = 1;
        setPage();
        setText();
    }

    public void etinfo_back(View view){
        setContentView(R.layout.elotrix);
        page = 9;
        setPage();
        setText();
    }

    public void setPage()
    {
        TextView Page = (TextView) findViewById(R.id.elotrix_Page1);
        if(page == 1){
            Page.setText("1");
        }
        if(page == 2){
            Page.setText("2");
        }
        if(page == 3){
            Page.setText("3");
        }
        if(page == 4){
            Page.setText("4");
        }
        if(page == 5){
            Page.setText("5");
        }
        if(page == 6){
            Page.setText("6");
        }
        if(page == 7){
            Page.setText("7");
        }
        if(page == 8){
            Page.setText("8");
        }
        if(page == 9){
            Page.setText("9");
        }
    }


    public void et_kanal(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/user/ELoTRiXHDx"));
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
