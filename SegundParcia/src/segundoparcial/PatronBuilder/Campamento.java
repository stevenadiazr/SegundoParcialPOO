/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial.PatronBuilder;

/**
 *
 * @author Docente
 */
public class Campamento {
    private Entrenador entrenador;
    
    public Campamento(Entrenador entrenador){
        this.entrenador = entrenador;
    }
    
    public void entrenarEjercito(){
        this.entrenador.asignarNombre();
        this.entrenador.asignarVida();
        this.entrenador.asignarDañoEdificios();
        this.entrenador.asignarDañoEjercito();
    }
    
    public Ejercito getEjercito(){
        return this.entrenador.getEjercito();
    }
}
