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
public class Ejercicio6 {
    public static void main(String[] args) {
        int Matriz[][] = new int [3][2];
        
         Matriz[0][0] = 1;
         Matriz[0][1] = 2;
         Matriz[1][0] = 3;
         Matriz[1][1] = 4;
         Matriz[2][0] = 5;
         Matriz[2][1] = 6;
         //mstrar en pantalla la matriz por medio de un for:
         
         for(int x = 0; x < 3; x++){
             for (int y = 0; y < 2; y++){
             System.out.println(Matriz[x][y] + "");
         }
             System.out.println();
         }
    }
}
