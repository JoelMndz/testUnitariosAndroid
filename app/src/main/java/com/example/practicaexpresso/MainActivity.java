package com.example.practicaexpresso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtEmail, txtPassword;
    Button btnGuardar;
    Validations validations;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtEmail = findViewById(R.id.txtEmail);
        txtPassword = findViewById(R.id.txtPassword);
        btnGuardar = findViewById(R.id.btnGuardar);
        validations = new Validations();

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validations.isEmpy(txtEmail.getText().toString()) || validations.isEmpy(txtPassword.getText().toString())){
                    Toast.makeText(MainActivity.this, "Llena todos los campos!!!", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (!validations.emailValid(txtEmail.getText().toString())){
                    Toast.makeText(MainActivity.this, "Solo se permiten email de google", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(!validations.passwordValid(txtPassword.getText().toString())){
                    Toast.makeText(MainActivity.this, "El passwrod debe tener minimo 8 caracteres!!!", Toast.LENGTH_SHORT).show();
                    return;
                }

                txtEmail.setText("");
                txtPassword.setText("");

                startActivity(new Intent(MainActivity.this, Dashboard.class));
            }
        });
    }
}