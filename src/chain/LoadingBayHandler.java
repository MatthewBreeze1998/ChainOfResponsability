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
public class LoadingBayHandler extends NextCheck
{
    LoadingBayEnum lb;
    PlaneSizeEnum ps;
     
    public LoadingBayHandler(LoadingBayEnum lb, PlaneSizeEnum ps) 
    {
        this.lb = lb;
        this.ps = ps;
    }

    /**
     *
     * @param plane
     * @return
     */
    public NextCheck Handle(Plane plane) 
    
    {
        {
        if(lb.equals(ps))
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


