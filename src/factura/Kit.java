/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factura;

import java.util.ArrayList;

/**
 *
 * @author LuisGerman
 */
public class Kit extends Artefacto {

    ArrayList<Artefacto> artefactos = new ArrayList<>();

    public Kit(int numero, String nombre, Double tiempoManoObra) {
        super(numero, nombre, tiempoManoObra);
    }

    public void calcularPrecio() {
        Double precioCalc = 0.0;
        for (Artefacto artefacto : artefactos) {
            precioCalc += artefacto.getPrecio();
        }
        precioCalc = 0.9 * precioCalc;
        this.precio = precioCalc;
    }

    public void agregar(Artefacto artefacto) {
        artefactos.add(artefacto);
        calcularPrecio();
    }
}
