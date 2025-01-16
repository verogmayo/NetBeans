/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicios;
import java.util.Scanner;
/**
 *
 * @author veronique.gru
 */
public class Ejercicios {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int opcion;
         String cadena1, cadena2, mayuscula, sustituye, repetido;  
         int entero, buscarcadena;
         boolean sufijo, prefijo, esMonovocalica;
         double area, so, lado1, lado2, lado3;
         char primeraVocal, c;
         
      do{
          System.out.println("1- Mostrar el sistema operativo, el usuario, el directorio home del usuario y la versión del JRE.");
          System.out.println("2- Mostrar la mayor de dos cadenas. Solicita dos cadenas y las muestra ordenadas alfabeticamente.");
          System.out.println("3- Comprobar prefijo y sufijo.");
          System.out.println("4- Buscar una cadena en otra.");
          System.out.println("5- Convertir cadena a mayúsculas.");
          System.out.println("6- Reemplazar caracteres.");
          System.out.println("7- Repetir caracteres.");
          System.out.println("8- Mostrar la letra del DNI.");
          System.out.println("9- Insertar una cadena en otra.");
          System.out.println("10- Comprobar palíndromo");
          System.out.println("11- Calcular el área de un círculo.");
          System.out.println("12- Calcular el área de un triángulo.");
          System.out.println("13- Comprobar monovocálica.");
          System.out.println("14- Convertir a binario y hexadecimal.");
      System.out.println("0-Salir");
      System.out.println("Introduce opción");
      opcion=teclado.nextInt();
      teclado.nextLine();// hay que ponerlo para que deje escribir entre linea y linea
      switch(opcion){
          case 1 -> {
                    System.out.println(System.getProperty("os.name")); // muestra la versión del SO
                    System.out.println(System.getProperty("user.name"));//muestra el usuario
                    System.out.println(System.getProperty("user.dir"));//muestra el usuari
                    System.out.println(System.getProperty("java.version"));//muestra el usuario
                }
          case 2 -> {
              System.out.println("Introduce la primera cadena : ");
              cadena1=teclado.nextLine();
              System.out.println("Introduce la segunda cadena : ");
              cadena2=teclado.nextLine();
              entero=cadena1.compareToIgnoreCase(cadena2);
              if(entero<0){//si es negativo la cadena1 está antes que la cadena2 por orden alfabetico.
                  System.out.println(cadena1);
                  System.out.println(cadena2);
              }else {
                  System.out.println(cadena2);
                  System.out.println(cadena1);
              }
          }
          case 3 ->{
              System.out.print("Introduce la primera cadena : ");
              cadena1=teclado.nextLine();
              System.out.print("Introduce la segunda cadena : ");
              cadena2=teclado.nextLine();
              prefijo=cadena1.startsWith(cadena2);/*dice si la cadena que se dice es prefijo : booleano*/
              sufijo=cadena1.endsWith(cadena2);
              if(sufijo && prefijo){
                  System.out.println("Es sufijo y prefijo");
              }else {
                  if(sufijo){
                      System.out.println("Es sufijo");
                 
                      }else{
                       if(prefijo){
                            System.out.println("Es prefijo") ;
                       }else{
                           System.out.println("No es ni prefijo ni sufijo");/*Se puede poner System.out.println(salida) y escribir salida en las otras con lo que se quiera imprimir*/
                       }
                  }
                  }
              }
          case 4 ->{
              System.out.print("Introduce la primera cadena : ");
              cadena1=teclado.nextLine();
              System.out.print("Introduce la segunda cadena : ");
              cadena2=teclado.nextLine();
              buscarcadena=cadena1.indexOf(cadena2);//busca la cadena 2 en l acadena 1. Devuelve una subcaneda
              if(buscarcadena<0){// Si contiene la cadena la expresion devuelve la posición de la cadena si no esta devielve -1. 
                  System.out.println("No se ha encontrado la cadena ");
              }else{
                  System.out.println("Se ha encontrado la cadena ");
                  System.out.println("esta en la posición :  " +buscarcadena);//Dice en que posicion está la cadena.
              }
          }
          case 5 ->{
             System.out.print("Introduce una palabra en minuscula : ");
             cadena1=teclado.nextLine();
             mayuscula=cadena1.toUpperCase();
             System.out.println(mayuscula);
          }
          case 6 ->{
              System.out.print("Introduce varias palabras : ");
              cadena1=teclado.nextLine();
              sustituye=cadena1.replace(' ','_');// Sustituye un caracter por otro en una cadena. Si tiene un caracter es '' Si es cadena ""
              //se pone comillas sencillas porque es un solo caracter. si fuera un grupo de caracteres ""
              System.out.println(cadena1);  //es mejor imprimir los dos para ver si cadena1 sigue igual
              System.out.println(sustituye);  
          }
          
          case 7 ->{
              System.out.print("Introduce una palabra : ");
              cadena1=teclado.nextLine();
              System.out.print("Introduce un entero positivo : ");
              entero=teclado.nextInt();
              repetido=cadena1.repeat(entero);
              if(entero<0){
                  System.out.print("Debe introducir un entero positivo : ");
              }else{
                  System.out.println(repetido);
              }
          }
          case 8 -> {
             System.out.print("Introduce el DNI : ");
             entero=teclado.nextInt();  
             buscarcadena=entero%23;
             cadena2="TRWAGMYFPDXBNJZSQVHLCKE";
             System.out.println(String.valueOf(entero)+cadena2.charAt(buscarcadena)); // String.valueOf pasa de entero a string.
             //Correcion pq el dnoi suele estar guadado como una cadena
             // System.out.print("Introduce el DNI : ");
             // cadena1=teclado.nextLine();  
             //dni=Integer.parseInt(cadena1); parse tipo primitivo cambia la cadena a entero
             //letraDni="TRWAGMYFPDXBNJZSQVHLCKE".charAt(entero)
             //System.out.println(cadena1+letraDni);
          }
          case 9 -> {
            System.out.print("Introduce la primera cadena : ");
            cadena1=teclado.nextLine();
            System.out.print("Introduce la segunda cadena : ");
            cadena2=teclado.nextLine();   
            StringBuilder s=new StringBuilder(cadena1); //construccion de StrigBuilder, para pasar de String a StringBuilder para poner modificar
            s.insert(cadena1.length()/2, cadena2);//.length()/2 mide la longitud de la cadena y la dividimos en 2 para que inserte en el medio
           //no poner s= s.insert(cadena1.length()/2, cadena2); pq sería poner que s=s
            System.out.println(s);
          }
          case 10-> {
            System.out.print("Introduce una palabra : ");
            cadena1=teclado.nextLine();
            StringBuilder s=new StringBuilder(cadena1);//pasar cadena1 a StringBuilder.
            //invertir s que es cadena1 pasado a StringBuilder.
            //Al ejecutar el codigo se ve que s es igual a revertido porque stringBuilder lo cambia
            //por lo que asignar revertido a s.reverse no es necesario pq al hacers.reverse(), ya se revierte s
            // entonces no hace falta : StringBuilder revertido=s.reverse();
            s.reverse();//da la vuelta a la cadena
            System.out.println(s); 
            if(s.toString().equals(cadena1)){//para que funcione hay que pasar el s a String con toString,
                //para que se comparen 2 strings y no un string y un stingBuilder.
              System.out.println("La palabra "+cadena1+" es políndromo");  
            }else{
                System.out.println("La palabra "+cadena1+" no es políndromo"); 
                //se puede hacer buscando si los indices son iguales.
            }
          }
          case 11 ->{
             System.out.print("Introduce el radio del circulo : "); 
             entero=teclado.nextInt();
             area=Math.PI* Math.pow(entero,2);//Math.Pi y Math.pow son double, no hace falta ponerlo. MRJOR MULTIPLICAR
             System.out.println("El area de un circulo de radio "+entero+" es : "+area);
          }
          case 12 ->{
          System.out.print("Introduce la longitud del lado 1 : "); 
             lado1=teclado.nextInt();
             System.out.print("Introduce la longitud del lado 2 : "); 
             lado2=teclado.nextInt();
             System.out.print("Introduce la longitud del lado 3 : "); 
             lado3=teclado.nextInt();
             so=((lado1+lado2+lado3)/2);//para que la operacion de el resulatdo correcto los lados tienen que ser double
             System.out.println(so);
             area=Math.sqrt(so*(so-lado1)*(so-lado2)*(so-lado3));
             System.out.println("El area de un triangulo de lado a : "+lado1+" lado b: "+lado2+ " lado c: "+lado3+" es : "+area);
          }
          case 13 ->{
             System.out.print("Introduce una palabra "); 
             cadena1=teclado.nextLine();
             primeraVocal=' '; //SE inicializa primeraVocal a espacio
             esMonovocalica=true;//Se inicializa esMonovocalica a true
             for(int i=0;i<cadena1.length() && primeraVocal==' ';i++){
                 //Cuando, recorriendo las letras de la palabra, encuentre
                 //una vocal, definida por esVocal,(funcion, definida más abajo)
                 //la recoge en primeraVocal y sale del bucle.
                 if(esVocal(cadena1.charAt(i))){
                     primeraVocal=cadena1.charAt(i);
                 }
             }
            for(int i=0;i<cadena1.length() && esMonovocalica ;i++) {
                //va recorriendo las letras de la pablabra y 
            if(esVocal(cadena1.charAt(i))){
                //Si encuentra una vocal...
                     if(cadena1.charAt(i)!=primeraVocal){
                         //y es diferente de promeraVocal...
                      esMonovocalica=false;
                      //no es monovocalica
                     }
                 }
            }
            if(esMonovocalica){
                //la salida es ... si esMonovocalica es verdadero, es monovocalida
                System.out.println("MONOVOCÁLICA");
            }else{
                //sino .. no es monovocalica
                System.out.println("NO MONOVOCÁLICA");
            }
          }
          case 14 ->{
            System.out.print("Introduce un numero decimal "); 
            entero=teclado.nextInt();
            cadena1=Integer.toBinaryString(entero);//convierte a bianrio
            cadena2=Integer.toHexString(entero);//convierte a hexadecimal
            System.out.println(" en binario : "+cadena1); 
            System.out.println(" en hexadecimal : "+cadena2); 
          }
          case 0 -> {
            System.out.println("Bye.");
          } 
          default -> {
                    System.out.println("Error en la entrada.");
          }
            
      }
      }while(opcion!=0);
    } 
    private static boolean esVocal(char c){
        c=Character.toLowerCase(c);
        return (c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u');
    }
}

