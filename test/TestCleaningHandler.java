/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import chain.Cleaning;
import chain.CleaningEnum;
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
public class TestCleaningHandler 

{
    @Test
    public void addCleaningToChain()
    {
        
    
        
         Cleaning cleaning1 = new Cleaning(CleaningEnum.biorisk);
         Cleaning cleaning2 = new Cleaning(CleaningEnum.heavy);
         Cleaning cleaning3 = new Cleaning(CleaningEnum.light);
         Cleaning cleaning4 = new Cleaning(CleaningEnum.medium);
         
         cleaning1.AddNext(cleaning2);
         cleaning2.AddNext(cleaning3);
         cleaning3.AddNext(cleaning4);
    
        Cleaning cateringExpected = cleaning2;       
        Cleaning cateringActual = (Cleaning)cleaning1.getNext(); 
        assertEquals(cateringExpected, cateringActual);
    
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
