
package tareapractica;

public class Estudiante {
    // Atributos
    String nombre, carrera;
    double promedio;
    boolean estados;

    // Constructores
    public Estudiante() {
    }

    public Estudiante(String nombre, String carrera, double promedio, boolean estados) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    // Métodos
    public void evaluarEstado(double promedio) {
        if (promedio < 0) {
            throw new IllegalArgumentException("El promedio no puede ser negativo");
        } else if (promedio > 20) {
            throw new IllegalArgumentException("El promedio no puede ser mayor a 20");
        } else if (promedio >= 14) {
            this.estados = true;
            System.out.println("Nota aprobatoria!");
        } else {
            this.estados = false;
            System.out.println("Nota desaprobatoria");
        }
    }

    public void actualizarPromedio(double newPromedio) {
        this.promedio = newPromedio;
        System.out.println("Promedio actualizado!");
    }

    public void mostrarInformacion() {
        System.out.println("-----DATOS DEL ESTUDIANTE-----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Carrera: " + carrera);
        System.out.println("Promedio: " + promedio);

        if (estados == true) {
            System.out.println("Estado: Aprobado");
        } else {
            System.out.println("Estado: Reprobado");
        }
    }
}
