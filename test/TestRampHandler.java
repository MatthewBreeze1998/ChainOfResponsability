/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import chain.Ramp;
import chain.RampEnum;
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
public class TestRampHandler
{

    @Test
    public void addRampToCahin()
    {
        Ramp ramp1 = new Ramp(RampEnum.Closed);
        Ramp ramp2 = new Ramp(RampEnum.Open);

        ramp1.AddNext(ramp2);

        Ramp rampExpected = ramp2;
        Ramp rampActual = (Ramp) ramp1.getNext();

        assertEquals(rampExpected, rampActual);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
