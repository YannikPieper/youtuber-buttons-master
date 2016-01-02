package com.eastereggdev.jonathan.TubeButtons;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
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
import java.util.Calendar;

public class Favoriten extends ActionBarActivity {
    private MediaPlayer mp = new MediaPlayer();
    Calendar ac = Calendar.getInstance();
    int month;
    int day;

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
        setContentView(R.layout.favoriten_liste); //Set the layout file
        setTitle("Adventskalender 2015"); //Rename the ActionBar Title

        adventscalendarshare();
    }

    public void adventscalendarshare(){
        Button av1 = (Button) findViewById(R.id.av1);
        Button av2 = (Button) findViewById(R.id.av2);
        Button av3 = (Button) findViewById(R.id.av3);
        Button av4 = (Button) findViewById(R.id.av4);
        Button av5 = (Button) findViewById(R.id.av5);
        Button av6 = (Button) findViewById(R.id.av6);
        Button av7 = (Button) findViewById(R.id.av7);
        Button av8 = (Button) findViewById(R.id.av8);
        Button av9 = (Button) findViewById(R.id.av9);
        Button av10 = (Button) findViewById(R.id.av10);
        Button av11 = (Button) findViewById(R.id.av11);
        Button av12 = (Button) findViewById(R.id.av12);
        Button av13 = (Button) findViewById(R.id.av13);
        Button av14 = (Button) findViewById(R.id.av14);
        Button av15 = (Button) findViewById(R.id.av15);
        Button av16 = (Button) findViewById(R.id.av16);
        Button av17 = (Button) findViewById(R.id.av17);
        Button av18 = (Button) findViewById(R.id.av18);
        Button av19 = (Button) findViewById(R.id.av19);
        Button av20 = (Button) findViewById(R.id.av20);
        Button av21 = (Button) findViewById(R.id.av21);
        Button av22 = (Button) findViewById(R.id.av22);
        Button av23 = (Button) findViewById(R.id.av23);
        Button av24 = (Button) findViewById(R.id.av24);

        month = ac.get(Calendar.MONTH);
        day = ac.get(Calendar.DAY_OF_MONTH);

        av1.setOnLongClickListener(new View.OnLongClickListener() {
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

                        ins1 = getResources().openRawResource(R.raw.mb_boxen);

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

        av2.setOnLongClickListener(new View.OnLongClickListener() {
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

                    ins1 = getResources().openRawResource(R.raw.ms_hihi);

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

        av3.setOnLongClickListener(new View.OnLongClickListener() {
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

                    ins1 = getResources().openRawResource(R.raw.mb_knappus);

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

        av4.setOnLongClickListener(new View.OnLongClickListener() {
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

                    ins1 = getResources().openRawResource(R.raw.mb_lachflash);

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

        av5.setOnLongClickListener(new View.OnLongClickListener() {
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

                    ins1 = getResources().openRawResource(R.raw.ms_rene);

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

        av6.setOnLongClickListener(new View.OnLongClickListener() {
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

                    ins1 = getResources().openRawResource(R.raw.ks_waaaas2);

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

        av7.setOnLongClickListener(new View.OnLongClickListener() {
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

                    ins1 = getResources().openRawResource(R.raw.mb_kuckuck);

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

        av8.setOnLongClickListener(new View.OnLongClickListener() {
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

                    ins1 = getResources().openRawResource(R.raw.et_lache2);

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

        av9.setOnLongClickListener(new View.OnLongClickListener() {
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

                    ins1 = getResources().openRawResource(R.raw.et_lache3);

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

        av10.setOnLongClickListener(new View.OnLongClickListener() {
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

                    ins1 = getResources().openRawResource(R.raw.et_schonwieder);

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

        av11.setOnLongClickListener(new View.OnLongClickListener() {
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

                    ins1 = getResources().openRawResource(R.raw.et_auto2);

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

        av12.setOnLongClickListener(new View.OnLongClickListener() {
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

                    ins1 = getResources().openRawResource(R.raw.et_indiefresse);

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

        av13.setOnLongClickListener(new View.OnLongClickListener() {
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

                    ins1 = getResources().openRawResource(R.raw.et_baftisch);

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

        av14.setOnLongClickListener(new View.OnLongClickListener() {
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

                    ins1 = getResources().openRawResource(R.raw.et_2euro);

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

        av15.setOnLongClickListener(new View.OnLongClickListener() {
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

                    ins1 = getResources().openRawResource(R.raw.et_ohja);

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

        av16.setOnLongClickListener(new View.OnLongClickListener() {
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

                    ins1 = getResources().openRawResource(R.raw.et_vonhinten2);

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

        av17.setOnLongClickListener(new View.OnLongClickListener() {
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

                    ins1 = getResources().openRawResource(R.raw.et_vonhinten3);

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

        av18.setOnLongClickListener(new View.OnLongClickListener() {
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

                    ins1 = getResources().openRawResource(R.raw.et_hexe);

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

        if(month >= 11 && day >= 19) {
            av19.setOnLongClickListener(new View.OnLongClickListener() {
                public boolean onLongClick(View v) {
                    if (!ordnerfile.exists()) {

                        try {
                            ordnerfile.mkdir();
                        } catch (Exception e) {
                            e.printStackTrace();
                            Toast.makeText(getApplicationContext(), "Error, please try again", Toast.LENGTH_SHORT).show();
                        }
                    }

                    try {

                        ins1 = getResources().openRawResource(R.raw.et_illuminaten);

                        fos = new FileOutputStream(soundfile);

                        while ((zwischenspeicher = ins1.read(byte1)) > 0) {

                            fos.write(byte1, 0, zwischenspeicher);

                        }
                        ins1.close();
                        fos.close();

                    } catch (Exception e) {
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
        }else{
            Toast.makeText(getApplicationContext(), "Es ist noch nicht der 19.12.2015", Toast.LENGTH_SHORT).show();
        }

        if(month >= 11 && day >= 20) {
            av20.setOnLongClickListener(new View.OnLongClickListener() {
                public boolean onLongClick(View v) {
                    if (!ordnerfile.exists()) {

                        try {
                            ordnerfile.mkdir();
                        } catch (Exception e) {
                            e.printStackTrace();
                            Toast.makeText(getApplicationContext(), "Error, please try again", Toast.LENGTH_SHORT).show();
                        }
                    }

                    try {

                        ins1 = getResources().openRawResource(R.raw.et_eeeeeehhhhhh);

                        fos = new FileOutputStream(soundfile);

                        while ((zwischenspeicher = ins1.read(byte1)) > 0) {

                            fos.write(byte1, 0, zwischenspeicher);

                        }
                        ins1.close();
                        fos.close();

                    } catch (Exception e) {
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
        }else{
            Toast.makeText(getApplicationContext(), "Es ist noch nicht der 20.12.2015", Toast.LENGTH_SHORT).show();
        }

        if(month >= 11 && day >= 21) {
            av21.setOnLongClickListener(new View.OnLongClickListener() {
                public boolean onLongClick(View v) {
                    if (!ordnerfile.exists()) {

                        try {
                            ordnerfile.mkdir();
                        } catch (Exception e) {
                            e.printStackTrace();
                            Toast.makeText(getApplicationContext(), "Error, please try again", Toast.LENGTH_SHORT).show();
                        }
                    }

                    try {

                        ins1 = getResources().openRawResource(R.raw.et_krank);

                        fos = new FileOutputStream(soundfile);

                        while ((zwischenspeicher = ins1.read(byte1)) > 0) {

                            fos.write(byte1, 0, zwischenspeicher);

                        }
                        ins1.close();
                        fos.close();

                    } catch (Exception e) {
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
        }else{
            Toast.makeText(getApplicationContext(), "Es ist noch nicht der 21.12.2015", Toast.LENGTH_SHORT).show();
        }

        if(month >= 11 && day >= 22) {
            av22.setOnLongClickListener(new View.OnLongClickListener() {
                public boolean onLongClick(View v) {
                    if (!ordnerfile.exists()) {

                        try {
                            ordnerfile.mkdir();
                        } catch (Exception e) {
                            e.printStackTrace();
                            Toast.makeText(getApplicationContext(), "Error, please try again", Toast.LENGTH_SHORT).show();
                        }
                    }

                    try {

                        ins1 = getResources().openRawResource(R.raw.et_fettesau);

                        fos = new FileOutputStream(soundfile);

                        while ((zwischenspeicher = ins1.read(byte1)) > 0) {

                            fos.write(byte1, 0, zwischenspeicher);

                        }
                        ins1.close();
                        fos.close();

                    } catch (Exception e) {
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
        }else{
            Toast.makeText(getApplicationContext(), "Es ist noch nicht der 22.12.2015", Toast.LENGTH_SHORT).show();
        }

        if(month >= 11 && day >= 23) {
            av23.setOnLongClickListener(new View.OnLongClickListener() {
                public boolean onLongClick(View v) {
                    if (!ordnerfile.exists()) {

                        try {
                            ordnerfile.mkdir();
                        } catch (Exception e) {
                            e.printStackTrace();
                            Toast.makeText(getApplicationContext(), "Error, please try again", Toast.LENGTH_SHORT).show();
                        }
                    }

                    try {

                        ins1 = getResources().openRawResource(R.raw.et_hintermir);

                        fos = new FileOutputStream(soundfile);

                        while ((zwischenspeicher = ins1.read(byte1)) > 0) {

                            fos.write(byte1, 0, zwischenspeicher);

                        }
                        ins1.close();
                        fos.close();

                    } catch (Exception e) {
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
        }else{
            Toast.makeText(getApplicationContext(), "Es ist noch nicht der 23.12.2015", Toast.LENGTH_SHORT).show();
        }

        if(month >= 11 && day >= 24) {
            av24.setOnLongClickListener(new View.OnLongClickListener() {
                public boolean onLongClick(View v) {
                    if (!ordnerfile.exists()) {

                        try {
                            ordnerfile.mkdir();
                        } catch (Exception e) {
                            e.printStackTrace();
                            Toast.makeText(getApplicationContext(), "Error, please try again", Toast.LENGTH_SHORT).show();
                        }
                    }

                    try {

                        ins1 = getResources().openRawResource(R.raw.et_codhurensohn);

                        fos = new FileOutputStream(soundfile);

                        while ((zwischenspeicher = ins1.read(byte1)) > 0) {

                            fos.write(byte1, 0, zwischenspeicher);

                        }
                        ins1.close();
                        fos.close();

                    } catch (Exception e) {
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
        }else{
            Toast.makeText(getApplicationContext(), "Es ist noch nicht Weihnachten", Toast.LENGTH_SHORT).show();
        }
    }

    public void adv1(View view){
        month = ac.get(Calendar.MONTH);
        day = ac.get(Calendar.DAY_OF_MONTH);

        if(month >= 11 && day >= 1){
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Favoriten.this, R.raw.mb_boxen); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }else
        {
            Toast.makeText(getApplicationContext(), "Es ist noch nicht der 01.12.2015", Toast.LENGTH_SHORT).show();
        }
    }
    public void adv2(View view){
        month = ac.get(Calendar.MONTH);
        day = ac.get(Calendar.DAY_OF_MONTH);

        if(month >= 11 && day >= 2){
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Favoriten.this, R.raw.ms_hihi); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }else
        {
            Toast.makeText(getApplicationContext(), "Es ist noch nicht der 02.12.2015", Toast.LENGTH_SHORT).show();
        }
    }
    public void adv3(View view){
        month = ac.get(Calendar.MONTH);
        day = ac.get(Calendar.DAY_OF_MONTH);

        if(month >= 11 && day >= 3){
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Favoriten.this, R.raw.mb_knappus); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }else
        {
            Toast.makeText(getApplicationContext(), "Es ist noch nicht der 03.12.2015", Toast.LENGTH_SHORT).show();
        }
    }
    public void adv4(View view){
        month = ac.get(Calendar.MONTH);
        day = ac.get(Calendar.DAY_OF_MONTH);

        if(month >= 11 && day >= 4){
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Favoriten.this, R.raw.mb_lachflash); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }else
        {
            Toast.makeText(getApplicationContext(), "Es ist noch nicht der 04.12.2015", Toast.LENGTH_SHORT).show();
        }
    }
    public void adv5(View view){
        month = ac.get(Calendar.MONTH);
        day = ac.get(Calendar.DAY_OF_MONTH);

        if(month >= 11 && day >= 5){
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Favoriten.this, R.raw.ms_rene); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }else
        {
            Toast.makeText(getApplicationContext(), "Es ist noch nicht der 05.12.2015", Toast.LENGTH_SHORT).show();
        }
    }
    public void adv6(View view){
        month = ac.get(Calendar.MONTH);
        day = ac.get(Calendar.DAY_OF_MONTH);

        if(month >= 11 && day >= 6){
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Favoriten.this, R.raw.ks_waaaas2); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }else
        {
            Toast.makeText(getApplicationContext(), "Es ist noch nicht der 06.12.2015", Toast.LENGTH_SHORT).show();
        }
    }
    public void adv7(View view){
        month = ac.get(Calendar.MONTH);
        day = ac.get(Calendar.DAY_OF_MONTH);

        if(month >= 11 && day >= 7){
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Favoriten.this, R.raw.mb_kuckuck); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }else
        {
            Toast.makeText(getApplicationContext(), "Es ist noch nicht der 07.12.2015", Toast.LENGTH_SHORT).show();
        }
    }
    public void adv8(View view){
        month = ac.get(Calendar.MONTH);
        day = ac.get(Calendar.DAY_OF_MONTH);

        if(month >= 11 && day >= 8){
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Favoriten.this, R.raw.et_lache2); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }else
        {
            Toast.makeText(getApplicationContext(), "Es ist noch nicht der 08.12.2015", Toast.LENGTH_SHORT).show();
        }
    }
    public void adv9(View view){
        month = ac.get(Calendar.MONTH);
        day = ac.get(Calendar.DAY_OF_MONTH);

        if(month >= 11 && day >= 9){
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Favoriten.this, R.raw.et_lache3); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }else
        {
            Toast.makeText(getApplicationContext(), "Es ist noch nicht der 09.12.2015", Toast.LENGTH_SHORT).show();
        }
    }
    public void adv10(View view){
        month = ac.get(Calendar.MONTH);
        day = ac.get(Calendar.DAY_OF_MONTH);

        if(month >= 11 && day >= 10){
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Favoriten.this, R.raw.et_schonwieder); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }else
        {
            Toast.makeText(getApplicationContext(), "Es ist noch nicht der 10.12.2015", Toast.LENGTH_SHORT).show();
        }
    }
    public void adv11(View view){
        month = ac.get(Calendar.MONTH);
        day = ac.get(Calendar.DAY_OF_MONTH);

        if(month >= 11 && day >= 11){
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Favoriten.this, R.raw.et_auto2); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }else
        {
            Toast.makeText(getApplicationContext(), "Es ist noch nicht der 11.12.2015", Toast.LENGTH_SHORT).show();
        }
    }
    public void adv12(View view){
        month = ac.get(Calendar.MONTH);
        day = ac.get(Calendar.DAY_OF_MONTH);

        if(month >= 11 && day >= 12){
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Favoriten.this, R.raw.et_indiefresse); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }else
        {
            Toast.makeText(getApplicationContext(), "Es ist noch nicht der 12.12.2015", Toast.LENGTH_SHORT).show();
        }
    }
    public void adv13(View view){
        month = ac.get(Calendar.MONTH);
        day = ac.get(Calendar.DAY_OF_MONTH);

        if(month >= 11 && day >= 13){
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Favoriten.this, R.raw.et_baftisch); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }else
        {
            Toast.makeText(getApplicationContext(), "Es ist noch nicht der 13.12.2015", Toast.LENGTH_SHORT).show();
        }
    }
    public void adv14(View view){
        month = ac.get(Calendar.MONTH);
        day = ac.get(Calendar.DAY_OF_MONTH);

        if(month >= 11 && day >= 14){
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Favoriten.this, R.raw.et_2euro); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }else
        {
            Toast.makeText(getApplicationContext(), "Es ist noch nicht der 14.12.2015", Toast.LENGTH_SHORT).show();
        }
    }
    public void adv15(View view){
        month = ac.get(Calendar.MONTH);
        day = ac.get(Calendar.DAY_OF_MONTH);

        if(month >= 11 && day >= 15){
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Favoriten.this, R.raw.et_ohja); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }else
        {
            Toast.makeText(getApplicationContext(), "Es ist noch nicht der 15.12.2015", Toast.LENGTH_SHORT).show();
        }
    }
    public void adv16(View view){
        month = ac.get(Calendar.MONTH);
        day = ac.get(Calendar.DAY_OF_MONTH);

        if(month >= 11 && day >= 16){
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Favoriten.this, R.raw.et_vonhinten2); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }else
        {
            Toast.makeText(getApplicationContext(), "Es ist noch nicht der 16.12.2015", Toast.LENGTH_SHORT).show();
        }
    }
    public void adv17(View view){
        month = ac.get(Calendar.MONTH);
        day = ac.get(Calendar.DAY_OF_MONTH);

        if(month >= 11 && day >= 17){
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Favoriten.this, R.raw.et_vonhinten3); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }else
        {
            Toast.makeText(getApplicationContext(), "Es ist noch nicht der 17.12.2015", Toast.LENGTH_SHORT).show();
        }
    }
    public void adv18(View view){
        month = ac.get(Calendar.MONTH);
        day = ac.get(Calendar.DAY_OF_MONTH);

        if(month >= 11 && day >= 18){
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Favoriten.this, R.raw.et_hexe); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }else
        {
            Toast.makeText(getApplicationContext(), "Es ist noch nicht der 18.12.2015", Toast.LENGTH_SHORT).show();
        }
    }
    public void adv19(View view){
        month = ac.get(Calendar.MONTH);
        day = ac.get(Calendar.DAY_OF_MONTH);

        if(month >= 11 && day >= 19){
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Favoriten.this, R.raw.et_illuminaten); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }else
        {
            Toast.makeText(getApplicationContext(), "Es ist noch nicht der 19.12.2015", Toast.LENGTH_SHORT).show();
        }
    }
    public void adv20(View view){
        month = ac.get(Calendar.MONTH);
        day = ac.get(Calendar.DAY_OF_MONTH);

        if(month >= 11 && day >= 20){
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Favoriten.this, R.raw.et_eeeeeehhhhhh); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }else
        {
            Toast.makeText(getApplicationContext(), "Es ist noch nicht der 20.12.2015", Toast.LENGTH_SHORT).show();
        }
    }
    public void adv21(View view){
        month = ac.get(Calendar.MONTH);
        day = ac.get(Calendar.DAY_OF_MONTH);

        if(month >= 11 && day >= 21){
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Favoriten.this, R.raw.et_krank); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }else
        {
            Toast.makeText(getApplicationContext(), "Es ist noch nicht der 21.12.2015", Toast.LENGTH_SHORT).show();
        }
    }
    public void adv22(View view){
        month = ac.get(Calendar.MONTH);
        day = ac.get(Calendar.DAY_OF_MONTH);

        if(month >= 11 && day >= 22){
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Favoriten.this, R.raw.et_fettesau); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }else
        {
            Toast.makeText(getApplicationContext(), "Es ist noch nicht der 22.12.2015", Toast.LENGTH_SHORT).show();
        }
    }
    public void adv23(View view){
        month = ac.get(Calendar.MONTH);
        day = ac.get(Calendar.DAY_OF_MONTH);

        if(month >= 11 && day >= 23){
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Favoriten.this, R.raw.et_hintermir); //Method to start the MediaPlayer with the selected Sound
            mp.start();
        }else
        {
            Toast.makeText(getApplicationContext(), "Es ist noch nicht der 23.12.2015", Toast.LENGTH_SHORT).show();
        }
    }
    public void adv24(View view){
        month = ac.get(Calendar.MONTH);
        day = ac.get(Calendar.DAY_OF_MONTH);

        if(month >= 11 && day >= 24){
            mp.reset();
            mp = MediaPlayer.create(com.eastereggdev.jonathan.TubeButtons.Favoriten.this, R.raw.et_codhurensohn); //Method to start the MediaPlayer with the selected Sound
            mp.start();
            Toast.makeText(getApplicationContext(), "Frohe Weihnachten und viel Spaß mit den Weihnachts Noobs!! :)", Toast.LENGTH_SHORT).show();
        }else
        {
            Toast.makeText(getApplicationContext(), "Es ist noch nicht Weihnachten!", Toast.LENGTH_SHORT).show();
        }
    }



}
