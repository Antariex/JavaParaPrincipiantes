import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        double promedio;
        String condicionFinal;
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el promedio general del alumno:");

        promedio = input.nextDouble();

        condicionFinal = promedio >= 6 ? "aprobado." : "desaprobado.";

        System.out.println("La condición final del alumno es: " + condicionFinal);
    }
}
