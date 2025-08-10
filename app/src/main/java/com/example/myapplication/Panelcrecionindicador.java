package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class Panelcrecionindicador extends AppCompatActivity  {
int numero_nota = 0;
    public static final ArrayList<Indicador> lista_indicadores = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // inicializa la lógica de la clase base
        setContentView(R.layout.activity_panelcrecionindicador); // carga el diseño XML
// boton de guardado
        Button boton1 = findViewById(R.id.botonguardarin);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//Funcion del botonm guardar los datos ingresados en los textos
                numero_nota ++;
                EditText campo_nombre = findViewById(R.id.campoNombre);
                EditText campo_logrado = findViewById(R.id.campologrado);
                EditText campo_medianamente = findViewById(R.id.campomedianamente);
                EditText campo_nologrado = findViewById(R.id.camponologrado);

                String Snombre       = campo_nombre.getText().toString().trim();
                String Slogrado      = campo_logrado.getText().toString().trim();
                String Smedianamente = campo_medianamente.getText().toString().trim();
                String Snologrado    = campo_nologrado.getText().toString().trim();

                Indicador nuevo_indicador = new Indicador(Snombre, Slogrado, Smedianamente, Snologrado);
                lista_indicadores.add(nuevo_indicador);

            }
        });

    }
}

