package com.example.practicaenclase1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Localizar los controles
        TextView txtSaludo = (TextView)findViewById(R.id.txtSaludo);
        TextView txtFechanaci = (TextView)findViewById(R.id.txtFechanaci);
        TextView txtTelefo = (TextView)findViewById(R.id.txtTelefo);

        TextView txtGenbero = (TextView)findViewById(R.id.txtGenbero);

        // //Recuperamos la información pasada en el intent
        Bundle bundle = this.getIntent().getExtras();
        // Construimos el mensaje a mostrar
        txtSaludo.setText("Hola!, Bienvenido \n " + bundle.getString("NOMBRE"));
        txtFechanaci.setText("fecha de nacimiento \n " + bundle.getString("Fecha"));
        txtTelefo.setText("Número de teléfono \n " + bundle.getString("telefono"));

        txtGenbero.setText("Género \n " + bundle.getString("genero"));
        //txtGenbero.setText("Género \n " + bundle.getString("RarioFemenino"));
        //txtGenbero.setText("Género \n " + bundle.getString("radioMasculino"));






    }
}