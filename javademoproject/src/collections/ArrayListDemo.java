package collections;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		demo1();
		demo2();
		demo3();
	}

	private static void demo3() {
		ArrayList<Integer>li=new ArrayList<Integer>();//same for linked list.
		for(int i=10;i<=100;i+=10) {
			li.add(i);
			
		}
		System.out.println(li);
		
		li.add(2,100);
		System.out.println(li);
		li.remove(1);
		System.out.println(li);
		li.set(3,101);
		System.out.println(li);
		boolean x=li.contains(99);
		System.out.println(x);
		int y=li.indexOf(60);
		System.out.println(y);
	}

	private static void demo2() {
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("10");
		list1.add("hello");
		list1.add("world");
		System.out.println(list1);
	}

	private static void demo1() {
		ArrayList list=new ArrayList();
		list.add(10);
		list.add(40.33);
		list.add("amam");
		System.out.println(list);
	}
}
