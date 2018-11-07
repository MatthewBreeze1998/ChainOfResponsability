
import chain.Plane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matty
 */
public class Planetest 
{

   
    public planeTest()
    {
        /**
     * Testing constructor, should assign default description if null.
     */
    @Test
    public void testNullDescription() {
            final Plane m = new Plane(Severity.HIGH, null);
            final String expectedOutcome = "No description available. Probably serious.";
            final String actualOutcome = m.getDescription();
            assertEquals(expectedOutcome, actualOutcome);
        }

        /**
         * Testing constructor, should assign default description if empty string.
         */
        @Test
        public void testEmptyDescription() {
            final Malfunction m = new Malfunction(Severity.HIGH, "");
            final String expectedOutcome = "No description available. Probably serious.";
            final String actualOutcome = m.getDescription();
            assertEquals(expectedOutcome, actualOutcome);
    }    
 
    }
    
}
    
