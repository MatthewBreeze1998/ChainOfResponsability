
package chain;


import java.util.List;
import chain.Plane.*;
/**
 *
 * @author t7077260 Matthew Breeze
 */
public class DeliveryVehicles extends Plane implements Chainable  
{
    
    public VehicleType type;
    public String destination;
    public boolean isAvailable;
    
    
    public DeliveryVehicles(VehicleType type) 
    {
        this.type = type;
        this.isAvailable = true;
     
    }
 
    @Override
    public void vehcial(LoadingBay plane) 
    {
        checkRamp();
        checkFuel();
    }

    @Override
    public void AddNext(LoadingBay next) {
        
    }

  public String checkRamp()
    {     
    
        this.getRampType();
    
     while(this.getRampType() != null)
     {
         
         
     
     
     
     
     
     }
     
       return "";     
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
