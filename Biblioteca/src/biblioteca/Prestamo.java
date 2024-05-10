package biblioteca;

import java.util.Date;

public class Prestamo {
    protected Date fechaPrestamo;
    protected Date fechaDevolucion;
    private TipoPrestamo tipoPrestamo;
    private Documento documento;
    private Estado estado;

    public Prestamo(Date fechaPrestamo, Date fechaDevolucion, TipoPrestamo tipoPrestamo, Documento documento, Estado estado) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.tipoPrestamo = tipoPrestamo;
        this.documento = documento;
        this.estado = estado;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public TipoPrestamo getTipoPrestamo() {
        return tipoPrestamo;
    }

    public Documento getDocumento() {
        return documento;
    }

    public Estado getEstado() {
        return estado;
    }
}
