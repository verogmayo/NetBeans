/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraylists2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Arraylists2 {

    public static void main(String[] args) {
       
        List<Persona> lista = new ArrayList<Persona>();
        lista.add(new Persona(1, "Luisina", 30));
        lista.add(new Persona(2, "Gabriel", 30));
        lista.add(new Persona(3, "Ibra", 9));
        lista.add(new Persona(4, "TodoCode", 2)); 
        lista.add(new Persona(5,"Pepe",40));
        
        
      
        System.out.println("------PRUEBA FOR COMÚN--------");
        //recorido for por índice
        for (int i=0; i<lista.size(); i++) {
            System.out.println("Prueba: " + lista.get(i).getNombre());
        }
        
        System.out.println("------PRUEBA FOREACH--------");
        //recorrido por foreach
            for (Persona persona:lista) {
                System.out.println("prueba " + persona.getNombre());
            }
    }
}
