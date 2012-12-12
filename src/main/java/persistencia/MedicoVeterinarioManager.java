package persistencia;

import static controlador.Principal.SQLSESSION;
import java.util.ArrayList;
import modelo.MedicoVeterinario;
import persistencia.mappers.MedicoVeterinarioMapper;

public class MedicoVeterinarioManager {

    private MedicoVeterinarioMapper vMapper;

    public MedicoVeterinarioManager() {
        if (SQLSESSION != null) {
            vMapper = SQLSESSION.getMapper(MedicoVeterinarioMapper.class);
        }
    }

    public int insert(MedicoVeterinario v) {
        int resut = vMapper.insert(v);
        SQLSESSION.commit();
        return resut;
    }

    public boolean deleteByRut(String rut) {
        if (vMapper.deleteByRut(rut) > 0) {
            SQLSESSION.commit();
            return true;
        }
        return false;
    }

    public MedicoVeterinario obtenerMedicoVeterinario(String rut) {
        return vMapper.selectByRut(rut);
    }

    public ArrayList<MedicoVeterinario> obtenerMedicosVeterinarios() {
        ArrayList<MedicoVeterinario> listaAct = vMapper.selectAll();
        return listaAct;
    }

    public int updateMedicoVeterinario(MedicoVeterinario v) {
        int result = vMapper.update(v);
        SQLSESSION.commit();
        return result;
    }
}
