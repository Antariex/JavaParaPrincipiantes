import org.w3c.dom.ls.LSOutput;

public class Variables {
    public static void main(String args[]) {

        int numero = 25;
        String palabras = "Soy un string";
        double temperatura = 38.5;
        char letra = 'p';
        boolean siONo = false;
        long numeroLargo = 123456789;

        int num1, num2, resultado;
        num1 = 4;
        num2 = 4;
        resultado = num1 + num2;

        System.out.println("El resultado de la suma es igual a " + resultado);

        if (num2 > num1) {
            System.out.println("La variable num2 es mayor a la variable num1");
        }

        /* Esta es una estructura if/else anidada.
        También podría haberse usado "else if" para evaluar múltiples condiciones en orden. */
        else {
            if (num1 == num2) {
                System.out.println("Las variables tienen valores iguales");
            }

            else {
                System.out.println("La variable num1 es mayor a la variable numb2");
            }
        }

    }
}
