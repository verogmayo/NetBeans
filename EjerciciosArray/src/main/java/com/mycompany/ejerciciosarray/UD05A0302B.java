/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejerciciosarray;

/**
 *
 * @author Usuario
 */
public class UD05A0302B {

		
		public static void main(String[] args){
			int[] num= new int[args.length];//esto convierte los argumentos a num enteros
			int contador=0;
			int suma=0;
			float media;
			for(int i=0;i<args.length;i++){
				num[i]=Integer.parseInt(args[i]);
				suma=suma+num[i];
				contador++;
			}
                        if (contador!=0){
                        media=suma/contador;
			System.out.println("La media de los numeros introducidos es "+media);
                        }
			
		}
		
}
