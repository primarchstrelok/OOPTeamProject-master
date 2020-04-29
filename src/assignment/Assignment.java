/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.Date;

/**
 *
 * @author kieran
 */
public class Assignment {

    /**
     * @param args the command line arguments.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //init testdate
        Date testDate = new Date();
        //construct carmodels
        CarModel supra = new CarModel("Supra", "Toyota", 2.8, 2, FuelType.petrol, CarBodyType.sedan);
        //construct individual cars with carmodel objects
        Car car1 = new Car("123456789", testDate, 45, "White", 1994, ShopStatus.available, testDate, testDate, supra);
        System.out.println(car1.getWOFExpiryDate());
        System.out.println(car1.getEngineSize());
        
        MainForm homeform = new MainForm();
        homeform.setVisible(true);
    }
    
}