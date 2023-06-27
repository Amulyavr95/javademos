package javademoproject;

public class demo3 {
	public static void main(String[] args) {
		System.out.println("from the main method");
		method1();
		method2();
		demo3 dem3 = new demo3();
		dem3.method3();
	}	
	static void method1(){
		System.out.println("from the static block1");
		
	
	}
	static void method2(){
		System.out.println("from the static block2");
		
		
		}
	void method3() {
		System.out.println("from the static block2");
	}
}
