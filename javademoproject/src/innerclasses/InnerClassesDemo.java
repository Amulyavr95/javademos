package innerclasses;

public class InnerClassesDemo {
	public static void main(String[] args) {
		ElectronicDevice.powerOn();
		ElectronicDevice.Chip.DisplayBrand();
		
		ElectronicDevice.Chip chip=new ElectronicDevice.Chip();
		chip.spec();
		
		ElectronicDevice laptop=new ElectronicDevice();
		
		ElectronicDevice.Proccessor proc = laptop.new Proccessor();
		proc.getVoltage();
		ElectronicDevice.Proccessor.displaay();
	}
	
	
}

class ElectronicDevice{
	
	static void powerOn() {
		System.out.println("power on....");
	}
	
	static class Chip{
		static void DisplayBrand() {
			System.out.println("sony...");
		}
		
		void spec(){
			System.out.println("specification for this chip....");
		}
	}
	
	class Proccessor{
		void getVoltage() {
			System.out.println("display voltage on processor");
		}
		
		static void displaay() {
			System.out.println("sfdsredrd");
		}
	}
}
