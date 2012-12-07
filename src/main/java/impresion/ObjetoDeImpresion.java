package impresion;

import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.util.ArrayList;
import modelo.FichaMedica;
import modelo.Mascota;

public class ObjetoDeImpresion implements Printable{
    
    private String histOrdenado="";
    
    public boolean imprimirHistorial(Mascota m){
        
        ordenarHistorial(m.getHistorial());
        
        return false;
    }

    public int print(Graphics g, PageFormat f, int pageIndex){
        if(pageIndex == 0){
            g.drawString("Historial Mascota.", 100, 200);
            g.drawString("Colocar aca mas datos.", 100, 205);
            g.drawString(histOrdenado, pageIndex, pageIndex);
            
            //para agregar mas texto
            //g.drawString(“mas texto”, coordenada_x, coordenada_y)
            return PAGE_EXISTS;
        }else{
            return NO_SUCH_PAGE;
        }
    }

    private String ordenarHistorial(ArrayList<FichaMedica> historial) {
        
        for (int cont = 0; cont < historial.size(); cont++) {
            FichaMedica fichaMedica = historial.get(cont);
            histOrdenado = fichaMedica.toString()+"\n";
        }
        return histOrdenado;
    }
    
}
