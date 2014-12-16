import org.asl.karelx.Uberbot;
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

/**
 * Patrols an area defined by four beepers.
 * 
 */
public class Sentry extends Uberbot {

   public Sentry(){ 
      super(1,1, Display.NORTH, Display.INFINITY);
      }
      public Sentry(int x, int y)
      { 
         super(x, y, Display.NORTH, Display.INFINITY);
         }	
	/**
	 * Patrol an area in a clockwise direction.  
	 * 
	 * Move forward until next to a beeper then turn right.  Repeat indefinitely.
	 *
	 */
	public void patrol() {
        
   for(int k= 3; k <5;){
        
     while(!nextToABeeper()){
     		move();
      }
      
     while(nextToABeeper()){
     		turnLeft();
         move();
      }
     }
  }
}

