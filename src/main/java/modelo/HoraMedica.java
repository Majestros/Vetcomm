/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Kal-El
 */
public class HoraMedica {
    
    private String rutCliente;
    private String nombreMascota;
    private String rutVeterinario;
    private String fecha;
    private String hora;
    private String sala;

    public HoraMedica() {
    }

    public HoraMedica(String rutCliente, String nombreMascota, String rutVeterinario, String fecha, String hora, String sala) {
        this.rutCliente = rutCliente;
        this.nombreMascota = nombreMascota;
        this.nombreMascota = nombreMascota;
        this.fecha = fecha;
        this.hora = hora;
        this.sala = sala;
    }
    
    

    

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getRutVeterinario() {
        return rutVeterinario;
    }

    public void setRutVeterinario(String rutVeterinario) {
        this.rutVeterinario = rutVeterinario;
    }

   

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
    
    
    
}
