/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.politecnicomalaga.ejercicios_if;

/**  EJERCICIO 5
 * Escribe un programa que ordene tres números enteros introducidos por teclado
 * @author Jose-PC
 */

import java.util.Scanner;

public class Ejercicio5_IF {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
        int numero1;
        int numero2;
        int numero3;
        
        System.out.println("Bienvenido, este programa ordena tres números enteros de mayor a menor");
        
        System.out.println("Introduce el primer número de la serie: ");
        numero1=entrada.nextInt();
        
        System.out.println("Introduce el segundo número de la serie: ");
        numero2=entrada.nextInt();
        
        System.out.println("Introduce el tercer número de la serie: ");
        numero3=entrada.nextInt();
        
        System.out.println("El orden de mayor a menor sería el siguiente: ");
        
        if (numero1>=numero2 && numero2>=numero3)
        {
            System.out.println(" " +numero1+ "_" +numero2+ "_" +numero3+ "_");
        }
        else if (numero1>=numero3 && numero3>=numero2)
            System.out.println(" " +numero1+ "_" +numero3+ "_" +numero2+ "_");
        
        else if (numero2>=numero1 && numero1>=numero3)
            System.out.println(" " +numero2+ "_" +numero1+ "_" +numero3+ "_");
   
        else if (numero2>=numero3 && numero3>=numero1)
            System.out.println(" " +numero2+ "_" +numero3+ "_" +numero1+ "_");
        
        else if (numero3>=numero1 && numero1>=numero2)
            System.out.println(" " +numero3+ "_" +numero1+ "_" +numero2+ "_");
        
        else
            System.out.println(" " +numero3+ "_" +numero2+ "_" +numero1+ "_");
        
    }
}
