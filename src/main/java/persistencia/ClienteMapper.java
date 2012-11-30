package persistencia;

import java.util.List;
import modelo.Cliente;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface ClienteMapper {
	final String INSERT = "INSERT INTO cliente (rut,nombre) VALUES (#{rut},#{nombre}) ";
	final String SELECT_ALL = "SELECT * FROM cliente";
	final String DELETE_BY_ID = "DELETE FROM cliente WHERE id=#{id}";
	
	@Select(SELECT_ALL)
	List<Cliente> getAllUsuarios();
	
	@Insert(INSERT)
	void insert(Cliente cliente);
	
	@Delete(DELETE_BY_ID)
	int deleteById(String id);
	
}
