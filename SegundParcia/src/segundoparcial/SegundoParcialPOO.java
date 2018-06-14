/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial;


import java.util.Scanner;
import segundoparcial.Factorys.FactoryEdificios;
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
        int opcion2;
        int opcion3;
        int opcion4;
        
        System.out.println("Bienvenido al menu");
        System.out.println("Que accion desea hacer?");
        System.out.println("Presione 1 para hacer una tropa");
        System.out.println("Presione 2 para hacer un vehiculo");
        System.out.println("Presione 3 para hacer un edificio");
        opcion = input.nextInt();



    FactoryTropas hacerTropas;
    hacerTropas = FactoryTropas.getInstance();
    FactoryVehiculos hacerVehiculos;
    hacerVehiculos = FactoryVehiculos.getInstance();
    FactoryEdificios hacerEdificios;
    hacerEdificios = FactoryEdificios.getInstance();

    while (opcion != 0){  
            switch (opcion){
                case 1:       
                    System.out.println("Que accion desea hacer?");
                    System.out.println("Presione 1 para hacer un ejercito");
                    System.out.println("Presione 2 para hacer un super soldado");
                    System.out.println("Presione 0 para salir");
                    opcion2 = input.nextInt();
                    
                    switch (opcion2){
                        case 1:       
                            System.out.println("Seleccione raza");
                            System.out.println("Presione 1 para Lycia");
                            System.out.println("Presione 2 para Biran");
                            System.out.println("Presione 3 para Elibe");
                            opcion3 = input.nextInt();

                            switch (opcion3){
                                case 1:       
                                    hacerTropas.crearTropas("Ejercito", "Lycia");
                                    break;
                                case 2:
                                    hacerTropas.crearTropas("Ejercito", "Biran");
                                    break;
                                case 3:
                                    hacerTropas.crearTropas("Ejercito", "Elibe");
                                    break;
                                default:
                                    System.out.println("No selecciono una opcion valida");
                                    break;
                            }
                    
                    break;
                        case 2:
                            System.out.println("Seleccione raza");
                            System.out.println("Presione 1 para Lycia");
                            System.out.println("Presione 2 para Biran");
                            System.out.println("Presione 3 para Elibe");
                            opcion3 = input.nextInt();
                            
                            switch (opcion3){
                                case 1:
                                    hacerTropas.crearTropas("SuperSoldado", "Lycia");
                                    break;
                                case 2:
                                    hacerTropas.crearTropas("SuperSoldado", "Biran");
                                    break;
                                case 3:
                                    hacerTropas.crearTropas("SuperSoldado", "Elibe");
                                    break;
                                default:
                                    System.out.println("No selecciono una opcion valida");
                                    break;
                            }
            
                            break;
                    }
                break;    
                
                case 2:
                    System.out.println("Presione 1 para hacer un vehiculo");
                    System.out.println("Presione 2 para hacer un super vehiculo");
                    opcion2 = input.nextInt();
                    
                    switch (opcion2){
                        case 1:
                                System.out.println("Seleccione raza");
                                System.out.println("Presione 1 para Lycia");
                                System.out.println("Presione 2 para Biran");
                                System.out.println("Presione 3 para Elibe");
                                opcion3 = input.nextInt();

                                switch (opcion3){
                                    case 1:
                                        hacerVehiculos.crearVehiculos("Normal", "Lycia");
                                        break;
                                    case 2:
                                        hacerVehiculos.crearVehiculos("Normal", "Biran");
                                        break;
                                    case 3:
                                        hacerVehiculos.crearVehiculos("Normal", "Elibe");
                                        break;
                                    default:
                                        System.out.println("No selecciono una opcion valida");
                                        break;
                                }
                        break;
                        
                        case 2:
                            System.out.println("Seleccione raza");
                            System.out.println("Presione 1 para Lycia");
                            System.out.println("Presione 2 para Biran");
                            System.out.println("Presione 3 para Elibe");
                            opcion3 = input.nextInt();

                            switch (opcion3){
                                case 1:
                                    hacerVehiculos.crearVehiculos("Super", "Lycia");
                                    break;
                                case 2:
                                    hacerVehiculos.crearVehiculos("Super", "Biran");
                                    break;
                                case 3:
                                    hacerVehiculos.crearVehiculos("Super", "Elibe");
                                    break;
                                default:
                                    System.out.println("No selecciono una opcion valida");
                                    break;
                            }
                        break;
                    }

                case 3:
                    System.out.println("Seleccione tipo de edificio");
                    System.out.println("Presione 1 para recurso1");
                    System.out.println("Presione 2 para recurso2");
                    System.out.println("Presione 3 para recurso3");
                    System.out.println("Presione 4 para tropas");
                    System.out.println("Presione 5 para taller");
                    opcion3 = input.nextInt();
                    
                    switch (opcion3){
                        case 1:
                            System.out.println("Seleccione raza");
                            System.out.println("Presione 1 para Lycia");
                            System.out.println("Presione 2 para Biran");
                            System.out.println("Presione 3 para Elibe");
                            opcion4 = input.nextInt();

                            switch (opcion4){
                                case 1:
                                    hacerEdificios.crearEdificios("Lycia", 1);
                                    break;
                                case 2:
                                    hacerEdificios.crearEdificios("Biran", 1);
                                    break;
                                case 3:
                                    hacerEdificios.crearEdificios("Elibe", 1);
                                    break;
                                default:
                                    System.out.println("No selecciono una opcion valida");
                                    break;
                            }
                        break;
                        
                        case 2:
                            System.out.println("Seleccione raza");
                            System.out.println("Presione 1 para Lycia");
                            System.out.println("Presione 2 para Biran");
                            System.out.println("Presione 3 para Elibe");
                            opcion4 = input.nextInt();

                            switch (opcion4){
                                case 1:
                                    hacerEdificios.crearEdificios("Lycia", 2);
                                    break;
                                case 2:
                                    hacerEdificios.crearEdificios("Biran", 2);
                                    break;
                                case 3:
                                    hacerEdificios.crearEdificios("Elibe", 2);
                                    break;
                                default:
                                    System.out.println("No selecciono una opcion valida");
                                    break;
                            }
                        break;
                        
                        case 3:
                            System.out.println("Seleccione raza");
                            System.out.println("Presione 1 para Lycia");
                            System.out.println("Presione 2 para Biran");
                            System.out.println("Presione 3 para Elibe");
                            opcion4 = input.nextInt();

                            switch (opcion4){
                                case 1:
                                    hacerEdificios.crearEdificios("Lycia", 3);
                                    break;
                                case 2:
                                    hacerEdificios.crearEdificios("Biran", 3);
                                    break;
                                case 3:
                                    hacerEdificios.crearEdificios("Elibe", 3);
                                    break;
                                default:
                                    System.out.println("No selecciono una opcion valida");
                                    break;
                            }
                        break;
                        
                        case 4:
                            System.out.println("Seleccione raza");
                            System.out.println("Presione 1 para Lycia");
                            System.out.println("Presione 2 para Biran");
                            System.out.println("Presione 3 para Elibe");
                            opcion4 = input.nextInt();

                            switch (opcion4){
                                case 1:
                                    hacerEdificios.crearEdificios("Lycia", 4);
                                    break;
                                case 2:
                                    hacerEdificios.crearEdificios("Biran", 4);
                                    break;
                                case 3:
                                    hacerEdificios.crearEdificios("Elibe", 4);
                                    break;
                                default:
                                    System.out.println("No selecciono una opcion valida");
                                    break;
                            }
                        break;
                        
                        case 5:
                            System.out.println("Seleccione raza");
                            System.out.println("Presione 1 para Lycia");
                            System.out.println("Presione 2 para Biran");
                            System.out.println("Presione 3 para Elibe");
                            opcion4 = input.nextInt();

                            switch (opcion4){
                                case 1:
                                    hacerEdificios.crearEdificios("Lycia", 5);
                                    break;
                                case 2:
                                    hacerEdificios.crearEdificios("Biran", 5);
                                    break;
                                case 3:
                                    hacerEdificios.crearEdificios("Elibe", 5);
                                    break;
                                default:
                                    System.out.println("No selecciono una opcion valida");
                                    break;
                            }
                        break;
                            
                        default:
                            System.out.println("No selecciono una opcion valida");
                            break;
                    }
                    
                default:
                    System.out.println("Seleccione una opcion valida por favor");
                    break;
            }
            
        System.out.println("Que accion desea hacer?");
        System.out.println("Presione 1 para hacer una tropa");
        System.out.println("Presione 2 para hacer un vehiculo");
        System.out.println("Presione 3 para hacer un edificio");

        opcion = input.nextInt();
        
    }
    }
}

