package com.example.pruebagithub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarResultados();
        recibirDatos();
    }

    private  void  cargarResultados(){
        Toast.makeText(this, "resultados cargando", Toast.LENGTH_SHORT).show();
        Intent i= new Intent(this, MainActivity2.class);
    }

    private void recibirDatos(){
        Toast.makeText(this, "recibiendo datos", Toast.LENGTH_SHORT).show();
    }
}