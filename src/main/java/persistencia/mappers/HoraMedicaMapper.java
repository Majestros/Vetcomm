/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.mappers;

import modelo.HoraMedica;

/**
 *
 * @author Kal-El
 */
public interface HoraMedicaMapper {

    public int insert(HoraMedica h);

    public int deleteByFecha(String fecha);
    
}
