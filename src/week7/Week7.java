/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

import java.util.ArrayList;

/**
 *
 * @author hello
 */
public class Week7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<String> features = new ArrayList<String>();
        features.add("Leather");
        features.add("Navigation System");
        features.add("Computerised parking system");
        
        Car car = new Car("Nissan", "Sedan", 2007, 15.00, 10000.00, features );
        //newViewCar();
        System.out.print("Car successfully created \n");
        
        
    }
    public void newViewCar(){
       // CarViewController.generateCarButtonPushed();
    }
    
}
