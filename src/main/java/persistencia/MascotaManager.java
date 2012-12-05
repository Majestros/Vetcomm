/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import controlador.ConnectioFactory;
import java.util.ArrayList;
import modelo.Mascota;
import org.apache.ibatis.session.SqlSession;

/**
 *
 * @author Kal-El
 */
public class MascotaManager {
    
    private SqlSession session;
    private MascotaMapper mMapper;
    
    public MascotaManager() {
        session = ConnectioFactory.getSession().openSession();
        mMapper = session.getMapper(MascotaMapper.class);
    }

    public int insert(Mascota m) {
        int resut = mMapper.insert(m);
//        cMapper.insert(c);
        session.commit();
        return resut;
    }
    
    public int updateById(Mascota m){
        int result = mMapper.updateById(m);
        session.commit();
        return result;
    }

    public boolean deleteById(String id) {
        if(mMapper.deleteById(id)>0){
            session.commit();
            return true;
        }
        return false;
    }

    public ArrayList<Mascota> obtenerMascotas() {
        return mMapper.getAllMascotas();
    }
    
}
