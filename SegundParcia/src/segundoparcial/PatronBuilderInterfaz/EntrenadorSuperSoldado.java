/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial.PatronBuilderInterfaz;

import segundoparcial.PatronBuilderClases.SuperSoldado;

/**
 *
 * @author Docente
 */
public interface EntrenadorSuperSoldado {
    public void asignarVida();
    public void asignarDañoEdificios();
    public void asignarDañoEjercito();
    public void asignarNombre();
    public SuperSoldado getSuperSoldado();
}
