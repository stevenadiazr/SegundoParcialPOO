/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial.PatronBuilderClases;

/**
 *
 * @author Docente
 */
public class Edificio implements segundoparcial.PatronBuilderInterfaz.CrearEdificioRecurso{
    private int vida;
    private int CantMax;
    private int TipoRecurso;
    private int CantProducida;
    private String nombre;
    
    
    @Override
    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public void setCantMax(int CantMax) {
        this.CantMax = CantMax;
    }

    @Override
    public void setCantProducida(int CantProducida) {
        this.CantProducida = CantProducida;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setTipoRecurso(int TipoRecurso) {
        this.TipoRecurso = TipoRecurso;
    }
    
        //comprobación
    @Override
    public String toString(){
       return "Un edificio ha sido creado con las siguientes especificaciones: Nombre: " + nombre + ", Vida: "
               + vida + ", Cantidad maxima de almacenamiento:" + CantMax + ", Cantidad producida por fase: " 
               + CantProducida + ", Tipo de recurso generado:" + TipoRecurso; 
    }
}
