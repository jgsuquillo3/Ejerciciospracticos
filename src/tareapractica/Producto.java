/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareapractica;
import java.util.InputMismatchException;
/**
 *
 * @author Jeremy S
 */
public class Producto {
    //atributos
    private String nombreProducto, estado;
    private double precio;
    private int stock;
    
    //getters (por alguna razon)

    public String getNombreProducto() {
        return nombreProducto;
    }
    
    
    //constructores

    public Producto() {
    }

    public Producto(String nombreProducto, double precio, int stock) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.stock = stock;
    }
    
    //metodos
    public void vender(int vendido){
    if(vendido>stock){
        throw new IllegalArgumentException("No hay suficiente stock para realizar esta venta!");
    }else{
        stock = stock - vendido;
    }
    }
    public void restablecer(int restock){
        if(restock<0){
            throw new InputMismatchException("Solo # positivos!");
            
        }else{
            stock = stock + restock;
        }
    }
    public void verificarEstado(){
        if(stock <= 0){
            this.estado = "Agotado";
        }else{
            this.estado = "Disponible";
        }
    }
    public void mostrarProducto(){
        System.out.println("====Registro del producto=====");
        System.out.println("Nombre del producto: " +nombreProducto);
        System.out.println("Precio unitario: " +precio);
        System.out.println("Estado: "+estado);
    }
    
}
