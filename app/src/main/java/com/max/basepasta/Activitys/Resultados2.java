

package com.max.basepasta.Activitys;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.max.basepasta.Dao.AdminSQLiteOpenHelper;
import com.max.basepasta.Listener.ListenerLista;
import com.max.basepasta.R;

public class Resultados2 extends AppCompatActivity {
    private TextView editTuMasa,editTuEstado,editTuPesoIdeal,editTuRiesgo;
    private Button bGuardarSql, listaSql;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editTuMasa = findViewById(R.id.editTuMasa);
        editTuEstado = findViewById(R.id.editTuEstado);
        editTuPesoIdeal = findViewById(R.id.editTuPesoIdeal);
        editTuRiesgo = findViewById(R.id.editTuRiesgo);
        bGuardarSql= findViewById(R.id.buttGuardarSql);
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
    public void guardar(View v){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,"MasaCorp",null,1);

        SQLiteDatabase db = admin.getWritableDatabase();

        String masaCV = editTuMasa.getText().toString();
        String estadoCV = editTuEstado.getText().toString();
        String pesoIdealCV = editTuPesoIdeal.getText().toString();
        String riesgoCV = editTuRiesgo.getText().toString();

        ContentValues registroCV= new ContentValues();
        registroCV.put("masa",masaCV);
        registroCV.put("estado",estadoCV);
        registroCV.put("pesoIdeal",pesoIdealCV);
        registroCV.put("riesgo",riesgoCV);

        db.insert("MasaCorporal",null,registroCV);
        db.close();

        editTuMasa.setText("");
        editTuEstado.setText("");
        editTuPesoIdeal.setText("");
        editTuRiesgo.setText("");

        Toast.makeText(this,"Se cargaron los datos...",Toast.LENGTH_LONG).show();
    }
    public void consulta(View v){
        AdminSQLiteOpenHelper Admin = new AdminSQLiteOpenHelper(this,"Masa Corp",null,1);

        SQLiteDatabase db = Admin.getWritableDatabase();

        String masaCV = editTuMasa.getText().toString();
        Cursor fila = db.rawQuery("SELECT Masa Corporal,Estado,Peso Ideal,Riesgo FROM MasaCorporal WHERE =" +masaCV,null);
        if (fila.moveToFirst()){
            editTuEstado.setText(fila.getString(0));
            editTuPesoIdeal.setText(fila.getString(1));
            editTuRiesgo.setText(fila.getString(2));
        } else
            Toast.makeText(this,"No existe dicho valor",Toast.LENGTH_LONG).show();
            db.close();
    }
}
