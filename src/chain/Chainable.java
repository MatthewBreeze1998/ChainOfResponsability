/*
 * this sends all the information to the handlers and and passes plane
 * add next adds the chain to be checked 
 */
package chain;

/**
 *
 * @author t7077260 Mastthew Breeze
 */
public interface Chainable
{

    /**
     *
     * @param plane
     * @return the vehicle need for the job
     */
    public NextCheck Handle(Plane plane);

    /**
     * this is a add next this adds the next vehicle for checking
     * @param next
     */
    public void AddNext(Chainable next);

}
