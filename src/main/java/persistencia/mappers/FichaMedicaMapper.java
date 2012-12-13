package persistencia.mappers;

import java.util.ArrayList;
import modelo.FichaMedica;
import modelo.Mascota;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface FichaMedicaMapper {

    final String INSERT = "INSERT INTO fichamedica (id, nombre, motivo, sintoma, diagnostico, fecha) "
            + "VALUES (#{id},#{nombre},#{motivo},#{sintoma},#{diagnostico},#{fecha}) ";
    final String DELETE_BY_ID = "DELETE FROM mascota WHERE id=#{id}";
    final String UPDATE_BY_ID = "UPDATE fichamedica (id, asunto, sintoma, diagnostico, fecha) "
            + "VALUES (#{id},#{asunto},#{sintoma},#{diagnostico},#{fecha}) ";
    final String SELECT_ALL = "SELECT * FROM fichamedica";
    final String SELECT_BY_MASCOTA = "SELECT * FROM fichamedica WHERE id=#{id} AND nombre=#{nombre}";

    @Insert(INSERT)
    int insert(FichaMedica fichamedica);

    @Delete(DELETE_BY_ID)
    int deleteById(String id);

    @Update(UPDATE_BY_ID)
    int updateById(FichaMedica fichamedica);

    @Select(SELECT_BY_MASCOTA)
    ArrayList<FichaMedica> getFichasByMascota(Mascota m);
    
    @Select(SELECT_ALL)
    ArrayList<FichaMedica> getFichas();
    
}