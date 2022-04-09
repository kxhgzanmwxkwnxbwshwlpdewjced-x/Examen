package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Pregunta4 extends AppCompatActivity {
    TextView respuesta4;
    Button radioButton10, radioButton11, radioButton12, atras4, siguiente4, salir4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta4);
        radioButton10 = findViewById(R.id.radioButton10);
        radioButton11 = findViewById(R.id.radioButton11);
        radioButton12 = findViewById(R.id.radioButton12);
        atras4 = findViewById(R.id.atras4);
        siguiente4 = findViewById(R.id.siguiente4);
        salir4 = findViewById(R.id.salir4);

        atras4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("regresarse a la pregunta anterior...");
                PreguntaAnterior();

            }
        });

        siguiente4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("irse a la pregunta siguiente...");
                SiguientePregunta();
            }
        });

        salir4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("regresarse a las preguntas...");
                RegresarseALasPreguntas();
            }
        });

        respuesta4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("mostrar resultado...");
                MostrarResultado();
            }
        });
    }
    private void PreguntaAnterior()
    {
        Intent i= new Intent(this, Pregunta3.class);
        startActivity(i);
    }

    private void SiguientePregunta()
    {
        Intent i= new Intent(this, Pregunta5.class);
        startActivity(i);
    }

    private void RegresarseALasPreguntas()
    {
        Intent i = new Intent( this, MainActivity.class);
        startActivity(i);
    }

    public void MostrarResultado() {
        TextView textoResultado = (TextView) findViewById(R.id.respuesta1);
        textoResultado.setText("respuesta: Es una plantilla para crear objetos ");
    }
}