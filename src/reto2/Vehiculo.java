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

// se crea una clase abstracta para que no se pueda instanciar
public class Vehiculo {
    // atributos
    String tipo;
    String pasajeros;
    String velocidad;    
    String placa;
    
    //constructor

    public Vehiculo(String tipo, String pasajeros, String velocidad, String placa) {
        this.tipo = tipo;
        this.pasajeros = pasajeros;
        this.velocidad = velocidad;
        this.placa = placa;
    }
    
        
    
    
}
