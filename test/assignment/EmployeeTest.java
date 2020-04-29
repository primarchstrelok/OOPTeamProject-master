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
public class EmployeeTest {
    
    public EmployeeTest() {
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
     * Test of getId method, of class Employee.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Employee instance = null;
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Employee.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String employeeID = "";
        Employee instance = null;
        instance.setId(employeeID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPhoneExtention method, of class Employee.
     */
    @Test
    public void testGetPhoneExtention() {
        System.out.println("getPhoneExtention");
        Employee instance = null;
        String expResult = "";
        String result = instance.getPhoneExtention();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhoneExtention method, of class Employee.
     */
    @Test
    public void testSetPhoneExtention() {
        System.out.println("setPhoneExtention");
        String phoneExtention = "";
        Employee instance = null;
        instance.setPhoneExtention(phoneExtention);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserName method, of class Employee.
     */
    @Test
    public void testGetUserName() {
        System.out.println("getUserName");
        Employee instance = null;
        String expResult = "";
        String result = instance.getUserName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserName method, of class Employee.
     */
    @Test
    public void testSetUserName() {
        System.out.println("setUserName");
        String userName = "";
        Employee instance = null;
        instance.setUserName(userName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class Employee.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Employee instance = null;
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class Employee.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        Employee instance = null;
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
