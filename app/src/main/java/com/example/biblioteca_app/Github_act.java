package com.example.biblioteca_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

import press.precio;

public class Github_act extends AppCompatActivity {
    public Spinner spin;
    public TextView edition;
    public Button mos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        spin = (Spinner) findViewById(R.id.produc);
        edition = (TextView) findViewById(R.id.et3);
        mos = (Button) findViewById(R.id.muestra);

        ArrayList<String> listaproductos = (ArrayList<String>) getIntent().getSerializableExtra("listado");
        ArrayAdapter<String> adapt = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaproductos);
        spin.setAdapter(adapt);

        mos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String productos = spin.getSelectedItem().toString();

                precio precio = new precio();

                if (productos.equals("Farenheith")) {
                    edition.setText("El valor de Farenheith es: " + precio.getFarenheith());
                }
                if (productos.equals("Revival")) {
                    edition.setText("El valor de Revival es: " + precio.getRevival());
                }
                if (productos.equals("El Alquimista")) {
                    edition.setText("El valor de El Alquimista es: " + precio.getEl_Alquimista());
                }
                //comandos de los nuevos libros
                if (productos.equals("El Poder")) {
                    edition.setText("El valor de El Poder es: " + precio.getEl_Poder());
                }
                if (productos.equals("Despertar")) {
                    edition.setText("El valor de Despertar es: " + precio.getDespertar());
                }



            }
        });
    }
}






