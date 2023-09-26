package threadingdemo;

public class ThreadCommunicationDemo {
	public static void main(String[] args) throws InterruptedException {
		MyThread mt= new MyThread();
		Thread t= new Thread(new MyThread());
		t.setName("T1");
		t.start();
		synchronized(t) {
			Utils.printmessage("going to wait");
			t.wait();
			Utils.printmessage("notified");
			//t.sleep(1000);
			Utils.printmessage("total= "+mt.total);
		}
		
		
	}
}

class MyThread implements Runnable{
	int total;
	@Override
	public void run() {
		Utils.printmessage("calculating sum");
		synchronized(this) {
			
		for(int i=1;i<=100;i++) {
			total+=i;
			
		}
		
		Utils.printmessage(""+total);
		Utils.printmessage("calculation completed notify...");
		this.notify();
	}
		
		
	}
	public int getTotal() {
		return total;
	}
	
}