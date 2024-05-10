package biblioteca;

public class Revista extends Documento {
    private int volumen;

    public Revista(String titulo, String autor, String fechaPublicacion, int volumen) {
        super(titulo, autor, fechaPublicacion);
        this.volumen = volumen;
    }

    public int getVolumen() {
        return volumen;
    }
}
