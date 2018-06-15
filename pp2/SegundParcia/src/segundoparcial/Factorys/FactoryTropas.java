/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial.Factorys;

import segundoparcial.PatronBuilderClases.Campamento;
import segundoparcial.PatronBuilderClases.Ejercito;
import segundoparcial.PatronBuilderClases.EntrenadorBiran;
import segundoparcial.PatronBuilderClases.EntrenadorBiranSuperSoldado;
import segundoparcial.PatronBuilderClases.EntrenadorElibe;
import segundoparcial.PatronBuilderClases.EntrenadorElibeSuperSoldado;
import segundoparcial.PatronBuilderClases.EntrenadorLyciano;
import segundoparcial.PatronBuilderClases.EntrenadorLycianoSuperSoldado;
import segundoparcial.PatronBuilderClases.SuperCampamento;
import segundoparcial.PatronBuilderClases.SuperSoldado;

/**
 *
 * @author Docente
 */
public class FactoryTropas {
    private static FactoryTropas FactoryTropas;
    
    public static FactoryTropas getInstance() {
        if ( FactoryTropas== null) {
            FactoryTropas = new FactoryTropas();
        }
        return FactoryTropas;
    }
    
    public void crearTropas(String tipo, String raza){
            switch (tipo){
                case "Ejercito":
                    switch (raza){
                        case "Lycia":
                            EntrenadorLyciano maestroLyciano = new EntrenadorLyciano();
                            Campamento campamentoLyciano = new Campamento(maestroLyciano);
                            campamentoLyciano.entrenarEjercito();
                            Ejercito ejercitoLyciano = campamentoLyciano.getEjercito();

                            System.out.println(ejercitoLyciano.toString());
                            break;
                        case "Biran":
                            EntrenadorBiran maestroBiran = new EntrenadorBiran();
                            Campamento campamentoBiran = new Campamento(maestroBiran);
                            campamentoBiran.entrenarEjercito();
                            Ejercito ejercitolyciano = campamentoBiran.getEjercito();

                            System.out.println(ejercitolyciano.toString());
                            break;
                        case "Elibe":
                            EntrenadorElibe maestroElibe = new EntrenadorElibe();
                            Campamento campamentoElibe = new Campamento(maestroElibe);
                            campamentoElibe.entrenarEjercito();
                            Ejercito ejercitoElibe = campamentoElibe.getEjercito();

                            System.out.println(ejercitoElibe.toString());
                            break;
                    }
                break;
                
                case "SuperSoldado":
                    switch (raza){
                        case "Lycia":
                            EntrenadorLycianoSuperSoldado superMaestroLyciano = new EntrenadorLycianoSuperSoldado();
                            SuperCampamento superCampamentoLyciano = new SuperCampamento(superMaestroLyciano);
                            superCampamentoLyciano.entrenarSuper();
                            SuperSoldado superSoldadoLyciano = superCampamentoLyciano.getSuper();

                            System.out.println(superSoldadoLyciano.toString());
                            break;
                        case "Biran":
                            EntrenadorBiranSuperSoldado superMaestroBiran = new EntrenadorBiranSuperSoldado();
                            SuperCampamento superCampamentoBiran = new SuperCampamento(superMaestroBiran);
                            superCampamentoBiran.entrenarSuper();
                            SuperSoldado superSoldadoBiran = superCampamentoBiran.getSuper();

                            System.out.println(superSoldadoBiran.toString());
                            break;
                        case "Elibe":
                            EntrenadorElibeSuperSoldado superMaestroElibe = new EntrenadorElibeSuperSoldado();
                            SuperCampamento superCampamentoElibe = new SuperCampamento(superMaestroElibe);
                            superCampamentoElibe.entrenarSuper();
                            SuperSoldado superSoldadoElibe = superCampamentoElibe.getSuper();

                            System.out.println(superSoldadoElibe.toString());
                            break;
                    }
                break;
            }

    }
}
