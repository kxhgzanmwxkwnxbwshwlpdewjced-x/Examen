package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Pregunta2 extends AppCompatActivity {
    TextView respuesta2;
    Button radioButton4, radioButton5, radioButton6, atras2, siguiente2, salir2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta2);
        radioButton4 = findViewById(R.id.radioButton4);
        radioButton5 = findViewById(R.id.radioButton5);
        radioButton6 = findViewById(R.id.radioButton6);
        atras2 = findViewById(R.id.atras2);
        siguiente2 = findViewById(R.id.siguiente2);
        salir2 = findViewById(R.id.salir2);

        atras2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("regresarse a la pregunta anterior...");
                PreguntaAnterior();

            }
        });

        siguiente2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("irsea a la pregunta siguiente...");
                SiguientePregunta();
            }
        });

        salir2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("regresarse a las preguntas...");
                RegresarseALasPreguntas();
            }
        });

        respuesta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("mostrar resultado...");
                MostrarResultado();
            }
        });
    }
    private void PreguntaAnterior()
    {
        Intent i= new Intent(this, MainActivitypregunta1.class);
        startActivity(i);
    }

    private void SiguientePregunta()
    {
        Intent i= new Intent(this, Pregunta3.class);
        startActivity(i);
    }

    private void RegresarseALasPreguntas()
    {
        Intent i = new Intent( this, MainActivity.class);
        startActivity(i);
    }

    public void MostrarResultado() {
        TextView textoResultado = (TextView) findViewById(R.id.respuesta1);
        textoResultado.setText("respuesta: Los atributos son los datos y los métodos las funcionalidades ");
    }
}