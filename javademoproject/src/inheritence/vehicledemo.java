package inheritence;

public class vehicledemo {
	public static void main(String[] args) {
		Vehicle v = new Car();
		System.out.println(v.fuel());
		Bus bus =new Bus();
		System.out.println(bus.fuel());
		Bike bike = new Bike();
		System.out.println(bike.fuel());
		
		}
}

class Vehicle{
	String fuel() {
		return     "petrol";
	}
}

class Car extends Vehicle{
	 String fuel(){
		return "petrol";
	}
}

class Bus extends Vehicle{
	 String fuel(){
			return "desiel";
		}
}

class Bike extends Vehicle{
	
}