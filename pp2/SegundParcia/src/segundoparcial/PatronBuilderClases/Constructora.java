/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial.PatronBuilderClases;

import segundoparcial.PatronBuilderInterfaz.Constructor;
/**
 *
 * @author Docente
 */
public class Constructora {
    private Constructor constructor;
    
    public Constructora(Constructor constructor){
        this.constructor = constructor;
    }
    
    public void hacerEdificio(){
        this.constructor.asignarNombre();
        this.constructor.asignarVida();
        this.constructor.asignarCantMax();
        this.constructor.asignarCantProducida();
        this.constructor.asignarTipoRecurso();
    }
    
    public Edificio getEdificio(){
        return this.constructor.getEdificio();
    }
}
