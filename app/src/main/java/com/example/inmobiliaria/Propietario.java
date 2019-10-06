package com.example.inmobiliaria;

import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Propietario {
    private int idPropietario;
    private int dni;
    private String nombre;
    private String apellido;
    private int telefono;
    private String mail;
    private String password;


    public Propietario () { }
    public Propietario(int idPropietario, int dni, String nombre, String apellido, int telefono, String mail, String password)
    {
        this.idPropietario = idPropietario;
        this.dni=dni;//no se puede cambiar
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.mail = mail;
        this.password = password;
    }
    public void setIdPropietario(int idPropietario) {
        this.idPropietario=idPropietario;
    }
    public int getIdPropietario() {
        return idPropietario;
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

    public void setTelefono (int telefono){
        this.telefono = telefono;
    }
    public int getTelefono() {
        return telefono;
    }

    public void setMail (String mail)    {
        this.mail = mail;
    }
    public String getMail() { return mail; }

    public String getPassword() {
        return password;
    }
    public void setPassword (String password) {
        this.password = password;
    }

    public List<Propietario> listarPropietarios() {
        List<Propietario> listaPropietario = new ArrayList<Propietario>();
        Propietario propietario = new Propietario();
        propietario.idPropietario = 1;
        propietario.dni = 10100100;
        propietario.nombre = "ana";
        propietario.apellido = "acosta";
        propietario.telefono = 266100100;
        propietario.mail = "ana@gmail.com";
        propietario.password = "111";
        listaPropietario.add(propietario);

        propietario = new Propietario();
        propietario.idPropietario = 2;
        propietario.dni = 20200200;
        propietario.nombre = "bruno";
        propietario.apellido = "becerra";
        propietario.telefono = 266200200;
        propietario.mail = "bruno@gmail.com";
        propietario.password = "222";
        listaPropietario.add(propietario);

        propietario = new Propietario();
        propietario.idPropietario = 3;
        propietario.dni = 30300300;
        propietario.nombre = "ciro";
        propietario.apellido = "cortéz";
        propietario.telefono = 266300300;
        propietario.mail = "ciro@gmail.com";
        propietario.password = "333";
        listaPropietario.add(propietario);

        return listaPropietario;
    }

    public  boolean logueo(String mail, String password){
        boolean rta=false;
        List<Propietario> listado = new ArrayList<Propietario>();
        Propietario propietario = new Propietario();
        listado=propietario.listarPropietarios();
        for(Propietario p:listado)
        {
            if(p.mail.equals(mail) && p.password.equals(password))
                rta=true;
        }
        return  rta;
    }
    public  Propietario devolverPropietario(String mail){
        List<Propietario> listado = new ArrayList<Propietario>();
        Propietario propietario = new Propietario();
        listado=propietario.listarPropietarios();
        for(Propietario p:listado)
        {
            if(p.mail.equals(mail))
                propietario=p;
        }
        return  propietario;
    }
    public String modificarPropietario()//(Propietario miPropietario)
     {
         String aux="";
         List<Propietario> listado = new ArrayList<Propietario>();
        List<Propietario> listadoNuevo = new ArrayList<Propietario>();
        Propietario propietario = new Propietario();
        Propietario otro=new Propietario();
        listado=propietario.listarPropietarios();
        int i=0;
        int pos=0;
        boolean esta=false;
        for(Propietario p:listado)
        {
           if(p.dni==dni)
            {
                otro.dni=dni;
                otro.apellido=apellido;
                otro.nombre=nombre;
                otro.telefono=telefono;
                otro.mail=mail;
                otro.password=password;
                esta=true;
            }
            listadoNuevo.add(otro);
        }
        if(esta) {
            otro = new Propietario();
            for (Propietario p : listadoNuevo) {
                if (p.dni == dni) {
                    otro.dni = p.dni;
                    otro.apellido = p.apellido;
                    otro.nombre = p.nombre;
                    otro.telefono = p.telefono;
                    otro.mail = p.mail;
                    otro.password = p.password;
                }
            }
            aux = "Datos actualizados " + otro.getDni() + "-" + otro.getApellido() + "-" + otro.getNombre() + "-" +
                    otro.getTelefono() + "-" + otro.getMail() + "-" + otro.getPassword();
        }
        else
            aux="El dni "+dni+" no pertenece a un propietario";
        return aux;
    }
}
