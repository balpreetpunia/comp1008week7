/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hello
 */
public class CarTest {
    
    Car validCar;
    
    public CarTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        validCar = new Car("Anita", "Job", "31 Employment Ave", "Happivale", "ON","T3T2B2", LocalDate.of(2000, Month.MAY, 10));
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setMake method, of class Car.
     */
    @Test
    public void testSetMake() {
        System.out.println("setMake");
        String make = "";
        Car instance = null;
        instance.setMake(make);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModel method, of class Car.
     */
    @Test
    public void testSetModel() {
        System.out.println("setModel");
        String model = "";
        Car instance = null;
        instance.setModel(model);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setYear method, of class Car.
     */
    @Test
    public void testSetYear() {
        System.out.println("setYear");
        int year = 0;
        Car instance = null;
        instance.setYear(year);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMileage method, of class Car.
     */
    @Test
    public void testSetMileage() {
        System.out.println("setMileage");
        Double mileage = null;
        Car instance = null;
        instance.setMileage(mileage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSellPrice method, of class Car.
     */
    @Test
    public void testSetSellPrice() {
        System.out.println("setSellPrice");
        Double sellPrice = null;
        Car instance = null;
        instance.setSellPrice(sellPrice);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFeatures method, of class Car.
     */
    @Test
    public void testSetFeatures() {
        System.out.println("setFeatures");
        ArrayList<String> features = null;
        Car instance = null;
        instance.setFeatures(features);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
