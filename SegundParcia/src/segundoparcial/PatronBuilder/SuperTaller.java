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
public class SuperTaller {
    private SuperMecanico superMecanico;
    
    public SuperTaller(SuperMecanico superMecanico){
        this.superMecanico = superMecanico;
    }
    
    public void entrenarVehiculo(){
        this.superMecanico.asignarNombre();
        this.superMecanico.asignarVida();
        this.superMecanico.asignarDañoEdificios();
        this.superMecanico.asignarDañoEjercito();
    }
    
    public SuperVehiculo getVehiculo(){
        return this.superMecanico.getVehiculo();
    }
}
