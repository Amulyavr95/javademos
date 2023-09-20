package encapsulation;

public class EncapsulationDemo {
	public static void main(String[] args) {
		Car car=new Car();
		car.setColor("black");
		System.out.println(car.getColor());
		System.out.println(car.getNumofwheels());
		
	}
}

 class Car{
	private String color;
	private int numofwheels;
	private boolean customisable;
	
	public Car() {
		setNumofwheels(4);
		setColor("white");
		customisable=false;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if(customisable)
			this.color = color;
	}

	public int getNumofwheels() {
		return numofwheels;
	}

	public void setNumofwheels(int numofwheels) {
		this.numofwheels = numofwheels;
	}
	
}