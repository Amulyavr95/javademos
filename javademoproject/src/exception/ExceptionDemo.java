package exception;
import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
//		divideByZeroDemo();
//		stringParserDemo();
		multiplecatchDemo();
	}

//	private static void stringParserDemo() {
//		String s = "hello";
//		try {
//			int i = Integer.parseInt(s);
//			System.out.println(i);
//		} catch (Exception e) {
//			System.out.println("exception" + e.getMessage());
//		}
//	}

	private static void multiplecatchDemo() {
		
		try {
			String s = "5";
			int i = Integer.parseInt(s);
			System.out.println(i);
			
			String t= "null";
			System.out.println("length"+t.length());
			
		}catch(NumberFormatException nfe) {
			System.out.println("exception"+nfe.getMessage());
		}
		catch(NullPointerException npe) {
			System.out.println("exception"+npe.getMessage());
		}
		catch(Exception e) {
			System.out.println("exception"+e.getMessage());
		}
		
	}

//	private static void divideByZeroDemo() {
//		int a, b, c, d;
//		System.out.println("enter two number to divide");
//		Scanner sc = new Scanner(System.in);
//		a = sc.nextInt();
//		System.out.println("the value input by user " + a);
//		System.out.println("enter one more");
//		b = sc.nextInt();
//		try {
//			c = a / b;
//			d = a % b;
//			System.out.println("division " + c + "and reminder" + d);
//		} catch (Exception e) {
//			System.out.println("exception occurred " + e.getMessage());
//		}
//	}
}
