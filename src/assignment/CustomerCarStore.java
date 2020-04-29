/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.ArrayList;

/**
 *
 * @author kieran
 */
public class CustomerCarStore {
     public static ArrayList<Customer> customers = new ArrayList<Customer>();
    public static boolean containsCustomer(String id)
    {
        for (Customer c : customers)
        {
            if(c.getId().equals(id))
            {
                return true;
            }
        }
        return false;
    }
    
    static public Customer searchCustomerByID(String id)
    {
        Customer found = null;
        for (Customer c : customers)
        {
            if(c.getId().equals(id))
            {
                found = c;
                break;
            }
        }
        return found;
    }
    
    public static void updateCustomer(String id, String name, String gender, String DOB, String address, String phone, String licenceNumber, LicenceType licenceType, String licenceExpiry)
    {
       Customer c = searchCustomerByID(id);
                c.setLicenceNumber(licenceNumber);
                c.setLicenceType(licenceType);
                c.setLicenceExpiry(licenceExpiry);
                c.setName(name);
                c.setGender(gender);
                c.setDateOfBirth(DOB);
                c.setAddress(address);
                c.setPhone(phone);
        
    }
}
