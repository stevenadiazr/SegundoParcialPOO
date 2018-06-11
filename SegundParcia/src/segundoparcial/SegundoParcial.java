/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial;

import segundoparcial.PatronBuilder.Campamento;
import segundoparcial.PatronBuilder.Ejercito;
import segundoparcial.PatronBuilder.EntrenadorLyciano;
import segundoparcial.PatronBuilder.EntrenadorBiran;
import segundoparcial.PatronBuilder.EntrenadorBiranSuperSoldado;
import segundoparcial.PatronBuilder.EntrenadorElibe;
import segundoparcial.PatronBuilder.EntrenadorElibeSuperSoldado;
import segundoparcial.PatronBuilder.EntrenadorLycianoSuperSoldado;
import segundoparcial.PatronBuilder.MecanicoLyciano;
import segundoparcial.PatronBuilder.SuperCampamento;
import segundoparcial.PatronBuilder.SuperSoldado;
import segundoparcial.PatronBuilder.Taller;
import segundoparcial.PatronBuilder.Vehiculo;

/**
 *
 * @author Docente
 */
public class SegundoParcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntrenadorLyciano maestroLyciano = new EntrenadorLyciano();
        EntrenadorBiran maestroBiran = new EntrenadorBiran();
        EntrenadorElibe maestroElibe = new EntrenadorElibe();
        EntrenadorLycianoSuperSoldado superMaestroLyciano = new EntrenadorLycianoSuperSoldado();
        EntrenadorBiranSuperSoldado superMaestroBiran = new EntrenadorBiranSuperSoldado();
        EntrenadorElibeSuperSoldado superMaestroElibe = new EntrenadorElibeSuperSoldado();
        MecanicoLyciano ingenieroLyciano1 = new MecanicoLyciano();
        
        Campamento campamentoLyciano = new Campamento(maestroLyciano);
        Campamento campamentoBiran = new Campamento(maestroBiran);
        Campamento campamentoElibe = new Campamento(maestroElibe);
        SuperCampamento superCampamentoLyciano = new SuperCampamento(superMaestroLyciano);
        SuperCampamento superCampamentoBiran = new SuperCampamento(superMaestroBiran);
        SuperCampamento superCampamentoElibe = new SuperCampamento(superMaestroElibe);
        Taller tallerLyciano = new Taller(ingenieroLyciano1);
        
        campamentoLyciano.entrenarEjercito();
        campamentoBiran.entrenarEjercito();
        campamentoElibe.entrenarEjercito();
        superCampamentoLyciano.entrenarSuper();
        superCampamentoBiran.entrenarSuper();
        superCampamentoElibe.entrenarSuper();
        tallerLyciano.entrenarVehiculo();
        
        Ejercito ejercitoLyciano = campamentoLyciano.getEjercito();
        Ejercito ejercitoBiran = campamentoBiran.getEjercito();
        Ejercito ejercitoElibe = campamentoElibe.getEjercito();
        SuperSoldado superSoldadoLyciano = superCampamentoLyciano.getSuper();
        SuperSoldado superSoldadoBiran = superCampamentoBiran.getSuper();
        SuperSoldado superSoldadoElibe = superCampamentoElibe.getSuper();
        Vehiculo vehiculoLyciano = tallerLyciano.getVehiculo();
        
        System.out.println("Se han creado los siguientes ejercitos: ");
        
        System.out.println(ejercitoLyciano.toString());
        System.out.println(ejercitoBiran.toString());
        System.out.println(ejercitoElibe.toString());
        System.out.println(superSoldadoLyciano.toString());
        System.out.println(superSoldadoBiran.toString());
        System.out.println(superSoldadoElibe.toString());
        System.out.println(vehiculoLyciano.toString());
        
    }
    
}
