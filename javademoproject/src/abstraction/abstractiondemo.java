package abstraction;

public class abstractiondemo {
	public static void main(String[] args) {
		BMWThreeSeries b3=new BMWThreeSeries();
		b3.start();
		b3.accelarate();
		BMWFiveSeries b5=new BMWFiveSeries();
		b5.start();
		b5.accelarate();
		BMW bmw=new BMWThreeSeries();
		bmw.start();
		bmw.accelarate();
		
	}
}

abstract class BMW{
	void start() {
		System.out.println("bmw started");
		
	}
	abstract void accelarate();

}

class BMWThreeSeries extends BMW{

	@Override
	void accelarate() {
		System.out.println("three times accelaration");
		
	}
	
}
class BMWFiveSeries extends BMW{

	@Override
	void accelarate() {
		System.out.println("five times accelaration");
		
	}
	
}