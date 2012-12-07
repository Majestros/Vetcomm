/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.mappers;

import modelo.Usuario;
import org.apache.ibatis.annotations.Select;

public interface UsuarioMapper {
    final String GET_USUARIO = "SELECT * FROM usuario WHERE nombre=#{nombre} AND clave=#{clave}";
    final String ADD_USUARIO = "INSERT INTO usuario VALUES (#{nombre},#{clave})";
    
    @Select(GET_USUARIO)
    Usuario getUsuario(Usuario usuario);
    
    @Select(ADD_USUARIO)
    int insertUsuario(Usuario usuario);
}
