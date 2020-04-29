/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kieran
 */
public class CustomerTest {
    Customer c = null;
    
    public CustomerTest() {
    }
    
     @Before
    public void setUp() {
        c = new Customer("1", "5645NF1", LicenceType.LEARNER, "12/05/2024", "John", "M", "12/10/1945", "22 Harbor Rd", "5654423");
    }
    
    @After
    public void tearDown() {
        c=null;
    }

    /**
     * Test of newCustomer method, of class Customer.
     */
    @Test
    public void testNewCustomer() {
    }

    /**
     * Test of getId method, of class Customer.
     */
    @Test
    public void testGetId() {
    }

    /**
     * Test of setId method, of class Customer.
     */
    @Test
    public void testSetId() {
    }

    /**
     * Test of getLicenceNumber method, of class Customer.
     */
    @Test
    public void testGetLicenceNumber() {
    }

    /**
     * Test of setLicenceNumber method, of class Customer.
     */
    @Test
    public void testSetLicenceNumber() {
 

    }

    /**
     * Test of getLicenceType method, of class Customer.
     */
    @Test
    public void testGetLicenceType() {
    }

    /**
     * Test of setLicenceType method, of class Customer.
     */
    @Test
    public void testSetLicenceType() {
    }

    /**
     * Test of getLicenceExpiry method, of class Customer.
     */
    @Test
    public void testGetLicenceExpiry() {
    }

    /**
     * Test of setLicenceExpiry method, of class Customer.
     */
    @Test
    public void testSetLicenceExpiry() {
    }
    
}
