/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.arraylists;

import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Usuario
 */
public class TreeMaps {

    static Scanner teclado = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //hay que definir 2 parametros, la clave y el valor.
        //Si se pone int para defiir
       TreeMap<String, String> MapaColor = new TreeMap<>();
        int opcion;
        Integer num;
        int posicion;
         do {
            System.out.println("1- Solicitar código y nombre de color e insertarlo en el mapa");
            System.out.println("2- Mostrar el contenido por pantalla.");
            System.out.println("3- Mostrar el primero y el último códigos.");
            System.out.println("4- Mostrar la primera pareja clave/valor.");
            System.out.println("5- Mostrar todas los colores con sus correspondientes códigos.");
            System.out.println("6- Eliminar todos los elementos.");
           
  
            System.out.println("0-Salir");
            System.out.print("Introduce opción :");
            opcion = teclado.nextInt();
            teclado.nextLine();// hay que ponerlo para que deje escribir entre linea y linea
           
                switch (opcion) {
                case 1 -> {
                  
                  
                   
                }
                case 2 -> {
                   
      
                }
                case 3 -> {
                   
                }
                case 4 -> {
                    
                    }
                case 5 -> {
                   
                }
                case 6 -> {
                   
                }
               
                
                case 0 -> {
                   
                }
                default -> {
                    
                }
               }
            

            
        } while (opcion != 0);
                
                
        
    }
    
}
