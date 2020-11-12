/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fdpu4;

import java.util.Scanner;

/**
 *
 * @author solic
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        
        String Vehiculo[] = new String[5];
        String Placas[] = new String[5];
        Scanner Leer = new Scanner (System.in);
        
        //Llenar los arreglos por medio de un for.
        for(int x = 0; x < 5; x++){
        System.out.println("Ingrese la marca del vehiculo");
        Vehiculo[x] = Leer.next();
        System.out.println("Ingrese la placa del vehiculo");
        Placas[x] = Leer.next();
    }
        System.out.println("-- Vehiculos y placas --");
        
        //Leer los arreglos por medio de un for
        for(int a = 0; a < 5; a++){
        System.out.println("Vehiculo: " + Vehiculo[a] + " Placas: " + Placas [a]);
                    
        }
    }
}
