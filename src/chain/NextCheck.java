/*
 * to check get next vehicle
 * add the next vehcial to the chain 
 */
package chain;

/**
 *
 * @author Matthew Breze t7077260
 */
public abstract class NextCheck implements Chainable
{

    String location;
    Chainable next;

    /**
     * gets the next vehicle
     * @return next vehicle in the chain for all the vehicle
     */
    public Chainable getNext()
    {
        return next;
    }

    /**
     * adds the next Vehicle to handler to be checked against the plane 
     * @param next
     */
    @Override
    public void AddNext(Chainable next)
    {
        this.next = next;
    }

}
