/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examenb2;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Usuario
 */
public class Ej03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner teclado=new Scanner(System.in);
         boolean esTautograma;
         String frase, palabra;
         System.out.print("Introduzca una frase : ");
         frase=teclado.nextLine();
         frase=frase.toLowerCase();
         StringTokenizer st=new StringTokenizer(frase);
         palabra=st.nextToken();
         char inicial=palabra.charAt(0);
         esTautograma=true;
         while(st.hasMoreTokens()){
             if (palabra.charAt(0)!=inicial){// la admiracion hace la negacion
                 esTautograma=false;
             }
             palabra=st.nextToken();
         }
         if(esTautograma){
             System.out.println("TAUTOGRAMA");
         }else{
            System.out.println("NO"); 
         }
    }
    
}
