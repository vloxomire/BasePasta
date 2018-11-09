package com.max.basepasta.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.max.basepasta.Model.ModelMasa;
import com.max.basepasta.R;

import java.util.ArrayList;

public class AdapterMasa extends BaseAdapter {
    private ArrayList<ModelMasa> masaCorporalModelsArrayList;
    private Context context;

    public AdapterMasa(ArrayList<ModelMasa> masaCorporalModelsArrayList, Context context) {
        this.masaCorporalModelsArrayList = masaCorporalModelsArrayList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return masaCorporalModelsArrayList.size();
    }

    @Override
    public Object getItem(int posicion) {
        return masaCorporalModelsArrayList.get(posicion);
    }

    @Override
    public long getItemId(int posicion) {
        return posicion;
    }

    @Override
    public View getView(int posicion, View view, ViewGroup viewGroup) {
        LayoutInflater miLayoutInflater;
        miLayoutInflater = (LayoutInflater)this.context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view = miLayoutInflater.inflate(R.layout.activity_main3, viewGroup, false);

        return view;
    }
    //Agregar metodos para trabajar la base de datos
}
