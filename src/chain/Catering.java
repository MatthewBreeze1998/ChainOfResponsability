/*
 * Catering handler
 * uses the Catering tpye chcek the plane against the Catering vehicle 
 * then adds next if not correct 
 */
package chain;

/**
 *
 * @author t7077260 Matthew Breeze 
 */
public class Catering extends NextCheck
{
    /**
    * This is the amount if food the truck has
    */
    int foodqty;
    /**
     * 
     * @param foodqty this gets the amount of food of the truck 
     */
    public Catering(int foodqty)
    {
        this.foodqty = foodqty;
    }

    /**
     *
     * @param plane
     * @return retuns the correct catering vehicle
     */
    @Override
    public NextCheck Handle(Plane plane)
    {
        {
            /**
             * this checks to see if the catering truck has enough food for the plane
             */
            if (plane.getMaxFood() - plane.getFoodQty() < foodqty)
            {
                /**
                 * returns the truck
                 */
                return this;
            } 
            /**
             * this returns handle is the next catering is null
             */
            else if (next != null)
            {
                /**
                 * returns handle plane
                 */
                return next.Handle(plane);
            } 
            /**
             * returns null if the plane cant be seen by any trucks
             */
            else
            {
                /**
                 * return null
                 */
                return null;
            }
        }

    }

    /**
     * this gets the next truck to check
     * @param next 
     * this returns the next catering truck in the chain
     */
    @Override
    public void AddNext(Chainable next)
    {
        /**
         * check id there is another catering truck
         */
        if (next instanceof Catering)
        {
            /**
             * gets the next catering in chain
             */                          
            this.next = next;
        }
    }
}
