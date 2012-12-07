/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import com.seaglasslookandfeel.SeaGlassLookAndFeel;
import interfaz.JFIngreso;
import interfaz.JFPrincipal;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

/**
 *
 * @author Kal-El
 */
public class Principal {
    
    /**
     * Instancia unica de veterinaria
     */
    public static Veterinaria VETERINARIA;
    public static SqlSession SQLSESSION;
    private static Logger LOGGER = LoggerFactory.getLogger(Principal.class);
    
    public static void main(String[] args){
        
        // Estable el LookAndFeel del programa
        
        try {
            LookAndFeel laf = new SeaGlassLookAndFeel();
            if (laf.isSupportedLookAndFeel())
                UIManager.setLookAndFeel(laf);
        }
        catch (UnsupportedLookAndFeelException ex) {
            LOGGER.error("Laf no soportada.", ex);
        }
        
        // Abre una conexion a la DB 
        SqlSessionFactory sqlSessionFactory = ConnectioFactory.getSession();
        
        if (sqlSessionFactory != null){
            SQLSESSION = sqlSessionFactory.openSession();
        }
        
        // Inicio
        VETERINARIA = new Veterinaria();
        VETERINARIA.actualizarArrays();
        
        // Inicia la UI de ingreso
        new JFIngreso().setVisible(true);
    }
    
}
