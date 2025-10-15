import java.util.ArrayList;
import java.util.Scanner;

public class GestorCaballeros {

    static ArrayList<Caballero> listaCaballeros = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void ejecutar() {
        int opcion;

        do {
            System.out.println("\n===== GESTOR DE CABALLEROS DEL ZODIACO =====");
            System.out.println("1. Crear caballero");
            System.out.println("2. Mostrar caballeros");
            System.out.println("3. Eliminar caballero");
            System.out.println("4. Batalla entre caballeros");
            System.out.println("5. Salir al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();


            switch (opcion) {
                case 1 -> crearCaballero();
                case 2 -> mostrarCaballeros();
                case 3 -> eliminarCaballero();
                case 4 -> batallaCaballeros();
                case 5 -> System.out.println("Regresando al menú principal...");
                default -> System.out.println("Opción inválida, intente de nuevo.");
            }

        } while (opcion != 5);
    }

    public static void crearCaballero() {
        System.out.print("Ingrese el nombre del caballero: ");
        String nombre = scanner.nextLine();

        System.out.println("Seleccione una constelación:");
        System.out.println("1. Pegaso");
        System.out.println("2. Dragón");
        System.out.println("3. Cisne");
        System.out.println("4. Andrómeda");
        System.out.println("5. Fénix");
        System.out.println("6. Virgo");
        System.out.println("7. Leo");
        System.out.println("8. Escorpio");
        System.out.println("9. Sagitario");
        System.out.println("10. Capricornio");
        System.out.print("Ingrese el número o escriba otra constelación: ");
        String entradaConstelacion = scanner.nextLine();

        String constelacion;
        switch (entradaConstelacion) {
            case "1" -> constelacion = "Pegaso";
            case "2" -> constelacion = "Dragón";
            case "3" -> constelacion = "Cisne";
            case "4" -> constelacion = "Andrómeda";
            case "5" -> constelacion = "Fénix";
            case "6" -> constelacion = "Virgo";
            case "7" -> constelacion = "Leo";
            case "8" -> constelacion = "Escorpio";
            case "9" -> constelacion = "Sagitario";
            case "10" -> constelacion = "Capricornio";
            default -> constelacion = entradaConstelacion;
        }

        System.out.print("Ingrese el cosmos (nivel de poder): ");
        int cosmos = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el tipo de armadura (Bronce, Plata, Oro): ");
        String tipoArmadura = scanner.nextLine();

        System.out.println("Seleccione el dios al que pertenece:");
        System.out.println("1. Atena");
        System.out.println("2. Hades");
        System.out.println("3. Poseidón");
        System.out.println("4. Zeus");
        System.out.println("5. Ares");
        System.out.println("6. Apolo");
        System.out.println("7. Artemisa");
        System.out.print("Ingrese el número o escriba otro dios: ");
        String entradaDios = scanner.nextLine();

        String dios;
        switch (entradaDios) {
            case "1" -> dios = "Atena";
            case "2" -> dios = "Hades";
            case "3" -> dios = "Poseidón";
            case "4" -> dios = "Zeus";
            case "5" -> dios = "Ares";
            case "6" -> dios = "Apolo";
            case "7" -> dios = "Artemisa";
            default -> dios = entradaDios;
        }

        Caballero nuevo = new Caballero(nombre, constelacion, cosmos, tipoArmadura, dios);
        listaCaballeros.add(nuevo);

        System.out.println("  Caballero agregado con éxito!");
    }




    public static void mostrarCaballeros() {
        if (listaCaballeros.isEmpty()) {
            System.out.println(" No hay caballeros registrados.");
        } else {
            System.out.println(" LISTA DE CABALLEROS ");
            for (Caballero c : listaCaballeros) {
                System.out.println(c);
            }
        }
    }

    public static void eliminarCaballero() {
        System.out.print("Ingrese el nombre del caballero a eliminar: ");
        String nombre = scanner.nextLine();

        boolean eliminado = listaCaballeros.removeIf(c -> c.nombre.equalsIgnoreCase(nombre));

        if (eliminado) {
            System.out.println(" Caballero eliminado con éxito.");
        } else {
            System.out.println(" No se encontró ningún caballero con ese nombre.");
        }
    }


    public static void batallaCaballeros() {
        if (listaCaballeros.size() < 2) {
            System.out.println(" No hay suficientes caballeros para la batalla (mínimo 2).");
            return;
        }

        System.out.print("Ingrese el nombre del primer caballero: ");
        String nombre1 = scanner.nextLine();
        System.out.print("Ingrese el nombre del segundo caballero: ");
        String nombre2 = scanner.nextLine();

        Caballero c1 = buscarCaballero(nombre1);
        Caballero c2 = buscarCaballero(nombre2);

        if (c1 == null || c2 == null) {
            System.out.println("Uno o ambos caballeros no existen.");
            return;
        }

        System.out.println(" ¡Comienza la batalla entre " + c1.nombre + " y " + c2.nombre + "!");

        if (c1.cosmos > c2.cosmos) {
            System.out.println(" El ganador es: " + c1.nombre + " con un cosmos de " + c1.cosmos);
        } else if (c2.cosmos > c1.cosmos) {
            System.out.println(" El ganador es: " + c2.nombre + " con un cosmos de " + c2.cosmos);
        } else {
            System.out.println("La batalla termina en empate. Ambos poseen el mismo cosmos.");
        }
    }


    public static Caballero buscarCaballero(String nombre) {
        for (Caballero c : listaCaballeros) {
            if (c.nombre.equalsIgnoreCase(nombre)) {
                return c;
            }
        }
        return null;
    }
}
