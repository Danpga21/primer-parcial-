import java.util.Scanner;

public class ValidadorEdad {
    public static void ejecutar() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Validador de Mayor de Edad ===");
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad ");
        } else {
            System.out.println("Eres menor de edad ");
        }
    }
}


