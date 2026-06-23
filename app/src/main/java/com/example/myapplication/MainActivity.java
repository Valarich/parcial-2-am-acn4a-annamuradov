package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final ArrayList<String> habitosGuardados = new ArrayList<>();
    private static boolean listaInicializada = false;

    private LinearLayout listaHabitos;
    private TextView txtTotalHabitos;
    private TextView txtListaVacia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(
                    systemBars.left + 24,
                    systemBars.top + 24,
                    systemBars.right + 24,
                    systemBars.bottom + 24
            );
            return insets;
        });

        Button btnAgregarHabito = findViewById(R.id.btnAgregarHabito);
        Button btnLimpiarHabitos = findViewById(R.id.btnLimpiarHabitos);
        listaHabitos = findViewById(R.id.listaHabitos);
        txtTotalHabitos = findViewById(R.id.txtTotalHabitos);
        txtListaVacia = findViewById(R.id.txtListaVacia);

        if (!listaInicializada) {
            habitosGuardados.add("tomar agua");
            habitosGuardados.add("leer 10 minutos");
            habitosGuardados.add("caminar");
            habitosGuardados.add("dormir 8 horas");
            listaInicializada = true;
        }

        String nuevoHabito = getIntent().getStringExtra("nuevo_habito");

        if (nuevoHabito != null && !nuevoHabito.isEmpty()) {
            habitosGuardados.add(nuevoHabito);
        }

        mostrarHabitos();

        btnAgregarHabito.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, AddHabitActivity.class);
            startActivity(intent);
        });

        btnLimpiarHabitos.setOnClickListener(v -> {
            habitosGuardados.clear();
            mostrarHabitos();
        });
    }

    private void mostrarHabitos() {
        listaHabitos.removeAllViews();

        txtTotalHabitos.setText(getString(R.string.texto_total_habitos, habitosGuardados.size()));

        if (habitosGuardados.isEmpty()) {
            txtListaVacia.setVisibility(View.VISIBLE);
            return;
        }

        txtListaVacia.setVisibility(View.GONE);

        for (int i = 0; i < habitosGuardados.size(); i++) {
            TextView nuevoHabito = new TextView(this);
            nuevoHabito.setText(getString(R.string.formato_habito, i + 1, habitosGuardados.get(i)));
            nuevoHabito.setTextSize(getResources().getDimension(R.dimen.habito_texto) / getResources().getDisplayMetrics().scaledDensity);

            int margenChico = getResources().getDimensionPixelSize(R.dimen.margen_chico);
            nuevoHabito.setPadding(0, margenChico, 0, margenChico);

            listaHabitos.addView(nuevoHabito);
        }
    }
}