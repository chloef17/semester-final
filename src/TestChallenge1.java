import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
import org.asl.karelx.Squarebot;

/**
 * Read and implement all of the TODO items in the main method, below.
 *@chloeF
 *@16.12.14
 * 
 */
public class TestChallenge1 {
	// TODO Complete the provided Sentry class by implementing its patrol() method

	public static void main(String[] args) {
       Display.setSize(15, 15);
       Display.setSpeed(10);
       
       Squarebot lily = new Squarebot(9,3);
       lily.layCorners(5);
       
       Sentry john = new Sentry(9,3);
       john.move();
       john.patrol();
              
       }
             }
   
   // TODO Create a Squarebot and have it place beepers at the corners of a rectangle
		//   	with bottom right corner at (9, 3) and sized for 5 beepers on each side (see picture)
		// TODO Create a Sentry and have it patrol clockwise around the beepers, indefinitely
