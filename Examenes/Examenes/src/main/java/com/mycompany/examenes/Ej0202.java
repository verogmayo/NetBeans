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
public class Ej0202 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String mensaje;
         System.out.print("Introduzca un mensaje con hashtags : ");
        mensaje=teclado.nextLine();
        StringTokenizer st=new StringTokenizer(mensaje);
        while(st.hasMoreTokens()){
            String palabra=st.nextToken();
            if(palabra.startsWith("#")){
                System.out.println(palabra);
        }
        }
        
    }
    
}
