/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author kieran
 */
public class Employee extends Person {
    private String id;
    private String phoneExtention;
    private String userName;
    private String password;

    public Employee(String id, String phoneExtention, String userName, String password, String name, String gender, String dateOfBirth, String address, String phone) {
        super(name, gender, dateOfBirth, address, phone);
        this.id = id;
        this.phoneExtention = phoneExtention;
        this.userName = userName;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String employeeID) {
        this.id = employeeID;
    }

    public String getPhoneExtention() {
        return phoneExtention;
    }

    public void setPhoneExtention(String phoneExtention) {
        this.phoneExtention = phoneExtention;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   
}
