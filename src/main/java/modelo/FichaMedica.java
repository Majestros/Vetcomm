/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Kal-El
 */
public class FichaMedica {
    
    private String id;
    private String nombre;
    private String motivo;
    private String sintoma;
    private String diagnostico;
    private String fecha;

    public FichaMedica() {
    }

    public FichaMedica(String id, String nombre, String motivo, String sintoma, String diagnostico, String fecha) {
        this.id = id;
        this.nombre=nombre;
        this.motivo = motivo;
        this.sintoma = sintoma;
        this.diagnostico = diagnostico;
        this.fecha = fecha;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return  fecha +"  " + motivo ;
    }
    
    
    
}
