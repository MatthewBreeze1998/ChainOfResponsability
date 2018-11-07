package chain;

/**
 *
 * @author t7077260 Matthew Breeze
 */
public class DeliveryVehicles {

    static Ramp firstRamp;
   static Cleaning firstCleaning;
   static Fuel firstFuel;
   static Maintenance firstMaintenance;
   static Catering firstCatering;

    public DeliveryVehicles(Ramp firstRamp, Cleaning firstCleaning, Fuel firstFuel, Maintenance firstMaintenance, Catering firstCatering) {
        DeliveryVehicles.firstRamp = firstRamp;
        DeliveryVehicles.firstCleaning = firstCleaning;
        DeliveryVehicles.firstCatering = firstCatering;
        DeliveryVehicles.firstFuel = firstFuel;
        DeliveryVehicles.firstMaintenance = firstMaintenance;
    }

    
    
    public static Ramp getRamp(Plane plane) {
        if (firstRamp != null) {
            return (Ramp) firstRamp.Handle(plane);
        }
        return null;
    }

    public static Cleaning getCleaning(Plane plane) {
        if (firstCleaning != null) {
            return (Cleaning) firstCleaning.Handle(plane);
        }
        return null;
    }

    public static Fuel getFuel(Plane plane) {
        if (firstFuel != null) {
            return (Fuel) firstFuel.Handle(plane);
        }
        return null;
    }

    public static Catering getCatering(Plane plane) {
        if (firstCatering != null) {
            return (Catering) firstCatering.Handle(plane);
        }
        return null;
    }

    public static Maintenance getMaintenance(Plane plane) {
        if (firstMaintenance != null) {
            return (Maintenance) firstMaintenance.Handle(plane);
        }
        return null;

    }

}
