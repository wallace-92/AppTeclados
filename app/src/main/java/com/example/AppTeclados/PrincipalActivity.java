package com.example.AppTeclados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PrincipalActivity extends AppCompatActivity implements View.OnClickListener {

    Button inicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        inicio = findViewById(R.id.buttonInicio);

        inicio.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        StringBuilder volver = new StringBuilder();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

    public void asus(View v) {

        StringBuilder volver = new StringBuilder();
        Intent intent = new Intent(this, AsusActivity.class);
        startActivity(intent);

    }

    public void corsair(View v) {

        StringBuilder volver = new StringBuilder();
        Intent intent = new Intent(this, CorsairActivity.class);
        startActivity(intent);

    }

    public void razer(View v) {

        StringBuilder volver = new StringBuilder();
        Intent intent = new Intent(this, RazerActivity.class);
        startActivity(intent);

    }

    public void hyper(View v) {

        StringBuilder volver = new StringBuilder();
        Intent intent = new Intent(this, HiperXActivity.class);
        startActivity(intent);

    }

    public void logitech(View v) {

        StringBuilder volver = new StringBuilder();
        Intent intent = new Intent(this, LogitechActivity.class);
        startActivity(intent);

    }

    public void historia(View v) {

        Uri uri = Uri.parse("https://es.wikipedia.org/wiki/Teclado_(inform%C3%A1tica)");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);

    }

}
