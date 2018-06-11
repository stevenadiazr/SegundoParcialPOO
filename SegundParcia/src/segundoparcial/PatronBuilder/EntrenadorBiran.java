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
public class EntrenadorBiran implements segundoparcial.PatronBuilder.Entrenador{
    private Ejercito ejercito;

    public EntrenadorBiran(){
        this.ejercito = new Ejercito();
    }
    
    @Override
    public void asignarVida() {
        ejercito.setVida(150);
    }

    @Override
    public void asignarDañoEdificios() {
        ejercito.setDañoEdificios(115);
    }

    @Override
    public void asignarDañoEjercito() {
        ejercito.setDañoEjercito(90);
    }

    @Override
    public void asignarNombre() {
        ejercito.setNombre("Ejercito de Biran");
    }

    @Override
    public Ejercito getEjercito() {
        return this.ejercito;
    }
}
