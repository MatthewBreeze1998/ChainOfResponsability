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
public class LoadingBay 
{       
 
  DeliveryVehicles manager;
  Boolean isAval ;  
  Plane plane ;
  String location;
  Ramp ramp; 
  Cleaning clenaing;
  Fuel fuel;
  Maintenance maintenance;
  Catering catering;
  
  LoadingBayEnum r;

    public LoadingBay() 
    {
        this.r = r;
    }
  
    public LoadingBay(String location) 
    {
        this.location = location;
    }

    public void getRamp()
    {
        ramp = manager.getRamp(plane);
    }
     
    public void getCleaning()
    {
        clenaing = manager.getCleaning(plane);
    }
    public void getfuel()
    {
        fuel = manager.getFuel(plane);
    }
    public void getMaintenance()
    {
        maintenance = manager.getMaintenance(plane);
    }
    public void getCatering()
    {
        catering = manager.getCatering(plane);
    }
    
}
