package com.example.x_food1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Perros extends AppCompatActivity {

    private EditText et9, et11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perros);

        et9 = (EditText) findViewById(R.id.PedidoPerro);
        et11 = (EditText) findViewById(R.id.CantidadPerro);


    }

    public void Enviar (View view){
        Intent enviar = new Intent(this, Pedido.class);
        enviar.putExtra("dato3", et9.getText().toString());
        Toast.makeText(this, "Agregado al Carrito", Toast.LENGTH_SHORT).show();
    }

    public void Anterior (View view){
        Intent anterior = new Intent(this, Menu.class);
        startActivity(anterior);
    }


}