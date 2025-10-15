import java.util.Scanner;
import java.util.Random;

public class juego {


    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int intento;
        int contadorIntentos = 0;

        System.out.println("\n¡Bienvenido al juego de adivinanza!");
        System.out.println("Estoy pensando en un número entre 1 y 100. ¡Intenta adivinarlo!");

        do {
            System.out.print("Introduce tu intento: ");
            intento = scanner.nextInt();
            contadorIntentos++;

            if (intento < numeroSecreto) {
                System.out.println("¡Demasiado bajo! Intenta nuevamente.");
            } else if (intento > numeroSecreto) {
                System.out.println("¡Demasiado alto! Intenta nuevamente.");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número en " + contadorIntentos + " intentos.");
            }
        } while (intento != numeroSecreto);

        scanner.close();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n---- MENÚ ----");
            System.out.println("1. Jugar al juego de adivinanza");
            System.out.println("2. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ejecutar();
                    break;
                case 2:
                    System.out.println("¡Gracias por jugar! Adiós.");
                    break;
                default:
                    System.out.println("Opción no válida, por favor selecciona de nuevo.");
            }
        } while (opcion != 2);

        scanner.close();
    }
}
