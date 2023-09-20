package inheritence1;

public class overridingdemo {
	public static void main(String[] args) {
//		Car car=new Car();
//		car.fuel();
		Bus bus =new Bus(1, 2, 0, 0);
		bus.fuel();
	}
}

class Vehicle{
	int a,b;
	
	Vehicle(int a,int b){
		this.a=a;
		this.b=b;
	}
	void  fuel() {
		System.out.println("petrol");
	}
	
}

class Bus extends Vehicle{
	int c,d;
	Bus(int a,int b,int c,int d){
		super(a,b);
		this.c=c;
		this.d=d;
	}
	void  fuel() {
		System.out.println("diesel");
	}
}

//class Car extends Vehicle{
//	
//}
//
//class Bike extends Vehicle{
//	
//}
