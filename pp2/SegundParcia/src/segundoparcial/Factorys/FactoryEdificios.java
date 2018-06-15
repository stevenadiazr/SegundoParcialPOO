/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial.Factorys;

import segundoparcial.PatronBuilderClases.ConstructorBiran1;
import segundoparcial.PatronBuilderClases.ConstructorBiran2;
import segundoparcial.PatronBuilderClases.ConstructorBiran3;
import segundoparcial.PatronBuilderClases.ConstructorBiran4;
import segundoparcial.PatronBuilderClases.ConstructorBiran5;
import segundoparcial.PatronBuilderClases.ConstructorElibe1;
import segundoparcial.PatronBuilderClases.ConstructorElibe2;
import segundoparcial.PatronBuilderClases.ConstructorElibe3;
import segundoparcial.PatronBuilderClases.ConstructorElibe4;
import segundoparcial.PatronBuilderClases.ConstructorElibe5;
import segundoparcial.PatronBuilderClases.ConstructorLyciano1;
import segundoparcial.PatronBuilderClases.ConstructorLyciano2;
import segundoparcial.PatronBuilderClases.ConstructorLyciano3;
import segundoparcial.PatronBuilderClases.ConstructorLyciano4;
import segundoparcial.PatronBuilderClases.ConstructorLyciano5;
import segundoparcial.PatronBuilderClases.Constructora;
import segundoparcial.PatronBuilderClases.SuperConstructora;
import segundoparcial.PatronBuilderClases.Edificio;


/**
 *
 * @author Docente
 */
public class FactoryEdificios {
    private static FactoryEdificios FactoryEdificios;
    
    public static FactoryEdificios getInstance() {
        if ( FactoryEdificios == null) {
            FactoryEdificios = new FactoryEdificios();
        }
        return FactoryEdificios;
    }
    
    public void crearEdificios(String raza, int tipoDeEdificio){
        /*
        Tipo 1 : Recurso 1
        Tipo 2 : Recurso 2
        Tipo 3 : Recurso 3
        Tipo 4 : Campamento
        Tipo 5 : Taller
        */
            switch (raza){
                case "Lycia":
                    switch (tipoDeEdificio){
                        case 1:
                            ConstructorLyciano1 constructorLyciano1 = new ConstructorLyciano1();
                            Constructora constructoraLyciana1 = new Constructora(constructorLyciano1);
                            constructoraLyciana1.hacerEdificio();
                            Edificio edificioLyciano1 = constructoraLyciana1.getEdificio();

                            System.out.println(edificioLyciano1.toString());
                            break;
                        case 2:
                            ConstructorLyciano2 constructorLyciano2 = new ConstructorLyciano2();
                            Constructora constructoraLyciana2 = new Constructora(constructorLyciano2);
                            constructoraLyciana2.hacerEdificio();
                            Edificio edificioLyciano2 = constructoraLyciana2.getEdificio();

                            System.out.println(edificioLyciano2.toString());
                            break;
                        case 3:
                            ConstructorLyciano3 constructorLyciano3 = new ConstructorLyciano3();
                            Constructora constructoraLyciana3 = new Constructora(constructorLyciano3);
                            constructoraLyciana3.hacerEdificio();
                            Edificio edificioLyciano3 = constructoraLyciana3.getEdificio();

                            System.out.println(edificioLyciano3.toString());
                            break;
                        case 4:
                            ConstructorLyciano4 constructorLyciano4 = new ConstructorLyciano4();
                            Constructora constructoraLyciana4 = new Constructora(constructorLyciano4);
                            constructoraLyciana4.hacerEdificio();
                            Edificio edificioLyciano4 = constructoraLyciana4.getEdificio();

                            System.out.println(edificioLyciano4.toString());
                            break;
                        case 5:
                            ConstructorLyciano5 constructorLyciano5 = new ConstructorLyciano5();
                            Constructora constructoraLyciana5 = new Constructora(constructorLyciano5);
                            constructoraLyciana5.hacerEdificio();
                            Edificio edificioLyciano5 = constructoraLyciana5.getEdificio();

                            System.out.println(edificioLyciano5.toString());
                            break;
                    }
                break;
                
                case "Biran":
                    switch (tipoDeEdificio){
                        case 1:
                            ConstructorBiran1 constructorBiran1 = new ConstructorBiran1();
                            Constructora constructoraBiran1 = new Constructora(constructorBiran1);
                            constructoraBiran1.hacerEdificio();
                            Edificio edificioLyciano1 = constructoraBiran1.getEdificio();

                            System.out.println(edificioLyciano1.toString());
                            break;
                        case 2:
                            ConstructorBiran2 constructorBiran2 = new ConstructorBiran2();
                            Constructora constructoraBiran2 = new Constructora(constructorBiran2);
                            constructoraBiran2.hacerEdificio();
                            Edificio edificioLyciano2 = constructoraBiran2.getEdificio();

                            System.out.println(edificioLyciano2.toString());
                            break;
                        case 3:
                            ConstructorBiran3 constructorBiran3 = new ConstructorBiran3();
                            Constructora constructoraBiran3 = new Constructora(constructorBiran3);
                            constructoraBiran3.hacerEdificio();
                            Edificio edificioLyciano3 = constructoraBiran3.getEdificio();

                            System.out.println(edificioLyciano3.toString());
                            break;
                        case 4:
                            ConstructorBiran4 constructorBiran4 = new ConstructorBiran4();
                            Constructora constructoraBiran4 = new Constructora(constructorBiran4);
                            constructoraBiran4.hacerEdificio();
                            Edificio edificioBiran4 = constructoraBiran4.getEdificio();

                            System.out.println(edificioBiran4.toString());
                            break;
                        case 5:
                            ConstructorBiran5 constructorBiran5 = new ConstructorBiran5();
                            Constructora constructoraBiran5 = new Constructora(constructorBiran5);
                            constructoraBiran5.hacerEdificio();
                            Edificio edificioBiran5 = constructoraBiran5.getEdificio();

                            System.out.println(edificioBiran5.toString());
                            break;
                    }
                break;
                
                case "Elibe":
                    switch (tipoDeEdificio){
                        case 1:
                            ConstructorElibe1 constructorElibe1 = new ConstructorElibe1();
                            Constructora constructoraElibe1 = new Constructora(constructorElibe1);
                            constructoraElibe1.hacerEdificio();
                            Edificio edificioElibe1 = constructoraElibe1.getEdificio();

                            System.out.println(edificioElibe1.toString());
                            break;
                        case 2:
                            ConstructorElibe2 constructorElibe2 = new ConstructorElibe2();
                            Constructora constructoraElibe2 = new Constructora(constructorElibe2);
                            constructoraElibe2.hacerEdificio();
                            Edificio edificioElibe2 = constructoraElibe2.getEdificio();

                            System.out.println(edificioElibe2.toString());
                            break;
                        case 3:
                            ConstructorElibe3 constructorElibe3 = new ConstructorElibe3();
                            Constructora constructoraElibe3 = new Constructora(constructorElibe3);
                            constructoraElibe3.hacerEdificio();
                            Edificio edificioElibe3 = constructoraElibe3.getEdificio();

                            System.out.println(edificioElibe3.toString());
                            break;
                        case 4:
                            ConstructorElibe4 constructorElibe4 = new ConstructorElibe4();
                            Constructora constructoraElibe4 = new Constructora(constructorElibe4);
                            constructoraElibe4.hacerEdificio();
                            Edificio edificioElibe4 = constructoraElibe4.getEdificio();

                            System.out.println(edificioElibe4.toString());
                            break;
                        case 5:
                            ConstructorElibe5 constructorElibe5 = new ConstructorElibe5();
                            Constructora constructoraElibe5 = new Constructora(constructorElibe5);
                            constructoraElibe5.hacerEdificio();
                            Edificio edificioElibe5 = constructoraElibe5.getEdificio();

                            System.out.println(edificioElibe5.toString());
                            break;
                    }
                break;
            }

    }
}
