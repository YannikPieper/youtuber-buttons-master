package com.eastereggdev.jonathan.TubeButtons;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

import com.example.jonathan.TubeButtons.R;

import java.util.ArrayList;


public class Elotrix extends ActionBarActivity {
    private MediaPlayer mp = new MediaPlayer();

    private static int etfav1 = 0;
    private static int etfav2 = 0;
    private static int etfav3 = 0;
    private static int etfav4 = 0;
    private static int etfav5 = 0;
    private static int etfav6 = 0;

    private Button fav1;
    private Button fav2;
    private Button fav3;
    private Button fav4;
    private Button fav5;
    private Button fav6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.elotrix_1);
        setTitle("Elotrix");
    }


    public void et_fav(View view)
    {

    }


    //OnClick Method für alle verschiedenen Sound Buttons
    public void et_b1(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_aufdemauto); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b2(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_aufklaerungsdrohne); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b3(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_aufklaerungsdrohne2); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b4(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_daskanndochnichtsein); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b5(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_deineelternsindgeschwister); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b6(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_diekoennennix); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b7(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_dudreckigerhuansohn); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b8(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_duhuansohn); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b9(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_duhuansohn2); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b10(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_duhuansohn3); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b11(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_ehnur); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b12(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_eristwiederda); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b13(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_esreicht); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b14(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_hnnnn); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b15(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_ihropfer); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b16(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_keinrecht); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b17(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_krankesouns); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b18(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_laecherlich); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b19(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_meinemamahatgesagt); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b20(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_mongoname); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b21(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_ohgott); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b22(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_ohman); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b23(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_ohnein); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b24(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_roterpfeil); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b25(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_scheisssniper); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b26(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_schluck); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b27(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_springausdemfenster); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b28(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_vonhinten); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b29(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_wasfuereinaim); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b30(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_washastdugetan); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b31(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_wasmachstduda); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b32(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_wiediegeiern); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b33(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_woraufsankommt); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }

    public void et_b34(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_abgehoben); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }

    public void et_b35(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_begruessung); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }

    public void et_b36(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_harakesh); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b37(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_abnormal); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b38(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_ausraster); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b39(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_einszufuenf); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b40(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_habtihrgesehn); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b41(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_hardscope); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b42(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_inzucht); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b43(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_keinaim); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b44(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_keinbock); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b45(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_laecherlich2); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b46(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_nachjoiner); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b47(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_nein); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b48(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_scheisslobby); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b49(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_seinemom); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b50(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_untermensch); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b51(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_verarschen); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b52(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_waswillstdu); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b53(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_weizen); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }
    public void et_b54(View view)
    {
        mp.reset();
        mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Elotrix.this, R.raw.et_wiedervonhinten); //Method to start the MediaPlayer with the selected Sound
        mp.start();
    }


    public void et1_next(View view)
    {
        setContentView(R.layout.elotrix_2);
    }

    public void et1_back(View view)
    {
        setContentView(R.layout.elotrix_info);
    }

    public void et2_next(View view)
    {
        setContentView(R.layout.elotrix_3);
    }

    public void et2_back(View view)
    {
        setContentView(R.layout.elotrix_1);
    }

    public void et3_next(View view)
    {
        setContentView(R.layout.elotrix_4);
    }

    public void et3_back(View view)
    {
        setContentView(R.layout.elotrix_2);
    }

    public void et4_back(View view)
    {
        setContentView(R.layout.elotrix_9);
    }

    public void et4_next(View view)
    {
        setContentView(R.layout.elotrix_1);
    }

    public void et5_next(View view)
    {
        setContentView(R.layout.elotrix_5);
    }

    public void et5_back(View view)
    {
        setContentView(R.layout.elotrix_3);
    }

    public void et6_next(View view)
    {
        setContentView(R.layout.elotrix_6);
    }

    public void et6_back(View view)
    {
        setContentView(R.layout.elotrix_4);
    }

    public void et7_next(View view)
    {
        setContentView(R.layout.elotrix_7);
    }

    public void et7_back(View view)
    {
        setContentView(R.layout.elotrix_5);
    }

    public void et8_next(View view)
    {
        setContentView(R.layout.elotrix_8);
    }

    public void et8_back(View view)
    {
        setContentView(R.layout.elotrix_6);
    }
    public void et9_next(View view)
    {
        setContentView(R.layout.elotrix_9);
    }

    public void et9_back(View view)
    {
        setContentView(R.layout.elotrix_7);
    }
    public void et10_next(View view)
    {
        setContentView(R.layout.elotrix_info);
    }

    public void et10_back(View view)
    {
        setContentView(R.layout.elotrix_8);
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
