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
public class MecanicoBiran implements segundoparcial.PatronBuilderInterfaz.Mecanico{
    private Vehiculo vehiculo;

    public MecanicoBiran(){
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
        vehiculo.setNombre("Vehiculo Biran");
    }

    @Override
    public Vehiculo getVehiculo() {
        return this.vehiculo;
    }
}
