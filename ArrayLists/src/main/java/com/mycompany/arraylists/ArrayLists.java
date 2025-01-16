/*
 * Hola Mundo
 */

package com.mycompany.arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author veronique.gru
 */
public class ArrayLists {
 static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
         
        List<Integer> lista=new ArrayList<Integer>();
        int opcion;
        int num;
        int posicion;
         do {
            System.out.println("1- Añadir un entero solicitado por teclado.");
            System.out.println("2- Mostrar el contenido por pantalla.");
            System.out.println("3- Solicitar una posición por teclado y mostrar por pantalla el entero"
                    + "que ocupa dicha posición");
            System.out.println("4- Mostrar el contenido por pantalla en orden inverso.");
            System.out.println("5- Mostrar por pantalla el numero de elementos que tiene la arraylist.");
            System.out.println("6- Mostrar por pantalla la media de los números contenidos. .");
            System.out.println("7- Solicitar una posición por teclado y cambiar el entero que" +
"ocupe dicha posición por 0.");
            System.out.println("8- Solicitar un entero por teclado y nos diga si se encuentra" +
"o no en el ArrayList.");
            System.out.println("9- Solicitar un entero por teclado y nos muestra la posición" +
"en la que está.");
            System.out.println("10- Solicitar un entero por teclado y lo elimina del" +
"ArrayList");
            System.out.println("11- Solicitar una posición por teclado e insertar el número 0" +
"en dicha posición.");
            System.out.println("12- Ordenar los elementos y mostrarlos por pantalla.");
            System.out.println("13- Ordenar los elementos en orden inverso y mostrarlos por" +
"pantalla.");
            System.out.println("14- Mostrar el mayor y el menor de los elementos.");
            System.out.println("15- Rotar los elementos una posicion a la derecha");
            System.out.println("16- Intercambiar el primer elemento con el ultimo.");
            System.out.println("17- Eliminar todos los elmentos.");
            
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
                    for (Integer elemento:lista){
                        System.out.println(elemento);
                    }
      
                }
                case 3 -> {
                    System.out.println("Introduzca la posición :");
                    posicion = teclado.nextInt();
                        System.out.println(lista.get(posicion));
                   
                }
                case 4 -> {
                    System.out.println(lista.reversed());
                    }
                case 5 -> {
                    System.out.printf("Hay %d elementos en la arraylist.",lista.size());
                }
                case 6 -> {
                    int suma;
                    suma=0;
                    for (Integer elemento:lista){
                        suma=suma+elemento;
                    }
                    System.out.printf("La media de los elementos es : %f\n",((float)suma/lista.size()));
                }
                case 7 -> {
                   System.out.println("Introduzca la posición del elemento :");
                    posicion = teclado.nextInt();
                    
                        lista.get(posicion).equals(0);
                        System.out.printf("Elemento de la posicion %d : %d",posicion,lista.get(posicion));
                    
                    
                }
                case 8 -> {
                   num=leerEntero(0,10);
                    for (Integer elemento:lista){
                        if(num==elemento){
                            System.out.println("El elemento está en la lista");
                        }else{
                            System.out.println("El elmento no está en la lista");
                        }
                    }
                }
                case 9 -> {
                    num=leerEntero(0,10);
                    for (Integer elemento:lista){
                        if(num==elemento){
                            System.out.println(lista.get(elemento));
                        }
                    }
                  
                  
                }
                case 10 ->{
                num=leerEntero(0,10);
                for (Integer elemento:lista){
                        if(num==elemento){
                            lista.remove(elemento);
                        }
                    }  
                }
                case 11->{
                  posicion=leerEntero(0,10);
                  lista.set(posicion, 0);
                  
                }
                case 12-> {
                    // se utiliza null para el orden ascendente. Para el orden descendente 
                   //se utilizará comparator,.reverseOrder();
                  lista.sort(null);
                    System.out.println(lista);
                }
                case 13-> {
                    // se utiliza null para el orden ascendente. Para el orden descendente 
                   //se utilizará comparator.reverseOrder();
                   lista.sort(Comparator.reverseOrder());
                    System.out.println(lista);
                }
                case 14-> {
                   
                   
                 System.out.printf("El maximo es %d y el minimo es %d.\n",Collections.max(lista),Collections.min(lista));
                }
                case 15-> {
                   /*Collectiions.rotate :Rotates the elements in the specified list by the specified distance. After 
                    calling this method, the element at index i will be the element previously at index (i - distance) 
                    mod list.size(), for all values of i between 0 and list.size()-1, inclusive.
                    Para rotar a la derecha 1 y a la izquierda -1*/
                   Collections.rotate(lista, 1);
                }
                case 16-> {
                   /*Collection.swap:Swaps the elements at the specified positions in the specified list. */
                   Collections.swap(lista, lista.getFirst(), lista.getLast());
                }
                case 17-> {
                    lista.clear();
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

/*
 if(opcion ==1){
                num=leerEntero(0,10); 
                   lista.add(num);
            } else{
                if(lista.isEmpty()){
                switch (opcion) {
                case 1 -> {
                   num=leerEntero(0,10); 
                   lista.add(num);
                }
                case 2 -> {
                    lista.forEach(System.out::println);
      
                }
                case 3 -> {
                  
                }
                case 4 -> {
                 
                    }
                case 5 -> {
                   
                }
                case 6 -> {
                
                }
                case 7 -> {
                  
                }
                case 8 -> {
                   
                }
                case 9 -> {
                  
                }
                case 10 ->{
               
                       
                }
                case 11->{
                   
                }
                case 12-> {
                   
                }
                
                case 0 -> {
                   
                }
                default -> {
                    
                }
               }
            }else{
                        
                        System.out.println("La lsita está vacía");
                        }}

            }
        } while (opcion != 0);
                
                
}           
}  
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


*/