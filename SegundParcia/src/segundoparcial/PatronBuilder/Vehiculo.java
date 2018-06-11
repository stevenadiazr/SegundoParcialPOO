/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial.PatronBuilder;

/**
 *
 * @author Docente
 */
public class Vehiculo implements segundoparcial.PatronBuilder.CrearVehiculo{
    private int vida;
    private int dañoEdificios;
    private int dañoEjercito;
    private String nombre;
    
    
    @Override
    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public void setDañoEdificios(int dañoEdificios) {
        this.dañoEdificios = dañoEdificios;
    }

    @Override
    public void setDañoEjercito(int dañoEjercito) {
        this.dañoEjercito = dañoEjercito;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //comprobación
    @Override
    public String toString(){
       return "Un vehiculo ha sido creado con las siguientes especificaciones: Nombre: " + nombre + ", Vida: "
               + vida + ", Daño a edificios:" + dañoEdificios + ", Daño a ejercitos: " +dañoEjercito; 
    }
}
