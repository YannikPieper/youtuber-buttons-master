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
    private RadioButton checked;
    private Button et_1;
    private Button et_2;
    private Button et_3;
    private Button et_4;
    private Button et_5;
    private Button et_6;

    private boolean et1_f = false;
    ArrayList<String> et_fav = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.elotrix_1);
        setTitle("Elotrix");
    }

    public void selectFav(View view)
    {
        boolean checked = ((CheckBox) view).isChecked();
        Button et_1 = (Button) findViewById(R.id.elotrix_b1);
        Button et_2 = (Button) findViewById(R.id.elotrix_b2);
        Button et_3 = (Button) findViewById(R.id.elotrix_b3);
        Button et_4 = (Button) findViewById(R.id.elotrix_b4);
        Button et_5 = (Button) findViewById(R.id.elotrix_b5);
        Button et_6 = (Button) findViewById(R.id.elotrix_b6);

        switch (view.getId())
        {
            case R.id.c_et1:
                if(checked)
                {et_fav.add("et_1");
                et_1.setBackgroundColor(Color.parseColor("#673AB7"));}
                else
                {et_fav.remove("et_1");
                    et_1.setBackgroundColor(Color.parseColor("#FFC107"));}
                break;

            case R.id.c_et2:

                if(checked)
                {et_fav.add("et_2");
                    et_2.setBackgroundColor(Color.parseColor("#673AB7"));}
                else
                {et_fav.remove("et_2");
                    et_2.setBackgroundColor(Color.parseColor("#FFC107"));}
                break;

            case R.id.c_et3:

                if(checked)
                {et_fav.add("et_3");
                    et_3.setBackgroundColor(Color.parseColor("#673AB7"));}
                else
                {et_fav.remove("et_3");
                    et_3.setBackgroundColor(Color.parseColor("#FFC107"));}
                break;

            case R.id.c_et4:

                if(checked)
                {et_fav.add("et_4");
                    et_4.setBackgroundColor(Color.parseColor("#673AB7"));}
                else
                {et_fav.remove("et_4");
                    et_4.setBackgroundColor(Color.parseColor("#FFC107"));}
                break;

            case R.id.c_et5:

                if(checked)
                {et_fav.add("et_5");
                    et_5.setBackgroundColor(Color.parseColor("#673AB7"));}
                else
                {et_fav.remove("et_5");
                    et_5.setBackgroundColor(Color.parseColor("#FFC107"));}
                break;

            case R.id.c_et6:

                if(checked)
                {et_fav.add("et_6");
                    et_6.setBackgroundColor(Color.parseColor("#673AB7"));}
                else
                {et_fav.remove("et_6");
                    et_6.setBackgroundColor(Color.parseColor("#FFC107"));}
                break;
        }
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
        setContentView(R.layout.elotrix_6);
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
        setContentView(R.layout.elotrix_info);
    }

    public void et7_back(View view)
    {
        setContentView(R.layout.elotrix_5);
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
