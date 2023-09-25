package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UtilDemo {
	public static void main(String[] args) {
		//CollectionDemo();
		ArraysDemo();
	}
	private static void ArraysDemo() {
		int[] a= {33,4,6,66};
		for(int i:a) {
			System.out.print(i+" ");Arrays.sort(a);
			
		}
		System.out.println();
		for(int i:a) {
			System.out.print(i+" ");Arrays.sort(a);
			
			
			
		}
		
		
	}
	private static void CollectionDemo() {
		List<String> list=new ArrayList();
		list.add("william");
		list.add("joe");
		list.add("mark");
		list.add("zo");
		list.add("pertricks");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
//		
//		Collections.sort(list,new MyComparator());
//		System.out.println(list);
		
		int result=Collections.binarySearch(list, "mark");
		System.out.println(result);
	}
	
}

class MyComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		
		return o2.compareTo(o1);
	}
}