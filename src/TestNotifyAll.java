public class TestNotifyAll {
	public static void main(String[] args) throws InterruptedException {
		TestThread t1 = new TestThread("t1");
		t1.start();
		
		TestThread t2 = new TestThread("t2");
		t2.start();
		
		Thread.sleep(5000);
		
	}
}

	class TestThread extends Thread{
		private String name;
		
		public TestThread(String name) {
			this.name = name;
		}
		
		@Override
		public void run() {
			super.run();
			try {
				wait();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			while (true){
				try {
					Thread.sleep((int)(Math.random()*500));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(name+": blah blah blah...");
				
			}
			
		}
	}
