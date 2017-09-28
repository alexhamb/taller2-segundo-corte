package com.example.android.celulares;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class reportes extends AppCompatActivity {
    private EditText res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportes);
        res = (EditText)findViewById(R.id.txtresultado);
        res.setText("Reporte No 1:\n " + Datos.Reporte1()+"\n Reporte No 4:\n " + Datos.Reporte4()+"\n Reporte No 5:\n " + Datos.Reporte5());

    }
}
