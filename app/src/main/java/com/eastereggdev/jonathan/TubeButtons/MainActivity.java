package com.eastereggdev.jonathan.TubeButtons;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jonathan.TubeButtons.R;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Random;


public class MainActivity extends ActionBarActivity {

    private static Button soundboard;
    private static ImageView ytView;
    int msicon = R.drawable.msicon;
    int vbicon = R.drawable.vbicon;
    int mbicon = R.drawable.mbicon;
    int isicon = R.drawable.isicon;
    int eticon = R.drawable.eticon;
    int ksicon = R.drawable.ksicon;
    private LinearLayout ytlist;
    private static final int NOTIFICATION_ID = 0;

    Button YouTuber;
    int yTuber = 0;
    int yt = 5;
    int rumNum;
    int rumNum2;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        setInfoText();
    }

    public void next(View view){
        if(yTuber < 5) {
            yTuber++;
        }else {
            yTuber = 0;
        }
        setYoutuber();
        setInfoText();
    }

    public void back(View view){
        if(yTuber > 0){
            yTuber--;
        } else {
            yTuber = 5;
        }
        setYoutuber();
        setInfoText();
    }

    public void setYoutuber(){
        Button YouTuber = (Button) findViewById(R.id.youtuber);
        TextView yURL = (TextView) findViewById(R.id.yURL);
        ytView = (ImageView) findViewById(R.id.yt_icon);
        soundboard = (Button) findViewById(R.id.sounds);

        if(yTuber == 0){
            YouTuber.setText("Elotrix");
            yURL.setText("https://www.youtube.com/user/ELoTRiXHDx");
            ytView.setImageResource(eticon);
            soundboard.setText("Elotrix Sounds");
            yt = 5;
        }
        if(yTuber == 1){
            YouTuber.setText("Marcelscorpion");
            yURL.setText("https://www.youtube.com/user/marcelscorpion");
            ytView.setImageResource(msicon);
            soundboard.setText("Marcelscorpion Sounds");
            yt = 1;
        }
        if(yTuber == 2){
            YouTuber.setText("Montanablack");
            yURL.setText("https://www.youtube.com/user/montanablack88");
            ytView.setImageResource(mbicon);
            soundboard.setText("Montanablack Sounds");
            yt = 3;
        }
        if(yTuber == 3){
            YouTuber.setText("Inscope21");
            yURL.setText("https://www.youtube.com/user/inscope21");
            ytView.setImageResource(isicon);
            soundboard.setText("Inscope21 Sounds");
            yt = 4;
        }
        if(yTuber == 4){
            YouTuber.setText("ViscaBarca");
            yURL.setText("https://www.youtube.com/user/Visca96Barca");
            ytView.setImageResource(vbicon);
            soundboard.setText("ViscaBarca Sounds");
            yt = 2;
        }
        if(yTuber == 5){
            YouTuber.setText("KSFreak");
            yURL.setText("https://www.youtube.com/user/KsFreakWhatElse");
            ytView.setImageResource(ksicon);
            soundboard.setText("KSFreak Sounds");
            yt = 6;
        }

    }

    public void setInfoText()
    {
        TextView infotext = (TextView) findViewById(R.id.infotext);

        Random rand = new Random();
        rumNum2 = (rand.nextInt(12) + 1);

        if(rumNum2 == 1){
            infotext.setText("Halte den Sound gedrückt um ihn mit deinen Freunden zu teilen!");
        }
        if(rumNum2 == 2){
            infotext.setText("Es kommen immer neue YouTuber hinzu!");
        }
        if(rumNum2 == 3){
            infotext.setText("Hast du schon mal den Rumble Button ausprobiert?");
        }
        if(rumNum2 == 4){
            infotext.setText("Schau doch mal bei uns auf Twitter vorbei!");
        }
        if(rumNum2 == 5){
            infotext.setText("by Easter Egg Development");
        }
        if(rumNum2 == 6){
            infotext.setText("Über 200 Sounds sind ab sofort verfügbar!");
        }
        if(rumNum2 == 7){
            infotext.setText("Abonniere doch den YouTuber wenn dir die Sounds gefallen!");
        }
        if(rumNum2 == 8){
            infotext.setText("Frohe Weihnachten und ein schönes neues Jahr!");
        }
        if(rumNum2 == 9){
            infotext.setText("Kritik oder Fragen? Melde dich doch einfach bei uns auf Twitter oder Facebook!");
        }
        if(rumNum2 == 10){
            infotext.setText("Unsere Email: eastereggdev@gmail.com");
        }
        if(rumNum2 == 11){
            infotext.setText("Wie gefällt dir das neue Design? Geil oder?!");
        }
        if(rumNum2 == 12){
            infotext.setText("Der Adventskalender soll auch ganz cool sein habe ich gehört...");
        }
    }

    public void rumble(View view) //Button to play a random sound
    {
        Rumble();
    }

    public void Rumble()
    {
        Random rand = new Random();
        rumNum = (rand.nextInt(181) + 1);
        SelectSound();
    }

    public void SelectSound()
    {
        mp.reset();
        if(rumNum == 1)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_abgehoben);
        }
        if(rumNum == 2)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_abnormal);
        }
        if(rumNum == 3)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_aufdemauto);
        }
        if(rumNum == 4)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_aufklaerungsdrohne);
        }
        if(rumNum == 5)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_aufklaerungsdrohne2);
        }
        if(rumNum == 6)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_ausraster);
        }
        if(rumNum == 7)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_begruessung);
        }
        if(rumNum == 8)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_daskanndochnichtsein);
        }
        if(rumNum == 9)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_deineelternsindgeschwister);
        }
        if(rumNum == 10)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_diekoennennix);
        }
        if(rumNum == 11)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_dudreckigerhuansohn);
        }
        if(rumNum == 12)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_duhuansohn);
        }
        if(rumNum == 13)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_duhuansohn2);
        }
        if(rumNum == 14)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_duhuansohn3);
        }
        if(rumNum == 15)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_ehnur);
        }
        if(rumNum == 16)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_einszufuenf);
        }
        if(rumNum == 17)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_eristwiederda);
        }
        if(rumNum == 18)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_esreicht);
        }
        if(rumNum == 19)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_habtihrgesehn);
        }
        if(rumNum == 20)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_harakesh);
        }
        if(rumNum == 21)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_hardscope);
        }
        if(rumNum == 22)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_hnnnn);
        }
        if(rumNum == 23)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_ihropfer);
        }
        if(rumNum == 24)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_inzucht);
        }
        if(rumNum == 25)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_keinaim);
        }
        if(rumNum == 26)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_keinbock);
        }
        if(rumNum == 27)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_keinrecht);
        }
        if(rumNum == 28)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_krankesouns);
        }
        if(rumNum == 29)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_laecherlich);
        }
        if(rumNum == 30)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_laecherlich2);
        }
        if(rumNum == 31)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_meinemamahatgesagt);
        }
        if(rumNum == 32)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_mongoname);
        }
        if(rumNum == 33)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_nachjoiner);
        }
        if(rumNum == 34)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_nein);
        }
        if(rumNum == 35)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_ohgott);
        }
        if(rumNum == 36)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_ohman);
        }
        if(rumNum == 37)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_ohnein);
        }
        if(rumNum == 38)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_roterpfeil);
        }
        if(rumNum == 39)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_scheisslobby);
        }
        if(rumNum == 40)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_scheisssniper);
        }
        if(rumNum == 41)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_schluck);
        }
        if(rumNum == 42)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_seinemom);
        }
        if(rumNum == 43)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_springausdemfenster);
        }
        if(rumNum == 44)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_untermensch);
        }
        if(rumNum == 45)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_verarschen);
        }
        if(rumNum == 46)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_vonhinten);
        }
        if(rumNum == 47)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_wasfuereinaim);
        }
        if(rumNum == 48)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_washastdugetan);
        }
        if(rumNum == 49)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_wasmachstduda);
        }
        if(rumNum == 50)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_waswillstdu);
        }
        if(rumNum == 51)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_weizen);
        }
        if(rumNum == 52)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_wiedervonhinten);
        }
        if(rumNum == 53)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_wiediegeiern);
        }
        if(rumNum == 54)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.et_woraufsankommt);
        }
        if(rumNum == 55)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.is_abgenommen);
        }
        if(rumNum == 56)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.is_begruessung);
        }
        if(rumNum == 57)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.is_cup);
        }
        if(rumNum == 58)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.is_derpunkt);
        }
        if(rumNum == 59)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.is_ereignisse);
        }
        if(rumNum == 60)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.is_eydigger);
        }
        if(rumNum == 61)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.is_haltmaul);
        }
        if(rumNum == 62)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.is_halzmaul);
        }
        if(rumNum == 63)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.is_idontgetit);
        }
        if(rumNum == 64)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.is_jaaber);
        }
        if(rumNum == 65)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.is_wahrscheinlich);
        }
        if(rumNum == 66)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.is_laeuft);
        }
        if(rumNum == 67)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.is_licht);
        }
        if(rumNum == 68)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.is_mainstation);
        }
        if(rumNum == 69)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.is_oppertunity);
        }
        if(rumNum == 70)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.is_scheissebedarf);
        }
        if(rumNum == 71)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.is_simon);
        }
        if(rumNum == 72)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.is_traum);
        }
        if(rumNum == 73)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.is_trick);
        }
        if(rumNum == 74)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.is_trockenfruechte);
        }
        if(rumNum == 75)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.is_umarmung);
        }
        if(rumNum == 76)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.is_verpissdich);
        }
        if(rumNum == 77)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.is_verpissen);
        }
        if(rumNum == 78)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.is_fiat);
        }
        if(rumNum == 79)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.is_gesagt);
        }
        if(rumNum == 80)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.is_hhhhhh);
        }
        if(rumNum == 81)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.is_ichmeine);
        }
        if(rumNum == 82)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.is_jucktdennich);
        }
        if(rumNum == 83)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.is_woihrrechthabt);
        }
        if(rumNum == 84)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.mb_5vswilli);
        }
        if(rumNum == 85)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.mb_after);
        }
        if(rumNum == 86)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.mb_aktiv);
        }
        if(rumNum == 87)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.mb_bug);
        }
        if(rumNum == 88)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.mb_erstesmal);
        }
        if(rumNum == 89)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.mb_hurensohn);
        }
        if(rumNum == 90)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.mb_hurensohn2);
        }
        if(rumNum == 91)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.mb_hurensohn3);
        }
        if(rumNum == 92)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.mb_isklar);
        }
        if(rumNum == 93)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.mb_kundenhotline);
        }
        if(rumNum == 94)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.mb_lache);
        }
        if(rumNum == 95)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.mb_lache2);
        }
        if(rumNum == 96)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.mb_messerihn);
        }
        if(rumNum == 97)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.mb_moinmoin);
        }
        if(rumNum == 98)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.mb_nein);
        }
        if(rumNum == 99)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.mb_nicespawn);
        }
        if(rumNum == 100)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.mb_ohh);
        }
        if(rumNum == 101)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.mb_omg);
        }
        if(rumNum == 102)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.mb_pizza);
        }
        if(rumNum == 103)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.mb_porno);
        }
        if(rumNum == 104)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.mb_schleifendehoden);
        }
        if(rumNum == 105)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.mb_trol);
        }
        if(rumNum == 106)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.mb_uiui);
        }
        if(rumNum == 107)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.mb_vorraete);
        }
        if(rumNum == 108)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.ms_ausraster1);
        }
        if(rumNum == 109)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.ms_ballerrein2);
        }
        if(rumNum == 110)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.ms_begruessung);
        }
        if(rumNum == 111)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.ms_bombi);
        }
        if(rumNum == 112)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.ms_einsvor);
        }
        if(rumNum == 113)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.ms_eyman);
        }
        if(rumNum == 114)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.ms_frechdachs);
        }
        if(rumNum == 115)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.ms_krank1);
        }
        if(rumNum == 116)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.ms_krank2);
        }
        if(rumNum == 117)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.ms_krank3);
        }
        if(rumNum == 118)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.ms_krankesounds);
        }
        if(rumNum == 119)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.ms_krankfinale);
        }
        if(rumNum == 120)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.ms_lachs);
        }
        if(rumNum == 121)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.ms_lenakannsnicht);
        }
        if(rumNum == 122)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.ms_lenalachen);
        }
        if(rumNum == 123)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.ms_marcelsingt1);
        }
        if(rumNum == 124)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.ms_marcelsingt2);
        }
        if(rumNum == 125)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.ms_meinpissoir);
        }
        if(rumNum == 126)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.ms_neinwas);
        }
        if(rumNum == 127)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.ms_nochniegesehen);
        }
        if(rumNum == 128)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.ms_noconnection);
        }
        if(rumNum == 129)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.ms_nohands);
        }
        if(rumNum == 130)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.ms_noobsschwitzen);
        }
        if(rumNum == 131)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.ms_ohgott);
        }
        if(rumNum == 132)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.ms_ohoh);
        }
        if(rumNum == 133)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.ms_onlyflinkehaende);
        }
        if(rumNum == 134)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.ms_ragemoment);
        }
        if(rumNum == 135)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.ms_rechtsvorlinks);
        }
        if(rumNum == 136)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.ms_sagudaheda);
        }
        if(rumNum == 137)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.ms_schwarm);
        }
        if(rumNum == 138)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.ms_stellung);
        }
        if(rumNum == 139)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.ms_sweep);
        }
        if(rumNum == 140)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.ms_tarnheli);
        }
        if(rumNum == 141)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.ms_tot1vor);
        }
        if(rumNum == 142)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.ms_verabschiedung);
        }
        if(rumNum == 143)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.ms_wasistmitdenleutenlos);
        }
        if(rumNum == 144)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.ms_weristderbeste);
        }
        if(rumNum == 145)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.ms_wermchtdennsowas);
        }
        if(rumNum == 146)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.ms_whoisthebest);
        }
        if(rumNum == 147)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.ms_wuup);
        }
        if(rumNum == 148)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.ms_zelosmonteturnon);
        }
        if(rumNum == 149)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.ms_zelosred);
        }
        if(rumNum == 150)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.ms_zelossauberman);
        }
        if(rumNum == 151)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.vb_100000likes);
        }
        if(rumNum == 152)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.vb_100erprezi);
        }
        if(rumNum == 153)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.vb_11schuesse);
        }
        if(rumNum == 154)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.vb_12erprezi);
        }
        if(rumNum == 155)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.vb_1vor);
        }
        if(rumNum == 156)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.vb_4minuten);
        }
        if(rumNum == 157)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.vb_afk);
        }
        if(rumNum == 158)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.vb_aimbot);
        }
        if(rumNum == 159)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.vb_amk);
        }
        if(rumNum == 160)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.vb_begruesung);
        }
        if(rumNum == 161)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.vb_chickenxhunter);
        }
        if(rumNum == 162)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.vb_doublenuklear);
        }
        if(rumNum == 163)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.vb_endscore);
        }
        if(rumNum == 164)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.vb_flanken);
        }
        if(rumNum == 165)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.vb_fuereuchalle);
        }
        if(rumNum == 166)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.vb_gamergrip);
        }
        if(rumNum == 167)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.vb_haenchen);
        }
        if(rumNum == 168)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.vb_ichhabsiegeschafft);
        }
        if(rumNum == 169)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.vb_ichkannsnichtglauben);
        }
        if(rumNum == 170)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.vb_ichweingleich);
        }
        if(rumNum == 171)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.vb_letstesmal);
        }
        if(rumNum == 172)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.vb_m8);
        }
        if(rumNum == 173)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.vb_missgebirten);
        }
        if(rumNum == 174)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.vb_muttervonanton);
        }
        if(rumNum == 175)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.vb_nisen);
        }
        if(rumNum == 176)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.vb_schweinpfeift);
        }
        if(rumNum == 177)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.vb_tripleaufschiff);
        }
        if(rumNum == 178)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.vb_triplenuklear);
        }
        if(rumNum == 179)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.vb_turnon);
        }
        if(rumNum == 180)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.vb_wichtig);
        }
        if(rumNum == 181)
        {
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.MainActivity.this, R.raw.vb_wtf);
        }

        mp.start();
    }

    public void ms(View view) //Method to change the values on top of the xml file
    {
        ytView = (ImageView) findViewById(R.id.yt_icon); //Change YouTuber Icon
        soundboard = (Button) findViewById(R.id.sounds); //Change Button to connect to the class
        soundboard.setText("Marcelscorpion Sounds"); //Change Text
        soundboard.setBackgroundResource(R.drawable.msbuttongo); //Change Background Color
        ytView.setImageResource(msicon);
        yt = 1; //Value to set the different YouTubers
    }

    public void vb(View view)
    {
        ytView = (ImageView) findViewById(R.id.yt_icon);
        soundboard = (Button) findViewById(R.id.sounds);
        soundboard.setText("ViscaBarca Sounds");
        soundboard.setBackgroundResource(R.drawable.vbbuttongo);
        ytView.setImageResource(vbicon);
        yt = 2;
    }

    public void mb(View view)
    {
        ytView = (ImageView) findViewById(R.id.yt_icon);
        soundboard = (Button) findViewById(R.id.sounds);
        soundboard.setText("Montanablack Sounds");
        soundboard.setBackgroundResource(R.drawable.mbbuttongo);
        ytView.setImageResource(mbicon);
        yt = 3;
    }

    public void is(View view)
    {
        ytView = (ImageView) findViewById(R.id.yt_icon);
        soundboard = (Button) findViewById(R.id.sounds);
        soundboard.setText("Inscope21 Sounds");
        soundboard.setBackgroundResource(R.drawable.isbuttongo);
        ytView.setImageResource(isicon);
        yt = 4;
    }

    public void et(View view)
    {
        ytView = (ImageView) findViewById(R.id.yt_icon);
        soundboard = (Button) findViewById(R.id.sounds);
        soundboard.setText("Elotrix Sounds");
        soundboard.setBackgroundResource(R.drawable.etbuttongo);
        ytView.setImageResource(eticon);
        yt = 5;
    }

    public void ytlist (View view){

        Intent intent = new Intent(this, YoutuberList.class);
        startActivity(intent); //start the new class

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
            Intent intent = new Intent(this, ViscaBarca.class);
            startActivity(intent);
        }
        if(yt == 3)
        {
            Intent intent = new Intent(this, Montanablack.class);
            startActivity(intent);
        }
        if(yt == 4) {
            Intent intent = new Intent(this, Inscope.class);
            startActivity(intent);
        }
        if(yt == 5)
        {
            Intent intent = new Intent(this, Elotrix.class);
            startActivity(intent);
        }
        if(yt == 6){
            Intent intent = new Intent(this, KSFreak.class);
            startActivity(intent);
        }
    }

    public void youtuber(View view) //Method to open the different soundboards
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
            Intent intent = new Intent(this, ViscaBarca.class);
            startActivity(intent);
        }
        if(yt == 3)
        {
            Intent intent = new Intent(this, Montanablack.class);
            startActivity(intent);
        }
        if(yt == 4) {
            Intent intent = new Intent(this, Inscope.class);
            startActivity(intent);
        }
        if(yt == 5)
        {
            Intent intent = new Intent(this, Elotrix.class);
            startActivity(intent);
        }
        if(yt == 6){
            Intent intent = new Intent(this, KSFreak.class);
            startActivity(intent);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    /*@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            openSettings();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);

        switch (item.getItemId()) {
            case R.id.action_informations:
                Intent infos = new Intent(this, Informations.class);
                startActivity(infos);
                return true;

            case R.id.action_adventskalender:
                Intent favoriten = new Intent(this, Favoriten.class);
                startActivity(favoriten);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
