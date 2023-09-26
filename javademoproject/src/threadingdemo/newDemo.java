package threadingdemo;

public class newDemo {
	public static void main(String[] args) {
		for(int i=0;i<=10;i++) {
			Utils.printmessage("numbers= "+i);
		}
		even e=new even();
		Thread t1=new Thread(e);
		t1.setName("T1");
		t1.start();
		
		odd o=new odd();
		Thread t2=new Thread(o);
        t2.setName("T2");
		t2.start();
	}
}

class odd implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			if(i%2!=0) {
				Utils.printmessage("odd= "+i);
			}
		}
		
	}
	
	
}
class even implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			if(i%2==0) {
				Utils.printmessage("even= "+i);
			}
		}
		
	}
	
	
}