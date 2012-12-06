package persistencia;

import java.util.ArrayList;
import modelo.Mascota;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface MascotaMapper {
	final String INSERT = "INSERT INTO mascota (id, nombre, raza, genero) "
                + "VALUES (#{id},#{nombre},#{raza},#{genero}) ";
	final String SELECT_ALL = "SELECT * FROM mascota";
        final String SELECT_BY_ID = "SELECT FROM mascota WHERE id=#{id} "
                + "AND nombre=#{nombre}";
        final String SELECT_ALL_BY_ID = "SELECT * mascota WHERE id=#{id}";
        final String UPDATE_BY_ID = "UPDATE mascota (id, nombre, raza, genero) "
                + "VALUES (#{id},#{nombre},#{raza},#{genero})";
	final String DELETE_BY_ID = "DELETE FROM mascota WHERE id=#{id}";
	
	@Select(SELECT_ALL)
	ArrayList<Mascota> getAllMascotas();
        
        @Select(SELECT_BY_ID)
        Mascota selectById(Mascota mascota);
	
	@Insert(INSERT)
	int insert(Mascota mascota);
        
        @Update(UPDATE_BY_ID)
        int updateById(Mascota mascota);
	
	@Delete(DELETE_BY_ID)
	int deleteById(String id);
	
}
