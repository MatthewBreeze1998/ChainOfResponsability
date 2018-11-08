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
public class Arc
{

    static LoadingBay FirstLoadingBay;

    /*
    * creates link to loading bay
    * allowes acces to first loading bay and allow the chainto start
     */
    public static void setFirstLoadingBay(LoadingBay FirstLoadingBay)
    {
        Arc.FirstLoadingBay = FirstLoadingBay;

        /*
        * sets first loading bad
         */
    }

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
