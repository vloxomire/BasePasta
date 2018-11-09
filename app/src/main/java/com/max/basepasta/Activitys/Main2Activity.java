

package com.max.basepasta.Activitys;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.max.basepasta.Listener.ListenerLista;
import com.max.basepasta.R;

public class Main2Activity extends AppCompatActivity {
    private TextView editTuMasa,editTuEstado,editTuPesoIdeal,editTuRiesgo;
    private Button guardarSql, listaSql;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editTuMasa = findViewById(R.id.editTuMasa);
        editTuEstado = findViewById(R.id.editTuEstado);
        editTuPesoIdeal = findViewById(R.id.editTuPesoIdeal);
        editTuRiesgo = findViewById(R.id.editTuRiesgo);
        guardarSql= findViewById(R.id.guardarSql);
        listaSql= findViewById(R.id.listaSql);

        ListenerLista listenerLista= new ListenerLista(this);
        listaSql.setOnClickListener(listenerLista);


        SharedPreferences sharedPreferences = getSharedPreferences("miShared", Context.MODE_PRIVATE);

        String masa =  sharedPreferences.getString("value","");
        String estado = sharedPreferences.getString("status","");
        String pesoIdeal = sharedPreferences.getString("ideal_weight","");
        String riesgo = sharedPreferences.getString("risk","");

        editTuMasa.setText(masa);
        editTuEstado.setText(estado);
        editTuPesoIdeal.setText(pesoIdeal);
        editTuRiesgo.setText(riesgo);
    }
}
