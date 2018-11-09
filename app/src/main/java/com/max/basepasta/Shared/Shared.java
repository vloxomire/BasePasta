package com.max.basepasta.Shared;

import android.content.Context;
import android.content.SharedPreferences;

public class Shared {
    public static void setSharedPrefenceVariables(Context context,String nombre,String valor){
        SharedPreferences shared =context.getSharedPreferences("miShared",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor= shared.edit();
        editor.putString(nombre,valor);
        editor.commit();
    }

}
