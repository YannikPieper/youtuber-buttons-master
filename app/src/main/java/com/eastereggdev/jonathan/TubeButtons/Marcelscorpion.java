package com.eastereggdev.jonathan.TubeButtons;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.jonathan.TubeButtons.R;


public class Marcelscorpion extends ActionBarActivity {
    private MediaPlayer mp = new MediaPlayer();
    private int page = 1;
    private boolean fav1 = false;
    private boolean fav2 = false;
    private boolean fav3 = false;
    private boolean fav4 = false;
    private boolean fav5 = false;
    private boolean fav6 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.marcelscorpion); //Set the layout file
        setTitle("Marcelscorpion"); //Rename the ActionBar Title
    }

    public void ms_fav(View view){
        switch (view.getId())
        {
            case R.id.ms_fav1:
                ImageButton msfav1 = (ImageButton) findViewById(R.id.ms_fav1);
                if(fav1 == false) {
                    msfav1.setBackgroundResource(R.drawable.fav_voll);
                    fav1 = true;
                    break;
                }
                if(fav1 == true) {
                    msfav1.setBackgroundResource(R.drawable.fav_leer);
                    fav1 = false;
                    break;
                }
            case R.id.ms_fav2:
                ImageButton msfav2 = (ImageButton) findViewById(R.id.ms_fav2);
                if(fav2 == false) {
                    msfav2.setBackgroundResource(R.drawable.fav_voll);
                    fav2 = true;
                    break;
                }
                if(fav2 == true) {
                    msfav2.setBackgroundResource(R.drawable.fav_leer);
                    fav2 = false;
                    break;
                }

            case R.id.ms_fav3:
                ImageButton msfav3 = (ImageButton) findViewById(R.id.ms_fav3);
                if(fav3 == false) {
                    msfav3.setBackgroundResource(R.drawable.fav_voll);
                    fav3 = true;
                    break;
                }
                if(fav3 == true) {
                    msfav3.setBackgroundResource(R.drawable.fav_leer);
                    fav3 = false;
                    break;
                }

            case R.id.ms_fav4:
                ImageButton msfav4 = (ImageButton) findViewById(R.id.ms_fav4);
                if(fav4 == false) {
                    msfav4.setBackgroundResource(R.drawable.fav_voll);
                    fav4 = true;
                    break;
                }
                if(fav4 == true) {
                    msfav4.setBackgroundResource(R.drawable.fav_leer);
                    fav4 = false;
                    break;
                }
            case R.id.ms_fav5:
                ImageButton msfav5 = (ImageButton) findViewById(R.id.ms_fav5);
                if(fav5 == false) {
                    msfav5.setBackgroundResource(R.drawable.fav_voll);
                    fav5 = true;
                    break;
                }
                if(fav5 == true) {
                    msfav5.setBackgroundResource(R.drawable.fav_leer);
                    fav5 = false;
                    break;
                }
            case R.id.ms_fav6:
                ImageButton msfav6 = (ImageButton) findViewById(R.id.ms_fav6);
                if(fav6 == false) {
                    msfav6.setBackgroundResource(R.drawable.fav_voll);
                    fav6 = true;
                    break;
                }
                if(fav6 == true) {
                    msfav6.setBackgroundResource(R.drawable.fav_leer);
                    fav6 = false;
                    break;
                }
        }
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
        }
        if(page == 2){
            setContentView(R.layout.marcelscorpion);
            setPage();
            setText();
        }
        if(page == 3){
            setContentView(R.layout.marcelscorpion);
            setPage();
            setText();
        }
        if(page == 4){
            setContentView(R.layout.marcelscorpion);
            setPage();
            setText();
        }
        if(page == 5){
            setContentView(R.layout.marcelscorpion);
            setPage();
            setText();
        }
        if(page == 6){
            setContentView(R.layout.marcelscorpion);
            setPage();
            setText();
        }
        if(page == 7){
            setContentView(R.layout.marcelscorpion);
            setPage();
            setText();
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
        }
        if(page == 2){
            setContentView(R.layout.marcelscorpion);
            setPage();
            setText();
        }
        if(page == 3){
            setContentView(R.layout.marcelscorpion);
            setPage();
            setText();
        }
        if(page == 4){
            setContentView(R.layout.marcelscorpion);
            setPage();
            setText();
        }
        if(page == 5){
            setContentView(R.layout.marcelscorpion);
            setPage();
            setText();
        }
        if(page == 6){
            setContentView(R.layout.marcelscorpion);
            setPage();
            setText();
        }
        if(page == 7){
            setContentView(R.layout.marcelscorpion);
            setPage();
            setText();
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
