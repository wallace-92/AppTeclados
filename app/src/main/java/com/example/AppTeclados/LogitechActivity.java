package com.example.AppTeclados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LogitechActivity extends AppCompatActivity implements View.OnClickListener {

    Button inicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logitech);

        inicio= findViewById(R.id.buttonInicio);

        inicio.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        StringBuilder volver = new StringBuilder();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

    public void principal(View v) {

        Uri uri = Uri.parse("https://www.logitech.com/es-es");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);

    }

    public void gaming(View v) {

        Uri uri = Uri.parse("https://www.logitechg.com/es-es");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);

    }

    public void teclados(View v) {

        Uri uri = Uri.parse("https://www.logitech.com/es-es/keyboards");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);

    }

    public void tecladosgaming(View v) {

        Uri uri = Uri.parse("https://www.logitechg.com/es-es/products/gaming-keyboards.html");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);

    }

    public void historia(View v) {

        Uri uri = Uri.parse("https://es.wikipedia.org/wiki/Logitech");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);

    }

    public void tienda(View v) {

        Uri uri = Uri.parse("https://www.pccomponentes.com/buscar/?query=logitech");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);

    }

    public void contacto(View v) {

        Uri uri = Uri.parse("https://www.logitech.com/es-es/about/contact.html");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);

    }

}
