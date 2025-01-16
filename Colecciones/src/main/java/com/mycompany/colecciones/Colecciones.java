/*
 * Hola Mundo
 */

package com.mycompany.colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;
/**
 *
 * @author veronique.gru
 */
public class Colecciones {

    public static void main(String[] args) {
       /* ArrayList<String> lista;
        Iterator=<Sting> iterador;
        lista=new LinkedList<>();
        lista.add("a");
        lista.add("b");
        lista.add("c");
        /*
        for(String elemento: lista){
            System.out.println(elemento);
        }*/
       /*
        for (int i=0; i<lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        */
        /*
        lista.
        
        
        iterador=lista.iterator();
        while(iterador.hasNext()){
        
            System.out.println(iterador.next());
        }*/
        /*
        Stack<String> pila=new Stack<>();
        
                pila.push("uno");
                 pila.push("uno");
                 System.out.println(pila.pop());
                 System.out.println(pila.peek());
                 System.out.println(pila.pop());
                 */
        /*Set<String> conjunto;
        Iterator<String> iterador;
        
        conjunto=new HashSet<>();
        
        conjunto.add("a");
        conjunto.add("a");
        conjunto.add("b");
        conjunto.add("c");
        
       for(String elemento: conjunto){
            System.out.println(elemento);
        } */
        
        
        /*
            Set<String> conjunto;
        Iterator<String> iterador;
        
        conjunto=new TreeSet<>(Comparator.reverseOrder());
        
        conjunto.add("d");
        conjunto.add("b");
        conjunto.add("c");
        
       for(String elemento: conjunto){
            System.out.println(elemento);
        }      
    
       conjunto.add("a");
        conjunto.add("e");
        
        for(String elemento: conjunto){
            System.out.println(elemento);
        } 

*/
        // MAPAS
      /*  Map<Integer,String> mapa;
        
        mapa=new HashMap<>();
        mapa.put(1,"uno");
        mapa.put(2,"dos");
        mapa.put(3,"tres");
        System.out.println(mapa.get(2));
        
        */
      
      Set<Cuenta> conjunto=new TreeSet<>(new ComparadorSaldo());
      conjunto.add(new Cuenta("1","a,",100));
      conjunto.add(new Cuenta("3","a,",3));
      conjunto.add(new Cuenta("2","b,",2));
      
      conjunto.forEach(System.out::println);
      
        System.out.println(Collections.max(conjunto,new ComparadorSaldo()));
    
}
