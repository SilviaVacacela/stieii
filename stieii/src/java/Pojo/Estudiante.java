package Pojo;
// Generated 28/03/2016 11:00:41 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Estudiante generated by hbm2java
 */
public class Estudiante  implements java.io.Serializable {


     private int idEst;
     private Unidadensenianza unidadensenianza;
     private Usuario usuario;
     private Set entrenamientos = new HashSet(0);
     private Set resultados = new HashSet(0);

    public Estudiante() {
    }

	
    public Estudiante(int idEst, Unidadensenianza unidadensenianza, Usuario usuario) {
        this.idEst = idEst;
        this.unidadensenianza = unidadensenianza;
        this.usuario = usuario;
    }
    public Estudiante(int idEst, Unidadensenianza unidadensenianza, Usuario usuario, Set entrenamientos, Set resultados) {
       this.idEst = idEst;
       this.unidadensenianza = unidadensenianza;
       this.usuario = usuario;
       this.entrenamientos = entrenamientos;
       this.resultados = resultados;
    }
   
    public int getIdEst() {
        return this.idEst;
    }
    
    public void setIdEst(int idEst) {
        this.idEst = idEst;
    }
    public Unidadensenianza getUnidadensenianza() {
        return this.unidadensenianza;
    }
    
    public void setUnidadensenianza(Unidadensenianza unidadensenianza) {
        this.unidadensenianza = unidadensenianza;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Set getEntrenamientos() {
        return this.entrenamientos;
    }
    
    public void setEntrenamientos(Set entrenamientos) {
        this.entrenamientos = entrenamientos;
    }
    public Set getResultados() {
        return this.resultados;
    }
    
    public void setResultados(Set resultados) {
        this.resultados = resultados;
    }




}


