
package chain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author t7077260 Matthew Breeze
 */
public class DeliveryVehicles 
{
    ArrayList<DeliveryVehicles> vehicles = new ArrayList<DeliveryVehicles>();
    public VehicleType type;
    public String destination;
    public boolean isAvailable;

    
    public DeliveryVehicles(VehicleType type) 
    {
        this.type = type;
        this.isAvailable = true;
        vehicles.add(this);
    }
    
    public String checkRamp()
    {
       while(type.RAMP != null) 
       {
          
           if(this.type.RAMP.)
           {
               
           }
       
       }
       return type.RAMP.toString();
           
           
    }
   
    
}
