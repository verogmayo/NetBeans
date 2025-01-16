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
public class UD05A0202 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int i, j;
        int [][] matriz=new int[2][3];
        float media;
        int posicionMenorFila;
        int posicionMenorColumna;
        for(i=0;i<matriz.length;i++){
            for(j=0;j<matriz[0].length;j++){
            System.out.printf("introduzca el entero de la linea %d y de la columna %d : ",(i+1),(j+1));
            matriz[i][j]=teclado.nextInt();
            }
        }
        for(i=0;i<matriz.length;i++){
            for(j=0;j<matriz[0].length;j++){
            System.out.print(matriz[i][j]);
            System.out.println(" ");
			}
            
        }
        media=calcularMedia(matriz);
        posicionMenorFila=0;
        posicionMenorColumna=0;
        for(i=0;i<matriz.length;i++){
            for(j=0;j<matriz[0].length;j++){
                if(matriz[i][j]<matriz[posicionMenorFila][posicionMenorColumna]){
                    posicionMenorFila=i;
                    posicionMenorColumna=j;
                }   
            } 
        }
        System.out.printf("La media de los elementos de la matriz es : "+media);
        System.out.printf("El elemento menor está en la fila %d y en la columna %d ",(posicionMenorFila+1), (posicionMenorColumna+1));
        }
       
    
    
    public static float calcularMedia (int[][] matriz){
            float media;
            int suma;
            int contador;
            suma=0;
            contador=0;
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    suma=matriz[i][j]+suma;
                    contador++;
            }
        
    }
    return media=suma/contador; 
        
        
        } 
    }
