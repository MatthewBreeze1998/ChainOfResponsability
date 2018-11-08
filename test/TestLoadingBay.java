/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import chain.Arc;
import chain.Cleaning;
import chain.CleaningEnum;
import chain.DeliveryVehicles;
import chain.Fuel;
import chain.FuelEnum;
import chain.LoadingBay;
import chain.LoadingBayEnum;
import chain.Maintenance;
import chain.MaintenanceEnum;
import chain.Plane;
import chain.PlaneSizeEnum;
import chain.Ramp;
import chain.RampEnum;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author t7077260
 */
public class TestLoadingBay {

    @Test
    public void TestaddLoadingBay() {
        LoadingBay Bay1 = new LoadingBay(LoadingBayEnum.Small);
        LoadingBay Bay2 = new LoadingBay(LoadingBayEnum.large);

        Bay1.AddNext(Bay2);

        LoadingBay bayExpected = Bay2;

        LoadingBay bayActual = (LoadingBay) Bay1.getNext();

        assertEquals(bayExpected, bayActual);
    }

    @Test
    public void GetRamp() {
        Plane p = new Plane(PlaneSizeEnum.large, 35, FuelEnum.Biokerosene, 67, RampEnum.Open, MaintenanceEnum.Medium, CleaningEnum.light);

        Ramp ramp1 = new Ramp(RampEnum.Open);
        Ramp ramp2 = new Ramp(RampEnum.Closed);

        ramp1.AddNext(ramp2);

        LoadingBay bay = new LoadingBay(LoadingBayEnum.large);
        DeliveryVehicles manager = new DeliveryVehicles(ramp1, null, null, null, null);
        Arc.setFirstLoadingBay(bay);
        Arc.handlePlane(p);
        Ramp rampExpected = ramp1;
        Ramp rampActual = bay.getRamp();

        assertEquals(rampExpected, rampActual);
    }
        @Test
         public void getFuel() {
        Plane p = new Plane(PlaneSizeEnum.large, 35, FuelEnum.Biokerosene, 67, RampEnum.Open, MaintenanceEnum.Medium, CleaningEnum.light);
        
        Fuel fuel1 = new Fuel(FuelEnum.Aviationgasoline);
        Fuel fuel2 = new Fuel(FuelEnum.Biokerosene);
        Fuel fuel3 = new Fuel(FuelEnum.Jetfuel);
        Fuel fuel4 = new Fuel(FuelEnum.Kerosenegasoline);

        fuel1.AddNext(fuel2);
        fuel2.AddNext(fuel3);
        fuel3.AddNext(fuel4);
        
        DeliveryVehicles manager = new DeliveryVehicles(null, null, fuel1, null, null);
        LoadingBay bay = new LoadingBay(LoadingBayEnum.large);
        Arc.setFirstLoadingBay(bay);
        
        Arc.handlePlane(p);
        Fuel fuelExpected = fuel2;
        Fuel fuelActual = bay.getfuel();

        assertEquals(fuelExpected, fuelActual);
        
    
   }
         @Test
        public void getMaintenance(){
         Plane p = new Plane(PlaneSizeEnum.large, 35, FuelEnum.Biokerosene, 67, RampEnum.Open, MaintenanceEnum.Medium, CleaningEnum.light);
         
         Maintenance maintenance1 = new Maintenance(MaintenanceEnum.High);
         Maintenance maintenance2 = new Maintenance(MaintenanceEnum.Medium);
         Maintenance maintenance3 = new Maintenance(MaintenanceEnum.severe);
         Maintenance maintenance4 = new Maintenance(MaintenanceEnum.Low);
        
         maintenance1.AddNext(maintenance2);
         maintenance2.AddNext(maintenance3);
         maintenance3.AddNext(maintenance4);
                
        DeliveryVehicles manager = new DeliveryVehicles(null, null, null, maintenance1, null);
        LoadingBay bay = new LoadingBay(LoadingBayEnum.large);
        Arc.setFirstLoadingBay(bay);
        Arc.handlePlane(p);
        Maintenance maintenanceExpected = maintenance2;
        Maintenance maintenanceActual = bay.getMaintenance();

        assertEquals(maintenanceExpected, maintenanceActual); 
        }
        @Test
        public void getCleaning(){
          Plane p = new Plane(PlaneSizeEnum.large, 35, FuelEnum.Biokerosene, 67, RampEnum.Open, MaintenanceEnum.Medium, CleaningEnum.light);  
       
         Cleaning Cleaning1 = new Cleaning(CleaningEnum.biorisk);
         Cleaning Cleaning2 = new Cleaning(CleaningEnum.heavy);
         Cleaning Cleaning3 = new Cleaning(CleaningEnum.light);
         Cleaning Cleaning4 = new Cleaning(CleaningEnum.medium);
         
         Cleaning1.AddNext(Cleaning2);
         Cleaning2.AddNext(Cleaning3);
         Cleaning3.AddNext(Cleaning4);
         
        DeliveryVehicles manager = new DeliveryVehicles(null, Cleaning1, null, null, null);
        LoadingBay bay = new LoadingBay(LoadingBayEnum.large);
        Arc.setFirstLoadingBay(bay);
        Arc.handlePlane(p);
        Cleaning CleaningExpected = Cleaning3;
        Cleaning CleaningActual = bay.getCleaning();

        assertEquals(CleaningExpected, CleaningActual);
        }
     
}

// TODO add test methods here.
// The methods must be annotated with annotation @Test. For example:
//
// @Test
// public void hello() {}

