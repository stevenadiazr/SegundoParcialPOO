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
import segundoparcial.PatronBuilder.SuperMecanico;
import segundoparcial.PatronBuilder.SuperMecanicoBiran;
import segundoparcial.PatronBuilder.SuperMecanicoElibe;
import segundoparcial.PatronBuilder.SuperMecanicoLyciano;
import segundoparcial.PatronBuilder.SuperTaller;
import segundoparcial.PatronBuilder.SuperVehiculo;

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
                case "Normal":
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
                
                case "Super":
                    switch (raza){
                        case "Lycia":
                            SuperMecanicoLyciano superIngenieroLyciano = new SuperMecanicoLyciano();
                            SuperTaller superTallerLyciano = new SuperTaller(superIngenieroLyciano);
                            superTallerLyciano.entrenarVehiculo();
                            SuperVehiculo superVehiculoLyciano = superTallerLyciano.getVehiculo();

                            System.out.println(superVehiculoLyciano.toString());
                            break;
                        case "Biran":
                            SuperMecanicoBiran superIngenieroBiran = new SuperMecanicoBiran();
                            SuperTaller superTallerBiran = new SuperTaller(superIngenieroBiran);
                            superTallerBiran.entrenarVehiculo();
                            SuperVehiculo superVehiculoBiran = superTallerBiran.getVehiculo();

                            System.out.println(superVehiculoBiran.toString());
                            break;
                        case "Elibe":
                            SuperMecanicoElibe superIngenieroElibe = new SuperMecanicoElibe();
                            SuperTaller superTallerElibe = new SuperTaller(superIngenieroElibe);
                            superTallerElibe.entrenarVehiculo();
                            SuperVehiculo superVehiculoElibe = superTallerElibe.getVehiculo();

                            System.out.println(superVehiculoElibe.toString());
                            break;
                    }
                break;
            }

    }
}
