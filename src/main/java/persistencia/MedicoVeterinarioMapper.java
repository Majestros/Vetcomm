/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import modelo.Cliente;
import modelo.MedicoVeterinario;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 *
 * @author Administrador
 */
public interface MedicoVeterinarioMapper {

    final String INSERT = "INSERT INTO medicoveterinario (rut, nombre, especialidad) VALUES (#{rut},#{nombre},#{especialidad}) ";
    final String SELECT_ALL = "SELECT * FROM medicoveterniario";
    final String SELECT_BY_ID = "SELECT FROM medicoveterinario WHERE id=#{id}";
    final String DELETE_BY_ID = "DELETE FROM medicoveterinario WHERE id=#{id}";
    final String UPDATE_BY_ID = "UPDATE medicoveterinario (rut, nombre, especialidad) "
                + "VALUES (#{rut},#{nombre},#{especial})";
    
    @Insert(INSERT)
	void insert(Cliente cliente);
    
    @Select(SELECT_ALL)
        List<MedicoVeterinario> getAllUsuarios();
    
    @Delete(DELETE_BY_ID)
	int deleteById(String id);
    
    @Update (UPDATE_BY_ID)
        int updateById(MedicoVeterinario medicoveterinario);
        
}
