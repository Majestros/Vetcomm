package persistencia;

import java.util.List;
import modelo.Cliente;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ClienteMapper {
	final String INSERT = "INSERT INTO cliente (rut,nombre,direccion,telefono,email) "
                + "VALUES (#{rut},#{nombre},#{direccion},#{telefono},#{email}) ";
        final String UPDATE_BY_RUT = "UPDATE cliente (rut,nombre,direccion,telefono,email) "
                + "VALUES (#{rut},#{nombre},#{direccion},#{telefono},#{email}) WHERE rut=#{rut}";
	final String SELECT_ALL = "SELECT * FROM cliente";
        final String SELECT_BY_RUT = "SELECT FROM cliente WHERE rut=#{rut}";
	final String DELETE_BY_RUT = "DELETE FROM cliente WHERE rut=#{rut}";
	
	@Select(SELECT_ALL)
	List<Cliente> getAllUsuarios();
	
	@Insert(INSERT)
	int insert(Cliente cliente);
        
        @Update(UPDATE_BY_RUT)
        int updateByRut(Cliente cliente);
        
        @Select(SELECT_BY_RUT)
        Cliente selectByRut(String rut);
	
	@Delete(DELETE_BY_RUT)
	int deleteByRut(String rut);
	
}
