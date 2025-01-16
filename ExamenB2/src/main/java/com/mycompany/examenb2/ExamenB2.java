/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.examenb2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ExamenB2 {

    public static void main(String[] args) {
        int n, resto, suma, contador;
        Scanner teclado = new Scanner(System.in);
        contador = 0;
           System.out.print("Introduzca un entero positivo : ");
            n = teclado.nextInt(); 
        
        while(n>0){
            System.out.print("Introduzca un entero positivo : ");
            n = teclado.nextInt();
            suma = 0;
            contador++;
            while (n != 0) {
                resto = n % 10;
                suma = suma + resto;
                n = n/10;
            }
                System.out.println(suma);
                contador++;
            System.out.print("Introduzca un entero positivo : ");
            n = teclado.nextInt();
            }
  
        System.out.print(contador);
    }
}
