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
public class Customer extends Person implements NewCustomer {
    private String id;
    private String licenceNumber;
    private LicenceType licenceType;
    private String licenceExpiry;
    

    public String newCustomer()
    {
        return "Choose two dates to search for new customer rentals";
    }

    public Customer(String id, String licenceNumber, LicenceType licenceType, String licenceExpiry, String name, String gender, String dateOfBirth, String address, String phone) {
        super(name, gender, dateOfBirth, address, phone);
        this.id = id;
        this.licenceNumber = licenceNumber;
        this.licenceType = licenceType;
        this.licenceExpiry = licenceExpiry;
    }

    public String getId() {
        return id;
    }

    public void setId(String customerID) {
        this.id = customerID;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public LicenceType getLicenceType() {
        return licenceType;
    }

    public void setLicenceType(LicenceType licenceType) {
        this.licenceType = licenceType;
    }

    public String getLicenceExpiry() {
        return licenceExpiry;
    }

    public void setLicenceExpiry(String licenceExpiry) {
        this.licenceExpiry = licenceExpiry;
    }
    
   
}
