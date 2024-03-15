/**
En una tabla de cuatro filas y cuatro columnas se guardan las notas de cuatro alumnos de secundaria.
Cada fila corresponde a las notas y al promedio de cada alumno. Se necesita un programa que permita a
un profesor cargar, en las tres posiciones (columnas) de cada fila, las notas del alumno y que en la
última columna se calculen los promedios. Una vez realizados los cálculos, se desea mostrar las tres
notas de cada alumno y el promedio correspondiente recorriendo la matriz
*/

package Practicas;
import java.util.Scanner;

public class EjerciciosArreglos2 {
    public static void main(String[] args) {

        double alumnos[][] = new double[4][4];
        Scanner notas = new Scanner(System.in);
        double suma;

        for (int fila = 0; fila < 3; fila++) {
            suma = 0.0;
            System.out.println("Ingrese las notas del alumno N° " + (fila + 1));
            for (int columna = 0; columna < 3; columna++) {
                System.out.println("Ingrese la nota N° " + (columna + 1) + ":");
                alumnos[fila][columna] = notas.nextDouble();
                suma += alumnos[fila][columna];
            }
            alumnos[fila][3] = suma / 3;
        }

        for (int fila = 0; fila < 3; fila++) {
            System.out.println("\nLas notas del alumno N° " + (fila + 1) + " son:");
            for (int columna = 0; columna < 3; columna++) {
                System.out.println("Nota N° " + (columna + 1) + ": " + alumnos[fila][columna]);
            }
            System.out.println("El promedio de las notas es: " + alumnos[fila][3]);
        }
    }
}