package modelo;

import java.util.ArrayList;

public class Mascota {
    
    private String id;
    private String nombre;
    private String raza;
    private boolean genero;
    private ArrayList<HistorialMedico> historial = new ArrayList<HistorialMedico>();

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

    public boolean isGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }

    public ArrayList<HistorialMedico> getHistorial() {
        return historial;
    }

    public void setHistorial(ArrayList<HistorialMedico> historial) {
        this.historial = historial;
    }
    
}