/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factura;

import java.util.ArrayList;

/**
 *
 * @author Luis German
 */
public class Factura {
    public int total = 0;
    // Aqui colocar el tipo que corresponde
    // Reemplazar Object es obligatorio
    public ArrayList<Artefacto> compra = new ArrayList<>();
    
    public void calculatotal(){
        total = 0;
        for (Artefacto artefacto: compra) {
            total += artefacto.getPrecio();
        };
    }
    
    public void imprimedetalle() {
        int i = 1;
        for (Artefacto artefacto: compra) {
            System.err.println("Item " + artefacto.getNumero() + " Nombre " + artefacto.getNombre() );
        };
    }
    
    public static void main(String[] args) {
        Pieza p1 = new Pieza(1,"aceite",10.0,1.0);
        Pieza p2 = new Pieza(1,"tapa",20.0,1.0);
        Pieza p3 = new Pieza(1,"filtro",30.0,1.0);
        Pieza p4 = new Pieza(1,"bujia",40.0,5.0);
        Kit cambioaceite = new Kit(2,"cambio aceite",10.0);
        cambioaceite.agregar(p1);
        cambioaceite.agregar(p2);
        cambioaceite.agregar(p3);

        Factura f1 = new Factura();
        f1.compra.add(p1);
        f1.compra.add(p2);
        f1.compra.add(p3);
        f1.imprimedetalle();
        f1.calculatotal();
        System.err.println("Total factura = " + f1.total );
        
        Factura f2 = new Factura();
        f2.compra.add(p4);
        f2.compra.add(cambioaceite);
        f2.calculatotal();
        f2.imprimedetalle();
        System.err.println("Total factura = " + f2.total );
    }
    
}
