public class Armadura {
    public String nombre;
    public String tipo;
    public int defensa; // Protección que aporta en la batalla

    public Armadura(String nombre, String tipo, int defensa) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.defensa = defensa;
    }

    @Override
    public String toString() {
        return nombre + " (" + tipo + ") - Defensa: " + defensa;
    }
}
