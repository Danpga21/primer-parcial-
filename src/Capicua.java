import java.util.Scanner;
public class Capicua {
    public static final Scanner scanner = new Scanner(System.in);
    public static void ejecutar() {

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        if (esCapicua(numero)) {
            System.out.println(" El número " + numero + " es capicúa.");
        } else {
            System.out.println(" El número " + numero + " no es capicúa.");
        }
    }

    public static boolean esCapicua(int numero) {
        int numeroOriginal = numero;
        int invertido = 0;

        while (numero > 0) {
            int digito = numero % 10;          
            invertido = invertido * 10 + digito;
            numero = numero / 10;
        }

        return numeroOriginal == invertido;
    }
}
