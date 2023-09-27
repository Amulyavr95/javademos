package functionalprogramming;

import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
//		Predicate<Integer> gt20=(i)->(i>20);
//		System.out.println("is 15 greater than 20 "+gt20.test(15));
//		
//		Predicate<String> stringlenthgreaterthan5=(s)->(s.length()>5);
//		System.out.println("is hello world length is greater "+stringlenthgreaterthan5.test("hello world"));
//		Predicate<Integer> gt10=(i)->(i>10);
//		int x[]= {10,13,2,4,23,6,8,99};
//		m1(gt10,x);
		Predicate<Integer> gt5=(i)->(i>5);
		Predicate<Integer> even=(i)->(i%2==0);
		int a[] ={1,2,3,4,5,6,7,8,9,10};
		evennum(gt5.and(even),a);
		
	}
	
//	static void m1(Predicate<Integer> p,int x[]) {
//		for(int i:x) {
//			if(p.test(i)){
//				System.out.println(i);
//			}
//		}
//	}
	static void evennum(Predicate<Integer> p,int a[]) {
		System.out.println("even numbers are ");
		for(int i:a) {
			if(p.test(i)) {
				System.out.println(i);
			}
		}
	}
	
}
 