package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // inicializa la lógica de la clase base
        setContentView(R.layout.activity_main); // carga el diseño XML

// Aquí conectas y configuras botones, textos, lógica
        // Se declaran los botones
        Button crein = findViewById(R.id.crein);
        Button creru = findViewById(R.id.creru);
        Button usarru = findViewById(R.id.usarru);

        // Se asignan funciones a botones
        crein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CrearIndicador.class);
                startActivity(intent);
            } });
        creru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//Funcion del boton
            } });
        usarru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//Funcion del boton
            } });

    }
}
