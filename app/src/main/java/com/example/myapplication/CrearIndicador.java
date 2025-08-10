package com.example.myapplication;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;


public class CrearIndicador extends AppCompatActivity {

    ArrayAdapter<Indicador> ADAPTADOR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // inicializa la lógica de la clase base
        setContentView(R.layout.activity_crearindicador); // carga el diseño XML

        Toolbar toolbar = findViewById(R.id.mi_toolbarcrein);
        setSupportActionBar(toolbar);

        ListView LISTVIEW = findViewById(R.id.listviewindicadores);
        ADAPTADOR = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Panelcrecionindicador.lista_indicadores);
        LISTVIEW.setAdapter(ADAPTADOR);

    }

    @Override
    protected void onResume() {
        super.onResume();
        ADAPTADOR.notifyDataSetChanged();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menu_crearindicador) {
            Intent intent = new Intent(CrearIndicador.this, Panelcrecionindicador.class);
            startActivity(intent);
            return true;
        } else if (item.getItemId() == R.id.menu_eliminarindicador) {
            Toast.makeText(this, "Guardar presionado", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);

        }
    }



