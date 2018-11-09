package com.max.basepasta.Dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

import com.max.basepasta.Model.ModelMasa;

public class SqlMasaCorporal extends SQLiteOpenHelper {
    private static final String DBNAME="MasaCorporal";
    private static final Integer DBVERSION=1;
    private Context contexto;
    private SQLiteDatabase conectarse;

    public SqlMasaCorporal(@Nullable Context context) {
        super(context, DBNAME, null, DBVERSION);
        this.contexto = contexto;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String query="CREATE TABLE `MasaCorporal` ( `Id` INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE, `Masa Corporal` INTEGER NOT NULL, `fecha y hora` INTEGER NOT NULL )";
        sqLiteDatabase.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        String query="CREATE TABLE `MasaCorporal` ( `Id` INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE, `Masa Corporal` INTEGER NOT NULL, `fecha y hora` INTEGER NOT NULL )";
        sqLiteDatabase.execSQL(query);
    }
    private void conectar(){
        conectarse = getWritableDatabase();
    }
    private void desconectarse(){
        conectarse.close();
    }
}
