package com.example.AppTeclados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HiperXActivity extends AppCompatActivity implements View.OnClickListener {

    Button inicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hiper_x);

        inicio=findViewById(R.id.buttonInicio);

        inicio.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        StringBuilder volver = new StringBuilder();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

    public void principal(View v) {

        Uri uri = Uri.parse("https://www.kingston.com/es");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);

    }

    public void hyperx(View v) {

        Uri uri = Uri.parse("https://www.hyperxgaming.com/es");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);

    }

    public void teclados(View v) {

        Uri uri = Uri.parse("https://www.hyperxgaming.com/es/keyboards");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);

    }

    public void historia(View v) {

        Uri uri = Uri.parse("https://es.wikipedia.org/wiki/Kingston_Technology");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);

    }

    public void tienda(View v) {

        Uri uri = Uri.parse("https://www.pccomponentes.com/buscar/?query=hyperx");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);

    }

    public void contacto(View v) {

        Uri uri = Uri.parse("https://www.kingston.com/es/support");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);

    }

}
