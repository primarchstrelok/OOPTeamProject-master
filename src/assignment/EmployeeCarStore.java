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
public class EmployeeCarStore {
    public static ArrayList<Employee> employees = new ArrayList<Employee>();
    public static boolean containsEmployee(String id)
    {
        for (Employee e : employees)
        {
            if(e.getId().equals(id))
            {
                return true;
            }
        }
        return false;
    }
    
    static public Employee searchEmployeeByID(String id)
    {
        Person found = null;
        for (Employee e : employees)
        {
            if(e.getId().equals(id))
            {
                found = e;
                break;
            }
        }
        return (Employee) found;
    }
    
     public static void updateEmployee(String id, String name, String gender, String DOB, String address, String phone, String phoneExtention, String userName, String password)
     {
       Employee e = searchEmployeeByID(id);
                e.setName(name);
                e.setGender(gender);
                e.setDateOfBirth(DOB);
                e.setAddress(address);
                e.setPhone(phone);
                e.setPhoneExtention(phoneExtention);
                e.setUserName(userName);
                e.setPassword(password); 
     }
}
