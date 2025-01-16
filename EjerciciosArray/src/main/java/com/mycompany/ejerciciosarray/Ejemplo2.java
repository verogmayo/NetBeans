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
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
       
      int vector []=new int[8];
       for(int i=0; i<vector.length;i++){
        System.out.println("Introduzca el numero de la posición "+ (i+1)+ " y del indice "+i);
        vector[i]=teclado.nextInt();
       }
       System.out.println("Los numeros introducidos son : ");
       for(int i=0; i<vector.length;i++){
           System.out.println("indice : "+i+ ", numeros: "+vector[i]);
       }
      //int vector []={3,5,7,98,45,12,67}; otra manera si ya sabes cuantos datos tienes.
      
      
    }
    
}
