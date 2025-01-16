/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examenes;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej0204 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int i,alto,bajo;
        int v[]=new int[10];
        Random random=new Random();
        for(i=0;i<v.length;i++){
            v[i]=random.nextInt(0,100);
            System.out.print(v[i]+" ");
        }
        System.out.println(" ");
        alto=v[0];
        bajo=v[0];
        for(i=0;i<v.length;i++){
            if(v[i]>alto){
                alto=v[i];
            }
            if(v[i]<bajo){
                bajo=v[i];
            }
        }
        System.out.println("El valor mas alto es : "+alto);
        System.out.println("El valor mas bajo es : "+bajo);
        System.out.println("El rango es: "+(alto-bajo));
    }
    
}
