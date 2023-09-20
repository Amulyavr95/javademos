package inheritence1;

public class MultipleInheritence {
	public static void main(String[] args) {
		TV tv=new TV();
		tv.powerOn();
		Monitor monitor =new Monitor();
		monitor.powerOn(); 
		DesktopComputer dc= new DesktopComputer();
		dc.Start();
	}
}

class ElectronicDevice{
	void powerOn() {
		System.out.println("device powered on");
	}
}

class TV extends ElectronicDevice{
	void powerOn() {
		System.out.println("TV guide screen displayed");
	}
}

class Monitor extends ElectronicDevice{
	void powerOn() {
		System.out.println("black screen displayed");
	}
}

class DesktopComputer implements I1,I2{

	@Override
	public void Start() {
		
		I1.super.Start();
		I2.super.Start();
	}
	
}