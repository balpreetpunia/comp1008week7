/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author hello
 */
public class Car {
    
    private String make;
    private String model;
    private int year;
    private Double mileage;
    private Double sellPrice;
    private ArrayList <String> features;


    public Car ( String make, String model, int year, Double mileage, Double sellPrice, ArrayList<String> features)
    {
        setMake(make);
        setModel(model);
        setYear(year);
        setMileage(mileage);
        setSellPrice(sellPrice);
        setFeatures(features);

    }

    public void setMake(String make)
    {
        this.make = make;
    }
    
    public void setModel(String model)
    {
        this.model = model;
    }
    
    public void setYear(int year)
    {
        if(year > 1884 && year < (LocalDate.now().getYear()+1))
        {
            this.year = year;
        }
        else
            throw new IllegalArgumentException("Please enter a valid year!");
    }
    
    public void setMileage(Double mileage)
    {
        if(mileage > 0 && mileage < 30)
        {
            this.mileage = mileage;
        }
        else
            throw new IllegalArgumentException("Please enter valid digits for mileage!");
    }
    
    public void setSellPrice(Double sellPrice)
    {
        if(sellPrice > 0)
        {
            this.sellPrice = sellPrice;
        }
        else
            throw new IllegalArgumentException("Please enter a valid amount for Sell Price!");
    }
    
    public void setFeatures(ArrayList<String> features)
    {
        this.features = features;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public Double getMileage() {
        return mileage;
    }

    public Double getSellPrice() {
        return sellPrice;
    }

    public ArrayList<String> getFeatures() {
        return features;
    }
}