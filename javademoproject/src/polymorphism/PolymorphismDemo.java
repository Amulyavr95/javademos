package polymorphism;

public class PolymorphismDemo {
	public static void main(String[] args) {
		CompileTimePolymorphism ctp=new CompileTimePolymorphism();
		ctp.add(10, 20);
		ctp.add(1.3f,1.3f);
		ctp.add(10,20,30);
		ctp.add("x","y");
	}
}

class CompileTimePolymorphism{
	void  add(int a,int b) {
		 int result=a+b;
		 System.out.println("addition of 2numbers " +result);
		}
	void  add(float a,float b) {
		 float result=a+b;
		 System.out.println("addition of 2 non integers " +result);
		}
	void  add(int a,int b,int c) {
		 int result=a+b+c;
		 System.out.println("addition of 3 numbers " +result);
		}
	void  add(String a,String b) {
		 String result=a+b;
		 System.out.println("addition of 2 String " +result);
		}
	}

