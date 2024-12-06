/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainOfResponsibility;

/**
 *
 * @author Anthony
 */
public class Tecnico extends BaseHandler{
    private boolean falloEnGarantia;
    
    @Override
    public void nextHandler(Handler h) {
        super.next= new JefeInventario();
    }
    
    @Override
    public void handle (String request){
        //Implementacion del componente de la cadena correspodiente al tecnico
        //Llamar al siguiente paso
        if(next != null)  next.handle(request);
    }
}
