package com.example.pruebagithub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarResultados();
    }

    private  void  cargarResultados(){
        Toast.makeText(this, "resultados cargando", Toast.LENGTH_SHORT).show();
    }

    private void recibirDatos(){
        Toast.makeText(this, "recibiendo datos", Toast.LENGTH_SHORT).show();
    }
}