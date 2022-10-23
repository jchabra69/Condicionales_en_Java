/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.politecnicomalaga.ejercicios_if;

/** Ejercicio 2
 * Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día de
la semana.
 * @author Jose-PC
 */

import java.util.Scanner;

public class Ejercicio2_IF {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Del 1 al 7, escribe un número para que te diga el día de la semana correspondiente:");
        int dia=entrada.nextInt();
        switch(dia){
            case 1:
                    System.out.println("Lunes");
                    break;
            case 2:
                    System.out.println("Martes");
                    break;
            case 3:
                    System.out.println("Miércoles");
                    break;
            case 4:
                    System.out.println("Jueves");
                    break;
            case 5:
                    System.out.println("Viernes");
                    break;
            case 6:
                    System.out.println("Sábado");
                    break;
            case 7:
                    System.out.println("Domingo");
                    break;
            default:
                System.out.println("DAME UN NÚMERO DEL 0 AL 7 WEEE");
      
    }

    }
}
