/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial.PatronBuilderClases;

import segundoparcial.PatronBuilderInterfaz.SuperConstructor;
/**
 *
 * @author Docente
 */
public class SuperConstructora {
    private SuperConstructor superConstructor;
    
    public SuperConstructora(SuperConstructor superConstructor){
        this.superConstructor = superConstructor;
    }
    
    public void hacerEdificio(){
        this.superConstructor.asignarNombre();
        this.superConstructor.asignarVida();
        this.superConstructor.asignarCantMax();
        this.superConstructor.asignarCantProducida();
        this.superConstructor.asignarTipoTropa();
    }
    
    public Edificio getEdificio(){
        return this.superConstructor.getEdificio();
    }
}
