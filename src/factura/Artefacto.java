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
public abstract class Artefacto {
    int numero;
    String nombre;
    Double precio;
    Double tiempoManoObra;

    public Artefacto(int numero, String nombre, Double tiempoManoObra) {
        this.numero = numero;
        this.nombre = nombre;
        this.tiempoManoObra = tiempoManoObra;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getTiempoManoObra() {
        return tiempoManoObra;
    }

    public void setTiempoManoObra(Double tiempoManoObra) {
        this.tiempoManoObra = tiempoManoObra;
    }
    
    
}
