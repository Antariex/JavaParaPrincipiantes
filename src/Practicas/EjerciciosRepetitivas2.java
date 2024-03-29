/**
Ejercicio 2: ingreso de palabras controlado por un centinela.

Realizar un programa que muestre en pantalla palabras que sean ingresadas por teclado hasta que se ingrese la palabra "salir".
*/

package Practicas;
import java.util.Scanner;

public class EjerciciosRepetitivas2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la palabra que quiera imprimir en pantalla. Para finalizar el programa escriba el comando 'salir':");

        for (String palabra = scanner.next(); !palabra.equalsIgnoreCase("salir"); palabra = scanner.next()) {
            System.out.println("El usuario ha ingresado la palabra: " + palabra);
            System.out.println("Ingrese la palabra que quiera imprimir en pantalla. Para finalizar el programa escriba el comando 'salir':");
        }
    }
}