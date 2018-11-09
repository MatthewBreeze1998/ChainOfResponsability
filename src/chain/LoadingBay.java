/*
 * this calls is used to to paramertes and set them to a objects thats is then passed throw to the arc where they are used 
 * to check the chain is working
 */
package chain;

/**
 
 * @author Matthew Breeze t7077260 
 */
public class LoadingBay extends NextCheck
{

  
    /**
     * plane this passes the information for the plane throw to the class
     */
    Plane plane;
    /**
     * location this give the location off the loading bay
     */
    String location;
    /**
     * ramp this is the ramp that is best for the job and has been selected by the chain
     */
    Ramp ramp;
    /**
     * cleaning this is the correct cleaning crew for the job
     */
    Cleaning clenaing;
    /**
     * fuel this is the fuel truck with the correct fuel type and ammount
     */
    Fuel fuel;
    /**
     * Maintenance this is the selected crew for the job level
     */
    Maintenance maintenance;
    /**
     * catering is the best catering with the correct amount food for it
     */
    Catering catering;
    /**
     * size is the size of the loading bay that there is and what size plane it can take
     */
    LoadingBayEnum size;
    /**
     * gets  the size of the loading that the plane is in
     * @param size 
     */
    public LoadingBay(LoadingBayEnum size)
    {

        this.size = size;
    }
/**
 * gets gets the location of the vehicles
 * @param location location is a location of a loading pay for plane 
 */
    public LoadingBay(String location)
    {
        this.location = location;
    }
/**
 * get the ramp type
 * @return ramp this is a ramp type of ramptypenue class 
 */
    public Ramp getRamp()
    {
        return ramp;
    }
/**
 * gets cleaning type
 * @return cleaning get the cleaning crew that will handle the job 
 */
    public Cleaning getCleaning()
    {
        return clenaing;
    }

    /**
     * getter for fuel object
     * @return object of type fuel
     */
    public Fuel getfuel()
    {
        return fuel;
    }
    /**
     * gets maintenance vehicles
     * @return maintenance gets the truck that is best for the job 
     */
    public Maintenance getMaintenance()
    {
        return maintenance;
    }
/**
 * gets catering from catering
 * @return catering truck more equipt for the job 
 */
    public Catering getCatering()
    {
        return catering;
    }
/**
 * getVehicals sets all the vehicles to the first instance of the vehicle  
 */
    public void getVehicals()
    {
        if (plane != null)
        {
            ramp = DeliveryVehicles.getRamp(plane);
            clenaing = DeliveryVehicles.getCleaning(plane);
            fuel = DeliveryVehicles.getFuel(plane);
            maintenance = DeliveryVehicles.getMaintenance(plane);
            catering = DeliveryVehicles.getCatering(plane);

        }
    }
/**
 * this gets the size of the loading bay and checks it against a loading bay id it can fit then returns that loading bay of not returns handle next
 * to to handle the next loading bay
 * @param plane 
 * @return plane size
 */
        
    @Override
    public NextCheck Handle(Plane plane)
    {
        if (size.ordinal() == plane.getPlaneSize().ordinal())
        {
            this.plane = plane;
            return this;
        } else if (next != null)
        {
            return next.Handle(plane);
        } else
        {
            return null;
        }

    }

}
