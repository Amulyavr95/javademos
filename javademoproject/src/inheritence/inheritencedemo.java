package inheritence;

public class inheritencedemo {
	public static void main(String[] args) {
		JDK8 jdk8=new JDK8();
		jdk8.f1();
		
	}
}
	
	class JDK6{
		JDK6(){
		System.out.println("from jdk6");
		}
		void f1(){
			System.out.println("from f1");
		}
	}
	class JDK7 extends JDK6{
		JDK7(){
			System.out.println("from jdk7");
			}
		void f2(){
			System.out.println("from f2");
		}
		
	}
	class JDK8 extends JDK7{
		JDK8(){
			System.out.println("from jdk8");
			}
		void f3(){
			System.out.println("from f3");
		}
	}


