/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import static controlador.Principal.SQLSESSION;
import java.util.ArrayList;
import modelo.HoraMedica;
import persistencia.mappers.HoraMedicaMapper;

/**
 *
 * @author Kal-El
 */
public class HoraMedicaManager {

    private HoraMedicaMapper hMapper;

    public HoraMedicaManager() {
        if (SQLSESSION != null) {
            hMapper = SQLSESSION.getMapper(HoraMedicaMapper.class);
        }
    }
    
    public int insert(HoraMedica h){
        int resut = hMapper.insertHoraMedica(h);
        if(resut > 0) {
            SQLSESSION.commit();
        }
        return resut;
    }
    
    public boolean deleteByFecha(String fecha) {
        if(hMapper.deleteByFecha(fecha)>0){
            SQLSESSION.commit();
            return true;
        }
        return false;
    }
    
    public ArrayList<HoraMedica> obtenerHorasMedicas(){
        return hMapper.obtenerHorasMedicas();
    }
}
