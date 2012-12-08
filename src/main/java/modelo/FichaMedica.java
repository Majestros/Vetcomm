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
    private String asunto;
    private String sintoma;
    private String diagnostico;
    private String fecha;

    public FichaMedica() {
    }

    public FichaMedica(String id, String asunto, String sintoma, String diagnostico, String fecha) {
        this.id = id;
        this.asunto = asunto;
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

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
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
}
