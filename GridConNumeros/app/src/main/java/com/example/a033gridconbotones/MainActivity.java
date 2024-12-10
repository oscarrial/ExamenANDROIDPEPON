package com.example.a033gridconbotones;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button[] buttons = new Button[20];
    private Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridLayout gridLayout = findViewById(R.id.gridLayout);
        Button resetButton = findViewById(R.id.resetButton);

        // Crear 20 botones dinámicamente
        for (int i = 0; i < 20; i++) {
            Button button = new Button(this);
            button.setText(String.valueOf(random.nextInt(49) + 1));
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    button.setText("RR");
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
                    button.setText(String.valueOf(random.nextInt(49) + 1));
                }
            }
        });
    }
}

