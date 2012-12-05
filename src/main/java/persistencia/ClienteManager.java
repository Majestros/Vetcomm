/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import controlador.ConnectioFactory;
import java.util.ArrayList;
import modelo.Cliente;
import org.apache.ibatis.session.SqlSession;

/**
 * Clase encargada de implementar todas las consultas<br/>
 * a la base de datos
 * @version 1.0
 */
public class ClienteManager {

    private SqlSession session;
    private ClienteMapper cMapper;

    public ClienteManager() {
        session = ConnectioFactory.getSession().openSession();
        cMapper = session.getMapper(ClienteMapper.class);
    }

    public int insert(Cliente c) {
        int resut = cMapper.insert(c);
//        cMapper.insert(c);
        session.commit();
        return resut;
    }

    public int updateByRut(Cliente c) {
        int result = cMapper.updateByRut(c);
        session.commit();
        return result;
    }

    public boolean deleteByRut(String rut) {
        if(cMapper.deleteByRut(rut)>0){
            session.commit();
            return true;
        }
        return false;
    }

    public ArrayList<Cliente> obtenerClientes() {
        ArrayList<Cliente> listaAct = cMapper.getAllUsuarios();
        return listaAct;
    }

}