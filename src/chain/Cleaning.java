/*
* Cleaning handler
 * uses the Cleaning tpye enum to chcek the plane against the enum
 * then adds next if not correct 
 */
package chain;

/**
 *
 * @author t7077260 Matthew breeze
 */
public class Cleaning extends NextCheck
{
    
    CleaningEnum r;

    /**
     * constructor for cleaning enum
     * @param r
     */
    public Cleaning(CleaningEnum r)
    {
        this.r = r;
    }

    /**
     * this checks the planes cleaning state then checked with the vehicles 
     * @param plane
     * @return Cleaning 
     */
    @Override

    public NextCheck Handle(Plane plane)

    {
        {
            if (r == plane.getCleaning())
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
        if (next instanceof Cleaning)
        {
            this.next = next;
        }
    }
}
