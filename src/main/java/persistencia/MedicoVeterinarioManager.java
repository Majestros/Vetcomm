/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import static controlador.Principal.SQLSESSION;
import persistencia.mappers.MedicoVeterinarioMapper;
import controlador.ConnectioFactory;
import modelo.MedicoVeterinario;
import org.apache.ibatis.session.SqlSession;

/**
 *
 * @author Kal-El
 */
public class MedicoVeterinarioManager {

    private MedicoVeterinarioMapper vMapper;

    public MedicoVeterinarioManager() {
        if (SQLSESSION != null) {
            vMapper = SQLSESSION.getMapper(MedicoVeterinarioMapper.class);
        }
    }

    public int insert(MedicoVeterinario v) {
        int resut = vMapper.insert(v);
        SQLSESSION.commit();
        return resut;
    }

    public int updateByRut(MedicoVeterinario v) {
        int result = vMapper.updateByRut(v);
        SQLSESSION.commit();
        return result;
    }

    public void deleteByRut(String rut) {
        vMapper.deleteByRut(rut);
        SQLSESSION.commit();
    }
}
