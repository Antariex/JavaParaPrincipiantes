package Practicas;

import java.util.Scanner;
import java.util.Vector;

public class Arreglos {
    public static void main(String[] args) {

        //Declaración vector
        int vector [] = new int [4];

        //Asignación (manual)
        vector [0] = 2;
        vector [1] = 35;
        vector [2] = 48;
        vector [3] = 157;

        //Asignación (por teclado)
        /*Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese el valor para el índice " + i);
            vector[i] = teclado.nextInt();
        }*/

        //Los vectores siempre deben ser del mismo tipo de dato.

        //Recorrido
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Estoy en el índice" + i);
            System.out.println("Tengo guardado un " +  vector[i]);
            System.out.println("-------");
        }

        //Declaración matriz
        int matriz [][] = new int[3][3];

        //Asignación (manual)
        /*matriz [0][0] = 5;
        matriz [0][1] = 13;
        matriz [0][2] = 96;
        matriz [1][0] = 35;
        matriz [1][1] = 33;
        matriz [1][2] = 71;
        matriz [2][0] = 446;
        matriz [2][1] = 228;
        matriz [2][2] = 24;*/

        //Asignación (por teclado)
        Scanner teclado2 = new Scanner(System.in);
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingrese el valor de la posición f:" + f + "c: " + c);
                matriz[f][c] = teclado2.nextInt();
            }
        }

        //Recorrido
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("El valor de la posición f:" + f + "c: " + c);
                System.out.println("es de: " + matriz[f][c]);
            }
        }
    }
}
