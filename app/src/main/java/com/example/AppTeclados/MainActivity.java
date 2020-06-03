package com.example.AppTeclados;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    EditText editTextCorreo, editTextContrasena;
    Button buttonLogin, buttonRegister;
    String string_correo,string_contrasena;

    String url = "https://rogdomain.ddns.net:8860/appteclados/login.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextCorreo = findViewById(R.id.editTextCorreo);
        editTextContrasena = findViewById(R.id.editTextContrasena);

        buttonLogin = findViewById(R.id.buttonLogin);
        buttonRegister = findViewById(R.id.buttonRegister);

    }

    public void Inicio(View view){

        String auth_correo = editTextCorreo.getText().toString();
        String auth_contrasena = editTextContrasena.getText().toString();

        if(auth_correo.isEmpty()){

            editTextCorreo.setError("Ingresa correo");
        }

        else if(auth_contrasena.isEmpty()){

            editTextContrasena.setError("Ingresa contraseña");
        }

        else{

            final ProgressDialog progressDialog = new ProgressDialog(this);
            progressDialog.setMessage("Entrando...");

            progressDialog.show();

            string_correo = editTextCorreo.getText().toString().trim();
            string_contrasena = editTextContrasena.getText().toString().trim();


            StringRequest request = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {

                    progressDialog.dismiss();

                    if(response.equalsIgnoreCase("Autenticacion correcta")){

                        editTextCorreo.setText("");
                        editTextContrasena.setText("");

                        startActivity(new Intent(getApplicationContext(),PrincipalActivity.class));
                        Toast.makeText(MainActivity.this, response, Toast.LENGTH_SHORT).show();

                    }

                    else{

                        editTextCorreo.setError("Correo no encontrado");

                    }
                }
            },new Response.ErrorListener(){

                @Override
                public void onErrorResponse(VolleyError error) {
                    progressDialog.dismiss();
                    Toast.makeText(MainActivity.this, error.getMessage().toString(), Toast.LENGTH_SHORT).show();
                }
            }

            ){
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {
                    Map<String,String> params = new HashMap<String, String>();
                    params.put("correo",string_correo);
                    params.put("contrasena",string_contrasena);
                    return params;

                }
            };

            RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
            requestQueue.add(request);

        }
    }

    public void Registro(View view){
        Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
        startActivity(intent);
    }

}
