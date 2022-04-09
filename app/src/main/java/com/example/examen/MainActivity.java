package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView examen;
    Button boton1;
    Button boton2;
    Button boton3;
    Button boton4;
    Button boton5;
    Button boton6;
    Button salir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton1 = findViewById(R.id.boton1);
        boton2 = findViewById(R.id.boton2);
        boton3 = findViewById(R.id.boton3);
        boton4 = findViewById(R.id.boton4);
        boton5 = findViewById(R.id.boton5);
        boton6 = findViewById(R.id.boton6);
        salir = findViewById(R.id.salir);
        examen = findViewById(R.id.examen);


        examen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
            }
        });

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("contesta la pregunta uno...");
                ContestarPreguntaUno();
            }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("contesta la pregunta dos...");
                ContestarPreguntaDos();
            }
        });

        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Contesta la pregunta 3");
                ContestarPreguntaTres();
                finish();
            }
        });
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Contesta la pregunta cuatro..");
                ContestarPreguntaCuatro();
            }
        });

        boton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Contesta la pregunta cinco...");
                ContestarPreguntaCinco();
            }
        });

        boton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Contesta la pregunta seis...");
                ContestarPreguntaSeis();
            }
        });

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void ContestarPreguntaUno()
    {
        Intent i = new Intent(this, MainActivitypregunta1.class);
        startActivity(i);
    }

    private void ContestarPreguntaDos()
    {
        Intent i = new Intent(this, Pregunta2.class);
        startActivity(i);
    }

    private void ContestarPreguntaTres()
    {
        Intent i = new Intent(this, Pregunta3.class);
        startActivity(i);
    }

    private void ContestarPreguntaCuatro()
    {
        Intent i = new Intent(this, Pregunta4.class);
        startActivity(i);
    }
    private void ContestarPreguntaCinco()
    {
        Intent i = new Intent(this, Pregunta5.class);
        startActivity(i);
    }

    private void ContestarPreguntaSeis()
    {
        Intent i = new Intent(this, Pregunta6.class);
        startActivity(i);
    }
}