package com.example.x_food1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Asados extends AppCompatActivity {

    private EditText et3, et4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asados);

        et3 = (EditText) findViewById(R.id.Asado);
        et4 = (EditText) findViewById(R.id.CantidadAsado);


    }
    public void Enviar (View view){
        Intent enviar = new Intent(this, Pedido.class);
        enviar.putExtra("dato1", et3.getText().toString());
        enviar.putExtra("datox1", et4.getText().toString());
        Toast.makeText(this, "Agregado al Carrito", Toast.LENGTH_SHORT).show();
    }

    public void Anterior (View view){
        Intent anterior = new Intent(this, Menu.class);
        startActivity(anterior);
    }

}