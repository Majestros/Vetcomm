package persistencia.mappers;

import java.util.ArrayList;
import modelo.MedicoVeterinario;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface MedicoVeterinarioMapper {

    final String INSERT = "INSERT INTO medicoveterinario (rut, nombre, especialidad) "
            + "VALUES (#{rut},#{nombre},#{especialidad}) ";
    final String DELETE_BY_RUT = "DELETE FROM medicoveterinario WHERE rut=#{rut}";
    final String UPDATE = "UPDATE medicoveterinario SET nombre=#{nombre},especialidad=#{especialidad} "
            + " WHERE rut=#{rut}";
    final String SELECT_ALL = "SELECT * FROM medicoveterinario";
    final String SELECT_BY_RUT = "SELECT FROM medicoveterinario WHERE rut=#{rut}";

    @Insert(INSERT)
    int insert(MedicoVeterinario medicoveterinario);

    @Delete(DELETE_BY_RUT)
    int deleteByRut(String rut);

    @Update(UPDATE)
    int updateMedicoVeterinario(MedicoVeterinario medicoveterinario);

    @Select(SELECT_ALL)
    ArrayList<MedicoVeterinario> selectAll();

    @Select(SELECT_BY_RUT)
    MedicoVeterinario selectByRut(String rut);
}
