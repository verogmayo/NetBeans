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
public class UD05A0105 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
       int i ;
       int valorMenor;
       int vector[]=new int[5];
       System.out.println("Introduzca 5 enteros : ");
       for(i=0;i<vector.length;i++){
           vector[i]=teclado.nextInt();
       }
       valorMenor=identificarOrden(vector);
       if(valorMenor==vector[4]){
           System.out.println("VECTOR ORDENADO");
       }else{
           System.out.println("VECTOR NO ORDENADO");
    }
    }
   public static int identificarOrden(int [] vector){
      int i ;
       int valorMenor;
       valorMenor=vector [0];
       for (i=0;i<vector.length;i++){
           if(vector[i]>valorMenor){
           i=vector.length-1;
           }else{
           valorMenor=vector[i];
           }
       }
       return valorMenor;
   } 
}
