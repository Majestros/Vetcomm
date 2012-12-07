/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import static controlador.Principal.SQLSESSION;
import persistencia.mappers.FichaMedicaMapper;
import controlador.ConnectioFactory;
import modelo.FichaMedica;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 *
 * @author Kal-El
 */
public class FichaMedicaManager {

    private FichaMedicaMapper fMapper;

    public FichaMedicaManager() {
        
        if (SQLSESSION != null)        
            fMapper = SQLSESSION.getMapper(FichaMedicaMapper.class);
    }

    public int insert(FichaMedica f) {
        int resut = fMapper.insert(f);
//        cMapper.insert(c);
        if( resut > 0)
            SQLSESSION.commit();
        return resut;
    }

    public boolean deleteById(String id) {
        if(fMapper.deleteById(id)>0){
            SQLSESSION.commit();
            return true;
        }
        return false;
    }
    
}
