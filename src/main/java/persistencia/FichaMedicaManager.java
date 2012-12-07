/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import persistencia.mappers.FichaMedicaMapper;
import controlador.ConnectioFactory;
import modelo.Cliente;
import modelo.FichaMedica;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 *
 * @author Kal-El
 */
public class FichaMedicaManager {

    private SqlSession session;
    private FichaMedicaMapper fMapper;

    public FichaMedicaManager() {
        SqlSessionFactory sqlSessionFactory = ConnectioFactory.getSession();
        
        if (sqlSessionFactory != null)
            session = sqlSessionFactory.openSession();
        
        fMapper = session.getMapper(FichaMedicaMapper.class);
    }

    public int insert(FichaMedica f) {
        int resut = fMapper.insert(f);
//        cMapper.insert(c);
        if( resut > 0)
            session.commit();
        return resut;
    }

    public boolean deleteById(String id) {
        if(fMapper.deleteById(id)>0){
            session.commit();
            return true;
        }
        return false;
    }
    
}
