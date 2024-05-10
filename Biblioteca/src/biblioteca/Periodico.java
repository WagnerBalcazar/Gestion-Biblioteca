package biblioteca;

public class Periodico extends Documento {
    private String nombrePeriodico;

    public Periodico(String titulo, String autor, String fechaPublicacion, String nombrePeriodico) {
        super(titulo, autor, fechaPublicacion);
        this.nombrePeriodico = nombrePeriodico;
    }

    public String getNombrePeriodico() {
        return nombrePeriodico;
    }
}
