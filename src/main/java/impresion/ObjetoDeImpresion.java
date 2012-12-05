/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package impresion;

import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

/**
 *
 * @author Kal-El
 */
public class ObjetoDeImpresion implements Printable{

    public int print(Graphics g, PageFormat f, int pageIndex){
        if(pageIndex == 0){
            g.drawString("Historial Mascota.", 100, 200);
            g.drawString("Colocar aca mas datos.", 100, 205);
            
            //para agregar mas texto
            //g.drawString(“mas texto”, coordenada_x, coordenada_y)
            return PAGE_EXISTS;
        }else{
            return NO_SUCH_PAGE;
        }
    }
    
}
