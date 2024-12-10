package com.example.a033gridconbotones;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button[] buttons = new Button[24];
    private Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridLayout gridLayout = findViewById(R.id.gridLayout);
        Button resetButton = findViewById(R.id.resetButton);

        // Crear 24 botones dinámicamente
        for (int i = 0; i < 24; i++) {
            Button button = new Button(this);
            button.setText(generateRandomLetter());
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    button.setText("77");
                }
            });
            buttons[i] = button;
            gridLayout.addView(button);
        }

        // Configurar botón RESET
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (Button button : buttons) {
                    button.setText(generateRandomLetter());
                }
            }
        });
    }

    // Método para generar una letra aleatoria entre G y S
    private String generateRandomLetter() {
        char randomLetter = (char) (random.nextInt('S' - 'G' + 1) + 'G');
        return String.valueOf(randomLetter);
    }
}


