/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Cliente;
import modelo.HoraMedica;
import modelo.Mascota;
import java.util.ArrayList;
import modelo.MedicoVeterinario;

/**
 *
 * @author Kal-El
 */
public class Veterinaria {
    
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    private ArrayList<Mascota> mascotas = new ArrayList<Mascota>();
    private ArrayList<HoraMedica> horas = new ArrayList<HoraMedica>();
    private ArrayList<MedicoVeterinario> medicos = new ArrayList<MedicoVeterinario>();

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<HoraMedica> getHoras() {
        return horas;
    }

    public void setHoras(ArrayList<HoraMedica> horas) {
        this.horas = horas;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
    
    public void agregarMascota(Mascota m){
        this.mascotas.add(m);
    }
    
    public void agregarCliente(Cliente c){
        this.clientes.add(c);
    }
    
    public void agregarHora(HoraMedica h){
        this.horas.add(h);
    }

    public ArrayList<MedicoVeterinario> getMedicos() {
        return medicos;
    }

    public void setMedicos(ArrayList<MedicoVeterinario> medicos) {
        this.medicos = medicos;
    }
    
    
    
    
}
