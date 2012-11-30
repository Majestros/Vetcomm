/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import controlador.ConnectioFactory;
import java.sql.SQLException;
import modelo.Cliente;
import org.apache.ibatis.session.SqlSession;

/**
 *
 * @author Kal-El
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

    public void deleteById(String rut) {
        cMapper.deleteById(rut);

        session.commit();
    }
}
