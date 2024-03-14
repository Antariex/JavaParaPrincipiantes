public class Switch {
    public static void main(String[] args) {
        int dia = 5;
        String nombreDia;

        switch (dia) {
            case 1:
                nombreDia = "domingo";
                break;
            case 2:
                nombreDia = "lunes";
                break;
            case 3:
                nombreDia = "martes";
                break;
            case 4:
                nombreDia = "miércoles";
                break;
            case 5:
                nombreDia = "jueves";
                break;
            case 6:
                nombreDia = "viernes";
                break;
            case 7:
                nombreDia = "sábado";
                break;
            default:
                nombreDia = "Número de día inválido";
                break;
        }

        /*
        Existe una sintaxis alternativa a la estructura switch, usando arrow notation (->)
        Esto es posible desde Java 12, y se llama  "Switch Expressions.":

        String nombreDia = switch (dia) {
            case 1 -> "domingo";
            case 2 -> "lunes";
            case 3 -> "martes";
            case 4 -> "miércoles";
            case 5 -> "jueves";
            case 6 -> "viernes";
            case 7 -> "sábado";
            default -> "Número de día inválido";
        };
  */


        System.out.println("El día de la semana seleccionado es: " + nombreDia);
    }
}
