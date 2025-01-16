/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examenb2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class E04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        Random random=new Random();
        int vector[]=new int [10];
        int valorMasBajo, valorMasAlto, rango;
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(0,100);  
        }

        System.out.println("El vector aleatorio es:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");// para que salga en linea y con espacio
        }
        //o sout (Arrays.toString(vector)
        System.out.println();
        valorMasBajo=vector[0];
        valorMasAlto=vector[0];
        for (int i = 0; i < vector.length; i++) {
            if(vector[i]>valorMasAlto){
                valorMasAlto=vector[i];
            }
        }
        for (int i = 0; i < vector.length; i++) {
            if(vector[i]<valorMasBajo){
                valorMasBajo=vector[i];
            }
        }
       System.out.println("El rango del vector es: "+(valorMasAlto-valorMasBajo));
    }
    
}
