/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial.PatronBuilderInterfaz;

import segundoparcial.PatronBuilderClases.Vehiculo;
/**
 *
 * @author Docente
 */
public interface Mecanico {
    public void asignarVida();
    public void asignarDañoEdificios();
    public void asignarDañoEjercito();
    public void asignarNombre();
    public Vehiculo getVehiculo();
}
