/*
 * this class creates a fake plane.
 * this plane is then used to check the vehicle handlers work
 */
package chain;

/**
 *
 * @author t7077260 Matthew Breeze
 */
public class Chain
{

    /**
     * main
     * @param args
     */
    public static void main(String[] args)
    {
        /**
         * calls testing simulator
         */
        testPlaneSimulator();

    }
    /**
     * This hold a plane instance and test the different chains for the correct vehicle
     */
    public static void testPlaneSimulator()
    {
        /**
         * plane p is an instance of the plane and a possible plane for simulation
         */
        Plane p = new Plane(PlaneSizeEnum.large, 35, FuelEnum.Biokerosene, 67, RampEnum.Open, MaintenanceEnum.Medium, CleaningEnum.light, 23);
        /**
         * creates a new bay and sets bay to large 
         */
        LoadingBay bay = new LoadingBay(LoadingBayEnum.large);
        /**
         * creates a new bay and sets bay to small 
         */
        LoadingBay bay1 = new LoadingBay(LoadingBayEnum.Small);
        /**
         * creates a new bay and sets bay to large 
         */
        LoadingBay bay2 = new LoadingBay(LoadingBayEnum.medium);

        /**
         * this links the next bay if the bay is not suitable
         */
        bay.AddNext(bay1);
        /**
         * this links the next bay if the bay is not suitable
         */
        bay1.AddNext(bay2);
        
        /**
         * this is the expected pay 
         */
        LoadingBay bayExpected = bay2;
        /**
         * this is the bay that is actually chosen in the chain
         */
        LoadingBay bayActual = (LoadingBay) bay.getNext();
        /**
         * prints out the bay thats been selected
         */
        System.out.println("Bay added " + bayActual);

        
        
        /**
         * creates a new ramp and sets the value
         */
        Ramp ramp1 = new Ramp(RampEnum.Open);
        Ramp ramp2 = new Ramp(RampEnum.Closed);

        
        /**
         * adds next ramp for chain to check
         */
        ramp1.AddNext(ramp2);
        
        /**
         * expected ramp
         */
        Ramp rampExpected = ramp1;
        /**
         * actual ramp selected by chain
         */
        Ramp rampActual = (Ramp) ramp1.getNext();
        /**
         * show what tuck is added
         */
        System.out.println("Ramp added " + rampActual);

        /**
         * creates new fuel truck and gives it a type
         */
        Fuel fuel1 = new Fuel(FuelEnum.Aviationgasoline);
        Fuel fuel2 = new Fuel(FuelEnum.Biokerosene);
        Fuel fuel3 = new Fuel(FuelEnum.Jetfuel);
        Fuel fuel4 = new Fuel(FuelEnum.Kerosenegasoline);

        /**
         * this addes the next fuel truck in the chain if the current one is able to do it
         */
        fuel1.AddNext(fuel2);
        fuel2.AddNext(fuel3);
        fuel3.AddNext(fuel4);

        /**
         *  is the expected fuel truck
         */
        Fuel fuelExpected = fuel1;
        /**
         * the actual fuel truck 
         */
        Fuel fuelActual = (Fuel) fuel1.getNext();
        /**
         * shows the actual fuel thats was addded
         */
        System.out.println("Fuel added" + fuelActual);

        
        /**
         * creates new maintenance and sets all vlaues
         */
        Maintenance maintenance1 = new Maintenance(MaintenanceEnum.High);
        Maintenance maintenance2 = new Maintenance(MaintenanceEnum.Medium);
        Maintenance maintenance3 = new Maintenance(MaintenanceEnum.severe);
        Maintenance maintenance4 = new Maintenance(MaintenanceEnum.Low);

        
        /**
         * adds next if the maintenance isnt able to handle it
         */
        maintenance1.AddNext(maintenance2);
        maintenance2.AddNext(maintenance3);
        maintenance3.AddNext(maintenance4);

        /**
         * expected vehicle
         */
        Maintenance maintenanceExpected = maintenance1;
        
        Maintenance maintenanceActual = (Maintenance) maintenance1.getNext();

        System.out.println("Maintenance added" + maintenanceActual);

        Cleaning Cleaning1 = new Cleaning(CleaningEnum.biorisk);
        Cleaning Cleaning2 = new Cleaning(CleaningEnum.heavy);
        Cleaning Cleaning3 = new Cleaning(CleaningEnum.light);
        Cleaning Cleaning4 = new Cleaning(CleaningEnum.medium);

        Cleaning1.AddNext(Cleaning2);
        Cleaning2.AddNext(Cleaning3);
        Cleaning3.AddNext(Cleaning4);

       
        Cleaning CleaningExpected = Cleaning1;
        Cleaning CleaningActual = (Cleaning) Cleaning1.getNext();
        
        System.out.println("cleaning added" + CleaningActual);

        Catering catering1 = new Catering(57);
        Catering catering2 = new Catering(100);

        catering1.AddNext(catering2);

      
        Catering cateringExpected = catering1;
        Catering cateringActual = (Catering) catering1.getNext();
        System.out.println("catering added" + cateringActual);

        DeliveryVehicles manager = new DeliveryVehicles(ramp1, Cleaning1, fuel1, maintenance1, catering1);

    }

}
