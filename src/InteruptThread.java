
public class InteruptThread {

	public static void main(String[] args) throws InterruptedException {
		InteruptedThread thread = new InteruptedThread();
		thread.start();
		
		Thread.sleep(5000);
		thread.interrupt();
		}
	
	
}

class InteruptedThread extends Thread{

	boolean ThreadDone = false;
	
	@Override
	public void run() {		
		int i = 0;
		while(!ThreadDone){
			System.out.println("printing like crazy" + i++);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				ThreadDone = true;
			}
		}
			
	}
		
		
}
	

