package com.eastereggdev.jonathan.TubeButtons;

import android.content.Intent;
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


public class Inscope extends ActionBarActivity {

    //Different Buttons of marcelscorpion_1.xmlml
    private int page = 1;
    private TextView Page;
    private MediaPlayer mp = new MediaPlayer();

    public String ordnerpfad = Environment.getExternalStorageDirectory() + "/TubeSounds";
    public String soundpfad = ordnerpfad + "/sound.mp3";
    public File ordnerfile = new File(ordnerpfad);
    public File soundfile = new File(soundpfad);
    public Uri urisound = Uri.parse(soundpfad);
    public byte[] byte1 = new byte[1024];
    public int zwischenspeicher = 0;
    public InputStream ins1;
    public FileOutputStream fos;

    public Intent shareintent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inscope);
        setTitle("Inscope21");

        inscope_share();
    }


    public void setText(){
        if(page == 1){
            Button is1 = (Button) findViewById(R.id.inscope_b1);
            Button is2 = (Button) findViewById(R.id.inscope_b2);
            Button is3 = (Button) findViewById(R.id.inscope_b3);
            Button is4 = (Button) findViewById(R.id.inscope_b4);
            Button is5 = (Button) findViewById(R.id.inscope_b5);
            Button is6 = (Button) findViewById(R.id.inscope_b6);

            is1.setText("Ereignisse");
            is2.setText("Abgenommen!");
            is3.setText("Begrüßung");
            is4.setText("Englisch Speakwords V.1");
            is5.setText("Wenn der Punkt erreicht ist");
            is6.setText("Das Ergebniss");
        }
        if(page == 2){
            Button is1 = (Button) findViewById(R.id.inscope_b1);
            Button is2 = (Button) findViewById(R.id.inscope_b2);
            Button is3 = (Button) findViewById(R.id.inscope_b3);
            Button is4 = (Button) findViewById(R.id.inscope_b4);
            Button is5 = (Button) findViewById(R.id.inscope_b5);
            Button is6 = (Button) findViewById(R.id.inscope_b6);

            is1.setText("Ey Digger");
            is2.setText("Halt dein Maul!");
            is3.setText("Halt's Maul!");
            is4.setText("Englisch Speakwords V.2");
            is5.setText("Ja aber...");
            is6.setText("Jo Wahrscheinlich");
        }
        if(page == 3){
            Button is1 = (Button) findViewById(R.id.inscope_b1);
            Button is2 = (Button) findViewById(R.id.inscope_b2);
            Button is3 = (Button) findViewById(R.id.inscope_b3);
            Button is4 = (Button) findViewById(R.id.inscope_b4);
            Button is5 = (Button) findViewById(R.id.inscope_b5);
            Button is6 = (Button) findViewById(R.id.inscope_b6);

            is1.setText("Läuft!");
            is2.setText("Geht euch auch grad ein Licht auf?");
            is3.setText("Englisch Speakwords V.3");
            is4.setText("Super Opportunity");
            is5.setText("Der Scheissebedarf muss gedeckt sein!");
            is6.setText("Ich bins euer Simon");
        }
        if(page == 4){
            Button is1 = (Button) findViewById(R.id.inscope_b1);
            Button is2 = (Button) findViewById(R.id.inscope_b2);
            Button is3 = (Button) findViewById(R.id.inscope_b3);
            Button is4 = (Button) findViewById(R.id.inscope_b4);
            Button is5 = (Button) findViewById(R.id.inscope_b5);
            Button is6 = (Button) findViewById(R.id.inscope_b6);

            is1.setText("Euer Traum!");
            is2.setText("Krasser Trick");
            is3.setText("Ohne Trockenfrüchte");
            is4.setText("12 Euro für eine Umarmung");
            is5.setText("Verpiss dich!");
            is6.setText("Verpisst euch!");
        }
        if(page == 5){
            Button is1 = (Button) findViewById(R.id.inscope_b1);
            Button is2 = (Button) findViewById(R.id.inscope_b2);
            Button is3 = (Button) findViewById(R.id.inscope_b3);
            Button is4 = (Button) findViewById(R.id.inscope_b4);
            Button is5 = (Button) findViewById(R.id.inscope_b5);
            Button is6 = (Button) findViewById(R.id.inscope_b6);

            is1.setText("Nehmt euren Fiat");
            is2.setText("Was haben sie gesagt?");
            is3.setText("hhhhhhhhhhhh");
            is4.setText("ich meine...");
            is5.setText("Juckt den nicht");
            is6.setText("Wo ihr recht habt");
        }
    }

    public void inscope_share(){
        Button is1 = (Button) findViewById(R.id.inscope_b1);
        Button is2 = (Button) findViewById(R.id.inscope_b2);
        Button is3 = (Button) findViewById(R.id.inscope_b3);
        Button is4 = (Button) findViewById(R.id.inscope_b4);
        Button is5 = (Button) findViewById(R.id.inscope_b5);
        Button is6 = (Button) findViewById(R.id.inscope_b6);


        is1.setOnLongClickListener(new View.OnLongClickListener() {
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
                        ins1 = getResources().openRawResource(R.raw.is_ereignisse);
                    }
                    if(page ==2) {
                        ins1 = getResources().openRawResource(R.raw.is_eydigger);
                    }
                    if(page ==3) {
                        ins1 = getResources().openRawResource(R.raw.is_laeuft);
                    }
                    if(page ==4) {
                        ins1 = getResources().openRawResource(R.raw.is_traum);
                    }
                    if(page ==5) {
                        ins1 = getResources().openRawResource(R.raw.is_fiat);
                    }

                    fos = new FileOutputStream(soundfile);

                    while((zwischenspeicher = ins1.read(byte1)) > 0){

                        fos.write(byte1, 0, zwischenspeicher);

                    }
                    ins1.close();
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

        is2.setOnLongClickListener(new View.OnLongClickListener() {
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
                        ins1 = getResources().openRawResource(R.raw.is_abgenommen);
                    }
                    if(page ==2) {
                        ins1 = getResources().openRawResource(R.raw.is_haltmaul);
                    }
                    if(page ==3) {
                        ins1 = getResources().openRawResource(R.raw.is_licht);
                    }
                    if(page ==4) {
                        ins1 = getResources().openRawResource(R.raw.is_trick);
                    }
                    if(page ==5) {
                        ins1 = getResources().openRawResource(R.raw.is_gesagt);
                    }

                    fos = new FileOutputStream(soundfile);

                    while((zwischenspeicher = ins1.read(byte1)) > 0){

                        fos.write(byte1, 0, zwischenspeicher);

                    }
                    ins1.close();
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

        is3.setOnLongClickListener(new View.OnLongClickListener() {
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
                        ins1 = getResources().openRawResource(R.raw.is_begruessung);
                    }
                    if(page ==2) {
                        ins1 = getResources().openRawResource(R.raw.is_halzmaul);
                    }
                    if(page ==3) {
                        ins1 = getResources().openRawResource(R.raw.is_mainstation);
                    }
                    if(page ==4) {
                        ins1 = getResources().openRawResource(R.raw.is_trockenfruechte);
                    }
                    if(page ==5) {
                        ins1 = getResources().openRawResource(R.raw.is_hhhhhh);
                    }

                    fos = new FileOutputStream(soundfile);

                    while((zwischenspeicher = ins1.read(byte1)) > 0){

                        fos.write(byte1, 0, zwischenspeicher);

                    }
                    ins1.close();
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

        is4.setOnLongClickListener(new View.OnLongClickListener() {
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
                        ins1 = getResources().openRawResource(R.raw.is_cup);
                    }
                    if(page ==2) {
                        ins1 = getResources().openRawResource(R.raw.is_idontgetit);
                    }
                    if(page ==3) {
                        ins1 = getResources().openRawResource(R.raw.is_oppertunity);
                    }
                    if(page ==4) {
                        ins1 = getResources().openRawResource(R.raw.is_umarmung);
                    }
                    if(page ==5) {
                        ins1 = getResources().openRawResource(R.raw.is_ichmeine);
                    }

                    fos = new FileOutputStream(soundfile);

                    while((zwischenspeicher = ins1.read(byte1)) > 0){

                        fos.write(byte1, 0, zwischenspeicher);

                    }
                    ins1.close();
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

        is5.setOnLongClickListener(new View.OnLongClickListener() {
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
                        ins1 = getResources().openRawResource(R.raw.is_derpunkt);
                    }
                    if(page ==2) {
                        ins1 = getResources().openRawResource(R.raw.is_jaaber);
                    }
                    if(page ==3) {
                        ins1 = getResources().openRawResource(R.raw.is_scheissebedarf);
                    }
                    if(page ==4) {
                        ins1 = getResources().openRawResource(R.raw.is_verpissdich);
                    }
                    if(page ==5) {
                        ins1 = getResources().openRawResource(R.raw.is_jucktdennich);
                    }
                    fos = new FileOutputStream(soundfile);

                    while((zwischenspeicher = ins1.read(byte1)) > 0){

                        fos.write(byte1, 0, zwischenspeicher);

                    }
                    ins1.close();
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

        is6.setOnLongClickListener(new View.OnLongClickListener() {
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
                        ins1 = getResources().openRawResource(R.raw.is_ergebniss);
                    }
                    if(page ==2) {
                        ins1 = getResources().openRawResource(R.raw.is_wahrscheinlich);
                    }
                    if(page ==3) {
                        ins1 = getResources().openRawResource(R.raw.is_simon);
                    }
                    if(page ==4) {
                        ins1 = getResources().openRawResource(R.raw.is_verpissen);
                    }
                    if(page ==5) {
                        ins1 = getResources().openRawResource(R.raw.is_woihrrechthabt);
                    }
                    fos = new FileOutputStream(soundfile);

                    while((zwischenspeicher = ins1.read(byte1)) > 0){

                        fos.write(byte1, 0, zwischenspeicher);

                    }
                    ins1.close();
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

    public void is_b1(View view){
        if(page == 1)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Inscope.this, R.raw.is_ereignisse); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 2)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Inscope.this, R.raw.is_eydigger); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 3)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Inscope.this, R.raw.is_laeuft); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 4)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Inscope.this, R.raw.is_traum); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 5)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Inscope.this, R.raw.is_fiat); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
    }

    public void is_b2(View view){
        if(page == 1)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Inscope.this, R.raw.is_abgenommen); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 2)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Inscope.this, R.raw.is_haltmaul); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 3)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Inscope.this, R.raw.is_licht); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 4)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Inscope.this, R.raw.is_trick); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 5)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Inscope.this, R.raw.is_gesagt); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
    }

    public void is_b3(View view){
        if(page == 1)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Inscope.this, R.raw.is_begruessung); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 2)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Inscope.this, R.raw.is_halzmaul); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 3)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Inscope.this, R.raw.is_mainstation); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 4)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Inscope.this, R.raw.is_trockenfruechte); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 5)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Inscope.this, R.raw.is_hhhhhh); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
    }

    public void is_b4(View view){
        if(page == 1)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Inscope.this, R.raw.is_cup); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 2)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Inscope.this, R.raw.is_idontgetit); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 3)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Inscope.this, R.raw.is_oppertunity); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 4)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Inscope.this, R.raw.is_umarmung); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 5)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Inscope.this, R.raw.is_ichmeine); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
    }

    public void is_b5(View view){
        if(page == 1)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Inscope.this, R.raw.is_derpunkt); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 2) {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Inscope.this, R.raw.is_jaaber); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 3)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Inscope.this, R.raw.is_scheissebedarf); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 4)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Inscope.this, R.raw.is_verpissdich); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 5)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Inscope.this, R.raw.is_jucktdennich); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
    }

    public void is_b6(View view){
        if(page == 1)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Inscope.this, R.raw.is_ergebniss); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 2)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Inscope.this, R.raw.is_wahrscheinlich); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 3)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Inscope.this, R.raw.is_simon); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 4)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Inscope.this, R.raw.is_verpissen); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 5)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Inscope.this, R.raw.is_woihrrechthabt); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
    }

    public void is_next(View view)
    {
        page++;
        if(page == 1){
            setContentView(R.layout.inscope);
            setPage();
            setText();
            inscope_share();
        }
        if(page == 2){
            setContentView(R.layout.inscope);
            setPage();
            setText();
            inscope_share();
        }
        if(page == 3){
            setContentView(R.layout.inscope);
            setPage();
            setText();
            inscope_share();
        }
        if(page == 4){
            setContentView(R.layout.inscope);
            setPage();
            setText();
            inscope_share();
        }
        if(page == 5){
            setContentView(R.layout.inscope);
            setPage();
            setText();
            inscope_share();
        }
        if(page == 6){
            setContentView(R.layout.inscope_info);
        }

    }

    public void is_back(View view)
    {
        page--;
        if(page == 1){
            setContentView(R.layout.inscope);
            setPage();
            setText();
            inscope_share();
        }
        if(page == 2){
            setContentView(R.layout.inscope);
            setPage();
            setText();
            inscope_share();
        }
        if(page == 3){
            setContentView(R.layout.inscope);
            setPage();
            setText();
            inscope_share();
        }
        if(page == 4){
            setContentView(R.layout.inscope);
            setPage();
            setText();
            inscope_share();
        }
        if(page == 5){
            setContentView(R.layout.inscope);
            setPage();
            setText();
            inscope_share();
        }
        if(page == 0){
            setContentView(R.layout.inscope_info);
        }

    }

    public void isinfo_next(View view){
        setContentView(R.layout.inscope);
        page = 1;
        setPage();
        setText();
    }

    public void isinfo_back(View view){
        setContentView(R.layout.inscope);
        page = 5;
        setPage();
        setText();
    }

    public void setPage()
    {
        TextView Page = (TextView) findViewById(R.id.inscope_Page1);
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
