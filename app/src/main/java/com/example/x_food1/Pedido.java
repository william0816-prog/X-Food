package com.example.x_food1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Pedido extends AppCompatActivity {

    TextView Mostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido);

        Mostrar = findViewById(R.id.TextoPedido);

        String dato = getIntent().getStringExtra("dato4");
        String dato21 = getIntent().getStringExtra("datox4");
      Mostrar.setText("Tu Pedido fue : H. " + dato21+ dato);

        String datoasado = getIntent().getStringExtra("dato1");
        String datoasado1 = getIntent().getStringExtra("datox1");
        Mostrar.setText("Tu Pedido fue : Asado "+ datoasado1 + datoasado);

        String bebida = getIntent().getStringExtra("dato2");
        String bebida1 = getIntent().getStringExtra("datox2");
        Mostrar.setText("Tu bebida es : "+ bebida1 + bebida);

        String dato3 = getIntent().getStringExtra("dato3");
        String dato31 = getIntent().getStringExtra("datox3");
        Mostrar.setText("Tu bebida es : "+ dato31 + dato3);

        String dato4 = getIntent().getStringExtra("dato");
        String datocan = getIntent().getStringExtra("datox");
        Mostrar.setText("Tu pedido es : " + datocan + dato4 );
    }

    public void Anterior (View view){
        Intent anterior = new Intent(this, Menu.class);
        startActivity(anterior);
    }

}