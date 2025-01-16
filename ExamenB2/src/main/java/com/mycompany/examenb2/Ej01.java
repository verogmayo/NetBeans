/*
 * Hola Mundo
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examenb2;

import java.util.Scanner;

/**
 *
 * @author veronique.gru
 */
public class Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
       int a, b;
       double hyp, per, area;
       
        System.out.println("Introduzca el lado a :");
        a=teclado.nextInt();
        System.out.println("Introduzca el lado b :");
        b=teclado.nextInt();
       hyp=Math.sqrt((a*a)+(b*b));
	area=((a*b)/2);
	per=(a+b+hyp);
        System.out.println(hyp);
        System.out.println(area);
        System.out.println(per);
        
    }
    
}
