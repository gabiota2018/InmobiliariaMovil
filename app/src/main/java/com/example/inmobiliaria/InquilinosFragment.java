package com.example.inmobiliaria;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class InquilinosFragment extends Fragment {
    RecyclerView recycler;
    ArrayList<Inquilino> listDatos;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      View vista=inflater.inflate(R.layout.fragment_inquilinos, container, false);

      listDatos=new ArrayList<>();
      recycler=vista.findViewById(R.id.RecyclerId);
      recycler.setLayoutManager(new LinearLayoutManager(getContext()));
      llenarLista();
      AdapterDatos adapter=new AdapterDatos(listDatos);
      recycler.setAdapter(adapter);

      return vista;
    }

    private void llenarLista() {
        List<Inquilino> listaInquilinos = new ArrayList<Inquilino>();
        Inquilino nuevo=new Inquilino();
        listaInquilinos=nuevo.listarInquilinos();
        for(Inquilino p:listaInquilinos){
            listDatos.add(p);
        }
        
    }
}
