package persistencia.mappers;

import java.util.ArrayList;
import modelo.Cliente;
import modelo.Mascota;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface MascotaMapper {

    final String INSERT = "INSERT INTO mascota (id, nombre, raza, genero) "
            + "VALUES (#{id},#{nombre},#{raza},#{genero}) ";
    final String DELETE_BY_ID = "DELETE FROM mascota WHERE id=#{id} AND nombre=#{nombre}";
    final String UPDATE = "UPDATE mascota SET raza=#{raza},genero=#{genero} "
            + " WHERE id=#{id}";
    final String SELECT_ALL = "SELECT * FROM mascota";
    final String SELECT_BY_ID = "SELECT FROM mascota WHERE id=#{id} "
            + "AND nombre=#{nombre}";
    final String SELECT_ALL_BY_CLIENTE = "SELECT * FROM mascota WHERE id=#{rut}";
    final String SELECT_ALL_BY_ID = "SELECT * mascota WHERE id=#{id}";

    @Insert(INSERT)
    int insert(Mascota mascota);

    @Delete(DELETE_BY_ID)
    int deleteById(Mascota mascota);

    @Update(UPDATE)
    int update(Mascota mascota);

    @Select(SELECT_ALL)
    ArrayList<Mascota> getAllMascotas();

    @Select(SELECT_BY_ID)
    Mascota selectById(Mascota mascota);

    @Select(SELECT_ALL_BY_CLIENTE)
    ArrayList<Mascota> getAllByCliente(Cliente c);
}
