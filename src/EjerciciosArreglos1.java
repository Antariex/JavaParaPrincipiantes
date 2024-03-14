/*
Realizar un programa que permita cargar 15 números en un vector. Una vez cargados, se necesita que el programa cuente e informe por pantalla cuántas veces se cargó el número 3.
*/

import java.util.Scanner;

public class EjerciciosArreglos1 {
    public static void main(String[] args) {

        int numeros [] = new int[15];
        System.out.println("ingrese quince números para el vector");
        Scanner ingresos = new Scanner(System.in);

        for (int i = 0; i < 15; i++) {
            numeros[i] = ingresos.nextInt();
        }

        int contador = 0;
        for (int i = 0; i < 15; i++) {
            if (numeros[i] == 3) {
                contador = contador + 1;
            }
            }

        System.out.println("Hay " + contador + " números tres en el vector.");
        }
    }