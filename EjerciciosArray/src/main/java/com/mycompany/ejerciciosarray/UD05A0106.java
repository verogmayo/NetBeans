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
public class UD05A0106 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int vector[]=new int[11];
        int i;
        int nota;
        do{
        System.out.println("Introduzca una nota (0 a 10): ");
        nota=teclado.nextInt();
        if(nota>=0 && nota<=10){
         vector[nota]++;
        }
        }while (nota>=0 && nota<=10);
        System.out.println("Frecuencia de las notas : ");
        for(i=0;i<vector.length;i++){
        System.out.printf("Nota %d, Frecuencia : %d%n",i,vector[i]);
        }
        
    }
    
   /* public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int vector[]=new int[11];
        int i;
        int nota;
        System.out.println("Introduzca una nota (0 a 10): ");
        nota=teclado.nextInt();
        while (nota>=0 && nota<=10);{
                     vector[nota]++;
        System.out.println("Introduzca una nota (0 a 10): ");
        nota=teclado.nextInt();
         }
        
        }
       
        System.out.println("Frecuencia de las notas : ");
        for(i=0;i<=10;i++){
        System.out.printf("Nota %d, Frecuencia : %d%n",i,vector[i]);
        }
        
    }*/
}
