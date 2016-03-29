package Pojo;
// Generated 28/03/2016 11:00:41 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Preguntaentrenar generated by hbm2java
 */
public class Preguntaentrenar  implements java.io.Serializable {


     private int idInt;
     private Entrenamiento entrenamiento;
     private Date fecha;
     private int valor;
     private int incorrecto;
     private Set fichaspreguntas = new HashSet(0);

    public Preguntaentrenar() {
    }

	
   public Preguntaentrenar(int idInt, Entrenamiento entrenamiento, Date fecha, int valor, int incorrecto) {
        this.idInt = idInt;
        this.entrenamiento = entrenamiento;
        this.fecha = fecha;
        this.valor = valor;
        this.incorrecto = incorrecto;
    }
    public Preguntaentrenar(int idInt, Entrenamiento entrenamiento, Date fecha, int valor, int incorrecto, Set fichaspreguntas) {
       this.idInt = idInt;
       this.entrenamiento = entrenamiento;
       this.fecha = fecha;
       this.valor = valor;
       this.incorrecto = incorrecto;
       this.fichaspreguntas = fichaspreguntas;
    }
   
    public int getIdInt() {
        return this.idInt;
    }
    
    public void setIdInt(int idInt) {
        this.idInt = idInt;
    }
    public Entrenamiento getEntrenamiento() {
        return this.entrenamiento;
    }
    
    public void setEntrenamiento(Entrenamiento entrenamiento) {
        this.entrenamiento = entrenamiento;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public int getValor() {
        return this.valor;
    }
    
    public void setValor(int valor) {
        this.valor = valor;
    }
    public int getIncorrecto() {
        return this.incorrecto;
    }
    
    public void setIncorrecto(int incorrecto) {
        this.incorrecto = incorrecto;
    }
    public Set getFichaspreguntas() {
        return this.fichaspreguntas;
    }
    
    public void setFichaspreguntas(Set fichaspreguntas) {
        this.fichaspreguntas = fichaspreguntas;
    }




}


