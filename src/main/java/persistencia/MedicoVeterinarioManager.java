/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import persistencia.mappers.MedicoVeterinarioMapper;
import controlador.ConnectioFactory;
import modelo.MedicoVeterinario;
import org.apache.ibatis.session.SqlSession;

/**
 *
 * @author Kal-El
 */
public class MedicoVeterinarioManager {
    
    private SqlSession session;
    private MedicoVeterinarioMapper vMapper;
    
    public MedicoVeterinarioManager() {
        session = ConnectioFactory.getSession().openSession();
        vMapper = session.getMapper(MedicoVeterinarioMapper.class);
    }
    
    public int insert(MedicoVeterinario v) {
        int resut = vMapper.insert(v);
        session.commit();
        return resut;
    }
    
    public int updateByRut(MedicoVeterinario v){
        int result = vMapper.updateByRut(v);
        session.commit();
        return result;
    }

    public void deleteByRut(String rut) {
        vMapper.deleteByRut(rut);
        session.commit();
    }
}
