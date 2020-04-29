/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author david
 */
public class CarStore {
    public static ArrayList<Car> cars = new ArrayList<Car>();
    public static boolean containsCar(String regNo)
    {
        for (Car c : cars)
        {
            if(c.getRegistrationNumber().equals(regNo))
            {
                return true;
            }
        }
        return false;
    }
    
    static public Car searchCarByRegistration(String regNo)
    {
        Car found = null;
        for (Car c : cars)
        {
            if(c.getRegistrationNumber().equals(regNo))
            {
                found = c;
                break;
            }
        }
        return (Car) found;
    }
}