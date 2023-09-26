package threadingdemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFrameworkDemo {
	public static void main(String[] args) {
		VedioProccessorTask[]task= {
				new VedioProccessorTask("bank"),
				new VedioProccessorTask("school"),
				new VedioProccessorTask("conferance"),
				new VedioProccessorTask("homesecurity")
		};
		ExecutorService newFixedThreadPool=Executors.newFixedThreadPool(4);
		for(VedioProccessorTask vptask : task) {
			newFixedThreadPool.submit(vptask);
		}
		newFixedThreadPool.shutdown();
	}
	
}

class VedioProccessorTask implements Runnable{
	String sourceName;
	public VedioProccessorTask(String sourceName) {
		this.sourceName=sourceName;
		
	}
	@Override
	public void run() {
		
		Utils.printmessage("proccessing vedio from "+sourceName+" started...");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Utils.printmessage("proccessing vedio from "+sourceName+" ended...");
	}
	
}