/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.politecnicomalaga.ejercicios_if;

/** EJERCICIO 4
 * Realiza un programa que calcule la media de tres notas obtenidas del teclado, muestre la cantidad
numérica obtenida y después añada: Insuficiente, suficiente, bien, notable o sobresaliente. Las notas
son:
Nota menor que 5: insuficiente
Nota entre 5 y 6 (sin incluir al 6): suficiente
Nota entre 6 y 7 (sin incluir al 7): bien
Nota entre 7 y 8.5 (sin incluir al 8.5): notable
Nota mayor o igual a 8.5: sobresaliente
 * @author Jose-PC
 */

import java.util.Scanner;


public class Ejercicio4_IF {

  
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double media;
        double nota1;
        double nota2;
        double nota3;
        
        System.out.println("Calculadora de media para notas");
        
        System.out.println("Ingrese el primer valor:");
        nota1=entrada.nextDouble();
        
        System.out.println("Ingrese el segundo valor:");
        nota2=entrada.nextDouble();
        
        System.out.println("Ingrese el tercer valor:");
        nota3=entrada.nextDouble();
        
        media= (nota1 + nota2 + nota3) /3;
        
        //Se puede usar else if para no tener que estar haciendo tantos IFs
        
        if (media <=5 ) {
           System.out.println("Tu nota es insuficiente: " +media); 
    }
        //Cuidado con los paréntesis al concatenar xd
        if ((media >= 5) && (media <6)) {
           System.out.println("Tu nota es suficiente: " +media); 
    }
        if ((media >= 6) && (media <7)) {
           System.out.println("Tu nota es bien: " +media); 
    }
        if ((media >= 7) && (media <8.5)) {
           System.out.println("Tu nota es notable: " +media); 
    }
        if (media >= 8.5) {
           System.out.println("Tu nota es sobresaliente: " +media); 
    }
    }
    
}
