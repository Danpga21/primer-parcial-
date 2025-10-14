public class Caballero {

    public String nombre;
    public int edad;
    public String reino;
    public int nivelDeHonor;


    public Caballero(String nombre, int edad, String reino, int nivelDeHonor) {
        this.nombre = nombre;
        this.edad = edad;
        this.reino = reino;
        this.nivelDeHonor = nivelDeHonor;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Reino: " + reino);
        System.out.println("Nivel de Honor: " + nivelDeHonor);
    }
}
