/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareapractica;
import java.util.Scanner;
/**
 *
 * bysaulgoodman
 */
public class Promedios {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        Estudiante estudiante = null;
        do {
            System.out.println("----- MENU SECRETARIA UNIVERSITARIA -----");
            System.out.println("1. Ingresar datos del estudiante");
            System.out.println("2. Evaluar promedio");
            System.out.println("3. Actualizar promedio del estudiante");
            System.out.println("4. Mostrar datos del estudiante");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opcion: ");
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    System.out.println("-- Registro de estudiante --");
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Carrera: ");
                    String carrera = sc.nextLine();
                    System.out.print("Promedio: ");
                    double promedio = sc.nextDouble();
                    sc.nextLine();
                    try {
                        estudiante = new Estudiante(nombre, carrera, promedio, false);
                        System.out.println("Estudiante registrado!");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    if (estudiante == null) {
                        System.out.println("Primero debe registrar un estudiante");
                    } else {
                        estudiante.evaluarEstado(estudiante.promedio);
                    }
                    break;
                case 3:
                    if (estudiante == null) {
                        System.out.println("Primero debe registrar un estudiante");}
                    else{
                        System.out.print("Ingrese el promedio actualizado: ");
                        double newpromedio = sc.nextDouble();
                        estudiante.actualizarPromedio(newpromedio);}
                    break;
                case 4:
                    if (estudiante == null) {
                        System.out.println("Primero debe registrar un estudiante");
                    } else {
                        estudiante.mostrarInformacion();
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
