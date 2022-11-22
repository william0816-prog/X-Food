package com.example.x_food1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Ventas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventas);
    }

    public void Anterior (View view){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }

}