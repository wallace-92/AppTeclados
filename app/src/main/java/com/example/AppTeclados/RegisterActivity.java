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

public class RegisterActivity extends AppCompatActivity {

    EditText  editTextEmail, editTextContrasena;
    Button buttonRegister;
    String string_email,string_contrasena;
    String url = "https://rogdomain.ddns.net:8860/appteclados/register.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        editTextEmail=findViewById(R.id.editTextEmail);
        editTextContrasena=findViewById(R.id.editTextContrasena);

        buttonRegister=findViewById(R.id.buttonRegister);

    }

    public void Registro(View view){

        final ProgressDialog progressDialog = new ProgressDialog(this);

        progressDialog.setMessage("Registrando...");

        String auth_email = editTextEmail.getText().toString();
        String auth_contrasena = editTextContrasena.getText().toString();

        if (auth_email.isEmpty()) {

            editTextEmail.setError("Ingresa correo electronico");

        } else if (auth_contrasena.isEmpty()) {

            editTextContrasena.setError("Ingresa contraseña");

        } else {

            progressDialog.show();

            string_email = editTextEmail.getText().toString().trim();
            string_contrasena = editTextContrasena.getText().toString().trim();


            StringRequest request = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {

                @Override
                public void onResponse(String response) {
                    progressDialog.dismiss();
                    editTextEmail.setText("");
                    editTextContrasena.setText("");

                    if (response.equalsIgnoreCase("Registrado")) {

                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        Toast.makeText(RegisterActivity.this, response, Toast.LENGTH_SHORT).show();

                    } else {

                        Toast.makeText(RegisterActivity.this, response, Toast.LENGTH_SHORT).show();
                    }
                }
            }, new Response.ErrorListener() {

                @Override
                public void onErrorResponse(VolleyError error) {
                    progressDialog.dismiss();
                    Toast.makeText(RegisterActivity.this, error.getMessage().toString(), Toast.LENGTH_SHORT).show();
                }
            }

            ) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {
                    Map<String, String> params = new HashMap<String, String>();

                    params.put("correo", string_email);
                    params.put("contrasena", string_contrasena);

                    return params;

                }
            };

            RequestQueue requestQueue = Volley.newRequestQueue(RegisterActivity.this);
            requestQueue.add(request);

        }

    }
}
