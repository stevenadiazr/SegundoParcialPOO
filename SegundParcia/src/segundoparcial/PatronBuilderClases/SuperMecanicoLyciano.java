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
public class SuperMecanicoLyciano implements segundoparcial.PatronBuilderInterfaz.SuperMecanico{
    private SuperVehiculo SuperVehiculo;

    public SuperMecanicoLyciano(){
        this.SuperVehiculo = new SuperVehiculo();
    }
    
    @Override
    public void asignarVida() {
        SuperVehiculo.setVida(200);
    }

    @Override
    public void asignarDañoEdificios() {
        SuperVehiculo.setDañoEdificios(100);
    }

    @Override
    public void asignarDañoEjercito() {
        SuperVehiculo.setDañoEjercito(75);
    }

    @Override
    public void asignarNombre() {
        SuperVehiculo.setNombre("Super vehiculo Lyciano");
    }

    @Override
    public SuperVehiculo getVehiculo() {
        return this.SuperVehiculo;
    }
}
