/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

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
    final String SELECT_BY_RUT = "SELECT FROM medicoveterinario WHERE rut=#{rut}";
    final String DELETE_BY_RUT = "DELETE FROM medicoveterinario WHERE rut=#{rut}";
    final String UPDATE_BY_RUT = "UPDATE medicoveterinario (rut, nombre, especialidad) "
                + "VALUES (#{rut},#{nombre},#{especial})";
    
    @Insert(INSERT)
	int insert(MedicoVeterinario medicoveterinario);
    
    @Select(SELECT_ALL)
        List<MedicoVeterinario> getAllUsuarios();
    
    @Select(SELECT_BY_RUT)
        int selectByRut(String rut);
    
    @Delete(DELETE_BY_RUT)
	int deleteByRut(String rut);
    
    @Update (UPDATE_BY_RUT)
        int updateByRut(MedicoVeterinario medicoveterinario);
        
}
