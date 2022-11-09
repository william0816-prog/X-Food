package com.example.x_food;

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
        Intent siguiente = new Intent(this, Comida.class);
        startActivity(siguiente);
     }
}