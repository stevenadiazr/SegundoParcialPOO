/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial.PatronBuilderInterfaz;

import segundoparcial.PatronBuilderClases.Edificio;
/**
 *
 * @author Docente
 */
public interface Constructor {
    public void asignarVida();
    public void asignarCantMax();
    public void asignarCantProducida();
    public void asignarNombre();
    public void asignarTipoRecurso();
    public Edificio getEdificio();
}
