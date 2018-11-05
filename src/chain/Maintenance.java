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
public class Maintenance extends Vehical 
{

    MaintenanceEnum r;

    public Maintenance(MaintenanceEnum r) {
        this.r = r;
    }
    
    
    @Override
    public Vehical Handle(Plane plane) 
    {
       {
        if(r == plane.getMaintenance())
        {
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
    
}
