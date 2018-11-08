/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chain;

/**
 *
 * @author t7077260 Matthew Breeze
 */
public class Chain
{

    public static void main(String[] args)
    {

        testsim();

    }

    public static void testsim()
    {

        Plane p = new Plane(PlaneSizeEnum.large, 35, FuelEnum.Biokerosene, 67, RampEnum.Open, MaintenanceEnum.Medium, CleaningEnum.light, 23);

        LoadingBay bay = new LoadingBay(LoadingBayEnum.large);

        LoadingBay Bay1 = new LoadingBay(LoadingBayEnum.Small);
        LoadingBay Bay2 = new LoadingBay(LoadingBayEnum.large);

        Bay1.AddNext(Bay2);

        LoadingBay bayExpected = Bay2;

        LoadingBay bayActual = (LoadingBay) Bay1.getNext();
        System.out.println("Bay added " + bayActual);

        Ramp ramp1 = new Ramp(RampEnum.Open);
        Ramp ramp2 = new Ramp(RampEnum.Closed);

        ramp1.AddNext(ramp2);
        Arc.setFirstLoadingBay(bay);
        Arc.handlePlane(p);
        Ramp rampExpected = ramp1;
        Ramp rampActual = (Ramp) ramp1.getNext();
        System.out.println("Ramp added " + rampActual);

        Fuel fuel1 = new Fuel(FuelEnum.Aviationgasoline);
        Fuel fuel2 = new Fuel(FuelEnum.Biokerosene);
        Fuel fuel3 = new Fuel(FuelEnum.Jetfuel);
        Fuel fuel4 = new Fuel(FuelEnum.Kerosenegasoline);

        fuel1.AddNext(fuel2);
        fuel2.AddNext(fuel3);
        fuel3.AddNext(fuel4);

        Arc.setFirstLoadingBay(bay);

        Arc.handlePlane(p);
        Fuel fuelExpected = fuel1;
        Fuel fuelActual = (Fuel) fuel1.getNext();

        System.out.println("Fuel added" + fuelActual);

        Maintenance maintenance1 = new Maintenance(MaintenanceEnum.High);
        Maintenance maintenance2 = new Maintenance(MaintenanceEnum.Medium);
        Maintenance maintenance3 = new Maintenance(MaintenanceEnum.severe);
        Maintenance maintenance4 = new Maintenance(MaintenanceEnum.Low);

        maintenance1.AddNext(maintenance2);
        maintenance2.AddNext(maintenance3);
        maintenance3.AddNext(maintenance4);

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

        Arc.setFirstLoadingBay(bay);
        Arc.handlePlane(p);
        Cleaning CleaningExpected = Cleaning1;
        Cleaning CleaningActual = (Cleaning) Cleaning1.getNext();
        System.out.println("cleaning added" + CleaningActual);

        Catering catering1 = new Catering(57);
        Catering catering2 = new Catering(100);

        catering1.AddNext(catering2);

        Arc.setFirstLoadingBay(bay);
        Arc.handlePlane(p);
        Catering cateringExpected = catering1;
        Catering cateringActual = (Catering) catering1.getNext();
        System.out.println("catering added" + cateringActual);

        DeliveryVehicles manager = new DeliveryVehicles(ramp1, Cleaning1, fuel1, maintenance1, catering1);

    }

}
