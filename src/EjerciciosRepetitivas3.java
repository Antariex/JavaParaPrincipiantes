import java.util.Scanner;

public class EjerciciosRepetitivas3 {
    public static void main(String[] args) {
    /*Ejercicio 3: maratón del inmigrante.

    En la ciudad de Oberá, Misiones, se realiza año a año la "Maratón del Inmigrante" en el marco de la Fiesta Nacional del Inmigrante.
    El evento cuenta con un día de inscripciones el día anterior a la carrera, por lo que se desconoce la cantidad exacta de inscriptos
    que puede llegar a haber. Desde la Federación de colectividades (los organizadores), manifestaron que se solicitan los siguientes datos
    para la inscripción de cada participante: dni, nombre y edad.

    En cuanto a las categorías posibles para una inscripción, se manejan las siguientes:

    Menores A (de 6 a 10 años)
    Menores B (de 11 a 17 años)
    Juveniles (de 18 a 30 años)
    Adultos (de 31 a 50 años)
    Adultos mayores (más de 50 años)

    Se necesita un programa que, a partir del ingreso de los datos y edad de cada participante, muestre por pantalla a qué categoría debe ser
    inscripto. cabe destacar que, al finalizar el día, para dar fin a las inscripciones, se debe ingresar un dni con el valor 0, y un nombre
    con la palabra "fin".
    */

        Scanner datos = new Scanner (System.in);
        System.out.println("Ingrese el nombre completo del participante:");
        String nombreParticipante = datos.nextLine();

        System.out.println("Ingrese el DNI del participante:");
        String dniParticipante = datos.nextLine();

        System.out.println("Ingrese la edad del participante:");
        int edadParticipante = datos.nextInt();
        datos.nextLine();

        int contadorInscriptos = 0;

        while ((!dniParticipante.equals("0")) && (!nombreParticipante.equalsIgnoreCase("fin"))) {

            String categoriaParticipante;

            if (edadParticipante >= 6 && edadParticipante <= 10) {
                categoriaParticipante = "Menores A";
            } else if (edadParticipante >= 11 && edadParticipante <= 17) {
                categoriaParticipante = "Menores B";
            } else if (edadParticipante >= 18 && edadParticipante <= 30) {
                categoriaParticipante = "Juveniles";
            } else if (edadParticipante >= 31 && edadParticipante <= 50) {
                categoriaParticipante = "Adultos";
            } else if (edadParticipante > 50) {
                categoriaParticipante = "Adultos mayores";
            } else {
                categoriaParticipante = "Edad inválida";
            }

            contadorInscriptos++;

            System.out.println(" ");
            System.out.println("-------------");
            System.out.println("El participante " + nombreParticipante + " (DNI " + dniParticipante + ") pertenece a la categoría: " + categoriaParticipante);
            System.out.println("-------------");
            System.out.println(" ");

            System.out.println("Ingrese el nombre completo del participante:");
            nombreParticipante = datos.nextLine();
            System.out.println("Ingrese el DNI del participante:");
            dniParticipante = datos.nextLine();
            System.out.println("Ingrese la edad del participante:");
            edadParticipante = datos.nextInt();
            datos.nextLine();
        }

        System.out.println(" ");
        System.out.println("-------------");
        System.out.println("Fin de las inscripciones. La cantidad total de inscriptos es de: " + contadorInscriptos);
        System.out.println("-------------");
    }
}