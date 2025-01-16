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
public class E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase;
        String hashtag, palabra;
        System.out.println("Introduzca una frase :");
        frase = teclado.nextLine();
        StringTokenizer sk = new StringTokenizer(frase);
        while (sk.hasMoreTokens()) {
            palabra=sk.nextToken();
            if (palabra.startsWith("#")) {
                hashtag = palabra;
                System.out.println(hashtag);
            }
        }

    }

}
