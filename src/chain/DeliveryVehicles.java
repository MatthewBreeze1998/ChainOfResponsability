
package chain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author t7077260 Matthew Breeze
 */
public class DeliveryVehicles implements Chainable 
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
 
    @Override
    public void vehcial(LoadingBay plane) 
    {
        checkRamp();
    }

    @Override
    public void AddNext(LoadingBay next) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  public String checkRamp()
    {
       while(type.RAMP != null) 
       {
          
        
       
       }
       return type.RAMP.toString();
           
           
    }
   public String checkFuel()
    {
       while(type.RAMP != null) 
       {
          
        
       
       }
       return type.RAMP.toString();
    
    }    
   
   public String checkMaint()
    {
       while(type.RAMP != null) 
       {
          
        
       
       }
       return type.RAMP.toString();
    }
   
    public String checkClenaing()
    {
       while(type.RAMP != null) 
       {
          
        
       
       }
       return type.RAMP.toString();
    }
}
