package com.example.interfaces_ejercicio1;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class NewPlayer extends AppCompatActivity {
    private Spinner spinnerEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newplayer);
// Inicializa el Spinner
        spinnerEmail = findViewById(R.id.spinnerEmail);

        // Crea una lista de opciones para el Spinner
        String[] opcionesTelefono = {"Teléfono 1", "Teléfono 2", "Teléfono 3", "Teléfono 4"};

        // Crea un ArrayAdapter para el Spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, opcionesTelefono);

        // Establece el diseño del menú desplegable
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Asigna el ArrayAdapter al Spinner
        spinnerEmail.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_buscar) {
            // Manejar la selección de la opción "Buscar" en el menú
            // Abre la actividad con el menú de chips
            Intent intent = new Intent(this, MenuChipsActivity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);

    // Agrega aquí la lógica para realizar la búsqueda si es necesario
}
}
