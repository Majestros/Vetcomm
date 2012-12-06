
package persistencia;

import static controlador.Principal.SQLSESSION;
import java.util.ArrayList;
import modelo.Cliente;
import modelo.Mascota;

/**
 * Clase encarda de la persistencia con la db 
 * @version 1.0
 */
public class MascotaManager {
    
    private MascotaMapper mMapper;
    
    public MascotaManager() {
        
        if (SQLSESSION != null )        
            mMapper = SQLSESSION.getMapper(MascotaMapper.class);
    }

    public int insert(Mascota m) {
        int resut = mMapper.insert(m);
        if (resut > 0)
            SQLSESSION.commit();
        return resut;
    }
    
    public int updateById(Mascota m){
        int result = mMapper.updateById(m);
        if(result > 0)
            SQLSESSION.commit();
        return result;
    }

    public boolean deleteById(String id) {
        if(mMapper.deleteById(id)>0){
            SQLSESSION.commit();
            return true;
        }
        return false;
    }

    public ArrayList<Mascota> obtenerMascotas() {
        return mMapper.getAllMascotas();
    }
    
    public ArrayList<Mascota> obtenerTodasByCliente(Cliente c){
        return mMapper.getAllByCliente(c);
    }
    
    public Mascota obtenerMascota(Mascota m){
        return mMapper.selectById(m);
    }
    
}
