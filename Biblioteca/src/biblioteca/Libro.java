package biblioteca;

public class Libro extends Documento {
    private int numeroPaginas;

    public Libro(String titulo, String autor, String fechaPublicacion, int numeroPaginas) {
        super(titulo, autor, fechaPublicacion);
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }
}
