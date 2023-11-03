package com.example.interfaces_ejercicio1;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.RatingBar;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class PreferencesActivity extends AppCompatActivity {
    private RadioGroup radioGroup;
    private SeekBar seekBar;
    private RatingBar ratingBar;
    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preferences);

        radioGroup = findViewById(R.id.radioGroup);
        seekBar = findViewById(R.id.seekBar);
        ratingBar = findViewById(R.id.ratingBar);
        fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedGameId = radioGroup.getCheckedRadioButtonId();
                RadioButton selectedGameButton = findViewById(selectedGameId);
                String selectedGameText = selectedGameButton != null ? selectedGameButton.getText().toString() : "Ningún juego seleccionado";
                int seekBarProgress = seekBar.getProgress();
                float ratingBarRating = ratingBar.getRating();

                String message = selectedGameText ;
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
            }
        });
    }
}


