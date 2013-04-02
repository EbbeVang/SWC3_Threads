public class JoiningThreads {
	PrintThread p1 = new PrintThread("first thread");
	PrintThread p2 = new PrintThread("second thread");
	
	public synchronized void DoStuff(){
		
	}
}

class PrintThread extends Thread{
	
	private String name;
	
	public PrintThread(String name){
		this.name = name;
	}
	
	public void run(){
		for (int i=0; i<1000; i++){
			System.out.println(name);
		}
	}
	
}

class OtherPrintThread extends Thread{
	
	private String name;
	
	public OtherPrintThread(String name){
		this.name = name;
	}
	
	public void run(){
		//p1.join();
		for (int i=0; i<1000; i++){
			System.out.println(name);
		}
	}
	
}
