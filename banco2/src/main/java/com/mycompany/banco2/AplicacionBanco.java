/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.banco2;

import java.util.Scanner;

/**
 *
 * @author veronique.gru
 */
public class AplicacionBanco {

    public static void main(String[] args) {
        Cuenta cuenta=null;
        int opcion;
        String codigo,titular;
        float saldo,cantidad;
        
        
        Scanner teclado=new Scanner(System.in);
        
        do{
         System.out.println("1. Abrir cuenta");
         System.out.println("2. Ingresar dinero");
         System.out.println("3. Retirar dinero");
         System.out.println("4. Consultar saldo");
         System.out.println("5. Cancelar cuenta");
         System.out.println("6. Salir");
         System.out.print("Introduzca opción : ");
         opcion=teclado.nextInt();
         teclado.nextLine();
         if(opcion>=1 && opcion<=5){
             System.out.println("Introduce el codigo de la cuenta :");
             codigo=teclado.nextLine();
             if(opcion==1){
               if(cuenta==null){
                 System.out.print("Introduzca el titular de la  cuenta: ");
                 titular = teclado.nextLine();
                 System.out.print("Introduzca el saldo inicial de la cuenta: ");
                 saldo=teclado.nextFloat();
                 teclado.nextLine();
                 cuenta = new Cuenta(codigo, titular, saldo);
                 System.out.println("Cuenta creada con exito. ");
                 }
                 else{
                 System.out.println("No se puede abrir la cuenta");
                 }
             }
             else{
                if(cuenta!=null && codigo.equals(cuenta.getCodigo())){
                    switch(opcion){
                        case 2 ->{
                            System.out.println("Introduzca la cantidad a ingresar");
                            cantidad=teclado.nextFloat();
                            teclado.nextLine();
                            cuenta.ingresar(cantidad);
                            System.out.println("Cantidad ingresada "+cantidad);
                            System.out.println("Nuevo Saldo:  " +cuenta.getSaldo());
                        }
                        case 3 ->{
                            System.out.println("Introduzca la cantidad a reintegrar");
                            cantidad=teclado.nextFloat();
                            teclado.nextLine();
                            cuenta.reintegrar(cantidad);
                            System.out.println("Cantidad reintegrada ");
                            System.out.println("Nuevo Saldo:  " +cuenta.getSaldo());
                        }
                        case 4 ->{
                            System.out.println( +cuenta.getSaldo());
                        }
                        case 5 ->{
                            cuenta=null;
                            System.out.println("La cuenta está cancelada");
                        }
                    }
                }
                else{
                    System.out.println("No exixte una cuenta con ese codigo");
                }
            }
         }
        }while(opcion!=0);
    }
}    
   
        
 
