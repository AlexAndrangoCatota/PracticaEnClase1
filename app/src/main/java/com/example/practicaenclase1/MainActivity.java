package com.example.practicaenclase1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    RadioButton radioMasculino, RarioFemenino;
    String genero= "Masculino";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void btEnviar(View view) {
            //Creamos el Intent
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);

            EditText txtNombre = (EditText) findViewById(R.id.txtNombre);
            EditText txtFecha = (EditText) findViewById(R.id.txtFecha);
            EditText txtTelefono = (EditText) findViewById(R.id.txtTelefono);

            radioMasculino = (RadioButton) findViewById(R.id.radioMasculino);
            RarioFemenino = (RadioButton) findViewById(R.id.RarioFemenino);




            //Creamos la información a pasar entre actividades - Pares Key-Value
            Bundle b = new Bundle();
            b.putString("NOMBRE", txtNombre.getText().toString());
            b.putString("Fecha", txtFecha.getText().toString());
            b.putString("telefono", txtTelefono.getText().toString());

            if (radioMasculino.isChecked()){
                 genero= "Masculino";

            }
            else {
                 genero= "Femenino";
            }
            b.putString("genero", genero);
            //b.putString("RarioFemenino", RarioFemenino.getText().toString());
            //b.putString("radioMasculino", radioMasculino.getText().toString());


            //Añadimos la información al intent
            intent.putExtras(b);
            // Iniciamos la nueva actividad
            startActivity(intent);
            //Nota: presionar alt+enter para importar las librerias

        }
//Fin del cod


    }