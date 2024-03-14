/*
Ejercicio 4: arbolito de Navidad con ASCII.

Realizar un programa que de forma automática imprima por pantalla la imagen de un árbol de navidad utilizando espacios, asteriscos y barras verticales.
*/

import java.util.Scanner;

public class EjerciciosRepetitivas4 {
    public static void main(String[] args) {

        System.out.println("Bienvenido al creador de árboles de Navidad!");
        System.out.println(" ");
        System.out.println("     *");
        System.out.println("    ***");
        System.out.println("   *****");
        System.out.println("    |||");
        System.out.println(" ");
        System.out.println("Ingrese la altura deseada para su árbol (mínimo: 3):");
        Scanner usuario = new Scanner(System.in);
        int alturaArbol = usuario.nextInt();
        usuario.nextLine();

            if (alturaArbol < 3) {
                System.out.println("La altura mínima del árbol debe ser de 3. Intente nuevamente.");
            } else {
                for (int fila = 0; fila < alturaArbol; fila++) {
                    // Espacios
                    for (int espacio = 0; espacio < alturaArbol - fila - 1; espacio++) {
                        System.out.print(" ");
                    }
                    // Asteriscos
                    for (int asterisco = 0; asterisco < 2 * fila + 1; asterisco++) {
                        System.out.print("*");
                    }
                    // Salto de línea
                    System.out.println();
                }

                // Tronco del árbol
                for (int i = 0; i < 1; i++) {
                    for (int espacio = 0; espacio < alturaArbol - 2; espacio++) {
                        System.out.print(" ");
                    }
                    System.out.println("|||");
                }
            }

        System.out.println(" ");
            System.out.println("¡Hasta luego!");
    }
}