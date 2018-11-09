/*
 * creates first loading bay then use loading bay to get the first vehicle in the chain
 */
package chain;

/**
 *
 * @author t7077260
 */
public class Arc
{

    static LoadingBay FirstLoadingBay;

    /*
    * creates link to loading bay
    * allowes acces to first loading bay and allow the chainto start
     */

    /**
     *creates link to loading bay
     *allowes acces to first loading bay and allow the chainto start
     * @param FirstLoadingBay
     */

    public static void setFirstLoadingBay(LoadingBay FirstLoadingBay)
    {
        Arc.FirstLoadingBay = FirstLoadingBay;

        /*
         * sets first loading bad
         */
    }

    /**
     * handles the plane and gets the first of all the vehicles
     * @param plane
     */
    public static void handlePlane(Plane plane)
    {
        if (FirstLoadingBay != null)
        {
            /*
            * checks loading bays is not empty
             */
            LoadingBay fl = (LoadingBay) FirstLoadingBay.Handle(plane);

            fl.getVehicals();

        }

    }

}
