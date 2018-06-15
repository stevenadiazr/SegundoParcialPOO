/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial.PatronBuilderClases;

import segundoparcial.PatronBuilderInterfaz.EntrenadorSuperSoldado;
/**
 *
 * @author Docente
 */
public class SuperCampamento {
    private EntrenadorSuperSoldado entrenadorSuper;
    
    public SuperCampamento(EntrenadorSuperSoldado entrenadorSuper){
        this.entrenadorSuper = entrenadorSuper;
    }
    
    public void entrenarSuper(){
        this.entrenadorSuper.asignarNombre();
        this.entrenadorSuper.asignarVida();
        this.entrenadorSuper.asignarDañoEdificios();
        this.entrenadorSuper.asignarDañoEjercito();
    }
    
    public SuperSoldado getSuper(){
        return this.entrenadorSuper.getSuperSoldado();
    }
    
}
