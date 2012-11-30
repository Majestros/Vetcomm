package persistencia;

import java.util.List;
import modelo.Cliente;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ClienteMapper {
	final String INSERT = "INSERT INTO cliente (rut,nombre,direccion,telefono,email) VALUES (#{rut},#{nombre},#{direccion},#{telefono},#{email}) ";
	final String SELECT_ALL = "SELECT * FROM cliente";
        final String UPDATE_BY_ID = "UPDATE cliente (rut,nombre,direccion,telefono,email) "
                + "VALUES (#{rut},#{nombre},#{direccion},#{telefono},#{email}) WHERE rut=#{rut}";
        final String SELECT_BY_ID = "SELECT FROM cliente WHERE id=#{id}";
	final String DELETE_BY_ID = "DELETE FROM cliente WHERE id=#{id}";
	
	@Select(SELECT_ALL)
	List<Cliente> getAllUsuarios();
	
	@Insert(INSERT)
	void insert(Cliente cliente);
        
        @Update(UPDATE_BY_ID)
        int updateById(Cliente cliente);
        
        @Select(SELECT_BY_ID)
        Cliente selectById(String rut);
	
	@Delete(DELETE_BY_ID)
	int deleteById(String id);
	
}
