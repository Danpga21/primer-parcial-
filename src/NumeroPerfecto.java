import java.util.Scanner;
public class NumeroPerfecto {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número para verificar si es perfecto: ");
        int numero = scanner.nextInt();
        int sumaDivisores = 0;
         for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
                }
            }
        System.out.println("La suma de los divisores de " + numero + " es: " + sumaDivisores);

        if (sumaDivisores == numero) {
            System.out.println(numero + " ES un número perfecto.");
        } else {
            System.out.println(numero + " NO es un número perfecto.");
            }

        }
    }

