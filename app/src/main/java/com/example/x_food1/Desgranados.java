package com.example.x_food1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Desgranados extends AppCompatActivity {

    private EditText et7, et8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desgranados);

        et7 = (EditText) findViewById(R.id.PedidoDesgranado);
        et8 = (EditText) findViewById(R.id.CantidadDesgranado);

    }

    public void Enviar (View view){
        Intent enviar = new Intent(this, Pedido.class);
        enviar.putExtra("dato3", et7.getText().toString());
        enviar.putExtra("datox3", et8.getText().toString());
        Toast.makeText(this, "Agregado al Carrito", Toast.LENGTH_SHORT).show();
    }

    public void Anterior (View view){
        Intent anterior = new Intent(this, Menu.class);
        startActivity(anterior);
    }

}