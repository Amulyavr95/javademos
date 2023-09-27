package garbagecollection;

import java.util.ArrayList;

import threadingdemo.Utils;

public class GarbageCollectionDemo {
	public static void main(String[] args) {
//		ArrayList<House> house=new ArrayList<House> ();
//		for (int i=0;i<=10;i++) {
//			//house.add(new House(i));
//			new House(i);
//		}
		
		new House(1);
		new House(2);
		
		System.gc();
	}
}

class House{
	int id;
	House(int id){
		this.id=id;
		Utils.printmessage("house created "+id);
		
		
		}
	protected void finalize() {
		Utils.printmessage("house destroyed "+id);
	}
}