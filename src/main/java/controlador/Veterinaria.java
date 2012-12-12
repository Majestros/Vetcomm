package controlador;

import java.util.ArrayList;
import modelo.Cliente;
import modelo.FichaMedica;
import modelo.HoraMedica;
import modelo.Mascota;
import modelo.MedicoVeterinario;
import modelo.Usuario;
import persistencia.ClienteManager;
import persistencia.FichaMedicaManager;
import persistencia.HoraMedicaManager;
import persistencia.MascotaManager;
import persistencia.MedicoVeterinarioManager;
import persistencia.UsuarioManager;

public class Veterinaria {

    private ClienteManager cManager = new ClienteManager();
    private MascotaManager mManager = new MascotaManager();
    private MedicoVeterinarioManager vManager = new MedicoVeterinarioManager();
    private FichaMedicaManager fManager= new FichaMedicaManager();
    private UsuarioManager usrManager = new UsuarioManager();    
    private HoraMedicaManager hManager= new HoraMedicaManager();
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
 //   private ArrayList<Mascota> mascotas = new ArrayList<Mascota>();
    private ArrayList<HoraMedica> horas = new ArrayList<HoraMedica>();
    private ArrayList<MedicoVeterinario> medicos = new ArrayList<MedicoVeterinario>();
    private ArrayList<FichaMedica> fichasMedicas=new ArrayList<FichaMedica>();

    public Veterinaria() {
    }

//------------------------------------------------------
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    /**
     * Agrega un cliente
     * @return verdadero si se agrego el cliente.
     */
    public boolean agregarCliente(Cliente c) {
        if (cManager.insert(c) > 0) {
            this.clientes.add(c);
            return true;
        }
        return false;
    }

    public boolean eliminarCliente(Cliente c) {
        if (this.cManager.deleteByRut(c.getRut())) {
            this.clientes.remove(c);
            return true;
        }
        return false;
    }

    /**
     * Establece las mascotas que posee un cliente.
     **/
    public void llenarMascotasDeCliente(Cliente c) {
        c.setMascota(mManager.obtenerTodasByCliente(c));
    }

    protected void actualizarArrayClientes() {
        this.clientes = cManager.obtenerClientes();
//        this.mascotas = mManager.obtenerMascotas();
    }
    
    protected void actualizarArrayMedicos(){
        this.medicos = vManager.obtenerMedicosVeterinarios();
    }
    
//    ////
//    ////
//    protected void actualizarArrayMascota(){
//        this.mascotas = mManager.obtenerMascotas();
//    }
//    ------------------------------------------------------------

    public boolean agregarMascota(Mascota m) {
        if (mManager.insert(m) > 0) {
  //          this.mascotas.add(m);
            return true;
        }
        return false;
    }

    public boolean eliminarMascota(Mascota m) {
        if (this.mManager.deleteById(m)) {
//            this.mascotas.remove(m);
            return true;
        }
        return false;
    }

//    ------------------------------------------------------------
    public boolean agregarMedicoVeterinario(MedicoVeterinario v) {
        if (vManager.insert(v) > 0) {
            this.medicos.add(v);
            return true;
        }
        return false;
    }

    public boolean eliminarMedicoVeterinario(MedicoVeterinario v) {
        if (this.vManager.deleteByRut(v.getRut())) {
            medicos.remove(v);
            return true;
        }
        return false;
    }
    
    public MedicoVeterinario selectMedicoVeterinarioByRut(String rut) {
        for (MedicoVeterinario medico : medicos) {
            if (rut.equals(medico.getRut())){
                return medico;
            }          
        }
        return null;
    }
    
    public boolean editarMedicoVeterinario (MedicoVeterinario v) {
        if (vManager.updateMedicoVeterinario(v) > 0) {            
            this.medicos.add(v);
            return true;
        }
        return false;
    }


//    ------------------------------------------------------------
    public boolean agregarHora(HoraMedica h) {
        if (hManager.insert(h) > 0) {
            this.horas.add(h);
            return true;
        }
        return false;
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
    public Cliente selectClienteByRut(String rut) {
        for (Cliente cliente : getClientes()) {
            if (rut.equals(cliente.getRut())) {
                return cliente;
            }
        }
        return null;
    }

    

    public void eliminarMascotasDeCliente(ArrayList<Mascota> mascota) {
        for (int i = 0; i < mascota.size(); i++) {
            mManager.deleteById(mascota.get(i));           
        }
    }
 //-------------------------------------------------------------------------- 
    

    public boolean agregarFichaMedica(FichaMedica f) {
        if (fManager.insert(f) > 0) {
            this.fichasMedicas.add(f);
            return true;
        }
        return false;
    
    }
    
//    public void llenarFichaMedicasDeMascota(String rut, String nombre) {
//        
//        m.setHistorial(fManager.obtenerFichasMedicas(rut,nombre));
//    }
//    
 //--------------------------------------------------------------------------
    public boolean esUsuarioRegistrado(Usuario usuario) {
        return (usrManager.obtenerUsuario(usuario) != null);
    }

//    void actualizarArrayFichas() {
//        this.fichasMedicas = fManager.obtenerFichasMedicas();
//    }

    public ArrayList<HoraMedica> getHoraMedica() {
        return horas;
    }
    
    protected void actualizarArrayHoraMedica(){
       this.horas = hManager.obtenerHorasMedicas();
   }
    
}
