/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import com.seaglasslookandfeel.SeaGlassLookAndFeel;
import interfaz.JFPrincipal;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
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
    public static Veterinaria VETERINARIA = new Veterinaria();
    private static Logger LOGGER = LoggerFactory.getLogger(Principal.class);
    
    public static void main(String[] args){
        
        // Estable el LookAndFeel del programa
        
//        try {
//            LookAndFeel laf = new SeaGlassLookAndFeel();
//            if (laf.isSupportedLookAndFeel())
//                UIManager.setLookAndFeel(laf);
//        }
//        catch (UnsupportedLookAndFeelException ex) {
//            LOGGER.error("Laf no soportada.", ex);
//        }
        VETERINARIA.actualizarArrays();
        JFPrincipal jfPrincipal = new JFPrincipal();
        jfPrincipal.setVisible(true);
    }
    
}
