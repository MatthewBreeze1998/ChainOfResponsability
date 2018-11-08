/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import chain.Catering;
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
public class TestCateringHandler
{

    @Test
    public void addCateringToCahin()
    {
        Catering catering1 = new Catering(57);
        Catering catering2 = new Catering(100);

        catering1.AddNext(catering2);

        Catering cateringExpected = catering2;

        Catering cateringActual = (Catering) catering1.getNext();

        assertEquals(cateringExpected, cateringActual);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
