/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;


/**
 *
 * @author evillarraga
 */
public class Inventario {
    
    protected ArrayList<Vehiculo>  vehiculos = new ArrayList<>();
   
    public void agregarVehiculo(Vehiculo c){
       vehiculos.add(c);
    }
    
    
    public void visualizar() {
        vehiculos.forEach((c) -> {
            System.out.println(c);
        });
}

    public static void main(String[] args) {
    
    int dato0 =  2;
    Inventario inventarios = new Inventario();
    
    do {
    
    Scanner sc = new Scanner(System.in);
    
    String entrada = sc.nextLine();
    String []datos = entrada.split("&");
    dato0 = Integer.parseInt(datos[0]);
    
    
    
    
    switch (dato0) {
            case 1:            
                String dato1 = datos[1];
                String dato2 = datos[2];
                String dato3 = datos[3];
                String dato4 = datos[4];
                String dato5 = datos[5];
                
                
                if (dato1.equals("Comercial")) {
                                        Comercial comercialX = new Comercial(dato1, dato2, dato3, dato4, dato5);
                                        inventarios.agregarVehiculo(comercialX);
                } else {
                                        Particular particularX = new Particular(dato1, dato2, dato3, dato4, dato5);
                                        inventarios.agregarVehiculo(particularX);  
                }
                break;
            case 2:
                //System.out.println("Eligió: " + dato0);
                System.out.println("***Inventario de vehículos***");
                inventarios.visualizar();
                break;
                
            case 3:
                break;
            }
        }  while (dato0!=3);
    }
}





