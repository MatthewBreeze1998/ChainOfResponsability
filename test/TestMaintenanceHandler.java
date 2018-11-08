/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import chain.Maintenance;
import chain.MaintenanceEnum;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Matty
 */
public class TestMaintenanceHandler
{

    @Test
    public void addFuelToChain()
    {
        Maintenance maintenance1 = new Maintenance(MaintenanceEnum.High);
        Maintenance maintenance2 = new Maintenance(MaintenanceEnum.Low);
        Maintenance maintenance3 = new Maintenance(MaintenanceEnum.Medium);
        Maintenance maintenance4 = new Maintenance(MaintenanceEnum.severe);

        maintenance1.AddNext(maintenance2);
        maintenance2.AddNext(maintenance3);
        maintenance3.AddNext(maintenance4);

        Maintenance maintenanceExpected = maintenance4;
        Maintenance maintenanceActual = (Maintenance) maintenance3.getNext();

        assertEquals(maintenanceExpected, maintenanceActual);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
