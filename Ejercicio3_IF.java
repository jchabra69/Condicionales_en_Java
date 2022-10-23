/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.politecnicomalaga.ejercicios_if;

/** EJERCICIO 3
 * Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta que las
horas ordinarias (40 primeras horas de trabajo) se pagan a 15 euros la hora. A partir de la hora 41, se
pagan a 20 euros la hora. Lee el número de horas trabajadas una semana por un trabajador y calcula
su retribución.
 * @author Jose-PC
 */

import java.util.Scanner;

public class Ejercicio3_IF {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int salario;
        int horas;

        System.out.println("Calculadora de salario semanal");
        System.out.println("Introduce tu número de horas trabajadas esta semana: ");
        horas = entrada.nextInt();
        
        // Resto 40, porque a partir de ahí empiezo a contar mi bonus 
        if (horas >= 41) {
            horas = horas - 40;
            salario = 40 * 15 + horas * 20;
            System.out.println("Has trabajado más de 40 horas ordinadas, así que te corresponde: " + salario + "€");
        } else {
            salario = horas*15;
                System.out.println("Has trabajado menos de 40 ordinarias, así que te corresponde " +salario + "€");
        }
    }

}
