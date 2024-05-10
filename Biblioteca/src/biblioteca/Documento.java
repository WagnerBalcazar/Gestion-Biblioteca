package biblioteca;

public class Documento {
    protected String titulo;
    protected String autor;
    protected String fechaPublicacion;

    public Documento(String titulo, String autor, String fechaPublicacion) {
         this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }
}
