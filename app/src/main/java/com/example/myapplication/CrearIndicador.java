package com.example.myapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;


public class CrearIndicador extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // inicializa la lógica de la clase base
        setContentView(R.layout.activity_crearindicador); // carga el diseño XML

        Toolbar toolbar = findViewById(R.id.mi_toolbarcrein);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menucrein, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menu_crearindicador) {
            Toast.makeText(this, "Buscar presionado", Toast.LENGTH_SHORT).show();
            return true;
        } else if (item.getItemId() == R.id.menu_eliminarindicador) {
            Toast.makeText(this, "Guardar presionado", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);

        }
    }


