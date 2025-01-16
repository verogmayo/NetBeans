/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ud04a03;

import java.text.NumberFormat;
import java.time.LocalTime;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.TimeZone;

/**
 *
 * @author veronique.gru
 */
public class UD04A03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        int entero, entero2, dia, mes, anio;
        float media, suma, contador, precio;
        String cadena1, cadena2,pais,idioma, precioE, precioUS, mesEnLetra;

        do {
            System.out.println("1- Calculo de la media.");
            System.out.println("2- Adivina el número.");
            System.out.println("3- Dividir cadena.");
            System.out.println("4- Leer fecha y mostrar formateada.");
            System.out.println("5- Unir palabras separadas por delimitador.");
            System.out.println("6- Mostrar la configuración regional y la zona horaria.");
            System.out.println("7- Cambiar la configuración regional.");
            System.out.println("8- Cambiar la zona horaria.");
            System.out.println("9- Mostrar información en distintos formatos.");
            System.out.println("0-Salir");
            System.out.println("Introduce opción");
            opcion = teclado.nextInt();
            teclado.nextLine();// hay que ponerlo para que deje escribir entre linea y linea
            switch (opcion) {
                case 1 -> {
                    suma = 0;
                    contador = 0;
                    do {
                        System.out.println("Introduce un numero : ");
                        //entero = teclado.nextInt();
                        entero=leerEntero();
                        if (entero > 0) {
                            suma = entero + suma;
                            contador = contador + 1;
                        } else {
                            media = suma / contador;
                            System.out.println("la media de los numeros marcados es " + media);
                        }
                    } while (entero > 0);
                }
                case 2 -> {
                    Random random = new Random();//se llama a la clase random
                    entero2 = random.nextInt(0, 99);
                    //bucle por lectura anticipada mejor solo while. porque se hace 0 o mas veces.
                    do {
                        System.out.print("Adivina un numero entero entre 1 y 99 : ");
                        entero = leerEntero(1, 99);
                        if (entero < entero2) {
                            System.out.println("El numero secreto es mayor");
                        } else {
                            System.out.println("El numero secreto es menor");
                        }
                    } while (entero2 != entero);
                    if (entero2 == entero) {
                        System.out.println("Enhorabuena has adivinado. Era el numero " + entero2);
                    }
                    
                   
                }
                case 3 -> {
                    System.out.print("Introduce una frase : ");
                    cadena1 = teclado.nextLine();
                    StringTokenizer st = new StringTokenizer(cadena1);//hay que importar la herramienta de tokenizer de java
                    while (st.hasMoreTokens()) {//mientras haya más palabras(tokens)...
                        System.out.println(st.nextToken());//las imprime
                        System.out.println(st.countTokens());//las cuenta CORREGIDO

                }
                }
                case 4 -> {
                    System.out.print("Introduce una fecha dd-mm-aaaa: ");
                    cadena1 = teclado.nextLine();
                    StringTokenizer st = new StringTokenizer(cadena1, "-");//Para que separe las palabras que tienen 
                    //guion como separacion hay que indicarlo en el Stringtokenizer
                        dia=Integer.parseInt(st.nextToken());//recoge el día. cambia la cadena de caracteres recibida en un int
                        mes=Integer.parseInt(st.nextToken());//recoge el mes
                        anio=Integer.parseInt(st.nextToken());//recoge el año
                        switch(mes){
                            case 1 -> System.out.println(dia+" de enero de "+anio);  
                            case 2 -> System.out.println(dia+" de febrero de "+anio);
                            case 3 -> System.out.println(dia+" de marzo de "+anio);
                            case 4 -> System.out.println(dia+" de abril de "+anio);
                            case 5 -> System.out.println(dia+" de mayo de "+anio);
                            case 6 -> System.out.println(dia+" de junio de "+anio);
                            case 7 -> System.out.println(dia+" de julio de "+anio);
                            case 8 -> System.out.println(dia+" de agosto de "+anio);
                            case 9 -> System.out.println(dia+" de septiembre de "+anio);
                            case 10 -> System.out.println(dia+" de octubre de "+anio);
                            case 11 -> System.out.println(dia+" de noviembre de "+anio);
                            case 12 -> System.out.println(dia+" de diciembre de "+anio);
                        }
                    }
                case 5 -> {
                    StringJoiner sj = new StringJoiner(",", "[", "]");//hay qie ponerlo fuera del bucle sino 
                    //da error, al estar el system.out fuera del bucle
                    //alt+enter para el util si no aparece la opción sola
                    do{
                        System.out.print("Introduce una palabra: ");
                        cadena1 = teclado.nextLine();
                        if(!cadena1.equals("fin")){//añade las palabras salvo que sea fin.
                        sj.add(cadena1);//StringJoiner sj = new StingJoiner(); 
                        }
                    }while(!cadena1.equals("fin"));//mientras sea diferente de "fin"
                     System.out.println(sj);
                }
                case 6 -> {
                   System.out.println("Configuración regional"+Locale.getDefault());//hay que importar util Locale
                   System.out.println("Zona horaria"+TimeZone.getDefault());//hay que importar util TimeZone
                }
                case 7 -> {
                    
                    System.out.print("Introduce el codigo del pais: ");
                    cadena1=teclado.nextLine();
                    System.out.print("Introduce el codigo el idioma: ");
                    cadena2=teclado.nextLine();
                   //Locale nlo=new Locale(cadena1,cadena2);//no se porque se borra locale 
                   
                   Locale.setDefault(Locale.of(cadena2, cadena1));
                  
                    System.out.println("El nuevo pais es: "+Locale.getDefault().getDisplayCountry());
                    System.out.println("El nuevo idioma es: "+Locale.getDefault().getDisplayLanguage());
                    //!!!!!NO FUNCIONA CON US Y GB.
                }
                case 8 -> {
                    /*System.out.print("Introduce la zona horaria : (America/New_York, Europe/London, Europe/Madrid): ");
                    cadena1=teclado.nextLine();
                    TimeZone tz=TimeZone.getTimeZone(cadena1);
                    System.out.println(tz);
                    //No sé si la salida está bien....*/
                    System.out.print("Introduce zona horaria: ");
                    cadena1=teclado.nextLine();
                   
                    TimeZone.setDefault(TimeZone.getTimeZone(cadena1));
                    System.out.print(LocalTime.now());
                    
                }
                case 9 -> {
                    System.out.print("introduce un precio: ");//Moneda es currency. 
                    precio=teclado.nextFloat();
                    NumberFormat nfe=NumberFormat.getCurrencyInstance(Locale.FRANCE);//No he encontrado España.
                    precioE=nfe.format(precio);
                    NumberFormat nfus=NumberFormat.getCurrencyInstance(Locale.US);
                    precioUS=nfus.format(precio);
                    System.out.println("Este es el precio en Euros"+ precioE);
                    System.out.println("Este es el precio en Dolares Americanos"+ precioUS);
                    //NumberFormat nf=NumberFormat.getInstance(Locale.getDefault());
                    // System.out.print("introduce un precio: ");//Moneda es currency. 
                   // precio=teclado.nextFloat();
                     //System.out.println(nf.format(precio)nf.getCurrency(precio));
                    //System.out.println(nf.getCurrency());
                   
                   
                   
                    
                    //NumberFormat nf=NumberFormat.getInstance(Locale.of("en","US"));
                    //NumberFormat nfe=NumberFormat.getInstance(Locale.of("es","ES"));
                    //System.out.println(nf.format(1547.57));
                    //System.out.println(nf.getCurrency());
                     //System.out.println(nfe.format(1547.57));
                    //System.out.println(nfe.getCurrency());
                    
                }
                case 10 ->{//correccion del 2
                 Random random = new Random();//se llama a la clase random
                    entero2 = random.nextInt(0, 99);
                    contador=1;
                        System.out.print("Adivina un numero entero entre 1 y 99 : ");
                        entero = leerEntero(1, 99);
                       while (entero!=entero2){
                        if(entero2<entero){
                        System.out.println("El numero secreto es mayor");
                            }else {
                                  System.out.println("El numero secreto es menor");  
                                    }
                       contador++;
                       System.out.print("Adivina un numero entero entre 1 y 99 : ");
                        entero = leerEntero(1, 99);
                       }
                       System.out.print("has necesitado  "+ contador+ "intentos");
                        
                }
                case 11->{
               /* System.out.print("Introduce una fecha dd-mm-aaaa: ");
                    cadena1 = teclado.nextLine();
                    StringTokenizer st = new StringTokenizer(cadena1, "-");
                    if(st.countTokens()==3){
                        dia=Integer.parseInt(st.nextToken());//recoge el día. cambia la cadena de caracteres recibida en un int
                        mes=Integer.parseInt(st.nextToken());//recoge el mes
                        anio=Integer.parseInt(st.nextToken());//recoge el año
                        mesEnLetra = switch(mes){
                            case 1 -> "enero";  
                            case 2 -> "febrero" ;
                            case 3 -> "marzo";
                            case 4 -> "abril" ;
                            case 5 -> "mayo" ;
                            case 6 -> "junio" ;
                            case 7 -> "julio";
                            case 8 -> "agosto";
                            case 9 -> "septiembre";
                            case 10 -> "octubre";
                            case 11 -> "noviembre";
                            case 12 -> "diciembre";
                        
                        };
                     
                       }else {}
                            System.out.printf(" %d de %s de %d\n ", dia,mesEnLetra,anio);   */ 
                }
                case 12-> {
                StringJoiner sj = new StringJoiner(",", "[", "]");//hay qie ponerlo fuera del bucle sino 
                    //da error, al estar el system.out fuera del bucle
                    //alt+enter para el util si no aparece la opción sola
                   
                        System.out.print("Introduce una palabra: ");
                        cadena1 = teclado.nextLine();
                    while(!cadena1.equals("fin")){//mientras sea diferente de "fin"
                    sj.add(cadena1);
                     System.out.println(sj);
                }
                }
                case 0 -> {
                    System.out.println("Bye.");
                }
                default -> {
                    System.out.println("Error en la entrada.");
                }

            }
        } while (opcion != 0);

    }

    private static int leerEntero(int min, int max) {
        int entero;
        Scanner teclado = new Scanner(System.in);
        do {
            while (!teclado.hasNextInt()) {//si el numero introducido no es entero vuelve a solicarlo
                teclado.nextLine();
            }
            entero = teclado.nextInt();
            if (entero < min || entero > max) {
                System.out.println("El número debe estar entre " + min + " y " + max);
            }
        } while (entero < min || entero > max);
        return entero;

    }
    private static int leerEntero(){
        int entero;
        Scanner teclado=new Scanner(System.in);
        while (!teclado.hasNextInt()){ //Si el numnero no es entero lo vuelve a solicitar
            System.out.println("Este caracter no es valido. Introduce un numero : ");
            teclado.nextLine();
        }
        entero=teclado.nextInt();
        return entero;
    }
}
