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
public class Fuel extends NextCheck 
{

    
    
    FuelEnum r; 

    public Fuel() 
    {
     this.r = r;
    
    }

   
    
    
    @Override
    public NextCheck Handle(Plane plane) 
    {
        
        if(plane.getFuel() < 100)
        {
            if(r == plane.getFuelType())
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
        else
        {
            return null;
        }
        
    
    }
    
    

    
    @Override
    public void AddNext(Chainable next) 
    {
        if(next instanceof Ramp)
        {
            this.next = next;
        }
    }
      
    
    
}
