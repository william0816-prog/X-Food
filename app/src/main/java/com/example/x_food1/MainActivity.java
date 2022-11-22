package com.example.x_food1;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Siguiente (View view){
        Intent siguiente = new Intent(this, Menu.class);
        startActivity(siguiente);
    }

    public void SiguienteVentas (View view){
        Intent siguienteVentas = new Intent(this, Ventas.class);
        startActivity(siguienteVentas);
    }

}