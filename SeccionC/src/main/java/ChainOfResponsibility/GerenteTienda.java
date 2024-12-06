/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainOfResponsibility;

/**
 *
 * @author Anthony
 */
public class GerenteTienda extends BaseHandler {
    private double precioProducto;
    
    @Override
    public void nextHandler(Handler h) {
        super.next = null; // Dejar de asignar pasos a la cadena
    }
    
    @Override
    public void handle (String request){
        //Componente de la cadena correspodiente al precio del producto
        
        if(next != null) next.handle(request); //Validar el ultimo next.
    }
}
