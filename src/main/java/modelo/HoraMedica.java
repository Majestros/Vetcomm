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
    
    private Cliente cliente;
    private Mascota mascota;
    private MedicoVeterinario veterinario;
    private String fecha;
    private String hora;

    public HoraMedica() {
    }

    public HoraMedica(Cliente cliente, Mascota mascota, MedicoVeterinario veterinario, String fecha, String hora) {
        this.cliente = cliente;
        this.mascota = mascota;
        this.veterinario = veterinario;
        this.fecha = fecha;
        this.hora = hora;
    }
    
    

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public MedicoVeterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(MedicoVeterinario veterinario) {
        this.veterinario = veterinario;
    }
    
    
    
}
