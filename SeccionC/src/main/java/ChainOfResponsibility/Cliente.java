/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainOfResponsibility;

/**
 *
 * @author Anthony
 */
public class Cliente {
    public static void main(String[] args){
        //Al ser establecido el proceso solo se llama a una instancia de Atencion y que se encarguen los metodos de segmentar la atencion.
        //Se podran establecer varias combinaciones y el proceso sera igual.
        AtencionUsuario atencion;
        
        atencion = new BaseHandler(); //Se instancia el orden realizado (Asistente -> Tecnico ->  JefeInventario -> GerenteTienda)
        
        atencion.handle("Request #1"); //Se procesa el request paso a paso.
    }
}
