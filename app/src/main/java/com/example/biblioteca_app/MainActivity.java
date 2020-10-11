package com.example.biblioteca_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progress;
    private Button boton;
    private ImageButton ima;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progress = (ProgressBar) findViewById(R.id.proceso);
        boton = (Button) findViewById(R.id.login);
        ima = (ImageButton) findViewById(R.id.botonimagen);

        ima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<String> productos = new ArrayList<String>();

                productos.add("Farenheith");
                productos.add("Revival");
                productos.add("El Alquimista");

                //Libros Nuevos
                productos.add("El Poder");
                productos.add("Despertar");


                Intent hello = new Intent( MainActivity.this,  Github_act.class);
                hello.putExtra("listado", productos);
                startActivity(hello);

            }
        });


        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Task().execute();
            }
        });


        progress.setVisibility(View.INVISIBLE);
    }


    //ASYNCTASK

    class Task extends AsyncTask<String, Void, String> {
        @Override
        protected void onPreExecute() {

            progress.setVisibility(View.VISIBLE);


        }

        @Override
        protected String doInBackground(String... strings) {
            for (int x = 1; x < 10; x++) {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            return null;

        }

        @Override
        protected void onPostExecute(String s) {
            Toast.makeText(getBaseContext(), "LOGIN INICIADO", Toast.LENGTH_SHORT).show();
            progress.setVisibility(View.INVISIBLE);


        }
    }


}