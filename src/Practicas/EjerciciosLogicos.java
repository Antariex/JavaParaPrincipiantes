/**
Realizar un programa que permita el intercambio de valores entre dos variables. Una vez realizado el cambio mostrar el resultado por pantalla
*/

package Practicas;
public class EjerciciosLogicos {
    public static void main(String args[]) {

        int numero1 = 20;
        int numero2 = 35;

        System.out.println("La variable numero1 original es igual a: " + numero1);
        System.out.println("La variable numero2 original es igual a: " + numero2);

        numero2 = numero1 + numero2; // numero2 es igual a: 20 + 35 = 55
        numero1 = numero2 - numero1; // numero1 es igual a: 55 - 20 = 35
        numero2 = numero2 - numero1; // numero2 es igual a: 55 - 35 = 20

        System.out.println("La nueva variable numero1 es igual a: " + numero1);
        System.out.println("La nueva variable numero2 es igual a: " + numero2);
    }
}