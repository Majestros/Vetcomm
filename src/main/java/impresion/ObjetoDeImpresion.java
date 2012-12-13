package impresion;

import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.util.ArrayList;
import modelo.FichaMedica;

public class ObjetoDeImpresion implements Printable{
    
    private String histOrdenado="";
    ArrayList<FichaMedica> fichasMedicas=new ArrayList<FichaMedica>();

    public ObjetoDeImpresion() {
    }
    
    public ObjetoDeImpresion(ArrayList<FichaMedica> fM){
        this.fichasMedicas = fM;
    }
    
    public void imprimirHistorial(){
        
        ordenarHistorial(this.fichasMedicas);
        print(null, null, PAGE_EXISTS);
        
    }

    public int print(Graphics g, PageFormat f, int pageIndex){
        if(pageIndex == 0){
            g.drawString(histOrdenado, 100, 200);
            
            //para agregar mas texto
            //g.drawString(“mas texto”, coordenada_x, coordenada_y)
            return PAGE_EXISTS;
        }else{
            return NO_SUCH_PAGE;
        }
    }

    private void ordenarHistorial(ArrayList<FichaMedica> historial) {
        
        for (int cont = 0; cont < historial.size(); cont++) {
            FichaMedica fichaMedica = historial.get(cont);
            this.histOrdenado += fichaMedica.toString()+"\n\n";
        }
    }
    
}
