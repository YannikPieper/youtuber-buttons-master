package com.eastereggdev.jonathan.TubeButtons;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jonathan.TubeButtons.R;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;


public class Marcelscorpion extends ActionBarActivity {
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
        setContentView(R.layout.marcelscorpion); //Set the layout file
        setTitle("Marcelscorpion"); //Rename the ActionBar Title

        marcelscorpion_share();
    }

    public void setText(){
        if(page == 1){
            Button mb1 = (Button) findViewById(R.id.marcelscorpion_b1);
            Button mb2 = (Button) findViewById(R.id.marcelscorpion_b2);
            Button mb3 = (Button) findViewById(R.id.marcelscorpion_b3);
            Button mb4 = (Button) findViewById(R.id.marcelscorpion_b4);
            Button mb5 = (Button) findViewById(R.id.marcelscorpion_b5);
            Button mb6 = (Button) findViewById(R.id.marcelscorpion_b6);

            mb1.setText("Es connected kein Schuss");
            mb2.setText("Wer ist der Beste");
            mb3.setText("Eins Vor!");
            mb4.setText("Der Frechdachs");
            mb5.setText("Marcel ist verrückt V.1");
            mb6.setText("Marcel ist verrückt V.2");
        }
        if(page == 2){
            Button mb1 = (Button) findViewById(R.id.marcelscorpion_b1);
            Button mb2 = (Button) findViewById(R.id.marcelscorpion_b2);
            Button mb3 = (Button) findViewById(R.id.marcelscorpion_b3);
            Button mb4 = (Button) findViewById(R.id.marcelscorpion_b4);
            Button mb5 = (Button) findViewById(R.id.marcelscorpion_b5);
            Button mb6 = (Button) findViewById(R.id.marcelscorpion_b6);

            mb1.setText("Marcel ist Verrückt V.3");
            mb2.setText("Marcel ist verrückt V.4");
            mb3.setText("Marcel ist verrückt V.5");
            mb4.setText("Lena kanns nicht");
            mb5.setText("Lenas Lache (leicht übertrieben)");
            mb6.setText("Marcel singt V.1");
        }
        if(page == 3){
            Button mb1 = (Button) findViewById(R.id.marcelscorpion_b1);
            Button mb2 = (Button) findViewById(R.id.marcelscorpion_b2);
            Button mb3 = (Button) findViewById(R.id.marcelscorpion_b3);
            Button mb4 = (Button) findViewById(R.id.marcelscorpion_b4);
            Button mb5 = (Button) findViewById(R.id.marcelscorpion_b5);
            Button mb6 = (Button) findViewById(R.id.marcelscorpion_b6);

            mb1.setText("Marcel singt V.2");
            mb2.setText("Marcels ganzer stolz");
            mb3.setText("no Hands!");
            mb4.setText("Ich habe sowas noch nie gesehen!");
            mb5.setText("Noobs Schwitzen!");
            mb6.setText("only Flinke Hände!");
        }
        if(page == 4){
            Button mb1 = (Button) findViewById(R.id.marcelscorpion_b1);
            Button mb2 = (Button) findViewById(R.id.marcelscorpion_b2);
            Button mb3 = (Button) findViewById(R.id.marcelscorpion_b3);
            Button mb4 = (Button) findViewById(R.id.marcelscorpion_b4);
            Button mb5 = (Button) findViewById(R.id.marcelscorpion_b5);
            Button mb6 = (Button) findViewById(R.id.marcelscorpion_b6);

            mb1.setText("Nuketown Ragemoment!");
            mb2.setText("Rechts vor links beachten");
            mb3.setText("Baller rein");
            mb4.setText("Sweeeeeep!");
            mb5.setText("Tarnheli!");
            mb6.setText("Was ist denn mit den Leuten los");
        }
        if(page == 5){
            Button mb1 = (Button) findViewById(R.id.marcelscorpion_b1);
            Button mb2 = (Button) findViewById(R.id.marcelscorpion_b2);
            Button mb3 = (Button) findViewById(R.id.marcelscorpion_b3);
            Button mb4 = (Button) findViewById(R.id.marcelscorpion_b4);
            Button mb5 = (Button) findViewById(R.id.marcelscorpion_b5);
            Button mb6 = (Button) findViewById(R.id.marcelscorpion_b6);

            mb1.setText("Wer macht denn sowas?");
            mb2.setText("Who Is the Best?");
            mb3.setText("Turn on! Monte!");
            mb4.setText("Red! Red! Red!");
            mb5.setText("Sauber man!");
            mb6.setText("Tot 1 vor Triple!");
        }
        if(page == 6){
            Button mb1 = (Button) findViewById(R.id.marcelscorpion_b1);
            Button mb2 = (Button) findViewById(R.id.marcelscorpion_b2);
            Button mb3 = (Button) findViewById(R.id.marcelscorpion_b3);
            Button mb4 = (Button) findViewById(R.id.marcelscorpion_b4);
            Button mb5 = (Button) findViewById(R.id.marcelscorpion_b5);
            Button mb6 = (Button) findViewById(R.id.marcelscorpion_b6);

            mb1.setText("Sagutzahäda");
            mb2.setText("Bambi");
            mb3.setText("Ey Man!");
            mb4.setText("Stellung bei Marcels Geburt");
            mb5.setText("Ausraster!");
            mb6.setText("Ohoh!");
        }
        if(page == 7){
            Button mb1 = (Button) findViewById(R.id.marcelscorpion_b1);
            Button mb2 = (Button) findViewById(R.id.marcelscorpion_b2);
            Button mb3 = (Button) findViewById(R.id.marcelscorpion_b3);
            Button mb4 = (Button) findViewById(R.id.marcelscorpion_b4);
            Button mb5 = (Button) findViewById(R.id.marcelscorpion_b5);
            Button mb6 = (Button) findViewById(R.id.marcelscorpion_b6);

            mb1.setText("Baller Rein V.2");
            mb2.setText("Begrüssung");
            mb3.setText("Alter Lachs");
            mb4.setText("Oh Gott!");
            mb5.setText("Verabschiedung");
            mb6.setText("Wuuuup");
        }
    }

    public void marcelscorpion_share(){
        Button ms1 = (Button) findViewById(R.id.marcelscorpion_b1);
        Button ms2 = (Button) findViewById(R.id.marcelscorpion_b2);
        Button ms3 = (Button) findViewById(R.id.marcelscorpion_b3);
        Button ms4 = (Button) findViewById(R.id.marcelscorpion_b4);
        Button ms5 = (Button) findViewById(R.id.marcelscorpion_b5);
        Button ms6 = (Button) findViewById(R.id.marcelscorpion_b6);


        ms1.setOnLongClickListener(new View.OnLongClickListener() {
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
                        is1 = getResources().openRawResource(R.raw.ms_noconnection);
                    }
                    if(page ==2) {
                        is1 = getResources().openRawResource(R.raw.ms_krank3);
                    }
                    if(page ==3) {
                        is1 = getResources().openRawResource(R.raw.ms_marcelsingt2);
                    }
                    if(page ==4) {
                        is1 = getResources().openRawResource(R.raw.ms_ragemoment);
                    }
                    if(page ==5) {
                        is1 = getResources().openRawResource(R.raw.ms_wermchtdennsowas);
                    }
                    if(page ==6) {
                        is1 = getResources().openRawResource(R.raw.ms_sagudaheda);
                    }
                    if(page ==7) {
                        is1 = getResources().openRawResource(R.raw.ms_ballerrein2);
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

        ms2.setOnLongClickListener(new View.OnLongClickListener() {
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
                        is1 = getResources().openRawResource(R.raw.ms_weristderbeste);
                    }
                    if(page ==2) {
                        is1 = getResources().openRawResource(R.raw.ms_krankfinale);
                    }
                    if(page ==3) {
                        is1 = getResources().openRawResource(R.raw.ms_meinpissoir);
                    }
                    if(page ==4) {
                        is1 = getResources().openRawResource(R.raw.ms_rechtsvorlinks);
                    }
                    if(page ==5) {
                        is1 = getResources().openRawResource(R.raw.ms_whoisthebest);
                    }
                    if(page ==6) {
                        is1 = getResources().openRawResource(R.raw.ms_bombi);
                    }
                    if(page ==7) {
                        is1 = getResources().openRawResource(R.raw.ms_begruessung);
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

        ms3.setOnLongClickListener(new View.OnLongClickListener() {
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
                        is1 = getResources().openRawResource(R.raw.ms_einsvor);
                    }
                    if(page ==2) {
                        is1 = getResources().openRawResource(R.raw.ms_krankesounds);
                    }
                    if(page ==3) {
                        is1 = getResources().openRawResource(R.raw.ms_nohands);
                    }
                    if(page ==4) {
                        is1 = getResources().openRawResource(R.raw.ms_schwarm);
                    }
                    if(page ==5) {
                        is1 = getResources().openRawResource(R.raw.ms_zelosmonteturnon);
                    }
                    if(page ==6) {
                        is1 = getResources().openRawResource(R.raw.ms_eyman);
                    }
                    if(page ==7) {
                        is1 = getResources().openRawResource(R.raw.ms_lachs);
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

        ms4.setOnLongClickListener(new View.OnLongClickListener() {
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
                        is1 = getResources().openRawResource(R.raw.ms_frechdachs);
                    }
                    if(page ==2) {
                        is1 = getResources().openRawResource(R.raw.ms_lenakannsnicht);
                    }
                    if(page ==3) {
                        is1 = getResources().openRawResource(R.raw.ms_nochniegesehen);
                    }
                    if(page ==4) {
                        is1 = getResources().openRawResource(R.raw.ms_sweep);
                    }
                    if(page ==5) {
                        is1 = getResources().openRawResource(R.raw.ms_zelosred);
                    }
                    if(page ==6) {
                        is1 = getResources().openRawResource(R.raw.ms_stellung);
                    }
                    if(page ==7) {
                        is1 = getResources().openRawResource(R.raw.ms_ohgott);
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

        ms5.setOnLongClickListener(new View.OnLongClickListener() {
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
                        is1 = getResources().openRawResource(R.raw.ms_krank1);
                    }
                    if(page ==2) {
                        is1 = getResources().openRawResource(R.raw.ms_lenalachen);
                    }
                    if(page ==3) {
                        is1 = getResources().openRawResource(R.raw.ms_noobsschwitzen);
                    }
                    if(page ==4) {
                        is1 = getResources().openRawResource(R.raw.ms_tarnheli);
                    }
                    if(page ==5) {
                        is1 = getResources().openRawResource(R.raw.ms_zelossauberman);
                    }
                    if(page ==6) {
                        is1 = getResources().openRawResource(R.raw.ms_ausraster1);
                    }
                    if(page ==7) {
                        is1 = getResources().openRawResource(R.raw.ms_verabschiedung);
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

        ms6.setOnLongClickListener(new View.OnLongClickListener() {
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
                        is1 = getResources().openRawResource(R.raw.ms_krank2);
                    }
                    if(page ==2) {
                        is1 = getResources().openRawResource(R.raw.ms_marcelsingt1);
                    }
                    if(page ==3) {
                        is1 = getResources().openRawResource(R.raw.ms_onlyflinkehaende);
                    }
                    if(page ==4) {
                        is1 = getResources().openRawResource(R.raw.ms_wasistmitdenleutenlos);
                    }
                    if(page ==5) {
                        is1 = getResources().openRawResource(R.raw.ms_tot1vor);
                    }
                    if(page ==6) {
                        is1 = getResources().openRawResource(R.raw.ms_ohoh);
                    }
                    if(page ==7) {
                        is1 = getResources().openRawResource(R.raw.ms_wuup);
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


    public void ms_b1(View view){
        if(page == 1)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_noconnection); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 2)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_krank3); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 3)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_marcelsingt2); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 4)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_ragemoment); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 5)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_wermchtdennsowas); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 6)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_sagudaheda); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 7)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_ballerrein2); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }

    }

    public void ms_b2(View view){
        if(page == 1)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_weristderbeste); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 2)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_krankfinale); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 3)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_meinpissoir); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 4)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_rechtsvorlinks); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 5)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_whoisthebest); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 6)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_bombi); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 7)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_begruessung); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }

    }

    public void ms_b3(View view){
        if(page == 1)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_einsvor); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 2)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_krankesounds); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 3)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_nohands); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 4)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_schwarm); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 5)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_zelosmonteturnon); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 6)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_eyman); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 7)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_lachs); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }

    }

    public void ms_b4(View view){
        if(page == 1)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_frechdachs); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 2)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_lenakannsnicht); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 3)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_nochniegesehen); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 4)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_sweep); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 5)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_zelosred); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 6)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_stellung); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 7)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_ohgott); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }

    }

    public void ms_b5(View view){
        if(page == 1)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_krank1); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 2) {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_lenalachen); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 3)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_noobsschwitzen); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 4)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_tarnheli); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 5)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_zelossauberman); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 6)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_ausraster1); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 7)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_verabschiedung); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }

    }

    public void ms_b6(View view){
        if(page == 1)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_krank2); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 2)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_marcelsingt1); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 3)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_onlyflinkehaende); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 4)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_wasistmitdenleutenlos); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 5)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_tot1vor); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 6)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_ohoh); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 7)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Marcelscorpion.this, R.raw.ms_wuup); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }

    }

    public void ms_next(View view)
    {
        page++;
        if(page == 1){
            setContentView(R.layout.marcelscorpion);
            setPage();
            setText();
            marcelscorpion_share();
        }
        if(page == 2){
            setContentView(R.layout.marcelscorpion);
            setPage();
            setText();
            marcelscorpion_share();
        }
        if(page == 3){
            setContentView(R.layout.marcelscorpion);
            setPage();
            setText();
            marcelscorpion_share();
        }
        if(page == 4){
            setContentView(R.layout.marcelscorpion);
            setPage();
            setText();
            marcelscorpion_share();
        }
        if(page == 5){
            setContentView(R.layout.marcelscorpion);
            setPage();
            setText();
            marcelscorpion_share();
        }
        if(page == 6){
            setContentView(R.layout.marcelscorpion);
            setPage();
            setText();
            marcelscorpion_share();
        }
        if(page == 7){
            setContentView(R.layout.marcelscorpion);
            setPage();
            setText();
            marcelscorpion_share();
        }
        if(page == 8){
            setContentView(R.layout.marcelscorpion_info);
        }

    }

    public void ms_back(View view)
    {
        page--;
        if(page == 1){
            setContentView(R.layout.marcelscorpion);
            setPage();
            setText();
            marcelscorpion_share();
        }
        if(page == 2) {
            setContentView(R.layout.marcelscorpion);
            setPage();
            setText();
            marcelscorpion_share();
        }
        if(page == 3){
            setContentView(R.layout.marcelscorpion);
            setPage();
            setText();
            marcelscorpion_share();
        }
        if(page == 4){
            setContentView(R.layout.marcelscorpion);
            setPage();
            setText();
            marcelscorpion_share();
        }
        if(page == 5){
            setContentView(R.layout.marcelscorpion);
            setPage();
            setText();
            marcelscorpion_share();
        }
        if(page == 6){
            setContentView(R.layout.marcelscorpion);
            setPage();
            setText();
            marcelscorpion_share();
        }
        if(page == 7){
            setContentView(R.layout.marcelscorpion);
            setPage();
            setText();
            marcelscorpion_share();
        }
        if(page == 0){
            setContentView(R.layout.marcelscorpion_info);
        }

    }

    public void msinfo_next(View view){
        setContentView(R.layout.marcelscorpion);
        page = 1;
        setPage();
        setText();

    }

    public void msinfo_back(View view){
        setContentView(R.layout.marcelscorpion);
        page = 7;
        setPage();
        setText();

    }

    public void setPage()
    {
        TextView Page = (TextView) findViewById(R.id.marcelscorpion_Page1);
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

    }

    public void ms_kanal(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/user/marcelscorpionhttps://www.youtube.com/user/marcelscorpion"));
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
