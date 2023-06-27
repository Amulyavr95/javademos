package javademoproject;

public class javanonstaticdemo {
	
	{
		System.out.println("from non static block");
	}
	public static void main(String[] args) {
		System.out.println("from the main method");
		javanonstaticdemo jnsd1=new javanonstaticdemo();
		javanonstaticdemo jnsd2=new javanonstaticdemo();
		
		Car mycar=new Car();
		System.out.println(mycar.wheels);
		System.out.println(Car.manufacturer);
	}	
	
}
