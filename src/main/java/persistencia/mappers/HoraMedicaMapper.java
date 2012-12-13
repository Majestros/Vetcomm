package persistencia.mappers;

import java.util.ArrayList;
import modelo.HoraMedica;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface HoraMedicaMapper {

    final String INSERT = "INSERT INTO horamedica (rutcliente, nombremascota, rutveterinario, fecha, hora, sala) "
                + "VALUES ( #{rutcliente}, #{nombremascota}, #{rutveterinario}, #{fecha}, #{hora}, #{sala} ) ";
    final String DELETE_BY_FECHA = "DELETE FROM horamedica WHERE fecha=#{fecha} AND hora=#{hora}";
    final String SELECT_ALL = "SELECT * FROM horamedica";
    
    @Insert(INSERT)
    int insertHoraMedica(HoraMedica h);
    
    @Delete(DELETE_BY_FECHA)
    int deleteByFecha(HoraMedica h);
    
    @Select(SELECT_ALL)
    ArrayList<HoraMedica> obtenerHorasMedicas();
            
}
