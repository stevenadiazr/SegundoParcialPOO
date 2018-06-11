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
public class EntrenadorLycianoSuperSoldado implements segundoparcial.PatronBuilder.EntrenadorSuperSoldado{
    private SuperSoldado superSoldado;

    public EntrenadorLycianoSuperSoldado(){
        this.superSoldado = new SuperSoldado();
    }
    
    @Override
    public void asignarVida() {
        superSoldado.setVida(300);
    }

    @Override
    public void asignarDañoEdificios() {
        superSoldado.setDañoEdificios(200);
    }

    @Override
    public void asignarDañoEjercito() {
        superSoldado.setDañoEjercito(150);
    }

    @Override
    public void asignarNombre() {
        superSoldado.setNombre("Super soldado Lyciano");
    }

    public SuperSoldado getSuperSoldado() {
        return this.superSoldado;
    }
}
