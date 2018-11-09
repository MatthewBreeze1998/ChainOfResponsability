/**
 * this gets first vehicle from the chain then checks the rest if need starts the chain of all vehicles
 */
package chain;

/**
 * this gets first vehicle from the chain then checks the rest if need starts the chain of all vehicles
 * 
 * @author t7077260 Matthew Breeze
 */
public class DeliveryVehicles
{

    static Ramp firstRamp;
    static Cleaning firstCleaning;
    static Fuel firstFuel;
    static Maintenance firstMaintenance;
    static Catering firstCatering;

    /**
     *
     * @param firstRamp this is the first ramp in the chain
     * @param firstCleaning first cleaning vehicle in the chain
     * @param firstFuel first fuel in the chain
     * @param firstMaintenance first Maintenance in the chain
     * @param firstCatering first catering in the chain
     */
    public DeliveryVehicles(Ramp firstRamp, Cleaning firstCleaning, Fuel firstFuel, Maintenance firstMaintenance, Catering firstCatering)
    {
        DeliveryVehicles.firstRamp = firstRamp;
        DeliveryVehicles.firstCleaning = firstCleaning;
        DeliveryVehicles.firstCatering = firstCatering;
        DeliveryVehicles.firstFuel = firstFuel;
        DeliveryVehicles.firstMaintenance = firstMaintenance;
    }

    /**
     *
     * @param plane
     * @return return the ramp for the job or null if first ramp is null 
     */
    public static Ramp getRamp(Plane plane)
    {
        if (firstRamp != null)
        {
            return (Ramp) firstRamp.Handle(plane);
        }
        return null;
    }

    /**
     * holds first Cleaning then checks the rest of the chain of Cleaning until null of correct vehicle 
     * @param plane
     * @return selected catering
     */
    public static Cleaning getCleaning(Plane plane)
    {
        if (firstCleaning != null)
        {
            return (Cleaning) firstCleaning.Handle(plane);
        }
        return null;
    }

    /**
     * holds first fuel then checks the rest of the chain of fuel until null of correct vehicle 
     * @param plane
     * @return correct fuel
     */
    public static Fuel getFuel(Plane plane)
    {
        if (firstFuel != null)
        {
            return (Fuel) firstFuel.Handle(plane);
        }
        return null;
    }

    /**
     * holds first Catering then checks the rest of the chain of Catering until null of correct vehicle
     * @param plane
     * @return correct catering truck 
     */
    public static Catering getCatering(Plane plane)
    {
        if (firstCatering != null)
        {
            return (Catering) firstCatering.Handle(plane);
        }
        return null;
    }

    /**
     * holds first Maintenance then checks the rest of the chain of Maintenance until null of correct vehicle
     * @param plane
     * @return suitable Maintenance for the job
     */
    public static Maintenance getMaintenance(Plane plane)
    {
        if (firstMaintenance != null)
        {
            return (Maintenance) firstMaintenance.Handle(plane);
        }
        return null;

    }

}
