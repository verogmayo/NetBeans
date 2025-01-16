/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejerciciosarray;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class UD05A0104 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int i;
        String vector[]=new String [5]; //Definir vector como String 
        int posicionUsuario;
        String nombreUsuario;
        System.out.println("Introduzca 5 nombres: ");
        for(i=0;i<vector.length;i++){
            System.out.println("Introduzca nombres en la posición : "+(i+1));
            nombreUsuario=teclado.nextLine();
            vector[i]=nombreUsuario;
        }
        System.out.println("Introduzca el nombre de usuario que busca :");
        nombreUsuario=teclado.nextLine();
        posicionUsuario=buscarUsuario(vector, nombreUsuario);
        if(posicionUsuario!=-1){
            System.out.printf("El usuario %s existe y está en la posición %d %n",nombreUsuario,posicionUsuario+1);
        }else{
            System.out.printf("El usuario %s no existe %n",nombreUsuario);
        }
        
    }
    public static int buscarUsuario(String vector[], String nombreUsuario){
        int i;
        int posicionUsuario;
        posicionUsuario=-1;
        for(i=0;i<vector.length;i++){
            if(vector[i]!=null && vector[i].equals(nombreUsuario)){//para comparar cadenas hay que utilizar equal, no=
            posicionUsuario=i;
            i=vector.length-1;
            } 
        }
        return posicionUsuario;
    }
    
}
