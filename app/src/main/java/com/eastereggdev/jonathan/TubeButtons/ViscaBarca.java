package com.eastereggdev.jonathan.TubeButtons;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jonathan.TubeButtons.R;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;


public class ViscaBarca extends ActionBarActivity {
    private int page = 1;
    private MediaPlayer mp = new MediaPlayer();

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
        setContentView(R.layout.viscabarca);
        setTitle("ViscaBarca");

        viscabarca_share();
    }

    public void setText(){
        if(page == 1){
            Button vb1 = (Button) findViewById(R.id.viscabarca_b1);
            Button vb2 = (Button) findViewById(R.id.viscabarca_b2);
            Button vb3 = (Button) findViewById(R.id.viscabarca_b3);
            Button vb4 = (Button) findViewById(R.id.viscabarca_b4);
            Button vb5 = (Button) findViewById(R.id.viscabarca_b5);
            Button vb6 = (Button) findViewById(R.id.viscabarca_b6);

            vb1.setText("100000 Likes!");
            vb2.setText("100er Präzi!");
            vb3.setText("elf Schüsse");
            vb4.setText("12er Präzi!");
            vb5.setText("Eins Vor!");
            vb6.setText("Noch 4 Minuten...");
        }
        if(page == 2){
            Button vb1 = (Button) findViewById(R.id.viscabarca_b1);
            Button vb2 = (Button) findViewById(R.id.viscabarca_b2);
            Button vb3 = (Button) findViewById(R.id.viscabarca_b3);
            Button vb4 = (Button) findViewById(R.id.viscabarca_b4);
            Button vb5 = (Button) findViewById(R.id.viscabarca_b5);
            Button vb6 = (Button) findViewById(R.id.viscabarca_b6);

            vb1.setText("AFK");
            vb2.setText("Aimbot");
            vb3.setText("AMK");
            vb4.setText("Begrüßung");
            vb5.setText("ChickenxHunter!");
            vb6.setText("Doublenuklear live!");
        }
        if(page == 3){
            Button vb1 = (Button) findViewById(R.id.viscabarca_b1);
            Button vb2 = (Button) findViewById(R.id.viscabarca_b2);
            Button vb3 = (Button) findViewById(R.id.viscabarca_b3);
            Button vb4 = (Button) findViewById(R.id.viscabarca_b4);
            Button vb5 = (Button) findViewById(R.id.viscabarca_b5);
            Button vb6 = (Button) findViewById(R.id.viscabarca_b6);

            vb1.setText("flanken (no homo)");
            vb2.setText("Für euch alle!");
            vb3.setText("Gamergrip");
            vb4.setText("Vom Hähnchen überfahren");
            vb5.setText("Ich hab sie geschafft!");
            vb6.setText("Ich kanns nicht glauben!");
        }
        if(page == 4){
            Button vb1 = (Button) findViewById(R.id.viscabarca_b1);
            Button vb2 = (Button) findViewById(R.id.viscabarca_b2);
            Button vb3 = (Button) findViewById(R.id.viscabarca_b3);
            Button vb4 = (Button) findViewById(R.id.viscabarca_b4);
            Button vb5 = (Button) findViewById(R.id.viscabarca_b5);
            Button vb6 = (Button) findViewById(R.id.viscabarca_b6);

            vb1.setText("Ich wein gleich...");
            vb2.setText("Ein letztes Mal");
            vb3.setText("M8");
            vb4.setText("Missgebirten!");
            vb5.setText("Ich bin Mutter von Anton");
            vb6.setText("Seltsame Geräusche");
        }
        if(page == 5){
            Button vb1 = (Button) findViewById(R.id.viscabarca_b1);
            Button vb2 = (Button) findViewById(R.id.viscabarca_b2);
            Button vb3 = (Button) findViewById(R.id.viscabarca_b3);
            Button vb4 = (Button) findViewById(R.id.viscabarca_b4);
            Button vb5 = (Button) findViewById(R.id.viscabarca_b5);
            Button vb6 = (Button) findViewById(R.id.viscabarca_b6);

            vb1.setText("Ich glaub mein Schwein pfeift");
            vb2.setText("Triple Nuklear auf Hijacked");
            vb3.setText("Triplenuklear!");
            vb4.setText("Turn on");
            vb5.setText("Wichtig...");
            vb6.setText("WTF");
        }
    }

    public void viscabarca_share(){
        Button vb1 = (Button) findViewById(R.id.viscabarca_b1);
        Button vb2 = (Button) findViewById(R.id.viscabarca_b2);
        Button vb3 = (Button) findViewById(R.id.viscabarca_b3);
        Button vb4 = (Button) findViewById(R.id.viscabarca_b4);
        Button vb5 = (Button) findViewById(R.id.viscabarca_b5);
        Button vb6 = (Button) findViewById(R.id.viscabarca_b6);


        vb1.setOnLongClickListener(new View.OnLongClickListener() {
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
                        is1 = getResources().openRawResource(R.raw.vb_100000likes);
                    }
                    if(page ==2) {
                        is1 = getResources().openRawResource(R.raw.vb_afk);
                    }
                    if(page ==3) {
                        is1 = getResources().openRawResource(R.raw.vb_flanken);
                    }
                    if(page ==4) {
                        is1 = getResources().openRawResource(R.raw.vb_ichweingleich);
                    }
                    if(page ==5) {
                        is1 = getResources().openRawResource(R.raw.vb_schweinpfeift);
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

        vb2.setOnLongClickListener(new View.OnLongClickListener() {
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
                        is1 = getResources().openRawResource(R.raw.vb_100erprezi);
                    }
                    if(page ==2) {
                        is1 = getResources().openRawResource(R.raw.vb_aimbot);
                    }
                    if(page ==3) {
                        is1 = getResources().openRawResource(R.raw.vb_fuereuchalle);
                    }
                    if(page ==4) {
                        is1 = getResources().openRawResource(R.raw.vb_letstesmal);
                    }
                    if(page ==5) {
                        is1 = getResources().openRawResource(R.raw.vb_tripleaufschiff);
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

        vb3.setOnLongClickListener(new View.OnLongClickListener() {
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
                        is1 = getResources().openRawResource(R.raw.vb_11schuesse);
                    }
                    if(page ==2) {
                        is1 = getResources().openRawResource(R.raw.vb_amk);
                    }
                    if(page ==3) {
                        is1 = getResources().openRawResource(R.raw.vb_gamergrip);
                    }
                    if(page ==4) {
                        is1 = getResources().openRawResource(R.raw.vb_m8);
                    }
                    if(page ==5) {
                        is1 = getResources().openRawResource(R.raw.vb_triplenuklear);
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

        vb4.setOnLongClickListener(new View.OnLongClickListener() {
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
                        is1 = getResources().openRawResource(R.raw.vb_12erprezi);
                    }
                    if(page ==2) {
                        is1 = getResources().openRawResource(R.raw.vb_begruesung);
                    }
                    if(page ==3) {
                        is1 = getResources().openRawResource(R.raw.vb_haenchen);
                    }
                    if(page ==4) {
                        is1 = getResources().openRawResource(R.raw.vb_missgebirten);
                    }
                    if(page ==5) {
                        is1 = getResources().openRawResource(R.raw.vb_turnon);
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

        vb5.setOnLongClickListener(new View.OnLongClickListener() {
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
                        is1 = getResources().openRawResource(R.raw.vb_1vor);
                    }
                    if(page ==2) {
                        is1 = getResources().openRawResource(R.raw.vb_chickenxhunter);
                    }
                    if(page ==3) {
                        is1 = getResources().openRawResource(R.raw.vb_ichhabsiegeschafft);
                    }
                    if(page ==4) {
                        is1 = getResources().openRawResource(R.raw.vb_muttervonanton);
                    }
                    if(page ==5) {
                        is1 = getResources().openRawResource(R.raw.vb_wichtig);
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

        vb6.setOnLongClickListener(new View.OnLongClickListener() {
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
                        is1 = getResources().openRawResource(R.raw.vb_4minuten);
                    }
                    if(page ==2) {
                        is1 = getResources().openRawResource(R.raw.vb_doublenuklear);
                    }
                    if(page ==3) {
                        is1 = getResources().openRawResource(R.raw.vb_ichkannsnichtglauben);
                    }
                    if(page ==4) {
                        is1 = getResources().openRawResource(R.raw.vb_nisen);
                    }
                    if(page ==5) {
                        is1 = getResources().openRawResource(R.raw.vb_wtf);
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

    public void vb_b1(View view){
        if(page == 1)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.ViscaBarca.this, R.raw.vb_100000likes); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 2)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.ViscaBarca.this, R.raw.vb_afk);  //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 3)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.ViscaBarca.this, R.raw.vb_flanken);
            mp.start();
        }
        if(page == 4)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.ViscaBarca.this, R.raw.vb_ichweingleich);
            mp.start();
        }
        if(page == 5)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.ViscaBarca.this, R.raw.vb_schweinpfeift);
            mp.start();
        }

    }

    public void vb_b2(View view){
        if(page == 1)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.ViscaBarca.this, R.raw.vb_100erprezi);  //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 2)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.ViscaBarca.this, R.raw.vb_aimbot);
            mp.start();
        }
        if(page == 3)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.ViscaBarca.this, R.raw.vb_fuereuchalle);
            mp.start();
        }
        if(page == 4)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.ViscaBarca.this, R.raw.vb_letstesmal);
            mp.start();
        }
        if(page == 5)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.ViscaBarca.this, R.raw.vb_tripleaufschiff);
            mp.start();
        }


    }

    public void vb_b3(View view){
        if(page == 1)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.ViscaBarca.this, R.raw.vb_11schuesse);  //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 2)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.ViscaBarca.this, R.raw.vb_amk);
            mp.start();
        }
        if(page == 3)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.ViscaBarca.this, R.raw.vb_gamergrip);
            mp.start();
        }
        if(page == 4)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.ViscaBarca.this, R.raw.vb_m8);
            mp.start();
        }
        if(page == 5)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.ViscaBarca.this, R.raw.vb_triplenuklear);
            mp.start();
        }


    }

    public void vb_b4(View view){
        if(page == 1)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.ViscaBarca.this, R.raw.vb_12erprezi);  //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 2)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.ViscaBarca.this, R.raw.vb_begruesung);
            mp.start();
        }
        if(page == 3)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.ViscaBarca.this, R.raw.vb_haenchen);
            mp.start();
        }
        if(page == 4)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.ViscaBarca.this, R.raw.vb_missgebirten);
            mp.start();
        }
        if(page == 5)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.ViscaBarca.this, R.raw.vb_turnon);
            mp.start();
        }


    }

    public void vb_b5(View view){
        if(page == 1)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.ViscaBarca.this, R.raw.vb_1vor);  //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 2) {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.ViscaBarca.this, R.raw.vb_chickenxhunter);
            mp.start();
        }
        if(page == 3)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.ViscaBarca.this, R.raw.vb_ichhabsiegeschafft);
            mp.start();
        }
        if(page == 4)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.ViscaBarca.this, R.raw.vb_muttervonanton);
            mp.start();
        }
        if(page == 5)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.ViscaBarca.this, R.raw.vb_wichtig);
            mp.start();
        }


    }

    public void vb_b6(View view){
        if(page == 1)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.ViscaBarca.this, R.raw.vb_4minuten);  //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 2)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.ViscaBarca.this, R.raw.vb_doublenuklear);
            mp.start();
        }
        if(page == 3)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.ViscaBarca.this, R.raw.vb_ichkannsnichtglauben);
            mp.start();
        }
        if(page == 4)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.ViscaBarca.this, R.raw.vb_nisen);
            mp.start();
        }
        if(page == 5)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.ViscaBarca.this, R.raw.vb_wtf);
            mp.start();
        }


    }

    public void vb_next(View view)
    {
        page++;
        if(page == 1){
            setContentView(R.layout.viscabarca);
            setPage();
            setText();
            viscabarca_share();
        }
        if(page == 2){
            setContentView(R.layout.viscabarca);
            setPage();
            setText();
            viscabarca_share();
        }
        if(page == 3){
            setContentView(R.layout.viscabarca);
            setPage();
            setText();
            viscabarca_share();
        }
        if(page == 4){
            setContentView(R.layout.viscabarca);
            setPage();
            setText();
            viscabarca_share();
        }
        if(page == 5){
            setContentView(R.layout.viscabarca);
            setPage();
            setText();
            viscabarca_share();
        }
        if(page == 6){
            setContentView(R.layout.viscabarca_info);
        }

    }

    public void vb_back(View view)
    {
        page--;
        if(page == 1){
            setContentView(R.layout.viscabarca);
            setPage();
            setText();
            viscabarca_share();
        }
        if(page == 2){
            setContentView(R.layout.viscabarca);
            setPage();
            setText();
            viscabarca_share();
        }
        if(page == 3){
            setContentView(R.layout.viscabarca);
            setPage();
            setText();
            viscabarca_share();
        }
        if(page == 4){
            setContentView(R.layout.viscabarca);
            setPage();
            setText();
            viscabarca_share();
        }
        if(page == 5){
            setContentView(R.layout.viscabarca);
            setPage();
            setText();
            viscabarca_share();
        }
        if(page == 0){
            setContentView(R.layout.viscabarca_info);
        }

    }

    public void vbinfo_next(View view){
        setContentView(R.layout.viscabarca);
        page = 1;
        setPage();
        setText();
    }

    public void vbinfo_back(View view){
        setContentView(R.layout.viscabarca);
        page = 5;
        setPage();
        setText();
    }

    public void setPage()
    {
        TextView Page = (TextView) findViewById(R.id.viscabarca_Page1);
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
