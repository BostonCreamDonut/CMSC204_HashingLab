import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;

public class CarQueue {
	private Random randInt;
	private Queue<Integer> queuer;
	public CarQueue() {
		queuer = new ArrayDeque<Integer>();
		randInt = new Random();
		queuer.add(randInt.nextInt(4));
		queuer.add(randInt.nextInt(4));
		queuer.add(randInt.nextInt(4));
		queuer.add(randInt.nextInt(4));
		queuer.add(randInt.nextInt(4));
		queuer.add(randInt.nextInt(4));
		
	}

	public void addToQueue() {
		// TODO Auto-generated method stub
		class cQueue implements Runnable{

			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true) {
					try {
						queuer.add(randInt.nextInt(4));
						Thread.sleep(100);
					}
					catch(Exception e) {
						e.printStackTrace();
					}
				}
			}
			
		}
		cQueue carQ = new cQueue();
		Thread t = new Thread(carQ);
		t.start();
	}

	public int deleteQueue() {
		// TODO Auto-generated method stub
		return queuer.remove();
	}

}