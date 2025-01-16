/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package es.sauces.banco;

import java.util.Scanner;

/**
 *
 * @author ambrosio
 */
public class AplicacionBanco {

    public static void main(String[] args) {
        Cuenta cuenta = null;
        int opcion;
        String codigo, titular;
        float saldo, cantidad;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("1.- Abrir cuenta");
            System.out.println("2.- Ingresar dinero");
            System.out.println("3.- Retirar dinero");
            System.out.println("4.- Consultar saldo");
            System.out.println("5.- Cancelar cuenta");
            System.out.println("0.- Salir");
            System.out.print("Introduzca opción: ");
            opcion = teclado.nextInt();
            teclado.nextLine();
            if(opcion>=1 && opcion<=5){
                 System.out.print("Introduzca código cuenta: ");
                 codigo = teclado.nextLine();
                 if(opcion==1){
                    if(cuenta==null){
                        System.out.print("Introduzca titular de la cuenta: ");
                        titular = teclado.nextLine();
                        System.out.print("Introduzca saldo inicial de la cuenta: ");
                        saldo = teclado.nextFloat();
                        teclado.nextLine();
                        cuenta = new Cuenta(codigo, titular, saldo);
                        System.out.println("Cuenta creada con éxito: "+cuenta);
                    }
                    else{
                        System.out.println("No se puede abrir la cuenta");
                    }
                 }
                 else{
                     if(cuenta!=null && codigo.equals(cuenta.getCodigo())){
                        switch (opcion) {
              
                            case 2 -> {
                    
                                System.out.print("Introduzca cantidad a ingresar: ");
                                cantidad=teclado.nextFloat();
                                teclado.nextLine();
                                cuenta.ingresar(cantidad);
                                System.out.println("Cantidad ingresada");
                                System.out.println("Nuevo saldo: "+cuenta.getSaldo());
                            }
                    
                           case 3 -> {
                                System.out.print("Introduzca cantidad a retirar: ");
                                cantidad=teclado.nextFloat();
                                teclado.nextLine();
                                cuenta.reintegrar(cantidad);
                                System.out.println("Cantidad reintegrada");
                                System.out.println("Nuevo saldo: "+cuenta.getSaldo());
                            }
                            
                            case 4 -> {
                                System.out.println(cuenta.getSaldo());
                            }
                                    
                            case 5 -> {
                                System.out.println(cuenta);
                                
                                cuenta=null;
                                System.out.println("CUENTA CANCELADA");
                            }
                        }
                    }
                    else{
                        System.out.println("No existe una cuenta con ese código en el sistema");
                    }
                }
            }
           
        } while (opcion != 0);
    }
}
