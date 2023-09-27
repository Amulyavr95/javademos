package threadingdemo;

public class DaemonThreadDemo {
	public static void main(String[] args) {
		Utils.printmessage(""+Thread.currentThread().isDaemon());
		Worker1 w1=new Worker1();
		w1.setDaemon(true);
		Utils.printmessage(""+w1.isDaemon());
		w1.start();
		
	}
}

class Worker1 extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			Utils.printmessage(""+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
