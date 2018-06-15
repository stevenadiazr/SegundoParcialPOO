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
public class EntrenadorLyciano implements segundoparcial.PatronBuilderInterfaz.Entrenador{
    private Ejercito ejercito;

    public EntrenadorLyciano(){
        this.ejercito = new Ejercito();
    }
    
    @Override
    public void asignarVida() {
        ejercito.setVida(200);
    }

    @Override
    public void asignarDañoEdificios() {
        ejercito.setDañoEdificios(100);
    }

    @Override
    public void asignarDañoEjercito() {
        ejercito.setDañoEjercito(75);
    }

    @Override
    public void asignarNombre() {
        ejercito.setNombre("Ejercito Lyciano");
    }

    public Ejercito getEjercito() {
        return this.ejercito;
    }
}
