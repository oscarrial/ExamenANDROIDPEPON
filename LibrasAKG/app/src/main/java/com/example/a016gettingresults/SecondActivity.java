package com.example.a016gettingresults;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    TextView stonesView, librasView, resultadoView;
    Button botonConvertir, botonVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        stonesView = findViewById(R.id.textViewStones);
        librasView = findViewById(R.id.textViewLibras);
        resultadoView = findViewById(R.id.textViewResultado);
        botonConvertir = findViewById(R.id.botonConvertir);
        botonVolver = findViewById(R.id.botonVolver);

        int stones = getIntent().getIntExtra("STONES", 0);
        int libras = getIntent().getIntExtra("LIBRAS", 0);

        stonesView.setText("Stones: " + stones);
        librasView.setText("Libras: " + libras);

        botonConvertir.setOnClickListener(v -> {
            double resultadoKg = stones * 6.35 + libras * 0.453;
            resultadoView.setText(String.format("Resultado: %.3f Kg", resultadoKg));
        });

        botonVolver.setOnClickListener(v -> {
            Intent returnIntent = new Intent();
            returnIntent.putExtra(MainActivity.REQUEST_RESULT, resultadoView.getText().toString());
            setResult(RESULT_OK, returnIntent);
            finish();
        });
    }
}
