package threadingdemo;

public class DeadLockDemo {
	public static void main(String[] args) {
		FirstResource fr=new FirstResource();
		SecondResource sr=new SecondResource();
		
		ResourceWorker rs=new ResourceWorker(fr,sr);
		Thread t=new Thread(rs);
		t.start();
		sr.method1(fr);
		
		
	}
}
class ResourceWorker implements Runnable{
	FirstResource fr;
	SecondResource sr;
	ResourceWorker(FirstResource fr,SecondResource sr){
		this.fr=fr;
		this.sr=sr;
	}
	@Override
	public void run() {
		fr.method1(sr);
		
	}
	
}

class FirstResource {
	public 	void method1(SecondResource sr) {
		Utils.printmessage("inside first resource method1");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Utils.printmessage("invoking second resource method2");
		sr.method2();
		
		
	}
public 	void method2() {

		 Utils.printmessage("first resource method2");
	}
}
 class SecondResource {
	 
	 public  void method1(FirstResource fr) {
		 Utils.printmessage("inside second resource method1");
		 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 Utils.printmessage("invoking first resource method2");
		 fr.method2();
	 }
 public  void method2() {
	 Utils.printmessage("second resource method2");
 }
}