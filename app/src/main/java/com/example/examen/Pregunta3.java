package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Pregunta3 extends AppCompatActivity {
    TextView respuesta3;
    Button radioButton7, radioButton8, radioButton9, atras3, siguiente3, salir3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta3);
        radioButton7 = findViewById(R.id.radioButton7);
        radioButton8 = findViewById(R.id.radioButton8);
        radioButton9 = findViewById(R.id.radioButton9);
        atras3 = findViewById(R.id.atras2);
        siguiente3 = findViewById(R.id.siguiente2);
        salir3 = findViewById(R.id.salir2);

        atras3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("regresarse a la pregunta anterior...");
                PreguntaAnterior();

            }
        });

        siguiente3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("irse a la pregunta siguiente...");
                SiguientePregunta();
            }
        });

        salir3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("regresarse a las preguntas...");
                RegresarseALasPreguntas();
            }
        });

        respuesta3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("mostrar resultado...");
                MostrarResultado();
            }
        });
    }
    private void PreguntaAnterior()
    {
        Intent i= new Intent(this, Pregunta2.class);
        startActivity(i);
    }

    private void SiguientePregunta()
    {
        Intent i= new Intent(this, Pregunta4.class);
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