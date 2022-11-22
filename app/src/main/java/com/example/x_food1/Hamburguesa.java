package com.example.x_food1;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Hamburguesa extends AppCompatActivity {

    private EditText et1, et2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hamburguesa);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.Cantidad);


    }


    public void Anterior (View view){
        Intent anterior = new Intent(this, Menu.class);
        startActivity(anterior);
    }

    public void Enviar (View view){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "administracion", null, 1);
        SQLiteDatabase BaseDeDatos = admin.getWritableDatabase();
        Intent enviar = new Intent(this, Pedido.class);
        enviar.putExtra("dato", et1.getText().toString());
        enviar.putExtra("datox", et2.getText().toString());


        String pedido = et1.getText().toString();
        String cuanto = et2.getText().toString();

        if (!pedido.isEmpty() && !cuanto.isEmpty()){
            ContentValues registro = new ContentValues();

            registro.put("pedido", pedido);
            registro.put("cuanto", cuanto);

            BaseDeDatos.insert("ventas", null, registro);

            BaseDeDatos.close();
            et1.setText("");
            Toast.makeText(this, "Agregado al Carrito", Toast.LENGTH_SHORT).show();

        }  else  {
            Toast.makeText(this, "Debes Llenar todos los campos", Toast.LENGTH_SHORT).show();
        }
        }
}

