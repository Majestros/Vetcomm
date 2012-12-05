/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import controlador.ConnectioFactory;
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

    public void deleteById(String rut) {
        mMapper.deleteById(rut);

        session.commit();
    }
    
}
