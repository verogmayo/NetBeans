/*
 * Hola Mundo
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examenes;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author veronique.gru
 */
public class Exam03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
         String frase, palabra;
         int i, contadorVocal, contadorConsonante,contador;
         boolean palabraSi;
         System.out.print("Introduzca una frase : ");
         frase=teclado.nextLine();
         frase=frase.toLowerCase();
         StringTokenizer st=new StringTokenizer(frase);
         palabra=st.nextToken();
         
         while(st.hasMoreTokens()){
             contadorVocal=0;
         for (i=0; i < palabra.length();i++){
                   if (esVocal(palabra.charAt(i))){
                   contadorVocal=contadorVocal+1;
                       
                   }
                   System.out.println("contadorVocal");
        }
        contadorConsonante=0;
        for (i=0; i < palabra.length();i++){
                   if (!esVocal(palabra.charAt(i))){
                   contadorConsonante=contadorConsonante+1;
                   
                   }
                   System.out.println("contadorVocal");
        }
        contador=0;
         if(contadorVocal==contadorConsonante){
             contador=contador+1;
         }else {
             System.out.println("0");;
         }
         palabra=st.nextToken();
         }
         System.out.println("contador");
         
        
    
    
    }
    private static boolean esVocal(char c){
        c=Character.toLowerCase(c);
        return (c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u');
    }
}
