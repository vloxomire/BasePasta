package com.max.basepasta.Activitys;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.widget.RemoteViews;

import com.max.basepasta.R;

public class Widget extends AppWidgetProvider {
    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {

        RemoteViews remote= new RemoteViews(context.getPackageName(),R.layout.widget);
        ComponentName thisWidget  = new ComponentName(context, Widget.class);

        appWidgetManager.updateAppWidget(thisWidget, remote);

    }

    @Override
    public void onDeleted(Context context, int[] appWidgetIds) {

    }

    @Override
    public void onEnabled(Context context) {

    }

    @Override
    public void onDisabled(Context context) {

    }
}
