package tareapractica;

import java.util.Scanner;

public class Vacaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        ReservaHotel reserva = null;
        do {
            System.out.println("----- SISTEMA DE RESERVAS DE HOTEL -----");
            System.out.println("1. Crear reserva");
            System.out.println("2. Confirmar reserva");
            System.out.println("3. Finalizar reserva");
            System.out.println("4. Mostrar reserva");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opcion: ");
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    System.out.print("Nombre del cliente: ");
                    String nombre = sc.nextLine();
                    System.out.print("Tipo de habitacion (simple, doble, suite): ");
                    String tipo = sc.nextLine().toLowerCase();
                    if (!tipo.equals("simple") && !tipo.equals("doble") && !tipo.equals("suite")) {
                        System.out.println("Tipo de habitacion no valido.");
                        break;
                    }
                    System.out.print("Numero de noches: ");
                    int noches = sc.nextInt();
                    System.out.print("Precio por noche: ");
                    double precio = sc.nextDouble();
                    sc.nextLine();
                    reserva = new ReservaHotel(nombre, tipo, noches, precio);
                    System.out.println("Reserva creada!");
                    break;
                case 2:
                    if (reserva == null) {
                        System.out.println("Primero debe crear una reserva");
                    } else {
                        reserva.confirmarReserva();
                    }
                    break;
                case 3:
                    if (reserva == null) {
                        System.out.println("Primero debe crear una reserva");
                    } else {
                        reserva.finalizarReserva();
                    }
                    break;
                case 4:
                    if (reserva == null) {
                        System.out.println("Primero debe crear una reserva");
                    } else {
                        reserva.mostrarReserva();
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (op != 5);
        sc.close();
    }
}