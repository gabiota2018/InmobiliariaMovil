package com.example.inmobiliaria;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterDatos extends RecyclerView.Adapter<AdapterDatos.ViewHolderdatos>{

ArrayList<Inquilino> listDatos;

    public AdapterDatos(ArrayList<Inquilino> listDatos) {
        this.listDatos = listDatos;
    }

    @NonNull
    @Override
    public ViewHolderdatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,null,false);
        return new ViewHolderdatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderdatos holder, int position) {
     holder.asignarDatos(listDatos.get(position));
    }

    @Override
    public int getItemCount() {
        return listDatos.size();
    }

    public class ViewHolderdatos extends RecyclerView.ViewHolder {

        TextView tvDni;
        TextView tvApellido;
        TextView tvNombre;
        TextView tvDireccion;
        TextView tvTelefono;

        public ViewHolderdatos(@NonNull View itemView) {
            super(itemView);
            tvDni=itemView.findViewById(R.id.tvDni);
            tvApellido=itemView.findViewById(R.id.tvApellido);
            tvNombre=itemView.findViewById(R.id.tvNombre);
            tvDireccion=itemView.findViewById(R.id.tvDireccion);
            tvTelefono=itemView.findViewById(R.id.tvTelefono);
        }

        public void asignarDatos(Inquilino s) {
           tvDni.setText(s.getDni());
           tvApellido.setText(s.getApellido());
           tvNombre.setText(s.getNombre());
           tvDireccion.setText(s.getDireccion());
           tvTelefono.setText(s.getTelefono());
        }
    }
}
