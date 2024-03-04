import java.text.DecimalFormat;
import java.util.Scanner;

public class EjercicioCondicionales {
    public static void main(String[] args) {
        /* Una pequeña despensa desea calcular los sueldos de sus empleados.
        Los puestos de los mismos pueden tener tres categorías: 1- repositor, 2- cajero y 3- supervisor.

        * Los repositores cobran $15.890 + un bono del 10%
        * Los cajeros cobran $25.630,89 fijos
        * Los supervisores cobran $35.560,20 en bruto al cual se les descuenta un 11% de jubilación.

        Se necesita un programa que, dependiendo del tipo de empleado del que se trate, calcule y muestre en pantalla el correspondiente sueldo. */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tipo de empleado: ");
        String tipoEmpleado = scanner.next();

        String salarioEmpleado;

        double repositor = 15890 * 1.10;
        double cajero = 25630.89;
        double supervisor = 35560.20 * (1 - 0.11);

        DecimalFormat formato = new DecimalFormat("#.##");

        salarioEmpleado = switch (tipoEmpleado) {
            case "repositor" -> "El empleado pertenece a la categoría 1 (repositor) y su sueldo total es de: $" + formato.format(repositor) + " ($15890 de básico más un bono del 10%).";
            case "cajero" -> "El empleado pertenece a la categoría 2 (cajero) y su sueldo total es de: $" + formato.format(cajero) + " fijos.";
            case "supervisor" -> "El empleado pertenece a la categoría 3 (supervisor) y su sueldo total es de: $" + formato.format(supervisor) + " ($35560,20 en bruto menos 11% de jubilación).";
            default -> "No es un tipo de empleado válido";
        };

        System.out.println(salarioEmpleado);

    }
}
