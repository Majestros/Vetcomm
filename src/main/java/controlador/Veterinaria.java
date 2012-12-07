package controlador;

import java.util.ArrayList;
import modelo.Cliente;
import modelo.HoraMedica;
import modelo.Mascota;
import modelo.MedicoVeterinario;
import persistencia.ClienteManager;
import persistencia.MascotaManager;
 
public class Veterinaria {

    private ClienteManager cManager = new ClienteManager();
    private MascotaManager mManager = new MascotaManager();
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
   // private ArrayList<Mascota> mascotas = new ArrayList<Mascota>();
    private ArrayList<HoraMedica> horas = new ArrayList<HoraMedica>();
    private ArrayList<MedicoVeterinario> medicos = new ArrayList<MedicoVeterinario>();

    public Veterinaria(){
        
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
        if ( mManager.insert(m)> 0){
//           this.mascotas.add(m);
           return true;
       }
           return false;
    }
    
    public boolean eliminarMascota(Mascota m){
        if(this.mManager.deleteById(m)){
//            this.mascotas.remove(m);
            return true;
        }
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
    /**
     * Busca un cliente en la coleccion de clientes<br/>
     * @return Null si no se encuntra el cliente.
     */
        public Cliente selectByRut(String rut) {
        for (Cliente cliente : getClientes()) {
            if (rut.equals(cliente.getRut())) {
                return cliente;
            }
        }
        return null;
    }

    /**
     * Establece las mascotas que posee un cliente.
     **/
    public void llenarMascotasDeCliente (Cliente c){
        c.setMascota(mManager.obtenerTodasByCliente(c));
    }
        
    protected void actualizarArrays() {
        this.clientes = cManager.obtenerClientes();
//        this.mascotas = mManager.obtenerMascotas();
    }
    
    
    
    
}
