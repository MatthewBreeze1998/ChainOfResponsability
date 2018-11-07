 
import chain.Plane;
import chain.Chainable;
import chain.Fuel;
import chain.FuelEnum;

/*
import uk.ac.tees.standard.cor1.username.Malfunction;
import uk.ac.tees.standard.cor1.username.Severity;
import uk.ac.tees.standard.cor1.username.ServiceRobot;
import uk.ac.tees.standard.cor1.username.FileUtility;
import uk.ac.tees.standard.cor1.username.SpaceMonkey;
import uk.ac.tees.standard.cor1.username.Engineer;
import java.io.File;
import org.junit.Test;
import uk.ac.tees.standard.cor1.username.Captain;
import uk.ac.tees.standard.cor1.username.Captain;
import uk.ac.tees.standard.cor1.username.Engineer;
import uk.ac.tees.standard.cor1.username.Engineer;
import uk.ac.tees.standard.cor1.username.Malfunction;
import uk.ac.tees.standard.cor1.username.Malfunction;
import uk.ac.tees.standard.cor1.username.ServiceRobot;
import uk.ac.tees.standard.cor1.username.ServiceRobot;
import uk.ac.tees.standard.cor1.username.Severity;
import uk.ac.tees.standard.cor1.username.Severity;
import uk.ac.tees.standard.cor1.username.SpaceMonkey;
import uk.ac.tees.standard.cor1.username.SpaceMonkey;
import java.io.File;
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matty
 */
public class PlaneHandler 
{
  // Instanciate malfunction handlers
        final  Fuel sm = new Fuel(FuelEnum.Jetfuel) ;
        final ServiceRobot sr = new ServiceRobot(Severity.LOW);
        final Engineer e = new Engineer(Severity.MEDIUM);
        final Captain c = new Captain(Severity.HIGH);
        
        // Construct chain of responsibility
        sm.setNextHandler(sr); 
        sr.setNextHandler(e);
        e.setNextHandler(c);
        
        // Create malfunctions
        final Plane m1 = new Plane(Severity.HIGH, "Life support error. Oxygen "
                 + "Recycling unit damaged, running at half efficiency");      
        final Plane m2  = new Plane(Severity.LOW, "Communications error. Cannot "
                + "find Jazz FM");
        final Plane m3 = new Plane(Severity.MEDIUM, "Power supply error. Solar Panel "
                + "2 damaged, running at 31.3333% efficiency");
        final Plane m4 = new Plane(Severity.MEDIUM, "Thermal regulation error. Sensor "
                + "damaged, manual temperature regulation needed");
        final Plane m5 = new Plane(Severity.TRIVIAL, "Trash can full on C-Desk.");
        final Plane m6 = new Plane(Severity.LOW, "Shower plug hole full of monkey hair");
        final Plane m7 = new Plane(Severity.HIGH, "Proximity alert. Collision imminent");
        
        // Clean log file
        FileUtility.resetFile(new File("log-cor1.txt"));
        
        // Process malfunctions
        sm.PlaneLanding(m1);
        sm.PlaneLanding(m2);
        sm.PlaneLanding(m3);
        sm.PlaneLanding(m4);
        sm.PlaneLanding(m5);
        sm.PlaneLanding(m6);
        sm.PlaneLanding(m7);
        
        // Check log file
        //final String actualOutput = FileUtility.readFile(new File("log-cor1.txt"));
       // final String expectedOutput = FileUtility.readFile(new File("expected-cor1.txt"));
        //assertEquals(actualOutput, expectedOutput);   
}
