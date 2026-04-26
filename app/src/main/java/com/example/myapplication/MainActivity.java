package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private int contadorHabitos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left + 24, systemBars.top + 24, systemBars.right + 24, systemBars.bottom + 24);
            return insets;
        });

        Button btnAgregarHabito = findViewById(R.id.btnAgregarHabito);
        LinearLayout listaHabitos = findViewById(R.id.listaHabitos);

        btnAgregarHabito.setOnClickListener(v -> {
            contadorHabitos++;

            TextView nuevoHabito = new TextView(this);
            nuevoHabito.setText("Hábito " + contadorHabitos + ": " + getString(R.string.texto_habito_base));
            nuevoHabito.setTextSize(getResources().getDimension(R.dimen.habito_texto) / getResources().getDisplayMetrics().scaledDensity);
            int margenChico = getResources().getDimensionPixelSize(R.dimen.margen_chico);
            nuevoHabito.setPadding(0, margenChico, 0, margenChico);

            listaHabitos.addView(nuevoHabito);
        });
    }
}