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
public class ConstructorBiran2 implements segundoparcial.PatronBuilderInterfaz.Constructor{
    private Edificio edificio;

    public ConstructorBiran2(){
        this.edificio = new Edificio();
    }
    
    @Override
    public void asignarVida() {
        edificio.setVida(200);
    }

    @Override
    public void asignarNombre() {
        edificio.setNombre("Edificio de recurso");
    }

    @Override
    public void asignarCantMax() {
        edificio.setCantMax(500);
    }

    @Override
    public void asignarCantProducida() {
        edificio.setCantProducida(25);
    }

    @Override
    public void asignarTipoRecurso() {
        edificio.setTipoRecurso(2);
    }

    @Override
    public Edificio getEdificio() {
        return this.edificio;
    }
}
