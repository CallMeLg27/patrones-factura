/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factura;

/**
 *
 * @author LuisGerman
 */
public class Pieza extends Artefacto{
    
    public Pieza(int numero, String nombre, Double precio, Double tiempoManoObra) {
        super(numero, nombre, tiempoManoObra);
        this.precio = precio;
    }
    
}
