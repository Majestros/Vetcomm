package persistencia.mappers;

import java.util.ArrayList;
import modelo.Cliente;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ClienteMapper {
    
    final String INSERT = ""
            + "INSERT INTO cliente (rut,nombre,direccion,telefono,email) "
            + "VALUES (#{rut},#{nombre},#{direccion},#{telefono},#{email}) ";
    final String DELETE_BY_RUT = "DELETE FROM cliente WHERE rut=#{rut}";
    final String UPDATE = "UPDATE cliente SET nombre=#{nombre},direccion=#{direccion},telefono=#{telefono},email=#{email} "
            + " WHERE rut=#{rut}";
    final String SELECT_BY_RUT = "SELECT FROM cliente WHERE rut=#{rut}";
    final String SELECT_ALL = "SELECT * FROM cliente";

    @Insert(INSERT)
    int insert(Cliente cliente);

    @Delete(DELETE_BY_RUT)
    int deleteByRut(String rut);

    @Update(UPDATE)
    int update(Cliente cliente);

    @Select(SELECT_BY_RUT)
    Cliente selectByRut(String rut);

    @Select(SELECT_ALL)
    ArrayList<Cliente> getAllUsuarios();
}
