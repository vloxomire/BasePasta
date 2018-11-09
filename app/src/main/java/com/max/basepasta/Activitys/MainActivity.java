package com.max.basepasta.Activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.max.basepasta.Listener.ListenerCalcular;
import com.max.basepasta.R;

public class MainActivity extends AppCompatActivity {
        private EditText edad,altura,peso;
        private Spinner genero;
        private Button calcular;

        public EditText getEdad() {
            return edad;
        }

        public EditText getAltura() {
            return altura;
        }

        public EditText getPeso() {
            return peso;
        }

        public Spinner getGenero() {
            return genero;
        }


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            peso=findViewById(R.id.Id_Peso);
            altura=findViewById(R.id.Id_Altura);
            genero=findViewById(R.id.genero);
            edad=findViewById(R.id.Id_Edad);
            calcular=findViewById(R.id.Id_calcular);

            //Listener
            ListenerCalcular listCalcular=new ListenerCalcular(this);
            calcular.setOnClickListener(listCalcular);
    }
}
