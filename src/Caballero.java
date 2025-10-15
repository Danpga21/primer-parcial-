public class Caballero {
    public String nombre;
    public String constelacion;
    public int cosmos;
    public String tipoArmadura;
    public String dios;

    // 🔹 Constructor con parámetros
    public Caballero(String nombre, String constelacion, int cosmos, String tipoArmadura, String dios) {
        this.nombre = nombre;
        this.constelacion = constelacion;
        this.cosmos = cosmos;
        this.tipoArmadura = tipoArmadura;
        this.dios = dios;
    }

    // 🔹 Constructor vacío
    public Caballero() {
    }

    // 🔹 Método para mostrar los datos del caballero
    @Override
    public String toString() {
        return "\nCaballero: " + nombre +
                "\nConstelación: " + constelacion +
                "\nCosmos: " + cosmos +
                "\nTipo de Armadura: " + tipoArmadura +
                "\nDios: " + dios +
                "\n----------------------------";
    }


    }
