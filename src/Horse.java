import org.asl.karelx.Wanderer;
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

/**
 * Represents a horse wandering around aimlessly in a pasture
 *@ChloeFink
 *@16.12.14
 */
public class Horse extends Wanderer {

	public Horse()
  {
     super(1, 1);
  }
   public Horse(int c, int t)
  {
     super(c, t);
  }
  
	public void wander(int count, int timer) {
   
      int k = 1;
      int numTimes = count/ timer;
      
      for (int j = 1; j <= numTimes; j++) 
      {
		   while (k <= timer && k <= count) 
     {
      wander();
      k++;
     }
      putBeeper();
      k = 1;
     }
	}
}
