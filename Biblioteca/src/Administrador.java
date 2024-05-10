public class Administrador extends Persona {
    public Administrador(String nombre, int id) {
        super(nombre, id);
    }

    public void concederPrestamo() {
        System.out.println("Administrador " + nombre + " concedió un préstamo.");
    }
}
