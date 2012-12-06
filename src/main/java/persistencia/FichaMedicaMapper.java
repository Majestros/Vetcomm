package persistencia;

import java.util.ArrayList;
import modelo.FichaMedica;
import modelo.Mascota;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface FichaMedicaMapper {
	final String INSERT = "INSERT INTO fichamedica (id, asunto, sintoma, diagnostico, fecha) "
                + "VALUES (#{id},#{asunto},#{sintoma},#{diagnostico},#{fecha}) ";
//	final String SELECT_ALL = "SELECT * FROM fichamedica";
//        final String SELECT_BY_ID = "SELECT FROM mascota WHERE id=#{id} "
//                + "AND nombre=#{nombre}";
//        final String SELECT_ALL_BY_ID = "SELECT * mascota WHERE id=#{id}";
//        final String UPDATE_BY_ID = "UPDATE mascota (id, nombre, raza, genero) "
//                + "VALUES (#{id},#{nombre},#{raza},#{genero})";
	final String DELETE_BY_ID = "DELETE FROM mascota WHERE id=#{id}";
	
	
	@Insert(INSERT)
	int insert(Mascota mascota);
        	
	@Delete(DELETE_BY_ID)
	int deleteById(String id);

    public int insert(FichaMedica f);
	
}