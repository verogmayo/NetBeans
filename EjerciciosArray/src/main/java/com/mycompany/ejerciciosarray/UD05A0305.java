/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejerciciosarray;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class UD05A0305 {

     public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int[] v= new int [10];
		int i;
		for (i=0;i<v.length;i++){
			System.out.println("introduzca un entero :");
                        v[i]=teclado.nextInt();
		}
                
                // la busquedad binaria funciona si el vector está ordenado.
                Arrays.sort(v);//ordena el vector ascendente.
		System.out.println("Introduzca el entero que quiera buscar :");
                 int   entero=teclado.nextInt();
                // API: static int binarySearch(int[] a, int key)
                Arrays.binarySearch(v, entero);
				if(Arrays.binarySearch(v, entero)>=0){
					System.out.println("El entero "+entero+" está en el vector en la posición "+Arrays.binarySearch(v, entero));
					
				}else{
					System.out.printf("El entero %d no se encuentra en el vector.",entero);
				}
                
                
                
                
    }
    
}
