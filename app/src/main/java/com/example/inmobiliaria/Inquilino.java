package com.example.inmobiliaria;

import java.util.ArrayList;
import java.util.List;

public class Inquilino {
    private int idInquilino;
    private int dni;
    private String nombre;
    private String apellido;
    private String direccion;
    private int telefono;

    private String password;


    public Inquilino() { }
    public Inquilino(int idInquilino, int dni, String nombre, String apellido, String direccion,int telefono)
    {
        this.idInquilino = idInquilino;
        this.dni=dni;//no se puede cambiar
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion=direccion;
        this.telefono = telefono;
      }
    public void setIdInquilino(int idInquilino) {
        this.idInquilino=idInquilino;
    }
    public int getIdInquilino() {
        return idInquilino;
    }

    public void setDni(int dni) {
        this.dni=dni;
    }
    public int getDni() {
        return dni;
    }

    public void setNombre (String nombre) { this.nombre = nombre;    }
    public String getNombre() {
        return nombre;
    }

    public void setApellido (String apellido) {
        this.apellido= apellido;
    }
    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion (String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono (int telefono){
        this.telefono = telefono;
    }
    public int getTelefono() {
        return telefono;
    }

    public List<Inquilino> listarInquilinos() {
        List<Inquilino> listaInquilinos = new ArrayList<Inquilino>();

        Inquilino inquilino = new Inquilino();
        inquilino.idInquilino = 1;
        inquilino.dni =21211211 ;
        inquilino.nombre = "María";
        inquilino.apellido = "Martinez";
        inquilino.direccion = "Mar del Plata 245";
        inquilino.telefono = 266100100;

        listaInquilinos.add(inquilino);

         inquilino = new Inquilino();
        inquilino.idInquilino = 2;
        inquilino.dni = 31311311;
        inquilino.nombre = "Mariano";
        inquilino.apellido = "Molina";
        inquilino.direccion = "Licitación 8";
        inquilino.telefono = 266100100;

        listaInquilinos.add(inquilino);

        inquilino = new Inquilino();
        inquilino.idInquilino = 3;
        inquilino.dni =41411411 ;
        inquilino.nombre = "Marcelo";
        inquilino.apellido = "Martínez";
        inquilino.direccion = "Pelegrini 123";
        inquilino.telefono = 266100100;

        listaInquilinos.add(inquilino);

        return listaInquilinos;

    }


}
