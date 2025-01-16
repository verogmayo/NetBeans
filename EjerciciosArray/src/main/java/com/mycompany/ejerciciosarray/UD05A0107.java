/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejerciciosarray;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class UD05A0107 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        Random random=new Random();
        int vector[]=new int [10];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(0,99);  
        }

        System.out.println("El vector original es:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");// para que salga en linea y con espacio
        }
        
        System.out.println();
        
        int opcion;
        int aux;
        do{
            
        System.out.println("Seleccione una operación:");
        System.out.println("1. Invertir el vector");
        System.out.println("2. Rotar una posición a la izquierda");
        System.out.println("3. Rotar una posición a la derecha");
        System.out.println("0. Salir");
        
        opcion = teclado.nextInt();
        teclado.nextLine();
        switch (opcion) {
            case 1 ->{//invertir
                for (int i = 0; i < vector.length / 2; i++) {
                   aux = vector[i];
                    vector[i] = vector[vector.length - 1 - i];
                    vector[vector.length - 1 - i] = aux;
                }
            }
            case 2-> {//Rotar a la izquierda
                aux = vector[0];
                for (int i = 0; i < vector.length - 1; i++) {
                    vector[i] = vector[i + 1];
                    
                }
                vector[vector.length - 1] = aux;
            }   

            case 3 ->{//rotar a la derecha
                aux = vector[vector.length - 1];
                for (int i = vector.length - 1; i > 0; i--) {
                    vector[i] = vector[i - 1];
                    
                }
                vector[0] = aux;
                
            }
            case 0 ->{
                System.out.println("Bye.");
            }
            default-> {
                System.out.println("La opcion no exixte.");
            }
        }
        System.out.println("El vector después de la operación es:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
        }while (opcion!=0);
        

        
    }
    
}
