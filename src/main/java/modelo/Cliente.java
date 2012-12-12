/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Kal-El
 */
public class Cliente {
    
    private String rut;
    private String nombre;
    private String direccion;
    private int telefono;
    private String email;
    private ArrayList<Mascota> mascota = new ArrayList<Mascota>();

    public Cliente() {
        super();
    }

    public Cliente(String rut, String nombre, String direccion, int telefono, String email) {
        this.rut = rut;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Mascota> getMascota() {
        return mascota;
    }

    public void setMascota(ArrayList<Mascota> mascota) {
        this.mascota = mascota;
    }

//    public void agregarMascota(Mascota m){
//        this.mascota.add(m);
//    }
//

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if ((this.rut == null) ? (other.rut != null) : !this.rut.equals(other.rut)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return  rut + " - " + nombre;
    }
    
   
    
}
