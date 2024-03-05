import java.util.Scanner;

public class EjerciciosRepetitivas1 {
    public static void main(String[] args) {
        /*Ejercicio 1:

        Realizar un programa que dado por teclado un límite númerico (por ejemplo 100)
        muestre en pantalla todos los números hasta ese límite (empezando por 1).*/

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