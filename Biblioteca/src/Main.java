import java.util.Scanner;
import java.util.Date;

import biblioteca.Documento;
import biblioteca.Prestamo;
import biblioteca.Estado;
import biblioteca.TipoPrestamo;
import biblioteca.Libro;
import biblioteca.Periodico;
import biblioteca.Revista;
import biblioteca.Genero;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obtener nombre del usuario
        System.out.print("Ingrese su nombre: ");
        String nombreUsuario = scanner.nextLine();

        Usuario usuario = new Usuario(nombreUsuario, 12345);

        // Solicitar tipo de préstamo
        System.out.print("¿Qué tipo de préstamo desea? (1: Reserva, 2: Leer en Biblioteca): ");
        int tipoPrestamoOpcion = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea restante

        TipoPrestamo tipoPrestamo;
        if (tipoPrestamoOpcion == 1) {
            tipoPrestamo = TipoPrestamo.RESERVA;
        } else {
            tipoPrestamo = TipoPrestamo.LEER_EN_BIBLIOTECA;
        }

        // Solicitar el genero literario
        System.out.println("Seleccione el género literario:");
        for (Genero genero : Genero.values()) {
            System.out.println(" - " + genero.ordinal() + ": " + genero.name());
        }

        int generoSeleccionado = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea
        Genero genero = Genero.values()[generoSeleccionado];

        System.out.println("Género seleccionado: " + genero.name());

        // Solicitar tipo de documento
        System.out.print("¿Qué tipo de documento desea? (1: Libro, 2: Periódico, 3: Revista): ");
        int tipoDocumentoOpcion = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea restante

        Documento documento;
        switch (tipoDocumentoOpcion) {
            case 1:
                System.out.print("Ingrese el nombre del libro: ");
                String tituloLibro = scanner.nextLine();
                documento = new Libro(tituloLibro, "Autor Desconocido", "Fecha Desconocida", 100);
                break;
            case 2:
                System.out.print("Ingrese el nombre del periódico: ");
                String nombrePeriodico = scanner.nextLine();
                documento = new Periodico("Periódico", "Autor Desconocido", "Fecha Desconocida", nombrePeriodico);
                break;
            case 3:
                System.out.print("Ingrese el volumen de la revista: ");
                int volumen = scanner.nextInt();
                documento = new Revista("Revista", "Autor Desconocido", "Fecha Desconocida", volumen);
                break;
            default:
                System.out.println("Opción no válida, saliendo...");
                return;
        }

        // Crear el prestamo
        Estado estado = new Estado(true);
        Prestamo prestamo = new Prestamo(
                new Date(),
                new Date(System.currentTimeMillis() + 7 * 24 * 60 * 60 * 1000),
                tipoPrestamo,
                documento,
                estado
        );

        System.out.println("Usuario " + usuario.getNombre() + " solicitó un préstamo para el documento: " + documento.getTitulo());
        System.out.println("Género literario preferido: " + genero.name());

        scanner.close();
    }
}
