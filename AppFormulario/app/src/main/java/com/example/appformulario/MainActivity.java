package com.example.appformulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void detalleContact(View vista){
        Intent intent = new Intent(this, DetalleContacto.class);

        EditText etName = (EditText) findViewById(R.id.etName);
        EditText etTel = (EditText) findViewById(R.id.etTel);
        EditText etEmail = (EditText) findViewById(R.id.etEmail);
        EditText etDesc = (EditText) findViewById(R.id.etDesc);
        DatePicker dtFecha = (DatePicker) findViewById(R.id.dtFecha);

        String nombre = etName.getText().toString();
        String telefono = etTel.getText().toString();
        String email = etEmail.getText().toString();
        String descripcion = etDesc.getText().toString();

        int day = dtFecha.getDayOfMonth();
        int month = dtFecha.getMonth();
        int year = dtFecha.getYear();
        String FechaNacimiento = fecha(day) + "/" + fecha(month+1) + "/" + year;

        intent.putExtra("Nombre", nombre);
        intent.putExtra("Telefono", telefono);
        intent.putExtra("Email", email);
        intent.putExtra("Descripcion", descripcion);
        intent.putExtra("FechaNacimiento", FechaNacimiento);

        startActivity(intent);
    }

    private String fecha(int n) {
        return (n<=9) ? ("0"+n) : String.valueOf(n);
    }
}