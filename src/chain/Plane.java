/*
 * gets and sets all the plane values and is ready to pass then as object plane
 */
package chain;

/**
 *
 * @author Matthew Breeze t7077260
 */
public class Plane
{

    private PlaneSizeEnum planeSize;
    private int fuel;
    private FuelEnum fuelType;
    private int foodQty;
    private int maxFood;
    private RampEnum rampType;
    private MaintenanceEnum maintenance;
    private CleaningEnum cleaning;

    /**
     *
     * @param planeSize
     * @param fuel
     * @param fuelType
     * @param foodQty
     * @param rampType
     * @param maintenance
     * @param cleaning
     * @param maxFood
     */
    public Plane(PlaneSizeEnum planeSize, int fuel, FuelEnum fuelType, int foodQty, RampEnum rampType, MaintenanceEnum maintenance, CleaningEnum cleaning, int maxFood)
    {
        this.planeSize = planeSize;
        this.fuel = fuel;
        this.fuelType = fuelType;
        this.foodQty = foodQty;
        this.rampType = rampType;
        this.maintenance = maintenance;
        this.cleaning = cleaning;
        this.maxFood = maxFood;
    }

    /**
     *
     * @return max food of plane
     */
    public int getMaxFood()
    {
        return maxFood;
    }

    /**
     * sets the max fuel to the ammont
     * @param maxFood
     */
    public void setMaxFood(int maxFood)
    {
        this.maxFood = maxFood;
    }

    /**
     * @return the fuel amount
     */
    public int getFuel()
    {
        return fuel;
    }

    /**
     * @param fuel the fuel ammount
     */
    public void setFuel(int fuel)
    {
        this.fuel = fuel;
    }

    /**
     * @return the fuelType of plane
     */
    public FuelEnum getFuelType()
    {
        return fuelType;
    }

    /**
     * @param fuelType the fuelType to set plane fuel type
     */
    public void setFuelType(FuelEnum fuelType)
    {
        this.fuelType = fuelType;
    }

    /**
     * @return the foodQty
     */
    public int getFoodQty()
    {
        return foodQty;
    }

    /**
     * @param foodQty the foodQty to set
     */
    public void setFoodQty(int foodQty)
    {
        this.foodQty = foodQty;
    }

    /**
     * @return the rampType
     */
    public RampEnum getRampType()
    {
        return rampType;
    }

    /**
     * @param rampType the rampType to set type of ramp
     */
    public void setRampType(RampEnum rampType)
    {
        this.rampType = rampType;
    }

    /**
     * @return the maintenance
     */
    public MaintenanceEnum getMaintenance()
    {
        return maintenance;
    }

    /**
     * @param maintenance the maintenance to set
     */
    public void setMaintenance(MaintenanceEnum maintenance)
    {
        this.maintenance = maintenance;
    }

    /**
     * @return the cleaning
     */
    public CleaningEnum getCleaning()
    {
        return cleaning;
    }

    /**
     * @param cleaning the cleaning to set
     */
    public void setCleaning(CleaningEnum cleaning)
    {
        this.cleaning = cleaning;
    }

    /**
     *
     * @return plane size enum
     */
    public PlaneSizeEnum getPlaneSize()
    {
        return planeSize;
    }

    /**
     *
     * @param planeSize set size of plane
     */
    public void setPlaneSize(PlaneSizeEnum planeSize)
    {
        this.planeSize = planeSize;
    }

}
