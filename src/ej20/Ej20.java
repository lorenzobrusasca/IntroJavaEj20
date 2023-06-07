/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej20;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class Ej20 {

    /**
     * @param args the command line arguments
     */
    /*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.*/
    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner (System.in);
        
        int [][] matriz = new int [3][3];
        int num = 0;
        int [] vectorHoriz = new int [3];
        int [] vectorVert = new int [3];
        int Diag1 = 0;
        int Diag2 = 0;
        
        int suma = 0;
        
         System.out.println("Ingrese los números que formarán el cuadrado mágico");
                
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                num = leer.nextInt();
                if (num>9||num<1)
                {System.out.println("Error, introduzca un número mayor a 1 y menor a 9");}
                } while (num>9||num<1);
                
               matriz [i][j] = num;
            }
        }
        
        
        for (int i = 0; i < 3; i++) {
            System.out.println("");
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]);
            }
        }
        
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3 ; j++) {
              
               suma = matriz[i][j] + suma;                    
                    
             }
            vectorHoriz [i] = suma;
            suma = 0;            
        }
        
     
         for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3 ; i++) {
              
               suma = matriz[i][j] + suma;                    
               
             }
             vectorVert [j] = suma;
            suma = 0;            
        }
        
         suma = 0;
         
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i==0&&j==0)||(i==1&&j==1)||(i==2&&j==2)) {
                    
                    suma = matriz[i][j] + suma;
                    
                }
            }
               Diag1 = suma;     
        }
        
        
        
        suma = 0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i==0&&j==2)||(i==1&&j==1)||(i==2&&j==0)) {
                    
                    suma = matriz[i][j] + suma;
                    
                }
            }
               Diag2 = suma;     
        }
        
              
        
            if (Arrays.equals(vectorVert, vectorHoriz))
                {
                  if (vectorVert[0]==Diag1) { 
                    
                      System.out.println("Es matriz mágica");
                    }
                  
                }
            else  {System.out.println("No es matriz mágica");}
    }
    
}
