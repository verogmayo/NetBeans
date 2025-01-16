/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejerciciosarray;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjerciciosArray {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] vector;
        vector = new int[10];
        System.out.println("Introducir 10 enteros : ");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = teclado.nextInt();
        }
        System.out.println("Numeros introducidos :  ");
        for (int elemento : vector) {
            System.out.println(elemento+" ");
        }
        System.out.println();
    }

    /* public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] vector;
        vector = new int[10];
        System.out.println("Introducir 10 enteros : ");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = teclado.nextInt();
        }
        System.out.println("Numeros introducidos :  ");
        for (int elemento : vector) {
            System.out.println(elemento+" ");
        }
        System.out.println();
    }*/
   public class PruebaArrays{
        public static void mostrarArray(int[] v) {
            for (int i = 0; i < v.length; i++) {
                System.out.print(v[i] +  " ");
    }
    }
    public static void main(String[] args) {
            int[] vector = {1, 2, 3, 4, 5};
            mostrarArray(vector);
        }
    }

    
    
    public static int busquedaBinaria(int[] v, int n) {
        int pos = -1, inf = 0, sup = v.length - 1, centro;
        while (inf <= sup && pos == -1) {
            centro = ((sup - inf) / 2) + inf;
            if (v[centro] == n) {
                pos = centro;
            } else {
                if (v[centro] > n) {
                    sup = centro
                            - 1;
                } else {
                    inf = centro + 1;
                }
            }
        }
        return pos;
    }

    public static void burbuja(int[] v) {
        boolean cambio = true;
        int aux;
        for (int i = v.length - 1; i > 0 && cambio; i--) {
            cambio = false;
            for (int j = 0; j < i; j++) {
                if (v[j] > v[j + 1]) {
                    aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                    cambio = true;
                }
            }
        }
    }

    public static void insercionDirecta(int[] v) {
    int aux;
    int j;
    for (int i = 1; i < v.length; i++) {
        aux = v[i];
        
        for ( j = i; j > 0 && aux < v[j - 1]; j--) {
            v[j] = v[j - 1];
        }
      v[j] = aux; 
    }
}
    
    public static void seleccionDirecta(int[] v) {
        int aux, posMenor;
        for (int i = 0; i < v.length - 1; i++) {
            posMenor = i;
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[posMenor]) {
                    posMenor = j;
                }
            }
            aux = v[i];
            v[i] = v[posMenor];
            v[posMenor] = aux;
        }
    }
}
