package com.example.inmobiliaria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etMail;
    private EditText etPassword;
    private Button btnLogin;
    private TextView respuesta;
    private Propietario miPropietario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etMail=findViewById(R.id.etMail);
        etPassword=findViewById(R.id.etPassword);
        btnLogin=findViewById(R.id.btnLogin);
        respuesta=findViewById(R.id.tvRespuesta);

        Intent intencion=new Intent(getApplicationContext(),NavigatorDrawerActivity.class);
        startActivity(intencion);
    }
 /*   public  void logueo(View v){
        miPropietario=new Propietario();
        String correo=etMail.getText().toString();
        String clave=etPassword.getText().toString();
        String nombre="";
        boolean rta=miPropietario.logueo(correo,clave);
        Intent intencion=new Intent(getApplicationContext(),NavigatorDrawerActivity.class);
        if(rta)
        {
            miPropietario=miPropietario.devolverPropietario(correo);
            nombre=miPropietario.getNombre()+""+miPropietario.getApellido();
            startActivity(intencion);}
        else
            respuesta.setText("Datos incorrectos");
    }*/
}
