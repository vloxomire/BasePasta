package com.max.basepasta.Activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.max.basepasta.R;

public class Main3Activity extends AppCompatActivity {
    ListView listaVista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        listaVista=findViewById(R.id.listaSql);
    }
}
