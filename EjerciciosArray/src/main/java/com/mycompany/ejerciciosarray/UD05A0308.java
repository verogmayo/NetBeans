/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejerciciosarray;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Usuario
 */
public class UD05A0308 {

   public static void main(String[] args) {
	   Random random=new Random();
		int[] v1= new int [10];
		int[] v2= new int[10];
		int i;
		for (i=0;i<v1.length;i++){
                        v1[i]=random.nextInt(100);
		}
                for (i=0;i<v1.length;i++){
                        v2[i]=random.nextInt(100);
		}
               System.out.println(Arrays.toString(v1));
			   System.out.println(Arrays.toString(v2));
                //static void sort(int[] a)
                Arrays.sort(v1);//ordena el vector ascendente.
               Arrays.sort(v2);
			   System.out.println(Arrays.toString(v1));
			   System.out.println(Arrays.toString(v2));
			   ordenarDescendente(v1);
			   ordenarDescendente(v2);
			   System.out.println(Arrays.toString(v1));
			   System.out.println(Arrays.toString(v2));
               int []v3;
                //API static void parallelSort(int[] a)      
		for(i=0;i<v1.length;i++){
                    Arrays.compare(v1,i , i, v2, i, i);
                }
                
                
                
                
                
    }
	public static void ordenarDescendente(int [] v){
			int aux;
		for (int i = 0; i < v.length / 2; i++) {
                   aux = v[i];
                    v[i] = v[v.length - 1 - i];
                    v[v.length - 1 - i] = aux;
                }
	}
}
