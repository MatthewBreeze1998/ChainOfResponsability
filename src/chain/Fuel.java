/*
 * Fuel handler
 * uses the Fuel tpye enum to chcek the plane against the enum
 * then adds next if not correct
 */
package chain;

/**
 *
 * @author t7077260
 */
public class Fuel extends NextCheck
{

    FuelEnum r;

    /**
     * gets the fuel enum so we can check the states of the fuel
     * @param fuelEnum
     */
    public Fuel(FuelEnum fuelEnum)
    {
        this.r = fuelEnum;
    }

    /**
     * this checks the plains needs against the trucks
     * @param plane
     * @return fuel truck
     */
    @Override
    public NextCheck Handle(Plane plane)
    {

        if (plane.getFuel() < 100)
        {
            if (r == plane.getFuelType())
            {
                return this;
            } else if (next != null)
            {
                return next.Handle(plane);
            } else
            {
                return null;
            }
        } else
        {
            return null;
        }

    }

    @Override
    public void AddNext(Chainable next)
    {
        if (next instanceof Fuel)
        {
            this.next = next;
        }
    }
}
