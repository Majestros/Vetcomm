package controlador;

import java.util.ArrayList;
import modelo.Cliente;
import modelo.HoraMedica;
import modelo.Mascota;
import modelo.MedicoVeterinario;
import persistencia.ClienteManager;
import persistencia.MascotaManager;
 
public class Veterinaria {
    
    private static Veterinaria INSTANCIA = null;
    private ClienteManager cManager = new ClienteManager();
    private MascotaManager mManager = new MascotaManager();
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
    
    /**
     * Agrega un cliente
     * @return verdadero si se agrego el cliente.
     */
    public boolean agregarCliente(Cliente c){
       if ( cManager.insert(c)> 0){
           this.clientes.add(c);
           return true;
       }
           return false;
       
    }
    
    public boolean eliminarCliente(Cliente c){
        if(this.cManager.deleteByRut(c.getRut())){
            this.clientes.remove(c);
            return true;
        }
        return false;
    }
//    ------------------------------------------------------------
    
    public boolean agregarMascota(Mascota m){
        return false;
    }
    
//    ------------------------------------------------------------
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
