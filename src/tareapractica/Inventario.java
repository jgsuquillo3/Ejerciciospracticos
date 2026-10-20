/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareapractica;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author Jeremy S
 */
public class Inventario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese el # de productos que desea registrar: ");
    int n = sc.nextInt();
    sc.nextLine();
    int op;
    Producto[] producto = new Producto[n];
    for (int i = 0; i < n; i++) {
        System.out.println("===Resgistro del producto " +(i+1)+" ===");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Precio Unitario: ");
        double precio = sc.nextDouble();
        System.out.print("Stock disponible: ");
        int stock = sc.nextInt();      
        sc.nextLine();
        producto[i] = new Producto(nombre, precio, stock);       
        producto[i].verificarEstado();
    }
    do{
    System.out.println("===Sistema de Inventario===");
    System.out.println("1. Vender producto");
    System.out.println("2. Reestablecer producto");
    System.out.println("3. Mostrar producto");
    System.out.println("4. Salir");
    System.out.print("Seleccione una opcion: ");
    op = sc.nextInt();
    switch(op){
        case 1:
            for (int i = 0; i < n ; i++) {
                System.out.println((i+1)+".- " + producto[i].getNombreProducto());
            }
            System.out.print("Que producto desea vender (solo valores numericos): ");
            int q = sc.nextInt();
            System.out.print("Cuanta cantidad desea vender: ");
            int w = sc.nextInt();
            try{
                producto[(q-1)].vender(w);
                System.out.println("venta realizada con exito!");
            }catch(IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        break;
        case 2:
            for (int i = 0; i < n ; i++) {
                System.out.println((i+1)+".- " + producto[i].getNombreProducto());
            }
            System.out.print("Que producto desea vender (solo valores numericos): ");
            int t = sc.nextInt();
            System.out.print("Cuanta cantidad se va a restablecer: ");
            int r = sc.nextInt();
            try{
                producto[(t-1)].restablecer(r);
                System.out.println("restock exitoso!");
            }catch(InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        break;
        
        case 3:
            for (int i = 0; i < n ; i++) {
                System.out.println((i+1)+".- " + producto[i].getNombreProducto());
            }
            System.out.print("Que producto desea revisar(solo valores numericos): ");
            int y = sc.nextInt();
            sc.nextLine();
            producto[(y-1)].verificarEstado();
            producto[(y-1)].mostrarProducto();
        break;
        case 4:
            System.out.println("Saliendo del programa...");
        break;
        default:
            System.out.println("Opcion no valida.");
    }
    }while(op!=4);
    }
}
