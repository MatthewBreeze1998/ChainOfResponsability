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
public class LoadingBay extends NextCheck
{       
 
  //DeliveryVehicles manager;
  Boolean isAval ;  
  Plane plane;
  String location;
  Ramp ramp; 
  Cleaning clenaing;
  Fuel fuel;
  Maintenance maintenance;
  Catering catering;
  LoadingBayEnum size;

    public LoadingBay(LoadingBayEnum size) 
    {
        this.size = size;
    }
  
    public LoadingBay(String location) 
    {
        this.location = location;
    }

    public Ramp getRamp()
    {
        return ramp;
    }
     
    public Cleaning getCleaning()
    {
        return clenaing;
    }
    public Fuel getfuel()
    {
        return fuel;
    }
    public Maintenance getMaintenance()
    {
        return maintenance;
    }
    public Catering getCatering()
    {
        return catering;
    }
    
    public void getVehicals()
    {
        if(plane != null)
        {
            ramp = DeliveryVehicles.getRamp(plane);
            clenaing = DeliveryVehicles.getCleaning(plane);
            fuel = DeliveryVehicles.getFuel(plane);
            maintenance = DeliveryVehicles.getMaintenance(plane);
            catering = DeliveryVehicles.getCatering(plane);
            
        }
    }

    @Override
    public NextCheck Handle(Plane plane) 
    {
        if(size.ordinal() == plane.getPlaneSize().ordinal())
        {
            this.plane = plane;
            return this; 
        }
        else if(next != null) 
        {
           return next.Handle(plane);
        }
        else
        {
            return null;
        }
        
    }
    
}
