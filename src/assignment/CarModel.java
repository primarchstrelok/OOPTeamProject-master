/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author david
 */
public class CarModel {
    private String modelName;
    private String manufacturer;
    // Engine size is in Litre Displacement
    private double engineSize;
    private int seatCount;
    private FuelType fuelType;
    private CarBodyType bodyType;

    public CarModel(String modelName, String manufacturer, double engineSize, int seatCount, FuelType fuelType, CarBodyType bodyType) {
        this.modelName = modelName;
        this.manufacturer = manufacturer;
        setEngineSize(engineSize);
        this.seatCount = seatCount;
        this.fuelType = fuelType;
        this.bodyType = bodyType;
    }

    public CarModel() {
    }
    
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(double engineSize) {
        if(engineSize >0) {
            this.engineSize = engineSize;
        }
        else {
           throw new RuntimeException("Please enter a positive number for Engine Size");
        }
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public CarBodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(CarBodyType bodyType) {
        this.bodyType = bodyType;
    }
}
