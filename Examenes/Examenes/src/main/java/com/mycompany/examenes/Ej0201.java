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
public class Ej0201 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner teclado=new Scanner(System.in);
      int n, resto, contador, suma;
        System.out.print("Introduzca un entero positivo : ");
        n=teclado.nextInt();
        contador=0;
        while(n>0){
            resto=0;
            suma=0;
            while(n>0){
                resto=n%10;
                suma=suma+resto;
                n=n/10;
            }
            System.out.println("La suma de los digitos es: "+suma);
            contador++;
            System.out.print("Introduzca un entero positivo : ");
            n=teclado.nextInt();
        }
        System.out.println("Se han introducido "+ contador+" enteros positivos.");
    
    }
    
}
