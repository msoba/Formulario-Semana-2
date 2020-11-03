package com.example.appformulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DetalleContacto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_contacto);
        Bundle param = getIntent().getExtras();
        String nombre = param.getString("Nombre");
        String telefono = param.getString("Telefono");
        String email = param.getString("Email");
        String descripcion = param.getString("Descripcion");
        String fechaNacimiento = param.getString("FechaNacimiento");


        TextView tvName = (TextView) findViewById(R.id.tvName);
        TextView tvTel = (TextView) findViewById(R.id.tvTel);
        TextView tvMail = (TextView) findViewById(R.id.tvMail);
        TextView tvDescripcion = (TextView) findViewById(R.id.tvDescripcion);
        TextView tvFecha = (TextView) findViewById(R.id.tvFecha);

        tvName.setText(nombre);
        tvTel.setText(telefono);
        tvMail.setText(email);
        tvDescripcion.setText(descripcion);
        tvFecha.setText(fechaNacimiento);
    }


    public void editarDatos (View v) {
        Intent intent = new Intent(this, MainActivity.class);
        finish();
    }
}