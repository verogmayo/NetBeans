/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ud04.a04;

import java.io.File;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.TimeZone;
import javax.swing.JOptionPane;

/**
 *
 * @author veronique.gru
 */
public class UD04A04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        String fecha1, fecha2, hora1, hora2;
        int contador, i;
       
        do {
            System.out.println("1- Mostrar fecha y hora del sistema.");
            System.out.println("2- Mostrar fecha y hora en dos zonas horarias.");
            System.out.println("3- Sumar un número de días a una fecha.");
            System.out.println("4- Mostrar la menor de dos fechas.");
            System.out.println("5- Sumar un número de minutos a una hora.");
            System.out.println("6- Mostrar si la hora es anterior o posterior.");
            System.out.println("7- Mostrar la diferencia entre dos fechas.");
            System.out.println("8- Cambiar la zona horaria.");
            System.out.println("9- Mostrar información en distintos formatos.");
            System.out.println("0-Salir");
            System.out.print("Introduce opción :");
            opcion = teclado.nextInt();
            teclado.nextLine();// hay que ponerlo para que deje escribir entre linea y linea
            switch (opcion) {
                case 1 -> {
                   System.out.println(LocalDateTime.now()); 
                   System.out.println(ZonedDateTime.now());
                   System.out.println(OffsetDateTime.now());
                   System.out.println(Instant.now());
                }
                case 2 -> {
                  System.out.println("Hora en la zona horaria de Asia/Tokio: "+ZonedDateTime.now(ZoneId.of("Asia/Tokyo")));
                  System.out.println("Hora en la zona horaria de America/New_York: "+ZonedDateTime.now(ZoneId.of("America/New_York")));         
               /* String origen = "Madrid";
        String destino = "Nueva York";
        String fechaSalida = "2024-11-27";
        String horaSalida = "16:40";
        String duracionVuelo = "8:45";

        // Crear objetos LocalDateTime para la salida y la duración
        LocalDateTime salidaMadrid = LocalDateTime.parse(fechaSalida + "T" + horaSalida);
        Duration duracion = Duration.parse("PT" + duracionVuelo.replace(":", "H"));

        // Obtener la zona horaria de Madrid y Nueva York
        ZoneId zonaMadrid = ZoneId.of("Europe/Madrid");
        ZoneId zonaNuevaYork = ZoneId.of("America/New_York");

        // Convertir la hora de salida de Madrid a ZonedDateTime
        ZonedDateTime salidaMadridZonedDateTime = salidaMadrid.atZone(zonaMadrid);

        // Sumar la duración del vuelo para obtener la hora de llegada en UTC
        ZonedDateTime llegadaUTC = salidaMadridZonedDateTime.plus(duracion);

        // Convertir la hora de llegada en UTC a la zona horaria de Nueva York
        ZonedDateTime llegadaNuevaYork = llegadaUTC.withZoneSameInstant(zonaNuevaYork);
        System.out.println("Origen : "+origen) ;
        System.out.println("Destino : "+destino) ;
        System.out.println("Fecha de salida "+fechaSalida) ;
        System.out.println("Hora Salida : "+horaSalida) ;
        System.out.println("Hora Salida : "+duracionVuelo) ;
        System.out.println("Llegada  : "+llegadaNuevaYork) ;*/
        
                }
                case 3 -> {
                   System.out.println("Introduzca una fecha: (yyyy-mm-dd)") ;
                   String fecha=teclado.nextLine();
                   LocalDate date=LocalDate.parse(fecha);
                   System.out.println("Introduzca un numero de días para sumar: ");
                   int dias=teclado.nextInt();
                   System.out.println("La fecha resultante de la suma de "+dias+ " es "+date.plusDays(dias)) ;
                  // System.out.printf("La fecha resultante de la suma de %d días es  +date.plusDays(dias))
                }
                case 4 -> {
                 System.out.println("Introduzca una fecha: (yyyy-mm-dd)") ;
                 fecha1=teclado.nextLine();
                 System.out.println("Introduzca una fecha: (yyyy-mm-dd)") ;
                 fecha2=teclado.nextLine();
                 //DateFormat fdt1=DateFormat.parse(fecha1);
                 LocalDate date1=LocalDate.parse(fecha1);
                 LocalDate date2=LocalDate.parse(fecha2);
                 if(date1.isBefore(date2)){
                 System.out.println(date1+" es anterior a "+date2);
                 }else {
                 System.out.println(date2+" es anterior a "+date1);
                 }
                 
                    }
                case 5 -> {
                    System.out.print("Introduzca una hora: (hh:mm): ") ;
                   String hora=teclado.nextLine();
                   LocalTime time=LocalTime.parse(hora);
                   System.out.print("Introduzca un numero de minutos para sumar: ");
                   int minutos=teclado.nextInt();
                   System.out.println("La nueva hora es: " +time.plusMinutes(minutos));
                }
                case 6 -> {
                  System.out.print("Introduzca una hora(hh:mm): ") ;
                 hora1=teclado.nextLine();
                 LocalTime time1=LocalTime.parse(hora1);
                 LocalTime ahora=LocalTime.now();
                 if(time1.isBefore(ahora)){
                    System.out.println("la hora introducida "+time1+" es anterior a la hora actual"+ahora) ;
                 }else{}
                    System.out.println("la hora introducida "+time1+" es posterior a la hora actual" +ahora) ;
                }
                case 7 -> {
                    System.out.println("Introduzca una fecha: (yyyy-mm-dd)") ;
                    fecha1=teclado.nextLine();
                    LocalDate date1=LocalDate.parse(fecha1);
                    LocalDate hoy=LocalDate.now();
                    Period dif=Period.between(date1, hoy);                    
                    System.out.print("La diferencia " +dif.getDays()+" días "+dif.getMonths()+" meses "+ dif.getYears()+ " años " );
                }
                case 8 -> {
                    System.out.println("Introduzca una hora (hh:mm) ") ;
                    hora1=teclado.nextLine();
                    LocalTime h1=LocalTime.parse(hora1);
                    LocalTime ahora=LocalTime.now();
                     Duration dif=Duration.between(h1, ahora);
                     System.out.println(dif);
                     
                   // System.out.print("La diferencia " +dif.ge+" días "+dif.getMonths()+" meses "+ dif.getYears()+ " años " );
                    
                }
                case 9 -> {
                    System.out.println("Introduzca el origen del vuelo : ") ;
                     String origen=teclado.nextLine();
                     System.out.println("Introduzca la fecha del vuelo (yyyy-mm-dd): ") ;
                     fecha1=teclado.nextLine();
                     System.out.println("Introduzca la hora del vuelo (hh:mm) : ") ;
                     hora1=teclado.nextLine();
                    
                     
       
        
                     
                     System.out.println("Introduzca la duración del vuelo (hh:mm) : ") ;
                     String duracion=teclado.nextLine();
             
                       LocalDate dia=LocalDate.parse(fecha1);
                     LocalTime hora=LocalTime.parse(hora1);
                     LocalDateTime diaHoraOrigen=LocalDateTime.of(dia, hora);
                     StringTokenizer st=new StringTokenizer(duracion,":");
                    int horasVuelo=Integer.parseInt(st.nextToken());
                    int minutosVuelo=Integer.parseInt(st.nextToken());
                    Duration totalHorasVuelo=Duration.ofHours(horasVuelo).plusMinutes(minutosVuelo);
                    /*ZoneOffset diaHoraDestino=diaHoraOrigen.plus(horadestino);*/
                    System.out.println(totalHorasVuelo);
                     LocalDateTime diaHoraDestino=diaHoraOrigen.plus(totalHorasVuelo);
  
                    System.out.println("día y hora de salida del vuelo : "+diaHoraOrigen);  
                   System.out.println("día y hora de llegada del vuelo : " + diaHoraDestino);
                     
                     
                   /*OffsetDateTime llegada=OffsetDateTime.of(diaHoraDestino, ZoneOffset.of("US/Eastern"));
                     System.out.println("día y hora de llegada del vuelo : " + llegada);   */ 
                     /*OffsetDateTime llegada = diaHoraDestino.atZone(ZoneId.of("America/New_York")).toOffsetDateTime();
System.out.println("Día y hora de llegada del vuelo: " + llegada);*/
                     /*  ZonedDateTime llegadaNY = diaHoraDestino.atZone(ZoneId.of("America/New_York"));
                     System.out.println("día y hora de llegada del vuelo : " + llegadaNY);*/
                    // ZonedDateTime llegadaNuevaYork = llegadaUTC.withZoneSameInstant(zonaNuevaYork);
                       //hay que pedir origen fecha y hora y dureción de vuelo. y hay que calcular el destino y la hora.
                    
                }
                case 10 ->{
               contador=0;
               String cadena1=JOptionPane.showInputDialog(null,"Introduzca un palabra :");
               
               for (i=0; i < cadena1.length();i++){
                   if (esVocal(cadena1.charAt(i))){
                   contador=contador+1;
                   }
               }
               
               JOptionPane.showMessageDialog(null, "esta palabra contiene " + contador+" vocales");
                       
                }
                case 11->{
                   String cadena1=JOptionPane.showInputDialog("Introduce el nombre :");
                    String cadena2=JOptionPane.showInputDialog("Introduce el primer apellido :");
                    String cadena3=JOptionPane.showInputDialog("Introduce el segundo apellido :");
                    String inicial ="";
                    if(cadena1.length()>0){
                       inicial+=cadena1.charAt(0);
                    }
                    if(cadena2.length()>0){
                        inicial+=cadena2.charAt(0);
                    }
                    if(cadena3.length()>0){
                        inicial+=cadena3.charAt(0);
                    }
              JOptionPane.showConfirmDialog(null, "Tus iniciales son : "+inicial);
                }
                case 12-> {
                    do{
                    String cadena1=JOptionPane.showInputDialog("Introduce el nombre de un archivo :");
                    File ficheroDirectorio=new File(cadena1);
                    StringBuilder sb=new StringBuilder();
                    if(ficheroDirectorio.exists()){
                    sb.append("EXISTE ");
                        if (ficheroDirectorio.isFile()){
                        sb.append("ES UN FICHERO");
                        }
                        else{ 
                            sb.append("ES UN DIRECTORIO.");
                    }
                    }
                    else{ sb.append("NO EXISTE");
                    }
                    JOptionPane.showMessageDialog(null, sb);
                    }while(JOptionPane.showConfirmDialog(null, "Desea continuar?")==JOptionPane.OK_OPTION) ;
                }
                
                case 0 -> {
                   
                }
                default -> {
                    
                }

            }
        } while (opcion != 0);

    }
    private static boolean esVocal(char c){
        c=Character.toLowerCase(c);
        return (c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u');
    }
}



/*pruebas del 9
 /* System.out.println("Introduzca el origen del vuelo : ") ;
                     String origen=teclado.nextLine();
                     System.out.println("Introduzca la fecha del vuelo (yyyy-mm-dd: ") ;
                     fecha1=teclado.nextLine();
                     System.out.println("Introduzca la hora del vuelo (hh:mm) : ") ;
                     hora1=teclado.nextLine();
                     System.out.println("Introduzca la duración del vuelo : ") ;
                     String duracion=teclado.nextLine();
                    LocalTime duracionHoras=LocalTime.parse(duracion);
                     Long duracionLong=Long.getLong(duracion);
                     Long duracionLong=Long.decode(duracion);
                     Integer duracionInt=Integer.parseInt(duracion);
                     Integer duracionInt=Integer.valueOf(duracion); no funciona
Long duracion1=Long.getLong(duracion);
                     LocalDate dia=LocalDate.parse(fecha1);
                     System.out.println(dia);
                     LocalTime hora=LocalTime.parse(hora1);
                     System.out.println(hora);
                     LocalDateTime diaHoraOrigen=LocalDateTime.of(dia, hora);
                    ZoneOffset diaHoraDestino=ZoneOffset.of(duracion);
                     System.out.println(diaHoraDestino) ;*/


/* System.out.println("Introduzca la duración del vuelo (hh:mm) : ") ;
                     String duracion=teclado.nextLine();
                   LocalTime horad=LocalTime.parse(duracion);
                   System.out.println(horad);
                   int horas=horad.getHour();
                   int minutos=horad.getMinute();
                   
                   System.out.println("son "+horas+ " y " +minutos+ "que son en total" +(horas*60+minutos)+ " minutos");
                    */

/*String origen = "Madrid";
        String destino = "Nueva York";
        String fechaSalida = "2024-11-20";
        String horaSalida = "12:30";
        String duracionVuelo = "7:30";

        // Crear objetos LocalDateTime para la salida y la duración
        LocalDateTime salidaMadrid = LocalDateTime.parse(fechaSalida + "T" + horaSalida);
        Duration duracion = Duration.parse("PT" + duracionVuelo.replace(":", "H"));

        // Obtener la zona horaria de Madrid y Nueva York
        ZoneId zonaMadrid = ZoneId.of("Europe/Madrid");
        ZoneId zonaNuevaYork = ZoneId.of("America/New_York");

        // Convertir la hora de salida de Madrid a ZonedDateTime
        ZonedDateTime salidaMadridZonedDateTime = salidaMadrid.atZone(zonaMadrid);

        // Sumar la duración del vuelo para obtener la hora de llegada en UTC
        ZonedDateTime llegadaUTC = salidaMadridZonedDateTime.plus(duracion);

        // Convertir la hora de llegada en UTC a la zona horaria de Nueva York
        ZonedDateTime llegadaNuevaYork = llegadaUTC.withZoneSameInstant(zonaNuevaYork);

        // Formatear la salida según la zona horaria de Nueva York
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm z");
        String horaLlegadaNY = llegadaNuevaYork.format(formatter);

        System.out.println("Salida desde " + origen + " a las " + salidaMadrid);
        System.out.println("Llegada a " + destino + " a las " + horaLlegadaNY);*/