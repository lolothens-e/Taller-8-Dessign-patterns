/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainOfResponsibility;

/**
 *
 * @author Anthony
 */
public class JefeInventario extends BaseHandler {
    private boolean existeEnBodega;
    
    @Override
    public void nextHandler(Handler h) {
        super.next = new GerenteTienda(); //Acaba la cadena de responsabilidad, deberia volver a main.
    }
    
    @Override
    public void handle (String request){
        //Implementacion del componente de la cadena correspodiente al jefe de inventario
        //Llamar al siguiente paso (Si aplica, si no volver)
        if(next != null) next.handle(request);
    }
}
