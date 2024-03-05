public class Repetitivas {
    public static void main(String[] args) {

        // While loop
        int contador1 = 1;

        while (contador1 <= 10) {
            System.out.println("Contador1 está en la vuelta N° " + contador1);
            contador1 = contador1 + 1; // De no incluirse esta línea, el contador no aumentaría y el bucle sería infinito al no producirse nunca la condición de salida.
        }

        // For loop
        for (int contador2 = 1; contador2 <= 10; contador2++) {
            System.out.println("Contador2 está en la vuelta N° " + contador2);
        }
    }
}
