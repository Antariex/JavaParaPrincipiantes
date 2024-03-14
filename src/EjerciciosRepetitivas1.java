/*
Ejercicio 1: contar números.

Realizar un programa que dado por teclado un límite númerico (por ejemplo 100) muestre en pantalla todos los números hasta ese límite (empezando por 1).
*/

import java.util.Scanner;

public class EjerciciosRepetitivas1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número hasta el que quiere contar:");
        int limite = scanner.nextInt();
        int numero = 1;

        while (numero <= limite) {
            System.out.println(numero);
            numero = numero + 1;
        }
    }
}