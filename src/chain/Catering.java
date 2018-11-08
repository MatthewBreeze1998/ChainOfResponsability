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
public class Catering extends NextCheck
{

    int foodqty;

    public Catering(int foodqty) {
        this.foodqty = foodqty;
    }
    
    /**
     *
     * @param plane
     * @return
     */
    @Override
    public NextCheck Handle(Plane plane) 
    {
        {
        
            
        if(plane.getMaxFood()-plane.getFoodQty() < foodqty)
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
    @Override
    public void AddNext(Chainable next) 
    {
        if(next instanceof Catering)
        {
            this.next = next;
        }
    }
}
