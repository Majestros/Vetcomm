package controlador;

import java.util.ArrayList;
import modelo.Cliente;
import modelo.HoraMedica;
import modelo.Mascota;
import modelo.MedicoVeterinario;
import persistencia.ClienteManager;
 
public class Veterinaria {
    
    private static Veterinaria INSTANCIA = null;
    private ClienteManager cManager = new ClienteManager();
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    private ArrayList<Mascota> mascotas = new ArrayList<Mascota>();
    private ArrayList<HoraMedica> horas = new ArrayList<HoraMedica>();
    private ArrayList<MedicoVeterinario> medicos = new ArrayList<MedicoVeterinario>();

    private Veterinaria(){
        
    }
    
    public static Veterinaria obtenerInstancia(){
        if(INSTANCIA == null){
            INSTANCIA = new Veterinaria();
        }
        return INSTANCIA;
    }
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
    
    /**
     * Agrega un cliente
     * @return verdadero si se agrego el cliente.
     */
    public boolean agregarCliente(Cliente c){
       if ( cManager.insert(c)> 0){
           this.clientes.add(c);
           return true;
       }else{
           return false;
       }
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
