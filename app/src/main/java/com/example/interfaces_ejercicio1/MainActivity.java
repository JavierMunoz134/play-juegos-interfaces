package com.example.interfaces_ejercicio1;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button jugador1 = findViewById(R.id.button1);
        jugador1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lanzarNewPlayer();
            }
        });

        Button preferencesButton = findViewById(R.id.button2);
        preferencesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lanzar la actividad PreferencesActivity
                Intent intent = new Intent(MainActivity.this, PreferencesActivity.class);
                startActivity(intent);
            }
        });

        Button botonJugar = findViewById(R.id.button);
        botonJugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GamesActivity.class);
                startActivity(intent);
            }
        });
    }

    private void lanzarNewPlayer() {
        Intent intent = new Intent(this, NewPlayer.class);
        startActivity(intent);
    }

    private void showFilterDialog() {
        View view = getLayoutInflater().inflate(R.layout.filter_layout, null);
        BottomSheetDialog dialog = new BottomSheetDialog(this);
        dialog.setContentView(view);
        dialog.show();
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
    }
}
