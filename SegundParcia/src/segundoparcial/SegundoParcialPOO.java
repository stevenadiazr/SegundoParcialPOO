/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial;


import java.util.Scanner;
import segundoparcial.Factorys.FactoryTropas;
import segundoparcial.Factorys.FactoryVehiculos;
/**
 *
 * @author Docente
 */
public class SegundoParcialPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String tipo;
        String raza;
        
        Scanner input = new Scanner(System.in);
        int opcion;
        
        System.out.println("Bienvenido al menu");
        System.out.println("Que accion desea hacer?");
        System.out.println("Presione 1 para hacer un ejercito lyciano");
        System.out.println("Presione 2 para hacer un ejercito de biran");
        System.out.println("Presione 3 para hacer un ejercito elibe");
        System.out.println("Presione 4 para hacer un ejercito lyciano");
        System.out.println("Presione 5 para hacer un ejercito biran");
        System.out.println("Presione 6 para hacer un ejercito de elibe");
        opcion = input.nextInt();
        
        FactoryTropas hacerTropas;
        hacerTropas = FactoryTropas.getInstance();
        FactoryVehiculos hacerVehiculos;
        hacerVehiculos = FactoryVehiculos.getInstance();
        
        while (opcion != 0){
            System.out.println("Que accion desea hacer?");
            System.out.println("Presione 1 para hacer un ejercito lyciano");
            System.out.println("Presione 2 para hacer un ejercito de biran");
            System.out.println("Presione 3 para hacer un ejercito elibe");
            System.out.println("Presione 4 para hacer un super soldado lyciano");
            System.out.println("Presione 5 para hacer un super soldado biran");
            System.out.println("Presione 6 para hacer un super soldado elibe");
            System.out.println("Presione 7 para hacer un vehiculo lyciano");
            System.out.println("Presione 8 para hacer un vehiculo de biran");
            System.out.println("Presione 9 para hacer un vehiculo elibe");
            System.out.println("Presione 10 para hacer un super vehiculo lyciano");
            System.out.println("Presione 11 para hacer un super vehiculo biran");
            System.out.println("Presione 12 para hacer un super vehiculo elibe");
            
            switch (opcion){
                case 1:
                    hacerTropas.crearTropas("Ejercito", "Lycia");
                    break;
                case 2:
                    hacerTropas.crearTropas("Ejercito", "Biran");
                    break;
                case 3:
                    hacerTropas.crearTropas("Ejercito", "Elibe");
                    break;
                case 4:
                    hacerTropas.crearTropas("SuperSoldado", "Lycia");
                    break;
                case 5:
                    hacerTropas.crearTropas("SuperSoldado", "Biran");
                    break;
                case 6:
                    hacerTropas.crearTropas("SuperSoldado", "Elibe");
                    break;
                case 7:
                    hacerVehiculos.crearVehiculos("Normal", "Lycia");
                    break;
                case 8:
                    hacerVehiculos.crearVehiculos("Normal", "Biran");
                    break;
                case 9:
                    hacerVehiculos.crearVehiculos("Normal", "Elibe");
                    break;
                case 10:
                    hacerVehiculos.crearVehiculos("Super", "Lycia");
                    break;
                case 11:
                    hacerVehiculos.crearVehiculos("Super", "Biran");
                    break;
                case 12:
                    hacerVehiculos.crearVehiculos("Super", "Elibe");
                    break;
                default:
                    System.out.println("Seleccione una opcion valida por favor");
            }
            
            opcion = input.nextInt();
        }
        
    }
    
}
