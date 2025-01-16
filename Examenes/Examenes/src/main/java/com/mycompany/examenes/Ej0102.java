/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examenes;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Usuario
 */
public class Ej0102 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner teclado=new Scanner(System.in);
      String frase, palabra;
        System.out.println("Introduzca un frase : ");
        frase=teclado.nextLine();
        StringTokenizer st=new StringTokenizer(frase);
        String palabraMasLarga=st.nextToken();

        while(st.hasMoreTokens()){
            palabra=st.nextToken();
            if(palabraMasLarga.length()<palabra.length()){
                palabraMasLarga=palabra;
            }
        }
        System.out.print("La palabra más larga es : "+palabraMasLarga);
      
    }
    
}
