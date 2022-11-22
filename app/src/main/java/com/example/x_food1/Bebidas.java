package com.example.x_food1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Bebidas extends AppCompatActivity {

    private EditText et5, et6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bebidas);

        et5 = (EditText) findViewById(R.id.PedidoBebidas);
        et6 = (EditText) findViewById(R.id.CantidadBebidas);


    }

    public void Enviar (View view){
        Intent enviar = new Intent(this, Pedido.class);
        enviar.putExtra("dato2", et5.getText().toString());
        enviar.putExtra("datox2", et6.getText().toString());
        Toast.makeText(this, "Agregado al Carrito", Toast.LENGTH_SHORT).show();
    }

    public void Anterior (View view){
        Intent anterior = new Intent(this, Menu.class);
        startActivity(anterior);
    }

}