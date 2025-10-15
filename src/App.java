import java.util.Scanner;

public class App {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Zodiaco por mes y año de nacimiento");
            System.out.println("2. Validador de mayoría de edad");
            System.out.println("3. Validador de número perfecto");
            System.out.println("4. Validador de palíndromo");
            System.out.println("5. Validador de capicúa");
            System.out.println("6. Conversor texto a Morse");
            System.out.println("7. Conversor Morse a texto");
            System.out.println("8. Gestor de Caballeros del Zodiaco");
            System.out.println("9. juego ");
            System.out.println("10. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> Zodiaco.ejecutar();
                case 2 -> ValidadorEdad.ejecutar();
                case 3 -> NumeroPerfecto.ejecutar();
                case 4 -> Palindromo.ejecutar();
                case 5 -> Capicua.ejecutar();
                case 6 -> TextoaMorse.ejecutar();
                case 7 -> MorseaTexto.ejecutar();
                case 8 -> GestorCaballeros.ejecutar();
                case 9 ->juego.ejecutar();
                case 10-> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (opcion != 10);

    }
}
