/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examenes;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Ej0104 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        int v[] = new int[10];
        Random random = new Random();
        for (i = 0; i < v.length; i++) {
            v[i] = random.nextInt(100);
        }
        for (i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println(" ");
        Arrays.sort(v);
        for (i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
		System.out.println(" ");
        float mediana;
        if(v.length%2!=0){
           mediana=v[v.length/2];
        }else{
              mediana=(v[(v.length/2)]+v[(v.length/2)-1])/2.0f;
        }
        System.out.println("La mediana es : "+mediana);
    }

}
