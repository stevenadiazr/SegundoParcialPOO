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
public class EntrenadorElibe implements segundoparcial.PatronBuilder.Entrenador{
    private Ejercito ejercito;

    public EntrenadorElibe(){
        this.ejercito = new Ejercito();
    }
    
    @Override
    public void asignarVida() {
        ejercito.setVida(250);
    }

    @Override
    public void asignarDañoEdificios() {
        ejercito.setDañoEdificios(85);
    }

    @Override
    public void asignarDañoEjercito() {
        ejercito.setDañoEjercito(60);
    }

    @Override
    public void asignarNombre() {
        ejercito.setNombre("Ejercito de Elibe");
    }

    @Override
    public Ejercito getEjercito() {
        return this.ejercito;
    }
}
