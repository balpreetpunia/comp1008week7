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
        ArrayList<String> features = new ArrayList<String>();
        features.add("leather");
        
        validCar = new Car("Nissan", "Sedan", 2007, 15.00, 10000.00, features );
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
        String make = "Nissan";
        validCar.setMake(make);
        assertEquals(make, validCar.getMake());
    }

    /**
     * Test of setModel method, of class Car.
     */
    @Test
    public void testSetModel() {
        System.out.println("setModel");
        String model = "Sedan";
        validCar.setModel(model);
        assertEquals(model, validCar.getModel());
    }

    /**
     * Test of setYearValid method, of class Car.
     */
    @Test
    public void testSetYearValid() {
        System.out.println("setYear");
        int year = 2007;
        validCar.setYear(year);
        assertEquals(year, validCar.getYear());
    }

    /**
     * Test of setYearValid method, of class Car.
     */
    @Test
    public void testSetYearInvalid() {
        System.out.println("setYear");
        int year = 2020;
        try
        {
            validCar.setYear(year);
            fail("setYear should have thrown an exception");
        }
        catch (IllegalArgumentException e)
        {
             
        }
    }
    
    /**
     * Test of setMileageValid method, of class Car.
     */
    @Test
    public void testSetMileageValid() {
        System.out.println("setMileage");
        Double mileage = 15.00;
        validCar.setMileage(mileage);
        assertEquals(mileage, validCar.getMileage());
    }
    
    /**
     * Test of setMileageInvalid method, of class Car.
     */
    @Test
    public void testSetMileageInvalid() {
        System.out.println("setMileage");
        Double mileage = -4.00;
        try
        {
            validCar.setMileage(mileage);
            fail("setYear should have thrown an exception");
        }
        catch (IllegalArgumentException e)
        {
             
        }
    }

    /**
     * Test of setSellPrice method, of class Car.
     */
    @Test
    public void testSetSellPrice() {
        System.out.println("setSellPrice");
        Double sellPrice = 10000.00;
        validCar.setSellPrice(sellPrice);
        assertEquals(sellPrice, validCar.getSellPrice());
    }

    /**
     * Test of setFeatures method, of class Car.
     */
    @Test
    public void testSetFeatures() {
        System.out.println("setFeatures");
        ArrayList<String> features = new ArrayList<String>();
        features.add("leather");
        validCar.setFeatures(features);
        assertEquals(features, validCar.getFeatures());
    }
    
    /**
     * Test of getMake method, of class Car.
     */
    @Test
    public void testGetMake() {
        System.out.println("getMake");
        String expResult = "Nissan";
        String result = validCar.getMake();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getModel method, of class Car.
     */
    @Test
    public void testGetModel() {
        System.out.println("getModel");
        String expResult = "Sedan";
        String result = validCar.getModel();
        assertEquals(expResult, result);
    }
}
