package com.example.x_food1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void Anterior (View view){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }
    public void Siguiente (View view){
        Intent siguiente = new Intent(this, Hamburguesa.class);
        startActivity(siguiente);
    }

    public void Siguientep (View view){
        Intent siguientep = new Intent(this, Perros.class);
        startActivity(siguientep);
    }

    public void Siguientepi (View view){
        Intent siguientepi = new Intent(this, Picadas.class);
        startActivity(siguientepi);
    }

    public void Siguientedes (View view){
        Intent Siguientedes = new Intent(this, Desgranados.class);
        startActivity(Siguientedes);
    }

    public void SiguienteAsa (View view){
        Intent SiguienteAsa = new Intent(this, Asados.class);
        startActivity(SiguienteAsa);
    }

    public void SiguienteBebida (View view){
        Intent SiguienteBebida = new Intent(this, Bebidas.class);
        startActivity(SiguienteBebida);
    }

    public void SiguienteConfirmar (View view){
        Intent SiguienteConfirmar = new Intent(this, Pedido.class);
        startActivity(SiguienteConfirmar);
    }

}