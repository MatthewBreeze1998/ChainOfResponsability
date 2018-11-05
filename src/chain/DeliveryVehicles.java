
package chain;



/**
 *
 * @author t7077260 Matthew Breeze
 */
public class DeliveryVehicles  
{
  Ramp firstRamp;

    public DeliveryVehicles(Ramp firstRamp) {
        this.firstRamp = firstRamp;
        
   }
 public Ramp getRamp(Plane plane)
 {
     
     return (Ramp) firstRamp.Handle(plane);
 
 }
}
