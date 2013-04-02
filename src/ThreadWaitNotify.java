
public class ThreadWaitNotify {
	public static void main(String[] args) throws InterruptedException {
		MyThread t = new MyThread();
		t.start();
		Thread.sleep(3000);
		synchronized (t) {
			t.notify();
		}
		
	}
}
class MyThread extends Thread {

		public synchronized void run() {
			System.out.println("The thread is waiting....");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("done waiting...");
		}
		
	
}

