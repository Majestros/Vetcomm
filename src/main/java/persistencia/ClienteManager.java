package persistencia;

import static controlador.Principal.SQLSESSION;
import java.util.ArrayList;
import modelo.Cliente;
import persistencia.mappers.ClienteMapper;

/**
 * Clase encargada de implementar todas las consultas<br/> a la base de datos
 *
 * @version 1.0
 */

public class ClienteManager {

    private ClienteMapper cMapper;

    public ClienteManager() {
        if (SQLSESSION != null) {
            cMapper = SQLSESSION.getMapper(ClienteMapper.class);
        }
    }

    public int insert(Cliente c) {
        int resut = cMapper.insert(c);
        if (resut > 0) {
            SQLSESSION.commit();
        }
        return resut;
    }

    public boolean deleteByRut(String rut) {
        if (cMapper.deleteByRut(rut) > 0) {
            SQLSESSION.commit();
            return true;
        }
        return false;
    }

    public int update(Cliente c) {
        int result = cMapper.update(c);
        if (result > 0) {
            SQLSESSION.commit();
        }
        return result;
    }
    
    public Cliente obtenerCliente(String rut) {
        return cMapper.selectByRut(rut);    
    }

    public ArrayList<Cliente> obtenerClientes() {
        ArrayList<Cliente> listaAct = cMapper.getAllUsuarios();
        return listaAct;
    }
}