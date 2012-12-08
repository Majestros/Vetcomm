package persistencia.mappers;

import java.util.ArrayList;
import modelo.FichaMedica;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface FichaMedicaMapper {
	final String INSERT = "INSERT INTO fichamedica (id, asunto, sintoma, diagnostico, fecha) "
                + "VALUES (#{id},#{asunto},#{sintoma},#{diagnostico},#{fecha}) ";
        final String DELETE_BY_ID = "DELETE FROM mascota WHERE id=#{id}";
        final String UPDATE_BY_ID = "UPDATE fichamedica (id, asunto, sintoma, diagnostico, fecha) "
                + "VALUES (#{id},#{asunto},#{sintoma},#{diagnostico},#{fecha}) ";
	final String SELECT_ALL = "SELECT * FROM fichamedica";
//        final String SELECT_ALL_BY_ID = "SELECT * fichamedica WHERE id=#{id}";
        
	
        @Insert(INSERT)
	int insert(FichaMedica fichamedica);
        	
	@Delete(DELETE_BY_ID)
	int deleteById(String id);
        
        @Update(UPDATE_BY_ID)
        int updateById(FichaMedica fichamedica);
        
        @Select(SELECT_ALL)
        ArrayList<FichaMedica> selectAll();
        
        
	
}