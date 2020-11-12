/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fdpu4;

/**
 *
 * @author solic
 */
   public class Ejercicio7 {
    public static void main(String[] args) {
        int Matriz[][] = new int[4][4];
        
        //Llenado de manera dinamica por medio de for:
        for(int x = 0; x < 4; x++){
           for(int y = 0; y < 4; y++){
              if(x == y){
                 Matriz[x][y] = 1;
               }
              else
               {
                  Matriz[x][y] = 0;
               }
            }   
        }
        
        //Leer el arreglo
        for(int x = 0; x < 4; x++){
            for(int y = 0; y < 4; y++){
            System.out.println(Matriz[x][y] + " ");
            }
            System.out.println();
        } 
    } 
}

