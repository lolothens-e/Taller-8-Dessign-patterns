/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy;

/**
 *
 * @author Anthony
 */
public class Travells {
    private TravelStrategy strategy;

    public void setStrategy(TravelStrategy strategy) {
        this.strategy = strategy;
    }
    //Se usa string para representar puntos A y B
    public void buildTravell(String A, String B){
        //Implementation here using the strategy selected prior.
    }
}
