/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial.PatronBuilderClases;

import segundoparcial.PatronBuilderInterfaz.Mecanico;
/**
 *
 * @author Docente
 */
public class Taller {
    private Mecanico mecanico;
    
    public Taller(Mecanico mecanico){
        this.mecanico = mecanico;
    }
    
    public void entrenarVehiculo(){
        this.mecanico.asignarNombre();
        this.mecanico.asignarVida();
        this.mecanico.asignarDañoEdificios();
        this.mecanico.asignarDañoEjercito();
    }
    
    public Vehiculo getVehiculo(){
        return this.mecanico.getVehiculo();
    }
}
