import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MorseaTexto {

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el código Morse (use '/' para el espacio entre  palabras): ");
        String morse = sc.nextLine().trim();

        String texto = morseATexto(morse);
        System.out.println("Texto decodificado: " + texto);
    }

    public static String morseATexto(String morse) {
        Map<String, Character> textoMap = new HashMap<>();

        textoMap.put(".-", 'A');
        textoMap.put("-...", 'B');
        textoMap.put("-.-.", 'C');
        textoMap.put("-..", 'D');
        textoMap.put(".", 'E');
        textoMap.put("..-.", 'F');
        textoMap.put("--.", 'G');
        textoMap.put("....", 'H');
        textoMap.put("..", 'I');
        textoMap.put(".---", 'J');
        textoMap.put("-.-", 'K');
        textoMap.put(".-..", 'L');
        textoMap.put("--", 'M');
        textoMap.put("-.", 'N');
        textoMap.put("---", 'O');
        textoMap.put(".--.", 'P');
        textoMap.put("--.-", 'Q');
        textoMap.put(".-.", 'R');
        textoMap.put("...", 'S');
        textoMap.put("-", 'T');
        textoMap.put("..-", 'U');
        textoMap.put("...-", 'V');
        textoMap.put(".--", 'W');
        textoMap.put("-..-", 'X');
        textoMap.put("-.--", 'Y');
        textoMap.put("--..", 'Z');
        textoMap.put("/", ' ');

        StringBuilder texto = new StringBuilder();
        String[] palabras = morse.split(" / ");

        for (String palabra : palabras) {
            String[] letras = palabra.split(" ");
            for (String letra : letras) {
                if (textoMap.containsKey(letra)) {
                    texto.append(textoMap.get(letra));
                } else {
                    texto.append("?");
                }
            }
            texto.append(" ");
        }

        return texto.toString().trim();
    }
}
