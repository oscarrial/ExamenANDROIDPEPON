package com.example.a016gettingresults;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    public static final String REQUEST_RESULT = "REQUEST_RESULT";
    Button boton;
    EditText libras;
    EditText stones;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = findViewById(R.id.botong);
        libras = findViewById(R.id.librasx);
        stones = findViewById(R.id.stonest);
        resultado = findViewById(R.id.resultado);

        boton.setOnClickListener(v -> {
            int lbs = Integer.parseInt(libras.getText().toString());
            int stn = Integer.parseInt(stones.getText().toString());

            if (lbs > 13) {
                libras.setError("Las libras deben ser menores o iguales a 13");
                return;
            }

            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra("STONES", stn);
            intent.putExtra("LIBRAS", lbs);
            startActivityForResult(intent, 1);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == RESULT_OK && data != null) {
            resultado.setText(data.getStringExtra(REQUEST_RESULT));
        }
    }
}
