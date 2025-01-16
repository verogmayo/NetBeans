/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejerciciosarray;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class UD05A0201_1 {

    
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int i, j;
        int [][] matriz=new int[3][2];
        boolean matrizPositiva;
        for(i=0;i<matriz.length;i++){
            for(j=0;j<matriz[0].length;j++){
            System.out.printf("introduzca el entero de la linea %d y de la columna %d : ",(i+1),(j+1));
            matriz[i][j]=teclado.nextInt();
            }
        }
        for(i=0;i<matriz.length;i++){
            for(j=0;j<matriz[0].length;j++){
            System.out.printf("Este es el numero introducido en la linea %d y la columna %d : %d",(i+1),(j+1),matriz[i][j]);
            System.out.println(" ");
			}
            
        }
        matrizPositiva =esMatrizPositiva(matriz);
        if(matrizPositiva){
            System.out.println("MATRIZ POSITIVA");
        }else{
            System.out.println("MATRIZ NO POSITIVA");
        }
        }
       
    
    
    public static boolean esMatrizPositiva (int[][] matriz){
            boolean matrizPositiva;
            matrizPositiva=true;
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    if (matriz[i][j] < 0) {
                        return false;       
            }
        }
    }
    return true; // Si no encontramos números negativos, la matriz es positiva
        
        
        } 
    }