/*
 * Hola Mundo
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejerciciosarray;

import java.util.Scanner;

/**
 *
 * @author veronique.gru
 */
public class UD05A01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
       int i; 
       int vector[]=new int[5];
       int contadorNegativo;
       System.out.println("introducza 5 enteros : ");
       for (i=0;i<vector.length;i++){
           vector[i]=teclado.nextInt();
       }
       contadorNegativo=contarNegativo(vector);//llama al metodo contar Negativo
       System.out.println("Hay "+contadorNegativo+ " numeros negativos");
       
    }
    
    public static int contarNegativo(int [] vector){ //el meotodo devuelve un entero asi que hay que poner int
        int i;
        int contadorNegativo;
        contadorNegativo=0;
        for(i=0;i<vector.length;i++){
            if(vector[i]<0){
            contadorNegativo=contadorNegativo+1;
            }
        }
        return contadorNegativo;// Me da error si no pongo el return
        
    }
}
