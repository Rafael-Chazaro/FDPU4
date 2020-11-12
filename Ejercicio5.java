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
public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Ingrese el numero de personas que va a registrar");
        Scanner Leer = new Scanner(System.in);
        int num = Leer.nextInt();
        String Nombre[] = new String[num];
        int Edad[] = new int[num];
        
        //Llenar los arreglos por medio de un for:
        for(int x = 0; x < num; x++){
            System.out.println("ingrese el nombre:");
            Nombre[x] = Leer.next();
            System.out.println("Ingrese la edad:");
            Edad[x] = Leer.nextInt();
            
        }
        System.out.println("-- Lista --");
        
        //Mostrar los datos de los arreglos, utilizando un for
        for (int x = 0; x < num; x++){
            System.out.println("Nombre: " + Nombre[x] + " Edad: "+ Edad[x]);
        }
        
    }
}
