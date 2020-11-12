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
public class Ejercicio2 {
    public static void main(String[] args) {
        String nombres[] = new String[5];
        Scanner Leer = new Scanner(System.in);
        
        for (int x= 0; x < 5; x ++){
            System.out.println("ingrese el nombre del posicion "+ x);
            nombres[x] = Leer .nextLine();
        }
        
        System.out.println("-- Lista --");
        
        for(int x = 0; x < 5; x ++){
        System.out.println(nombres[x]);
    }
    }
}
