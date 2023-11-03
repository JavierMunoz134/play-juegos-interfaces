package com.example.interfaces_ejercicio1;


import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.chip.Chip;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MenuChipsActivity extends AppCompatActivity {

    private FloatingActionButton fab;
    private boolean fabClicked = false;
    private static final int FAB_ANIMATION_DURATION = 5000; // 5 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.filter_layout);

        fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!fabClicked) {
                    // Subir el FAB
                    fab.animate().translationY(-fab.getHeight()).setDuration(FAB_ANIMATION_DURATION);
                    fabClicked = true;

                    // Retrasar la restauración del FAB
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            // Volver a la posición original
                            fab.animate().translationY(0).setDuration(FAB_ANIMATION_DURATION);
                            fabClicked = false;
                        }
                    }, FAB_ANIMATION_DURATION);
                }
            }
        });

        // Obtén referencias a los chips de género
        Chip chipGenreAction = findViewById(R.id.chipGenreAction);
        Chip chipGenreAdventure = findViewById(R.id.chipGenreAdventure);
        Chip chipGenreDeportes = findViewById(R.id.chipGenreDeportes);
        Chip chipGenreDisparos = findViewById(R.id.chipGenreDisparos);
        Chip chipGenreEstrategia = findViewById(R.id.chipGenreEstrategia);
        Chip chipGenreLucha = findViewById(R.id.chipGenreLucha);
        Chip chipGenreMusical = findViewById(R.id.chipGenreMusical);
        Chip chipGenreRol = findViewById(R.id.chipGenreRol);
        Chip chipGenreSimulacion = findViewById(R.id.chipGenreSimulacion);

        // Configura un escuchador para cada chip de género
        chipGenreAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                informarSeleccion("Acción");
            }
        });

        chipGenreAdventure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                informarSeleccion("Aventura");
            }
        });

        chipGenreDeportes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                informarSeleccion("Deportes");
            }
        });

        chipGenreDisparos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                informarSeleccion("Disparos");
            }
        });

        chipGenreEstrategia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                informarSeleccion("Estrategia");
            }
        });

        chipGenreLucha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                informarSeleccion("Lucha");
            }
        });

        chipGenreMusical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                informarSeleccion("Musical");
            }
        });

        chipGenreRol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                informarSeleccion("Rol");
            }
        });

        chipGenreSimulacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                informarSeleccion("Simulación");
            }
        });

        // Repite el proceso para los chips de plataformas
        Chip chipPlatformPS5 = findViewById(R.id.chipPlatformPS5);
        Chip chipPlatformXboxSeriesX = findViewById(R.id.chipPlatformXboxSeriesX);
        Chip chipPlatformPC = findViewById(R.id.chipPlatformPC);
        Chip chipPlatformWii = findViewById(R.id.chipPlatformWii);
        Chip chipPlatformWiiU = findViewById(R.id.chipPlatformWiiU);
        Chip chipPlatform3Ds = findViewById(R.id.chipPlatform3Ds);
        Chip chipPlatformXbox = findViewById(R.id.chipPlatformXbox);

        // Configura un escuchador para cada chip de plataforma
        chipPlatformPS5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                informarSeleccion("PS4");
            }
        });

        chipPlatformXboxSeriesX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                informarSeleccion("Xbox 360");
            }
        });

        chipPlatformPC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                informarSeleccion("PC");
            }
        });

        chipPlatformWii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                informarSeleccion("WII");
            }
        });

        chipPlatformWiiU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                informarSeleccion("WII U");
            }
        });

        chipPlatform3Ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                informarSeleccion("3DS");
            }
        });

        chipPlatformXbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                informarSeleccion("Xbox");
            }
        });
    }

    private void informarSeleccion(String opcionSeleccionada) {
        // Muestra un mensaje con el chip seleccionado
        Toast.makeText(this, opcionSeleccionada, Toast.LENGTH_SHORT).show();
    }
}
