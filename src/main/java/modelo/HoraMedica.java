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
    
    private String rutcliente;
    private String nombremascota;
    private String rutveterinario;
    private String fecha;
    private String hora;
    private String sala;

    public HoraMedica() {
    }

    public HoraMedica(String rutCliente, String nombreMascota, String rutVeterinario, String fecha, String hora, String sala) {
        this.rutcliente = rutCliente;
        this.nombremascota = nombreMascota;
        this.nombremascota = nombreMascota;
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
        return nombremascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombremascota = nombreMascota;
    }

    public String getRutCliente() {
        return rutcliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutcliente = rutCliente;
    }

    public String getRutVeterinario() {
        return rutveterinario;
    }

    public void setRutVeterinario(String rutVeterinario) {
        this.rutveterinario = rutVeterinario;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
    
}
