package javademoproject;

public class javanonstaticdemo {
	public javanonstaticdemo(){
		System.out.println("from constructor");
	}
	{
		System.out.println("from non static block");
	}
	public static void main(String[] args) {
		System.out.println("from the main method");
		javanonstaticdemo jnsd=new javanonstaticdemo();
		
		
	}	
}
