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
public class Particular extends Vehiculo{
    // atributo de Particular
    String color;

    public Particular(String tipo, String pasajeros, String velocidad, String placa, String color) {
        super(tipo, pasajeros, velocidad, placa);
        this.color = color;
    }
    

    @Override
    public String toString() {
        String vehiculoDetalles = "\t" + "Vehículo " + this.tipo + " - " + "Placa: " + this.placa + "\n\t" + "valocidad: " +this.velocidad + " km/h" + "\n\t" + "pasajeros: " + this.pasajeros + "\n\t" + "color: " + this.color;
        return vehiculoDetalles;
  
    }
}
