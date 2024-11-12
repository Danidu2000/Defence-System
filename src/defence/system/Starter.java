/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package defence.system;

/**
 *
 * @author danid
 */
public class Starter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Observable observable=new Observable();
	observable.addObserver(new Helicopter(observable));
	observable.addObserver(new Tank(observable));
        observable.addObserver(new Submarine(observable));
        observable.addObserver(new MainController(observable));
       }
    
}
