public class Usuario extends Persona {
    public Usuario(String nombre, int id) {
        super(nombre, id);
    }

    public void pedirPrestamo() {
        System.out.println("Usuario " + nombre + " solicitó un préstamo.");
    }
}
