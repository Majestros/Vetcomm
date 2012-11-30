package persistencia;

import java.util.List;
import modelo.Mascota;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface MascotaMapper {
	final String INSERT = "INSERT INTO mascota (id, nombre, raza, genero) "
                + "VALUES (#{id},#{nombre},#{raza},#{genero}) ";
	final String SELECT_ALL = "SELECT * FROM mascota";
	final String DELETE_BY_ID = "DELETE FROM mascota WHERE id=#{id}";
	
	@Select(SELECT_ALL)
	List<Mascota> getAllMascotas();
	
	@Insert(INSERT)
	void insert(Mascota mascota);
	
	@Delete(DELETE_BY_ID)
	int deleteById(String id);
	
}
