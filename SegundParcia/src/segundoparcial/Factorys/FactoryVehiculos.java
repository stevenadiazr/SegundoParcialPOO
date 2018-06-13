/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial.Factorys;

import segundoparcial.PatronBuilder.Taller;
import segundoparcial.PatronBuilder.Vehiculo;
import segundoparcial.PatronBuilder.MecanicoBiran;
import segundoparcial.PatronBuilder.MecanicoElibe;
import segundoparcial.PatronBuilder.MecanicoLyciano;

/**
 *
 * @author Docente
 */
public class FactoryVehiculos {
    private static FactoryVehiculos FactoryTropas;
    
    public static FactoryVehiculos getInstance() {
        if ( FactoryTropas== null) {
            FactoryTropas = new FactoryVehiculos();
        }
        return FactoryTropas;
    }
    
    public void crearVehiculos(String tipo, String raza){
            switch (tipo){
                case "Terrestre":
                    switch (raza){
                        case "Lycia":
                            MecanicoLyciano ingenieroLyciano = new MecanicoLyciano();
                            Taller tallerLyciano = new Taller(ingenieroLyciano);
                            tallerLyciano.entrenarVehiculo();
                            Vehiculo vehiculoLyciano = tallerLyciano.getVehiculo();
                            
                            System.out.println(vehiculoLyciano.toString());
                            break;
                        case "Biran":
                            MecanicoBiran ingenieroBiran = new MecanicoBiran();
                            Taller tallerBiran = new Taller(ingenieroBiran);
                            tallerBiran.entrenarVehiculo();
                            Vehiculo vehiculoBiran = tallerBiran.getVehiculo();
                            
                            System.out.println(vehiculoBiran.toString());
                            break;
                        case "Elibe":
                            MecanicoElibe ingenieroElibe = new MecanicoElibe();
                            Taller tallerElibe = new Taller(ingenieroElibe);
                            tallerElibe.entrenarVehiculo();
                            Vehiculo vehiculoElibe = tallerElibe.getVehiculo();
                            
                            System.out.println(vehiculoElibe.toString());
                            break;
                    }
                break;
                
                case "Aereo":
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
