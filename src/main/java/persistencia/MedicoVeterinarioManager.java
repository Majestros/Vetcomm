/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import static controlador.Principal.SQLSESSION;
import persistencia.mappers.MedicoVeterinarioMapper;
import modelo.MedicoVeterinario;

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

    public boolean deleteByRut(String rut) {
        if(vMapper.deleteByRut(rut)>0){
            SQLSESSION.commit();
            return true;
        }
        return false;
    }
}
