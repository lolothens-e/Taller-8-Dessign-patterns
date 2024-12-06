/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ChainOfResponsibility;

/**
 *
 * @author Anthony
 */
public interface AtencionUsuario {
    public void nextHandler(Handler h);
    public void handle(String request); //String como forma de interpretar a un request.
    
}
