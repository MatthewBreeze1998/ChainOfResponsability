/*
 * maintence handler
 * uses the maintence tpye enum to chceck the plane against the enum
 * then adds next if not correct
 */
package chain;

/**
 *
 * @author Matthew Breeze t7077260
 */
public class Maintenance extends NextCheck
{

    MaintenanceEnum r;

    /**
     * MaintenanceEnum constructor
     * @param r
     */
    public Maintenance(MaintenanceEnum r)
    {
        this.r = r;
    }

    /**
     *
     * @param plane
     * @return the best Maintenance vehicle in the chain best for the job
     */
    @Override
    public NextCheck Handle(Plane plane)
    {
        {
            if (r == plane.getMaintenance())
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
    }

    @Override
    public void AddNext(Chainable next)
    {
        if (next instanceof Maintenance)
        {
            this.next = next;
        }
    }
}
