package com.example.AppTeclados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AsusActivity extends AppCompatActivity implements View.OnClickListener {

    Button inicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asus);

        inicio = findViewById(R.id.buttonInicio);

        inicio.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        StringBuilder volver = new StringBuilder();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

    public void principal(View v) {

        Uri uri = Uri.parse("https://www.asus.com/es/");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);

    }

    public void rog(View v) {

        Uri uri = Uri.parse("https://rog.asus.com/");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);

    }

    public void historia(View v) {

        Uri uri = Uri.parse("https://es.wikipedia.org/wiki/ASUS");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);

    }

    public void tienda(View v) {

        Uri uri = Uri.parse("https://www.pccomponentes.com/buscar/?query=asus");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);

    }

    public void contacto(View v) {

        Uri uri = Uri.parse("https://www.asus.com/es/support/");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);

    }

    public void tecladosAsus(View v) {

        Uri uri = Uri.parse("https://www.asus.com/es/Keyboards-Mice/Keyboards-Products/");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);

    }

    public void tecladosROG(View v) {

        Uri uri = Uri.parse("https://www.asus.com/es/Keyboards-Mice/Keyboards-Products/");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);

    }

}
