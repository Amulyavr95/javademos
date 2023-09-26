package threadingdemo;

public class RunnableDemo {
	public static void main(String[] args) {
		Utils.printmessage("begin main");
		ImageProccessor ip=new ImageProccessor();
		Thread t=new Thread(ip);
		t.start();
		Thread t1=new Thread(new Runnable() {

			@Override
			public void run() {
				Utils.printmessage("do some work");
				
			}
			
		});
		t1.start();
		Utils.printmessage("end main");
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
	}
	
}

class ImageProccessor implements Runnable{

	@Override
	public void run() {
		Utils.printmessage("proccessing an image");
		
	}
	
}