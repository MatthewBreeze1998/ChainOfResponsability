package chain;

/**
 *
 * @author t7077260 Matthew Breeze
 */
public class DeliveryVehicles {

    Ramp firstRamp;
    Cleaning firstCleaning;
    Fuel firstFuel;
    Maintenance firstMaintenance;
    Catering firstCatering;

    public DeliveryVehicles(Ramp firstRamp, Cleaning firstCleaning, Fuel firstFuel, Maintenance firstMaintenance, Catering firstCatering) {
        this.firstRamp = firstRamp;
        this.firstCleaning = firstCleaning;
        this.firstCatering = firstCatering;
        this.firstFuel = firstFuel;
        this.firstMaintenance = firstMaintenance;
    }

    public Ramp getRamp(Plane plane) {

        return (Ramp) firstRamp.Handle(plane);

    }

    public Cleaning getCleaning(Plane plane) {

        return (Cleaning) firstCleaning.Handle(plane);

    }

    public Fuel getFuel(Plane plane) {

        return (Fuel) firstFuel.Handle(plane);

    }

    public Catering getCatering(Plane plane) {

        return (Catering) firstCatering.Handle(plane);

    }
     
    public Maintenance getMaintenance(Plane plane) {

        return (Maintenance) firstMaintenance.Handle(plane);

    }

}
