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


public class Montanablack extends ActionBarActivity {
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
        setContentView(R.layout.montanablack);
        setTitle("Montanablack");

        montanablack_share();
    }


    public void setText(){
        if(page == 1){
            Button mb1 = (Button) findViewById(R.id.montanablack_b1);
            Button mb2 = (Button) findViewById(R.id.montanablack_b2);
            Button mb3 = (Button) findViewById(R.id.montanablack_b3);
            Button mb4 = (Button) findViewById(R.id.montanablack_b4);
            Button mb5 = (Button) findViewById(R.id.montanablack_b5);
            Button mb6 = (Button) findViewById(R.id.montanablack_b6);

            mb1.setText("Moin Moin");
            mb2.setText("After gefällt mir!");
            mb3.setText("Wie beim ersten mal Anal");
            mb4.setText("Du Hurensohn V.1");
            mb5.setText("Du Hurensohn V.2");
            mb6.setText("Du Hurensohn V.3");
        }
        if(page == 2){
            Button mb1 = (Button) findViewById(R.id.montanablack_b1);
            Button mb2 = (Button) findViewById(R.id.montanablack_b2);
            Button mb3 = (Button) findViewById(R.id.montanablack_b3);
            Button mb4 = (Button) findViewById(R.id.montanablack_b4);
            Button mb5 = (Button) findViewById(R.id.montanablack_b5);
            Button mb6 = (Button) findViewById(R.id.montanablack_b6);

            mb1.setText("is klar!");
            mb2.setText("Kundenhotline");
            mb3.setText("Beste Lache EU");
            mb4.setText("Monte lacht");
            mb5.setText("Messer ihn!");
            mb6.setText("Neeein");
        }
        if(page == 3){
            Button mb1 = (Button) findViewById(R.id.montanablack_b1);
            Button mb2 = (Button) findViewById(R.id.montanablack_b2);
            Button mb3 = (Button) findViewById(R.id.montanablack_b3);
            Button mb4 = (Button) findViewById(R.id.montanablack_b4);
            Button mb5 = (Button) findViewById(R.id.montanablack_b5);
            Button mb6 = (Button) findViewById(R.id.montanablack_b6);

            mb1.setText("Nice Spawn!");
            mb2.setText("Ohhh");
            mb3.setText("Oh Mein Gott!");
            mb4.setText("Pizza!");
            mb5.setText("Billig Porno");
            mb6.setText("Schleifende Hoden");
        }
        if(page == 4){
            Button mb1 = (Button) findViewById(R.id.montanablack_b1);
            Button mb2 = (Button) findViewById(R.id.montanablack_b2);
            Button mb3 = (Button) findViewById(R.id.montanablack_b3);
            Button mb4 = (Button) findViewById(R.id.montanablack_b4);
            Button mb5 = (Button) findViewById(R.id.montanablack_b5);
            Button mb6 = (Button) findViewById(R.id.montanablack_b6);

            mb1.setText("Trololololol");
            mb2.setText("Uiuiui!");
            mb3.setText("Vorräte");
            mb4.setText("Was ist das denn für ein Bug?");
            mb5.setText("Aktiv");
            mb6.setText("5 gegen Willi");
        }
    }

    public void montanablack_share(){
        Button mb1 = (Button) findViewById(R.id.montanablack_b1);
        Button mb2 = (Button) findViewById(R.id.montanablack_b2);
        Button mb3 = (Button) findViewById(R.id.montanablack_b3);
        Button mb4 = (Button) findViewById(R.id.montanablack_b4);
        Button mb5 = (Button) findViewById(R.id.montanablack_b5);
        Button mb6 = (Button) findViewById(R.id.montanablack_b6);


        mb1.setOnLongClickListener(new View.OnLongClickListener() {
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
                        is1 = getResources().openRawResource(R.raw.mb_moinmoin);
                    }
                    if(page ==2) {
                        is1 = getResources().openRawResource(R.raw.mb_isklar);
                    }
                    if(page ==3) {
                        is1 = getResources().openRawResource(R.raw.mb_nicespawn);
                    }
                    if(page ==4) {
                        is1 = getResources().openRawResource(R.raw.mb_trol);
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

        mb2.setOnLongClickListener(new View.OnLongClickListener() {
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
                        is1 = getResources().openRawResource(R.raw.mb_after);
                    }
                    if(page ==2) {
                        is1 = getResources().openRawResource(R.raw.mb_kundenhotline);
                    }
                    if(page ==3) {
                        is1 = getResources().openRawResource(R.raw.mb_ohh);
                    }
                    if(page ==4) {
                        is1 = getResources().openRawResource(R.raw.mb_uiui);
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

        mb3.setOnLongClickListener(new View.OnLongClickListener() {
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
                        is1 = getResources().openRawResource(R.raw.mb_erstesmal);
                    }
                    if(page ==2) {
                        is1 = getResources().openRawResource(R.raw.mb_lache);
                    }
                    if(page ==3) {
                        is1 = getResources().openRawResource(R.raw.mb_omg);
                    }
                    if(page ==4) {
                        is1 = getResources().openRawResource(R.raw.mb_vorraete);
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

        mb4.setOnLongClickListener(new View.OnLongClickListener() {
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
                        is1 = getResources().openRawResource(R.raw.mb_hurensohn);
                    }
                    if(page ==2) {
                        is1 = getResources().openRawResource(R.raw.mb_lache2);
                    }
                    if(page ==3) {
                        is1 = getResources().openRawResource(R.raw.mb_pizza);
                    }
                    if(page ==4) {
                        is1 = getResources().openRawResource(R.raw.mb_bug);
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

        mb5.setOnLongClickListener(new View.OnLongClickListener() {
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
                        is1 = getResources().openRawResource(R.raw.mb_hurensohn2);
                    }
                    if(page ==2) {
                        is1 = getResources().openRawResource(R.raw.mb_messerihn);
                    }
                    if(page ==3) {
                        is1 = getResources().openRawResource(R.raw.mb_porno);
                    }
                    if(page ==4) {
                        is1 = getResources().openRawResource(R.raw.mb_aktiv);
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

        mb6.setOnLongClickListener(new View.OnLongClickListener() {
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
                        is1 = getResources().openRawResource(R.raw.mb_hurensohn3);
                    }
                    if(page ==2) {
                        is1 = getResources().openRawResource(R.raw.mb_nein);
                    }
                    if(page ==3) {
                        is1 = getResources().openRawResource(R.raw.mb_schleifendehoden);
                    }
                    if(page ==4) {
                        is1 = getResources().openRawResource(R.raw.mb_5vswilli);
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

    public void mb_b1(View view){
        if(page == 1)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_moinmoin); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 2)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_isklar); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 3)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_nicespawn); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 4)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_trol); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }

    }

    public void mb_b2(View view){
        if(page == 1)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_after); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 2)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_kundenhotline); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 3)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_ohh); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 4)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_uiui); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }

    }

    public void mb_b3(View view){
        if(page == 1)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_erstesmal); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 2)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_lache); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 3)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_omg); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 4)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_vorraete); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }

    }

    public void mb_b4(View view){
        if(page == 1)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_hurensohn); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 2)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_lache2); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 3)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_pizza); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 4)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_bug); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }

    }

    public void mb_b5(View view){
        if(page == 1)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_hurensohn2); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 2) {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_messerihn); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 3)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_porno); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 4)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_aktiv); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }

    }

    public void mb_b6(View view){
        if(page == 1)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_hurensohn3); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 2)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_nein); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 3)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_schleifendehoden); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }
        if(page == 4)
        {
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Montanablack.this, R.raw.mb_5vswilli); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }

    }

    public void mb_next(View view)
    {
        page++;
        if(page == 1){
            setContentView(R.layout.montanablack);
            setPage();
            setText();
            montanablack_share();
        }
        if(page == 2){
            setContentView(R.layout.montanablack);
            setPage();
            setText();
            montanablack_share();
        }
        if(page == 3){
            setContentView(R.layout.montanablack);
            setPage();
            setText();
            montanablack_share();
        }
        if(page == 4){
            setContentView(R.layout.montanablack);
            setPage();
            setText();
            montanablack_share();
        }
        if(page == 5){
            setContentView(R.layout.montanablack_info);
        }

    }

    public void mb_back(View view)
    {
        page--;
        if(page == 1){
            setContentView(R.layout.montanablack);
            setPage();
            setText();
            montanablack_share();
        }
        if(page == 2){
            setContentView(R.layout.montanablack);
            setPage();
            setText();
            montanablack_share();
        }
        if(page == 3){
            setContentView(R.layout.montanablack);
            setPage();
            setText();
            montanablack_share();
        }
        if(page == 4){
            setContentView(R.layout.montanablack);
            setPage();
            setText();
            montanablack_share();
        }
        if(page == 0){
            setContentView(R.layout.montanablack_info);
        }

    }

    public void mbinfo_next(View view){
        setContentView(R.layout.montanablack);
        page = 1;
        setPage();
        setText();
    }

    public void mbinfo_back(View view){
        setContentView(R.layout.montanablack);
        page = 4;
        setPage();
        setText();
    }

    public void setPage()
    {
        TextView Page = (TextView) findViewById(R.id.montanablack_Page1);
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
    }


    public void mb_kanal(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/user/montanablack88"));
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
