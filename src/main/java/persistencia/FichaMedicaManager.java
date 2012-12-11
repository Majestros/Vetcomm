/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import static controlador.Principal.SQLSESSION;
import java.util.ArrayList;
import modelo.FichaMedica;
import modelo.Mascota;
import persistencia.mappers.FichaMedicaMapper;


public class FichaMedicaManager {

    private FichaMedicaMapper fMapper;

    public FichaMedicaManager() {
        
        if (SQLSESSION != null) {
            fMapper = SQLSESSION.getMapper(FichaMedicaMapper.class);
        }
    }

    public int insert(FichaMedica f) {
        int resut = fMapper.insert(f);
        if( resut > 0) {
            SQLSESSION.commit();
        }
        return resut;
    }

    public boolean deleteById(String id) {
        if(fMapper.deleteById(id)>0){
            SQLSESSION.commit();
            return true;
        }
        return false;
    }
    
    public int updateById(FichaMedica f){
        int result = fMapper.updateById(f);
        if(result > 0) {
            SQLSESSION.commit();
        }
        return result;
    }

    public ArrayList<FichaMedica> obtenerFichasMedicas(Mascota m) {
        ArrayList<FichaMedica> listaAct = fMapper.getAllFichas(m);
        return listaAct;
    }
    
}
