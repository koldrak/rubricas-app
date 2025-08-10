package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Panelcrecionindicador extends AppCompatActivity  {
int numero_nota = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // inicializa la lógica de la clase base
        setContentView(R.layout.activity_main); // carga el diseño XML
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

                Indicador numero_nota = new Indicador(Snombre, Slogrado, Smedianamente, Snologrado);
            }
        });

    }
}

