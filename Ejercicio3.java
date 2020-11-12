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
public class Ejercicio3 {
    public static void main(String[] args) {
        
        System.out.println("ingrese el numero de alumnos de la lista");
        Scanner Leer = new Scanner(System.in);
        int num = Leer.nextInt();
        
        String Alumnos[] = new String[num];
        
        // Llenar el arreglo por medio de un for 
        for(int x = 0; x < num; x++){
            System.out.println("ingrese el nombre del alumno");
            Alumnos[x] = Leer.next();
        }
        
        System.out.println("-- Lista de Alumnos --");
        
        //Leer los datos de el arreglo
        for (int y = 0; y < num; y++){
            System.out.println(Alumnos[y]);
        }
    }
}
