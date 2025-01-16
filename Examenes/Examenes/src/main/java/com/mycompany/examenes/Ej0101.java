/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examenes;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej0101 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
	 int n;
         System.out.print("Introduzca Un entero positivo :");
         n=teclado.nextInt();
         System.out.print(n+ " ");
         while (n<0){
         System.out.print("Introduzca Un entero positivo :");
         n=teclado.nextInt();
         System.out.print(n+ " ");
         }
         while(n!=1){
         if(n%2==0){
             n=n/2;
         }else {
             n=(n*3)+1;
         }
             System.out.print(n+" ");
         }
    }
    
}
