package com.max.basepasta.Listener;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.max.basepasta.Activitys.Main3Activity;

public class ListenerLista implements View.OnClickListener {
    private Context context;

    public ListenerLista(Context context) {
        this.context = context;
    }

    @Override
    public void onClick(View view) {
        Intent listaIntent = new Intent(context ,Main3Activity.class);
        context.startActivity(listaIntent);
    }
}
