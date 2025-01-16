/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.arraylists;

import static com.mycompany.arraylists.ArrayLists.teclado;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class LinkedLists {
static Scanner teclado = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         LinkedList<Integer> lista=new LinkedList<Integer>();
        int opcion;
        int num;
        int posicion;
         do {
            System.out.println("1- Añadir un entero solicitado por teclado.");
            System.out.println("2- Mostrar el contenido por pantalla.");
            System.out.println("3- Solicitar un entero por teclado e insertarlo en la primera" +
"posición.");
            System.out.println("4- Solicitar un entero por teclado e insertarlo en la última" +
"posición.");
            System.out.println("5- Mostrar el contenido en orden inverso.");
            System.out.println("6-Mostrar los elementos primero y último.");
            System.out.println("7- Eliminar los elementos primero y último.");
            System.out.println("8- Solicitar un entero por teclado y elimine la primera" +
"aparición del número introducido.");
            System.out.println("9- Solicitar un entero por teclado y eliminar la última" +
"aparición del número introducido.");
            System.out.println("10- Ordenar los elementos y mostrarlos por pantalla.");
            System.out.println("11- Invertir el orden de los elementos y mostrarlos por" +
"pantalla.");
            System.out.println("12- Mostrar por pantalla cuántas veces aparece cada número.");
            System.out.println("13- Eliminar todos los elementos.");
            
            
            System.out.println("0-Salir");
            System.out.print("Introduce opción :");
            opcion = teclado.nextInt();
            teclado.nextLine();// hay que ponerlo para que deje escribir entre linea y linea
           
                switch (opcion) {
                case 1 -> {
                  num=leerEntero(0,10);
                  lista.add(num);
                }
                case 2 -> {
                   for(Integer elemento:lista){
                   System.out.println(elemento);
                   }
                  
                }
                case 3 -> {
                    num=leerEntero(0,10);
                    lista.add(0, num);
                   
                }
                case 4 -> {
                    num=leerEntero(0,10);
                    lista.add(num);
                    }
                case 5 -> {
                    System.out.println(lista.reversed());
                }
                case 6 -> {
                    System.out.println(lista.getFirst()+lista.getLast());
                   
                }
                case 7 -> {
                  lista.removeFirst();
                  lista.removeLast();
                    
                }
                case 8 -> {
                  System.out.println("Introduza un entero");
                  Integer  num2=teclado.nextInt();
                  lista.remove(num2);
                  
                }
                case 9 -> {
                    
                   
                 System.out.println("Introduza un entero");
                  Integer  num2=teclado.nextInt();
                  lista.removeLastOccurrence(num2);
                 
                }
                case 10 ->{
                    Collections.sort(lista);
                    System.out.println(lista);
                    
                }
                case 11->{
                    
                 Collections.sort(lista,Comparator.reverseOrder());
                  System.out.println(lista);
                }
                case 12-> {
                    //como hacer entre 2 numeros?????????????
                    for (Integer elemento:lista){
                    Collections.frequency(lista, elemento);
                    }
                   
                }
                case 13-> {
                  lista.clear();
                    System.out.println(lista);
                }
                
                
                case 0 -> {
                   
                }
                default -> {
                    
                }
               }
            

            
        } while (opcion != 0);
                
                
         
  

    }
    private static int leerEntero(int limiteinf, int limitesup){
            int num;
            System.out.printf("Introduza un entero entre %d y %d\n : ",limiteinf, limitesup);
            num=teclado.nextInt();
            while(num<limiteinf || num>limitesup){
                System.out.println("Error en entrada");
                System.out.printf("Introduza un entero entre %d y %d",limiteinf, limitesup);
                num=teclado.nextInt();
            }
            return num;
        }
    
}
