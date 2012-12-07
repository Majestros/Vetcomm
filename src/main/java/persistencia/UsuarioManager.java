/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import modelo.Usuario;
import persistencia.mappers.UsuarioMapper;
import static controlador.Principal.SQLSESSION;
/**
 *
 * @author Kal-El
 */
public class UsuarioManager {
    
    private UsuarioMapper usrMapper;
    public UsuarioManager(){
        if(SQLSESSION != null)
            usrMapper = SQLSESSION.getMapper(UsuarioMapper.class);
            
    }
    
    public Usuario obtenerUsuario(Usuario usuario){
          return usrMapper.getUsuario(usuario);
    }
}
