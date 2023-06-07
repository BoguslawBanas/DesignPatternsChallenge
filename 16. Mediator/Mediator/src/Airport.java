import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class Airport implements Mediator {
	private Runaway r;
	private Queue<Aircraft> landingQueue=new ArrayDeque<>();

	public Airport(Runaway r) {
		this.r = r;
	}

	public void inform() throws InterruptedException{
		while(!landingQueue.isEmpty()){
			System.out.println("Uwaga za chwile bedzie ladowanie.");
			informRunaway();
			informAircraft();
			System.out.println();
		}
	}
	
	private void informRunaway() throws InterruptedException {
		r.waitToCleanRunaway();
	}
	
	private void informAircraft() {
		landingQueue.peek().land();
		landingQueue.remove();
	}

	public void addToLandingQueue(Aircraft a){
		landingQueue.add(a);
	}
}
