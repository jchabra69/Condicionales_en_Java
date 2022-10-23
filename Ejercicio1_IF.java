/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.politecnicomalaga.ejercicios_if;

/** EJERCICIO 1
 * Realiza un programa que pida una hora por teclado y que muestre luego buenos días, buenas tardes
o buenas noches según la hora. Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5.
respectivamente. Sólo se tienen en cuenta las horas, los minutos no se deben introducir por teclado.
 * @author Jose-PC
 */

import java.util.Scanner;

public class Ejercicio1_IF {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int hora;
        
        System.out.println("Escribe una hora:");
        hora=entrada.nextInt();
   
        if ((hora >= 6) && (hora <= 12)) {
      System.out.println("Buenos días");
      }
      
      if ((hora >= 13) && (hora <= 20)) {
      System.out.println("Buenas tardes");
      }
      
      /*Si 21:00 es mayor o igual que 24 || Si 5:00 es menor o igual que 00:00 = digo buenas noches*/
              
      if (((hora >= 21) && (hora < 24)) || ((hora <= 5) && (hora >= 0))) {
      System.out.println("Buenas noches");
    }
     
    }
}
