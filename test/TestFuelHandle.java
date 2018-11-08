/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import chain.Fuel;
import chain.FuelEnum;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author t7077260
 */
public class TestFuelHandle {
    
    public TestFuelHandle() {
    }

    @Test
    public void addFuelToCahin()
    {
        Fuel truck1 = new Fuel(FuelEnum.Jetfuel);
        Fuel truck2 = new Fuel(FuelEnum.Aviationgasoline);
        Fuel truck3 = new Fuel(FuelEnum.Kerosenegasoline);
        Fuel truck4 = new Fuel(FuelEnum.Jetfuel);
        
        truck1.AddNext(truck2);
        truck2.AddNext(truck3);
        truck3.AddNext(truck4);
        
        Fuel truckExpected = truck3;
        
        Fuel truckActual = (Fuel)truck2.getNext();
        
        assertEquals(truckExpected, truckActual);
    }
    
    
 
}
