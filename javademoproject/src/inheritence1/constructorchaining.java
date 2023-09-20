package inheritence1;

public class constructorchaining {
	public static void main(String[] args) {
		ChildClass cc= new ChildClass(10);
		
	}
}

class SuperClass{
	int x;
	SuperClass(){
		System.out.println("no args super class constructor");
	}
	SuperClass(int x){
		this.x=x;
		System.out.println("one arg super clss constructor");
	}
	
}

class ChildClass extends SuperClass{
	ChildClass(){
		this(10);
		System.out.println("no args child class constructor");
	}
	ChildClass(int y){
		super(y);
		System.out.println("one args child class constructor");
	}
	
}