
package persistencia;

import static controlador.Principal.SQLSESSION;
import java.util.ArrayList;
import modelo.Cliente;
import modelo.Mascota;
import persistencia.mappers.MascotaMapper;

public class MascotaManager {
    
    private MascotaMapper mMapper;
    
    public MascotaManager() {        
        if (SQLSESSION != null ) {
            mMapper = SQLSESSION.getMapper(MascotaMapper.class);
        }
    }

    public int insert(Mascota m) {
        int resut = mMapper.insert(m);
        if (resut > 0) {
            SQLSESSION.commit();
        }
        return resut;
    }
    
    public boolean deleteById(Mascota mascota) {
        if(mMapper.deleteById(mascota) > 0){
            SQLSESSION.commit();
            return true;
        }
        return false;
    }
    
    public int updateById(Mascota m){
        int result = mMapper.updateById(m);
        if(result > 0) {
            SQLSESSION.commit();
        }
        return result;
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
