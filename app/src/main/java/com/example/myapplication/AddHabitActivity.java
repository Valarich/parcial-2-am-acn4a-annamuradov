package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddHabitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_habit);

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

        EditText inputHabito = findViewById(R.id.inputHabito);
        Button btnGuardarHabito = findViewById(R.id.btnGuardarHabito);

        btnGuardarHabito.setOnClickListener(v -> {
            String textoHabito = inputHabito.getText().toString().trim();

            if (textoHabito.isEmpty()) {
                Toast.makeText(this, "Escribí un hábito primero", Toast.LENGTH_SHORT).show();
                return;
            }

            Intent intent = new Intent(AddHabitActivity.this, MainActivity.class);
            intent.putExtra("nuevo_habito", textoHabito);
            startActivity(intent);
            finish();
        });
    }
}