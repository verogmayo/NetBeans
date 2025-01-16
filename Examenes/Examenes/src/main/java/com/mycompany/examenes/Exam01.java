/*
 * Hola Mundo
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examenes;

import java.util.Scanner;

/**
 *
 * @author veronique.gru
 */
public class Exam01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        int n;
        int suma, mayor, menor;
        mayor=0;
        menor=10;
        suma=0;
        for(int i =0;i<4;i++){
            System.out.println("Introduzca");
            n=teclado.nextInt();
            while (n<0 || n<10){
            System.out.println("Introduzca");
            n=teclado.nextInt();
            }
        }
    }
    
}
