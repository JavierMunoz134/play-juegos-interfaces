package com.example.interfaces_ejercicio1;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class GamesActivity extends AppCompatActivity {
    private CheckBox checkBoxRadiantDefense;
    private CheckBox checkBoxPocketSoccer;
    private CheckBox checkBoxAngryBirds;
    private CheckBox checkBoxNinJump;
    private CheckBox checkBoxAirControl;
    private CheckBox checkBoxDragonFly;
    private CheckBox checkBoxHillClimbingRacing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.games);

        checkBoxRadiantDefense = findViewById(R.id.checkBoxRadiantDefense);
        checkBoxPocketSoccer = findViewById(R.id.checkBoxPocketSoccer);
        checkBoxAngryBirds = findViewById(R.id.checkBoxAngryBirds);
        checkBoxNinJump = findViewById(R.id.checkBoxNinJump);
        checkBoxAirControl = findViewById(R.id.checkBoxAirControl);
        checkBoxDragonFly = findViewById(R.id.checkBoxDragonFly);
        checkBoxHillClimbingRacing = findViewById(R.id.checkBoxHillClimbingRacing);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrarOpcionesSeleccionadas();
            }
        });
    }

    private void mostrarOpcionesSeleccionadas() {
        StringBuilder selectedGames = new StringBuilder("Juegos seleccionados: ");

        if (checkBoxRadiantDefense.isChecked()) {
            selectedGames.append("Radiant Defense, ");
        }
        if (checkBoxPocketSoccer.isChecked()) {
            selectedGames.append("Pocket Soccer, ");
        }
        if (checkBoxAngryBirds.isChecked()) {
            selectedGames.append("Angry Birds, ");
        }
        if (checkBoxNinJump.isChecked()) {
            selectedGames.append("NinJump, ");
        }
        if (checkBoxAirControl.isChecked()) {
            selectedGames.append("Air Control, ");
        }
        if (checkBoxDragonFly.isChecked()) {
            selectedGames.append("Dragon Fly, ");
        }
        if (checkBoxHillClimbingRacing.isChecked()) {
            selectedGames.append("Hill Climbing Racing, ");
        }

        if (selectedGames.toString().equals("Juegos seleccionados: ")) {
            selectedGames.append("Ningún juego seleccionado");
        }

        Toast.makeText(this, selectedGames.toString(), Toast.LENGTH_LONG).show();
    }
}

