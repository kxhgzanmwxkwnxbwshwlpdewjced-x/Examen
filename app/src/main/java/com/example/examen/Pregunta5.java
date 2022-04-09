package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Pregunta5 extends AppCompatActivity {
    TextView respuesta5;
    Button radioButton13, radioButton14, radioButton15, atras5, siguiente5, salir5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta5);
        radioButton13 = findViewById(R.id.radioButton16);
        radioButton14 = findViewById(R.id.radioButton17);
        radioButton15 = findViewById(R.id.radioButton18);
        atras5 = findViewById(R.id.atras5);
        siguiente5 = findViewById(R.id.siguiente5);
        salir5 = findViewById(R.id.salir5);

        atras5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("regresarse a la pregunta anterior...");
                PreguntaAnterior();

            }
        });

        siguiente5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("irse a la pregunta siguiente...");
                SiguientePregunta();
            }
        });

        salir5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("regresarse a las preguntas...");
                RegresarseALasPreguntas();
            }
        });

        respuesta5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("mostrar resultado...");
                MostrarResultado();
            }
        });
    }
    private void PreguntaAnterior()
    {
        Intent i= new Intent(this, Pregunta4.class);
        startActivity(i);
    }

    private void SiguientePregunta()
    {
        Intent i= new Intent(this, Pregunta6.class);
        startActivity(i);
    }

    private void RegresarseALasPreguntas()
    {
        Intent i = new Intent( this, MainActivity.class);
        startActivity(i);
    }

    public void MostrarResultado() {
        TextView textoResultado = (TextView) findViewById(R.id.respuesta1);
        textoResultado.setText("respuesta: Herencia");
    }
}