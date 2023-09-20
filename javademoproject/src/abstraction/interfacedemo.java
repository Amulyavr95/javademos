package abstraction;

public class interfacedemo {
	public static void main(String[] args) {
		Honda honda = new Honda();
		honda.go();
		honda.stop();
	}
}

interface Car{
	void go();
	void stop();
}

class Honda implements Car{

	@Override
	public void go() {
		System.out.println("inside Honda.go()");
		
	}

	@Override
	public void stop() {
		System.out.println("inside Honda.stop()");	
		
	}
	
}