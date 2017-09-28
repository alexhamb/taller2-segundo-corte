package com.example.android.celulares;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CrearCelular extends AppCompatActivity {

    private EditText precio, capacidad, marca, sistemaoperativo, color;
    private Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_celular);


        marca = (EditText)findViewById(R.id.txtmarca);
        sistemaoperativo = (EditText)findViewById(R.id.txtSistemaOperavito);
        color = (EditText)findViewById(R.id.txtColor);
        precio = (EditText)findViewById(R.id.txtPrecio);
        capacidad = (EditText)findViewById(R.id.txtCapacidad);
        res = this.getResources();
    }
    public void guardar (View v){
        String marc,so,col,cap;
        int prec;
        marc = marca.getText().toString();
        so = sistemaoperativo.getText().toString();
        col = color.getText().toString();
        prec = Integer.parseInt(precio.getText().toString());
        cap = capacidad.getText().toString();

        Celular c = new Celular(marc,so,col,prec,cap);
        c.guardar();
        Toast.makeText(this,res.getString(R.string.mensaje_exitoso),Toast.LENGTH_SHORT).show();
    }

    public void limpiar(View v){
        marca.setText("");
        sistemaoperativo.setText("");
        color.setText("");
        precio.setText("");
        capacidad.setText("");
    }
}
