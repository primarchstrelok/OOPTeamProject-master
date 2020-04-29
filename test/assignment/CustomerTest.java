/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author natyd
 */
public class CustomerTest {
    
    public CustomerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of newCustomer method, of class Customer.
     */
    @Test
    public void testNewCustomer() {
        System.out.println("newCustomer");
        Customer instance = null;
        String expResult = "";
        String result = instance.newCustomer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Customer.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Customer instance = null;
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Customer.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String customerID = "";
        Customer instance = null;
        instance.setId(customerID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLicenceNumber method, of class Customer.
     */
    @Test
    public void testGetLicenceNumber() {
        System.out.println("getLicenceNumber");
        Customer instance = null;
        String expResult = "";
        String result = instance.getLicenceNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLicenceNumber method, of class Customer.
     */
    @Test
    public void testSetLicenceNumber() {
        System.out.println("setLicenceNumber");
        String licenceNumber = "";
        Customer instance = null;
        instance.setLicenceNumber(licenceNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLicenceType method, of class Customer.
     */
    @Test
    public void testGetLicenceType() {
        System.out.println("getLicenceType");
        Customer instance = null;
        LicenceType expResult = null;
        LicenceType result = instance.getLicenceType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLicenceType method, of class Customer.
     */
    @Test
    public void testSetLicenceType() {
        System.out.println("setLicenceType");
        LicenceType licenceType = null;
        Customer instance = null;
        instance.setLicenceType(licenceType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLicenceExpiry method, of class Customer.
     */
    @Test
    public void testGetLicenceExpiry() {
        System.out.println("getLicenceExpiry");
        Customer instance = null;
        String expResult = "";
        String result = instance.getLicenceExpiry();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLicenceExpiry method, of class Customer.
     */
    @Test
    public void testSetLicenceExpiry() {
        System.out.println("setLicenceExpiry");
        String licenceExpiry = "";
        Customer instance = null;
        instance.setLicenceExpiry(licenceExpiry);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
