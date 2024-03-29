/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Kal-El
 */
public class MedicoVeterinario {
 
    private String rut;
    private String nombre;
    private String especialidad;

    public MedicoVeterinario() {
    }

    public MedicoVeterinario(String rut, String nombre, String especialidad) {
        this.rut = rut;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    @Override
    public String toString() {
        return  rut + " - " + nombre;
    }

}
