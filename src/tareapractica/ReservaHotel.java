package tareapractica;

public class ReservaHotel {
    // Atributos
    private String nombreCliente, tipoHabitacion, estado;
    private int numeroNoches;
    private double precioPorNoche;

    // Constructores
    public ReservaHotel() {
    }

    public ReservaHotel(String nombreCliente, String tipoHabitacion, int numeroNoches, double precioPorNoche) {
        this.nombreCliente = nombreCliente;
        this.tipoHabitacion = tipoHabitacion;
        this.numeroNoches = numeroNoches;
        this.precioPorNoche = precioPorNoche;
        this.estado = "reservado";
    }

    // Métodos
    public double calcularTotal() {
        return numeroNoches * precioPorNoche;
    }

    public void confirmarReserva() {
        if (estado.equals("reservado")) {
            estado = "ocupado";
            System.out.println("Reserva confirmada! La habitacion esta ocupada.");
        } else {
            System.out.println("Solo se puede confirmar una reserva en estado 'reservado'.");
        }
    }

    public void finalizarReserva() {
        if (estado.equals("ocupado")) {
            estado = "finalizado";
            System.out.println("Reserva finalizada!");
        } else {
            System.out.println("Solo se puede finalizar una reserva en estado 'ocupado'.");
        }
    }

    public void mostrarReserva() {
        System.out.println("-----DATOS DE LA RESERVA-----");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Tipo de habitacion: " + tipoHabitacion);
        System.out.println("Numero de noches: " + numeroNoches);
        System.out.println("Precio por noche: " + precioPorNoche);
        System.out.println("Estado: " + estado);
        System.out.println("Total a pagar: " + calcularTotal());
    }
}