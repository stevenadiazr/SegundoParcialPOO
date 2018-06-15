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
public class ConstructorBiran4 implements segundoparcial.PatronBuilderInterfaz.Constructor{
    private Edificio edificio;

    public ConstructorBiran4(){
        this.edificio = new Edificio();
    }
    
    @Override
    public void asignarVida() {
        edificio.setVida(200);
    }

    @Override
    public void asignarNombre() {
        edificio.setNombre("Edificio de Tropas");
    }

    @Override
    public void asignarCantMax() {
        edificio.setCantMax(10);
    }

    @Override
    public void asignarCantProducida() {
        edificio.setCantProducida(1);
    }

    @Override
    public void asignarTipoRecurso() {
    }

    @Override
    public Edificio getEdificio() {
        return this.edificio;
    }
}
