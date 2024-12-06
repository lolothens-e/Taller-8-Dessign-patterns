/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy;

/**
 *
 * @author Anthony
 */
public class Logistica {
    public static void main(String[] args){
        // Implementacion con clase Travells, instanciando un TravelStrategy y ejecutando de forma acorde.
        TravelStrategy estrategiaEnvio;
        estrategiaEnvio = new CiclistaStrategy(); // FluvialStrategy(), FerreaStrategy(), AereaStrategy(), AutomotrizStrategy(), etc. 
        
        //Existira una logica que determine que estrategia instanciar. Cuando esta sea decidida solo sera necesario usar el metodo comun.
        
        estrategiaEnvio.BuildTravell("Mexico", "Singapore");
        //Cada metodo se encargara del resto.
    }
}
