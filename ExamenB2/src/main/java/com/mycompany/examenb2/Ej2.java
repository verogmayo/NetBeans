/*
 * Hola Mundo
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examenb2;

import java.util.Scanner;

/**
 *
 * @author veronique.gru
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner teclado=new Scanner(System.in);
     int n, digito;
     int acumulador, contador, aux;
     contador=0;
     while(contador!=3){
         System.out.println("Intriduzca un entero :");
         n=teclado.nextInt();
         
         if (n>0){
             aux=n;
             acumulador=0;
         while(n!=0){
             digito=n%10;
             acumulador=acumulador+digito;
             n=n/10;
         }
        if(aux%acumulador==0){
            System.out.println("ES UN NUMERO HASHARD");
            contador=contador+1;
        }else{
            System.out.println("NO ES UN NUMERO HASHARD");
        
        }
         }
         
     }
    }
    
}
