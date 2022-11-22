package com.example.x_food1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Picadas extends AppCompatActivity {

    private EditText et12, et13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picadas);

        et12 = (EditText) findViewById(R.id.PedidoPicada);
        et13 = (EditText) findViewById(R.id.CantidadPicada);

    }

    public void Enviar (View view){
        Intent enviar = new Intent(this, Pedido.class);
        enviar.putExtra("dato4", et12.getText().toString());
        enviar.putExtra("datox4", et13.getText().toString());
        Toast.makeText(this, "Agregado al Carrito", Toast.LENGTH_SHORT).show();
    }

    public void Anterior (View view){
        Intent anterior = new Intent(this, Menu.class);
        startActivity(anterior);
    }

}