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
public class UD05A0306 {

    public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int[] v1= new int [5];
		int[] v2= new int [5];
		int i;
		for (i=0;i<v1.length;i++){
			System.out.println("introduzca un entero para el vector 1 :");
                        v1[i]=teclado.nextInt();
		}
                for (i=0;i<v2.length;i++){
			System.out.println("introduzca un entero para el vector 2 :");
                        v2[i]=teclado.nextInt();
		}
                
                // la busquedad binaria funciona si el vector está ordenado.
                //static void sort(int[] a)
                Arrays.sort(v1);//ordena el vector ascendente.
                Arrays.sort(v2);
                //static int compare(int[] a, int[] b)
                Arrays.compare(v1, v2);
               
		if(Arrays.compare(v1, v2)==0){
                    System.out.println("Los vectores son iguales");
		}else{
		System.out.printf("Los vectores sont diferentes");
		}
                
                
                
                
    }
   /* public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int[] v1= new int [5];
		int[] v2= new int [5];
		int i;
		for (i=0;i<v1.length;i++){
			System.out.println("introduzca un entero para el vector 1 :");
                        v1[i]=teclado.nextInt();
		}
                for (i=0;i<v2.length;i++){
			System.out.println("introduzca un entero para el vector 2 :");
                        v2[i]=teclado.nextInt();
		}
                
                // la busquedad binaria funciona si el vector está ordenado.
                //static void sort(int[] a)
                Arrays.sort(v1);//ordena el vector ascendente.
                Arrays.sort(v2);
                //static int compare(int[] a, int[] b)
                boolean vectoresIguales=Arrays.equals(v1,v2);
               
		if(vectoresIguales){
                    System.out.println("Los vectores son iguales");
		}else{
		System.out.printf("Los vectores sont diferentes");
		}
                
                
                
                
    }*/
}
