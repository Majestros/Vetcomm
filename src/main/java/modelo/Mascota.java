package modelo;

import java.util.ArrayList;

public class Mascota {
    
    private String id;
    private String nombre;
    private String raza;
    private boolean genero;
    private ArrayList<FichaMedica> historial = new ArrayList<FichaMedica>();

    public Mascota() {
        super();
    }

    public Mascota(String id, String nombre, String raza, boolean genero) {
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
        this.genero = genero;
    }    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean getGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }

    public ArrayList<FichaMedica> getHistorial() {
        return historial;
    }

    public void setHistorial(ArrayList<FichaMedica> historial) {
        this.historial = historial;
    }

   @Override
   public String toString (){
       return nombre;
   }

    public void agregarFichaMedica(FichaMedica obtenerDatosHistorial) {
        this.historial.add(obtenerDatosHistorial);
    }    
    
    
       
}