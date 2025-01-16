/*
 * Hola Mundo
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examenes;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author veronique.gru
 */
public class Exam04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        Random random=new Random();
        int i, v, vfrecuencias ;
       
        int vector[]=new int [10];
        for ( i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(0,5);  
        }

        System.out.println("El vector original es:");
        for ( i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
    }
    
}
