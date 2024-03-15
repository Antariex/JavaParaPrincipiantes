package Practicas;

public class Repetitivas {
    public static void main(String[] args) {

        // While loop
        int contadorWhile = 1;

        while (contadorWhile <= 10) {
            System.out.println("ContadorWhile está en la vuelta N° " + contadorWhile);
            contadorWhile = contadorWhile + 1; // De no incluirse esta línea, el contador no aumentaría y el bucle sería infinito al no producirse nunca la condición de salida.
        }

        // For loop
        for (int contadorFor = 1; contadorFor <= 10; contadorFor++) {
            System.out.println("ContadorFor está en la vuelta N° " + contadorFor);
        }
    }
}
