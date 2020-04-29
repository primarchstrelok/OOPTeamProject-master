/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.Date;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author david
 */
public class CarTest {
    CarModel supra = null;
    Car c = null;

    public CarTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @Before
    public void setUp() throws Exception {
        Date testDate = new Date();
        supra = new CarModel("Supra", "Toyota", 2.8, 2, FuelType.petrol, CarBodyType.sedan);
        c = new Car("123456789", testDate, 45, "White", 1994, ShopStatus.available, testDate, testDate, supra);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetCarModel() {
    }

    @Test
    public void testSetCarModel() {
    }

    @Test
    public void testGetRegistrationNumber() {
    }

    @Test
    public void testGetWOFExpiryDate() {
    }

    @Test
    public void testSetWOFExpiryDate() {
    }

    @Test
    public void testGetRentPerDay() {
    }

    @Test
    public void testSetRentPerDay() {
    }

    @Test
    public void testGetColor() {
    }

    @Test
    public void testSetColor() {
    }

    @Test
    public void testGetYearOfManufacture() {
    }

    @Test
    public void testGetShopStatus() {
    }

    @Test
    public void testSetShopStatus() {
    }

    @Test
    public void testGetRentDate() {
    }

    @Test
    public void testSetRentDate() {
    }

    @Test
    public void testGetReturnDate() {
    }

    @Test
    public void testSetReturnDate() {
    }

    @Test
    public void testGetModelName() {
    }

    @Test
    public void testSetModelName() {
    }

    @Test
    public void testGetManufacturer() {
    }

    @Test
    public void testSetManufacturer() {
    }

    @Test
    public void testGetEngineSize() {
    }

    @Test
    public void testSetEngineSize() {
        try{
            double newEngineSize = Double.MAX_VALUE;
        c.setEngineSize(newEngineSize);
            assertEquals(newEngineSize, c.getEngineSize(), 0.0);
        }catch(Exception ex)
        {
            fail();
        }
        try{
            double newEngineSize = 0;
            c.setEngineSize(newEngineSize);
         assertEquals(newEngineSize, c.getEngineSize(), 0.0);
        }catch(Exception ex)
        {
            fail();
        }
    }
    
    @Test
    public void testGetSeatCount() {
    }

    @Test
    public void testSetSeatCount() {
    }

    @Test
    public void testGetFuelType() {
    }

    @Test
    public void testSetFuelType() {
    }

    @Test
    public void testGetBodyType() {
    }

    @Test
    public void testSetBodyType() {
    }
    
}
