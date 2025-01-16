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
public class UD05A0103 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int i; 
       int vector[]=new int[5];
       int comparadorMenor;
       System.out.println("introducza 5 enteros : ");
       for (i=0;i<vector.length;i++){
           vector[i]=teclado.nextInt();
       }
       comparadorMenor=buscarMenor(vector);
       System.out.println("El menor es "+comparadorMenor);
       
    }
    
    public static int buscarMenor(int [] vector){ //el metodo devuelve un real asi que hay que poner float
        int i;
       int comparadorMenor;
       int posicion;
        comparadorMenor=0;
        posicion=0;
        for(i=0;i<vector.length;i++){
            if(vector[i]<comparadorMenor){
                comparadorMenor=vector[i];
                posicion=i;
            }
        }
        return comparadorMenor;// Me da error si no pongo el return
        
    }
}
