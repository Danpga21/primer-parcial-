import java.util.Scanner;

public class Palindromo {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una palabra o frase: ");
        String texto = scanner.nextLine();

        if (esPalindromo(texto)) {
            System.out.println(" La frase o palabra es un palíndromo.");
        } else {
            System.out.println(" La frase o palabra NO es un palíndromo.");
        }
    }

    public static boolean esPalindromo(String texto) {

        texto = texto.toLowerCase().replaceAll("[^a-z0-9]", "");

        String invertido = new StringBuilder(texto).reverse().toString();

        return texto.equals(invertido);
    }
}

