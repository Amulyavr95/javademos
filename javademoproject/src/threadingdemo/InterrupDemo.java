package threadingdemo;

public class InterrupDemo {
	public static void main(String[] args) {
		
		Utils.printmessage("start");
		Thread t=new Thread(new worker() );
		t.start();
		try {
			Thread.sleep(3000);
			t.interrupt();
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		Utils.printmessage("end");
	}
}

class worker implements Runnable{

	@Override
	public void run() {
		Utils.printmessage("start");
		for(int i=1;i<=10;i++) {
		Utils.printmessage(""+i);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			Utils.printmessage("thread inturrupted");
		}
		}
		Utils.printmessage("end");
	}
	
}