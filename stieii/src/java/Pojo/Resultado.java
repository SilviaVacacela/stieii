package Pojo;
// Generated 28/03/2016 11:00:41 AM by Hibernate Tools 4.3.1



/**
 * Resultado generated by hbm2java
 */
public class Resultado  implements java.io.Serializable {


     private int idResultado;
     private Concepto concepto;
     private Estudiante estudiante;
     private double valor;

    public Resultado() {
    }

    public Resultado(int idResultado, Concepto concepto, Estudiante estudiante, double valor) {
       this.idResultado = idResultado;
       this.concepto = concepto;
       this.estudiante = estudiante;
       this.valor = valor;
    }
   
    public int getIdResultado() {
        return this.idResultado;
    }
    
    public void setIdResultado(int idResultado) {
        this.idResultado = idResultado;
    }
    public Concepto getConcepto() {
        return this.concepto;
    }
    
    public void setConcepto(Concepto concepto) {
        this.concepto = concepto;
    }
    public Estudiante getEstudiante() {
        return this.estudiante;
    }
    
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    public double getValor() {
        return this.valor;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }



}


