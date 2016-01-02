package com.eastereggdev.jonathan.TubeButtons;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.RemoteViews;

import com.example.jonathan.TubeButtons.R;

import java.util.Random;

import static android.media.MediaPlayer.*;


public class Widget extends AppWidgetProvider {

    final String RUMBLEBUTTON = "hsdjifafdak";
    int rumNum;
    private MediaPlayer mp = new MediaPlayer();

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {

        Intent rumbleIntent = new Intent(context, Favoriten.class);
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_layout);
        PendingIntent rumblePendingIntent = PendingIntent.getActivity(context, 0, rumbleIntent, 0);


        remoteViews.setOnClickPendingIntent(R.id.advWidget, rumblePendingIntent);
        remoteViews.setOnClickPendingIntent(R.id.rumbleWidget, rumble(context, RUMBLEBUTTON));
        appWidgetManager.updateAppWidget(appWidgetIds, remoteViews);



        super.onUpdate(context, appWidgetManager, appWidgetIds);
    }


    @Override
    public void onReceive(Context context, Intent intent) {

        if(intent.getAction().toString() == RUMBLEBUTTON) {

        }
        super.onReceive(context, intent);
    }


    public PendingIntent rumble(Context context, String stringAction)
    {
        Intent rumble = new Intent(context, Widget.class);
        rumble.setAction(stringAction);

        return PendingIntent.getBroadcast(context, 0, rumble, 0);
    }


}
