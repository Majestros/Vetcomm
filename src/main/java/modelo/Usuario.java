/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Kal-El
 */
public class Usuario {
    private String nombre;
    private String clave;

    public Usuario(){}
    
    public Usuario(String nombre, String contraseña) {
        this.nombre = nombre;
        this.clave = contraseña;
    }
    
    public String getContraseña() {
        return clave;
    }

    public void setContraseña(String contraseña) {
        this.clave = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
