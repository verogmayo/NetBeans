/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejerciciosarray;

/**
 *
 * @author Usuario
 */
import java.util.Arrays;
import java.util.Random;

public class UD05A0304 {

	
    public static void main(String[] args) {
		
		int[] vOriginal= new int [10];
		Random random=new Random();
		int i;
		for (i=0;i<vOriginal.length;i++){
			vOriginal[i]=random.nextInt(101);
		}
		//System.out.println(Arrays.toString(vOriginal));// muestra el array. si no se pone to string solo muetra un codigo
		//static int[]copyOf(int[] original, int newLength) API
		int [] copiavOriginal=Arrays.copyOf(vOriginal, vOriginal.length);
		//System.out.println(Arrays.toString(copiavOriginal) );
                
                // API static void sort(int[] a)
                Arrays.sort(vOriginal) ;
                
                System.out.println("Este es el vector original "+Arrays.toString(copiavOriginal) );
                System.out.println("Este es el vector ordenado "+Arrays.toString(vOriginal));
                
    }
}
