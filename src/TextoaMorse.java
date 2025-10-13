import java.util.HashMap;
import java.util.Scanner;

public class TextoaMorse {

    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un texto para convertir a código Morse:");
        String texto = scanner.nextLine().toUpperCase(); // Convertimos a mayúsculas

        String morse = convertirATextoMorse(texto);

        System.out.println("Texto en Morse:");
        System.out.println(morse);
    }

    private static String convertirATextoMorse(String texto) {
        HashMap<Character, String> morseMap = new HashMap<>();

        morseMap.put('A', ".-");
        morseMap.put('B', "-...");
        morseMap.put('C', "-.-.");
        morseMap.put('D', "-..");
        morseMap.put('E', ".");
        morseMap.put('F', "..-.");
        morseMap.put('G', "--.");
        morseMap.put('H', "....");
        morseMap.put('I', "..");
        morseMap.put('J', ".---");
        morseMap.put('K', "-.-");
        morseMap.put('L', ".-..");
        morseMap.put('M', "--");
        morseMap.put('N', "-.");
        morseMap.put('O', "---");
        morseMap.put('P', ".--.");
        morseMap.put('Q', "--.-");
        morseMap.put('R', ".-.");
        morseMap.put('S', "...");
        morseMap.put('T', "-");
        morseMap.put('U', "..-");
        morseMap.put('V', "...-");
        morseMap.put('W', ".--");
        morseMap.put('X', "-..-");
        morseMap.put('Y', "-.--");
        morseMap.put('Z', "--..");

        morseMap.put('0', "-----");
        morseMap.put('1', ".----");
        morseMap.put('2', "..---");
        morseMap.put('3', "...--");
        morseMap.put('4', "....-");
        morseMap.put('5', ".....");
        morseMap.put('6', "-....");
        morseMap.put('7', "--...");
        morseMap.put('8', "---..");
        morseMap.put('9', "----.");

        // Espacio entre las palabras
        morseMap.put(' ', "/");

        StringBuilder morse = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (morseMap.containsKey(c)) {
                morse.append(morseMap.get(c)).append(" ");
            } else {
                morse.append("? ");
            }
        }

        return morse.toString();
    }
}
