package abstraction;

public class FinalKeywordDemo {
	public static void main(String[] args) {
		final int x=10;
		B b=new B();
		b.A();
	}
}

class A{
	final void A(){
		System.out.println("method A");
	}
}

class B extends A{
	
}