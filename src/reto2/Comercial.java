/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2;

/**
 *
 * @author evillarraga
 */
public class Comercial extends Vehiculo{
    // atributo de Comercial
    String cargaMaxima;

    public Comercial(String tipo, String pasajeros, String velocidad, String placa, String cargaMaxima) {
        super(tipo, pasajeros, velocidad, placa);
        this.cargaMaxima = cargaMaxima;
    }
    

    @Override 
    public String toString() {
        String vehiculoDetalles = "\t" + "Vehículo " + this.tipo + " - " + "Placa: " + this.placa + "\n\t" + "velocidad: " +this.velocidad + " km/h" + "\n\t" + "pasajeros: " + this.pasajeros + "\n\t" + "Carga máxima: " + this.cargaMaxima;
        return vehiculoDetalles;
  
    }
}
