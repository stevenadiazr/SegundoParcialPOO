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
public class MecanicoElibe implements segundoparcial.PatronBuilder.Mecanico{
    private Vehiculo vehiculo;

    public MecanicoElibe(){
        this.vehiculo = new Vehiculo();
    }
    
    @Override
    public void asignarVida() {
        vehiculo.setVida(200);
    }

    @Override
    public void asignarDañoEdificios() {
        vehiculo.setDañoEdificios(100);
    }

    @Override
    public void asignarDañoEjercito() {
        vehiculo.setDañoEjercito(75);
    }

    @Override
    public void asignarNombre() {
        vehiculo.setNombre("Vehiculo Elibe");
    }

    @Override
    public Vehiculo getVehiculo() {
        return this.vehiculo;
    }
}
