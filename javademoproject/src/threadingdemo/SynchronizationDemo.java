package threadingdemo;

public class SynchronizationDemo {
	public static void main(String[] args) {
		Monitor mon =new Monitor();
		Thread t1=new Thread(new MonitorWorker(mon,"Steve"));
		t1.setName("T1");
		Thread t2=new Thread(new MonitorWorker(mon,"roger"));
		t2.setName("T2");
		t1.start();
		t2.start();
	}
}

class MonitorWorker implements Runnable{
	Monitor monitor;
	String name;
	MonitorWorker(Monitor monitor,String name){
		this.monitor=monitor;
		this.name=name;
	}

	@Override
	public void run() {
		
		monitor.displayGreeting(name);
	}
	
}

class Monitor {
	public synchronized void displayGreeting(String name) {
		for(int i=1;i<=10;i++)
		
		Utils.printmessage(i+" how are you "+name+"?");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}