package com.example.inmobiliaria;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class PerfilFragment extends Fragment {

    View vista;
    Button button;
    EditText etDni,etApellido,etNombre,etTelefono,etMail,etPassword;


    public PerfilFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        vista= inflater.inflate(R.layout.fragment_perfil, container, false);
        etDni=vista.findViewById(R.id.etDni);
        etApellido=vista.findViewById(R.id.etApellido);
        etNombre=vista.findViewById(R.id.etNombre);
        etTelefono=vista.findViewById(R.id.etTelefono);
        etMail=vista.findViewById(R.id.etMail);
        etPassword=vista.findViewById(R.id.etPassword);


        button=vista.findViewById(R.id.btnActualizarPerfil);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Propietario miPropietario=new Propietario();
                String aux="";
                aux=etDni.getText().toString();
                miPropietario.setDni(Integer.parseInt(aux));

                miPropietario.setApellido(etApellido.getText().toString());
                miPropietario.setNombre(etNombre.getText().toString());

                aux=etTelefono.getText().toString();
                miPropietario.setTelefono(Integer.parseInt(aux));

                miPropietario.setMail(etMail.getText().toString());

                miPropietario.setPassword(etPassword.getText().toString());

                aux=miPropietario.modificarPropietario();


                Toast.makeText(getContext(),aux,Toast.LENGTH_LONG).show();
            }
        });
        return vista;
    }


}
