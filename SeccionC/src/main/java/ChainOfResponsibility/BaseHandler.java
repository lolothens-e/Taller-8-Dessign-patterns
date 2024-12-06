/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainOfResponsibility;

/**
 *
 * @author Anthony
 */
public class BaseHandler implements AtencionUsuario {
    
    AtencionUsuario next;
    
    @Override
    public void nextHandler(Handler h) {
        next = new Asistente(); //Se continua con la cadena de responsabilidad en orden.
    }

    @Override
    public void handle(String request) {
        //Baseline de handles, comportamiento base de un request. Tras terminar llamar a nextHandler si necesario.
        next.handle(request);
    }
    
}
