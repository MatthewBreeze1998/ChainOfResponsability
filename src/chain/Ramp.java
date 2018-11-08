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
public class Ramp extends NextCheck
{

    RampEnum r;

    public Ramp(RampEnum r)
    {
        this.r = r;
    }

    public NextCheck Handle(Plane plane)
    {
        if (r == plane.getRampType())
        {
            return this;
        } else if (next != null)
        {
            return next.Handle(plane);
        } else
        {
            return null;
        }
    }

    @Override
    public void AddNext(Chainable next)
    {
        if (next instanceof Ramp)
        {
            this.next = next;
        }
    }

}
