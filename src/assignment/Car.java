/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;
import java.util.Date;
/**
 *
 * @author david
 */
public class Car {
    private String registrationNumber;
    private Date WOFExpiryDate;
    private double rentPerDay;
    private String color;
    private int yearOfManufacture;
    private ShopStatus shopStatus;
    private Date rentDate;
    private Date returnDate;
    CarModel carModel = new CarModel();

    public Car(String registrationNumber, Date WOFExpiryDate, double rentPerDay, String color, int yearOfManufacture, ShopStatus shopStatus, Date rentDate, Date returnDate, CarModel carModel) {
        this.registrationNumber = registrationNumber;
        this.WOFExpiryDate = WOFExpiryDate;
        this.rentPerDay = rentPerDay;
        this.color = color;
        this.yearOfManufacture = yearOfManufacture;
        this.shopStatus = shopStatus;
        this.rentDate = rentDate;
        this.returnDate = returnDate;
        this.carModel = carModel;
    }
    
    public CarModel getCarModel() {
        return carModel;
    }

    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public Date getWOFExpiryDate() {
        return WOFExpiryDate;
    }

    public void setWOFExpiryDate(Date WOFExpiryDate) {
        this.WOFExpiryDate = WOFExpiryDate;
    }

    public double getRentPerDay() {
        return rentPerDay;
    }

    public void setRentPerDay(double rentPerDay) {
        this.rentPerDay = rentPerDay;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public ShopStatus getShopStatus() {
        return shopStatus;
    }

    public void setShopStatus(ShopStatus shopStatus) {
        this.shopStatus = shopStatus;
    }

    public Date getRentDate() {
        return rentDate;
    }

    public void setRentDate(Date rentDate) {
        this.rentDate = rentDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public String getModelName() {
        return carModel.getModelName();
    }

    public void setModelName(String modelName) {
        carModel.setModelName(modelName);
    }

    public String getManufacturer() {
        return carModel.getManufacturer();
    }

    public void setManufacturer(String manufacturer) {
        carModel.setManufacturer(manufacturer);
    }

    public double getEngineSize() {
        return carModel.getEngineSize();
    }

    public void setEngineSize(double engineSize) {
        carModel.setEngineSize(engineSize);
    }

    public int getSeatCount() {
        return carModel.getSeatCount();
    }

    public void setSeatCount(int seatCount) {
        carModel.setSeatCount(seatCount);
    }

    public FuelType getFuelType() {
        return carModel.getFuelType();
    }

    public void setFuelType(FuelType fuelType) {
        carModel.setFuelType(fuelType);
    }

    public CarBodyType getBodyType() {
        return carModel.getBodyType();
    }

    public void setBodyType(CarBodyType bodyType) {
        carModel.setBodyType(bodyType);
    }
}
