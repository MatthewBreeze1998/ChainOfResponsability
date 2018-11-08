/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chain;

/**
 *
 * @author t7077260
 */
public class Plane 
{
    
    private PlaneSizeEnum planeSize;
    private  int fuel;
    private FuelEnum fuelType;
    private int foodQty;
    private int maxFood; 
    private  RampEnum rampType;
    private MaintenanceEnum maintenance;
    private CleaningEnum cleaning;

   
    public Plane(PlaneSizeEnum planeSize, int fuel, FuelEnum fuelType, int foodQty, RampEnum rampType, MaintenanceEnum maintenance, CleaningEnum cleaning,int maxFood) {
        this.planeSize = planeSize;
        this.fuel = fuel;
        this.fuelType = fuelType;
        this.foodQty = foodQty;
        this.rampType = rampType;
        this.maintenance = maintenance;
        this.cleaning = cleaning;
        this.maxFood = maxFood;
    }

    public int getMaxFood() {
        return maxFood;
    }

    public void setMaxFood(int maxFood) {
        this.maxFood = maxFood;
    }

   

    

    /**
     * @return the fuel
     */
    public int getFuel() {
        return fuel;
    }

    /**
     * @param fuel the fuel to set
     */
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    /**
     * @return the fuelType
     */
    public FuelEnum getFuelType() {
        return fuelType;
    }

    /**
     * @param fuelType the fuelType to set
     */
    public void setFuelType(FuelEnum fuelType) 
    {
        this.fuelType = fuelType;
    }

    /**
     * @return the foodQty
     */
    public int getFoodQty() {
        return foodQty;
    }

    /**
     * @param foodQty the foodQty to set
     */
    public void setFoodQty(int foodQty) {
        this.foodQty = foodQty;
    }

    /**
     * @return the rampType
     */
    public RampEnum getRampType() {
        return rampType;
    }

    /**
     * @param rampType the rampType to set
     */
    public void setRampType(RampEnum rampType) {
        this.rampType = rampType;
    }

    /**
     * @return the maintenance
     */
    public MaintenanceEnum getMaintenance() {
        return maintenance;
    }

    /**
     * @param maintenance the maintenance to set
     */
    public void setMaintenance(MaintenanceEnum maintenance) {
        this.maintenance = maintenance;
    }

    /**
     * @return the cleaning
     */
    public CleaningEnum getCleaning() {
        return cleaning;
    }

    /**
     * @param cleaning the cleaning to set
     */
    public void setCleaning(CleaningEnum cleaning) {
        this.cleaning = cleaning;
    }
     public PlaneSizeEnum getPlaneSize() {
        return planeSize;
    }

    public void setPlaneSize(PlaneSizeEnum planeSize) {
        this.planeSize = planeSize;
    }
    
}
