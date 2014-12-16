import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
import org.asl.karelx.Squarebot;

public class TestChallenge2 {
	// TODO Complete the Horse class, provided

	public static void main(String[] args) {
		// TODO Load the "pasture" map at size 15 by 15
		// TODO Create an instance of a Horse inside the pasture
		// TODO Have the horse wander for 36 steps with a timer of 7
		// TODO Have the horse explode()
       Display.openWorld("maps/pasture.map");
       Display.setSize(15, 15);
       Display.setSpeed(10);
       
       Horse lily = new Horse(9,3);

	}

}
