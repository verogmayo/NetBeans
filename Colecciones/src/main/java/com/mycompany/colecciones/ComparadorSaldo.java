/*
 * Hola Mundo
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colecciones;

import java.util.Comparator;

/**
 *
 * @author veronique.gru
 */
public class ComparadorSaldo implements Comparator<Cuenta> {

    @Override
    public int compare(Cuenta o1, Cuenta o2) {
       return Float .compare(o1.getSaldo(),o2.getSaldo());
    }
    
}
